package ssm.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ssm.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String test1() {
		List<Map<String, Object>> lists =  testService.testOne();
		System.out.println("asaaaaaaaaaaaaa");
		return "hello";
	}
	
	@RequestMapping("/view1")
	public ModelAndView view1() {
		return new ModelAndView("page1");
	}
	
	
}
