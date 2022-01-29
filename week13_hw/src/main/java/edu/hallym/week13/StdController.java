package edu.hallym.week13;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StdController {
	
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
	@RequestMapping(value="/stdinput.do", method= RequestMethod.POST)
	public String erpocess3(@ModelAttribute Student ret, Model model) {
		model.addAttribute("msg", ret);
		return "/result";
	}
}
