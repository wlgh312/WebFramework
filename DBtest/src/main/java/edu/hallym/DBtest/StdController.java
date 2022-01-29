package edu.hallym.DBtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.hallym.DBtest.db.StdDB;

@Controller
public class StdController {
	@Autowired
	private StdDB stddb;
	
	@RequestMapping(value="/stdinput.do", method= RequestMethod.POST)
	public String stdinput(@ModelAttribute Student ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create(ret);
		return "/result";
	}
	@RequestMapping(value="/std1.do", method=RequestMethod.GET)
	public String eprocess1(Model model) {
		model.addAttribute("msg", new Student());
		return "/stdinput";
	}
	@RequestMapping(value="/std2.do", method=RequestMethod.GET)
	public ModelAndView eprocess2() {
		ModelAndView k = new ModelAndView("/stdinput", "msg", new Student());
		return k;
	}
}
