package edu.hallym.week13;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TestController {
@RequestMapping(value = "/test/t1.do", method = RequestMethod.GET)
public String myTtile(Model model) {
	model.addAttribute("cmd", new TestModel("t1"));
	return "/test/t1";
}
@RequestMapping(value="/test/testmodelandview", method=RequestMethod.GET)
public ModelAndView myTitle() {
	ModelAndView ret = new ModelAndView();
	ret.setViewName("test/testmodelandview");
	ret.addObject("cmd", new TestModel("testmodelandview"));
	return ret;
}
@RequestMapping(value="/test/myvoid", method = RequestMethod.GET)
public void mine(Model model) {
	model.addAttribute("cmd", new TestModel("myvoid"));
}
@RequestMapping(value="/test/mymodel", method = RequestMethod.GET)
public TestModel myModel() {
	return new TestModel("mymodel");
}
@RequestMapping(value = "/test/mybody2", method = RequestMethod.GET)
@ResponseBody
public ResponseEntity<String> myBody2(){
	HttpHeaders h = new HttpHeaders();
	h.add("Content-Type", "text/html; charset=UTF-8");
	String html = "<h1>TestTestTest....지금은 테스트중임</h1>";
	return new ResponseEntity<String>(html, h, HttpStatus.OK);
}
}
