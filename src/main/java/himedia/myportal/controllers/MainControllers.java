package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class MainControllers {
	
	// POJO
	@Controller
	public class MainController {
		@RequestMapping({"/", "/main"})
		public ModelAndView main() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/WEB-INF/views/home.jsp");
			return mav;
		}
	}
}
