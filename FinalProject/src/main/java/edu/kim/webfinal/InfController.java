package edu.kim.webfinal;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import edu.kim.webfinal.db.InfDB;
import edu.kim.webfinal.db.profInfDB;

/**
 * Handles requests for the application home page.
 */
@Controller
public class InfController {
	
	private static final Logger logger = LoggerFactory.getLogger(InfController.class);
	
	@Autowired
	private InfDB infdb;
	@Autowired
	private profInfDB pinfdb;
	
	@RequestMapping(value="/infinput.do", method= RequestMethod.POST)
	public String stdinput(@ModelAttribute Inform ret, Model model) {
		model.addAttribute("msg", ret);
		infdb.create(ret);
		return "redirect:inf_list.do";
	}
	@RequestMapping(value="/inf1.do", method=RequestMethod.GET)
	public String eprocess1(Model model) {
		model.addAttribute("msg", new Inform());
		return "/infinput";
	}
	@RequestMapping(value="/inf_list.do", method=RequestMethod.GET)
	public String getInform(Model model, Inform ret, @RequestParam(value="seq", required=false, defaultValue="0") int seq) {
		infdb.caution(ret);
		if(seq==0) {
			List<Inform> inf = infdb.select();
			model.addAttribute("inf_cmd", inf);
			List<Integer> preGrade=infdb.preGrade();
			model.addAttribute("preGrade", preGrade);
			return "list";
		}else {
			Inform inf = infdb.select(seq);
			model.addAttribute("msg", inf);
			return "result";
		}
	}
	@RequestMapping(value="/blobinput.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String imginput(Model model, @RequestParam(value="seq", required=true) int seq) {
		Inform inf = infdb.select(seq);
		model.addAttribute("msg", inf);
		String mid=infdb.midPrint(seq);
		model.addAttribute("midP", mid);
		String fin=infdb.finPrint(seq);
		model.addAttribute("finP", fin);
		return "/blobinput";
	}
	@RequestMapping(value="midPrint.do")
	public String paperP(Model model, HttpServletRequest request, @RequestParam(value="seq", required = true) int seq, MultipartFile file) throws IllegalStateException, IOException{
		Inform inf = infdb.select(seq);
		model.addAttribute("msg", inf);
		String fileName = file.getOriginalFilename();
		String realPath = "C:\\Users\\wlgh3\\Desktop\\웹프레임워크\\FinalProject\\src\\main\\webapp\\resources\\upload";
		File savePath = new File(realPath);
		if(!savePath.exists())
			savePath.mkdirs();
		realPath+=File.separator+fileName;
		File saveFile = new File(realPath);
		file.transferTo(saveFile);
		model.addAttribute("pic", fileName);
		infdb.midpicUpdate(fileName,seq);
		return "midPrint";
	}
	@RequestMapping(value="finPrint.do")
	public String finpaperP(Model model,HttpServletRequest request, @RequestParam(value="seq", required = true) int seq, MultipartFile file) throws IllegalStateException, IOException{
		Inform inf = infdb.select(seq);
		model.addAttribute("msg", inf);
		long size=file.getSize();
		String fileName = file.getOriginalFilename();
		String realPath = "C:\\Users\\wlgh3\\Desktop\\웹프레임워크\\FinalProject\\src\\main\\webapp\\resources\\upload";
		File savePath = new File(realPath);
		if(!savePath.exists())
			savePath.mkdirs();
		realPath+=File.separator+fileName;
		File saveFile = new File(realPath);
		file.transferTo(saveFile);
		model.addAttribute("pic", fileName);
		infdb.finpicUpdate(fileName,seq);
		return "finPrint";
	}
	@RequestMapping(value="/checkinput.do", method= RequestMethod.GET)
	public String prof(Model model, HttpServletRequest request, MultipartFile file) {
		String url=request.getQueryString();
		String pic=pinfdb.profPrint(url);
		model.addAttribute("pic", pic);
		model.addAttribute("pos", url);
		String name=pinfdb.nameP(url);
		model.addAttribute("name", name);
		return "checkinput";
	}
	@RequestMapping(value="/checkprint.do")
	public String checkP(Model model, @RequestParam("name") String name, HttpServletRequest request, MultipartFile file) throws IllegalStateException, IOException{
		String url=request.getQueryString();
		String fileName = file.getOriginalFilename();
		String realPath = "C:\\Users\\wlgh3\\Desktop\\웹프레임워크\\FinalProject\\src\\main\\webapp\\resources\\upload";
		realPath+=File.separator+fileName;
		File saveFile = new File(realPath);
		file.transferTo(saveFile);
		model.addAttribute("pic", fileName);
		model.addAttribute("url", url);
		if(url.equals("prof")) {
			pinfdb.profupdate(name, fileName);
		}
		else {
			pinfdb.asstupdate(name, fileName);
		}
		return "/checkprint";
	}
	@RequestMapping(value="/inf_delete.do", method = RequestMethod.GET)
	public String delete(@RequestParam(value="seq", required = true) int seq) {
		infdb.delete(seq);
		return "redirect:/inf_list.do";
	}
	@RequestMapping(value="/inf_update.do", method = RequestMethod.GET)
	public String m_update(Model model, @RequestParam(value="seq", required=true) int seq) {
		Inform inf = infdb.select(seq);
		model.addAttribute("msg", inf);
		return "infinput";
	}
	@RequestMapping(value="/update/infinput.do", method = RequestMethod.POST)
	public String update(@ModelAttribute Inform ret) {
		infdb.update(ret);
		return "redirect:/inf_list.do?seq="+ret.getSeq();
	}
	
}
