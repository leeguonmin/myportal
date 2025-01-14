package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping({"/", "/main"})
	public String main() {
		return "/WEB-INF/views/home.jsp";
	/*public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/home.jsp");
		return mav;*/
	}
}