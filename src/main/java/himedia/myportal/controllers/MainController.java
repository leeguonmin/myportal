package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import himedia.myportal.exception.MainControllerException;

@Controller
public class MainController {
	@RequestMapping({"/", "/main"})
	public String main() {
		/* return "/WEB-INF/views/home.jsp"; */
		return "home";
	/*public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/home.jsp");
		return mav;*/
	}
	
	@RequestMapping("/except")
	public String except() {
		/* throw new RuntimeException("강제 익셉션 발생"); */
		throw new RuntimeException("force Exception"); /* v1 */
//		throw new MainControllerException();				/* v2 */
	}
	// ExceptionHandler v1
	/*
	 * @ExceptionHandler(RuntimeException.class)
	 * 
	 * @ResponseBody public String handlerControllerException(RuntimeException e) {
	 * return "Exception: " + e.getMessage(); }
	 */
	
	// ExceptionHandler v2
	@ExceptionHandler(MainControllerException.class)
	public String handlerControllerException(MainControllerException e, Model model) {
		model.addAttribute("name", e.getClass().getSimpleName());
		model.addAttribute("message", e.getMessage());
		
		return "errors/exception";
		
	}
	
	
	// 개별 컨트롤러에서 예외 처리하는 것보단
	// @ControllerAdvice 를 이용, 전역적으로 예외를 처리하는 것이 좋은 방법임
	
	
	
}
