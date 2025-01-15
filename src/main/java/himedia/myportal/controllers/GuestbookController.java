package himedia.myportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import himedia.myportal.repositories.vo.GuestbookVo;
import himedia.myportal.services.GuestbookService;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	@Autowired
	GuestbookService guestbookServiceImpl;
	
	@GetMapping({"", "/", "/list"})
	public String list(Model model) {
		List<GuestbookVo> list = 
				guestbookServiceImpl.getMessageList();
		model.addAttribute("list", list);
		return "guestbook/list";
	}
	
	
	@PostMapping("/write")
	public String write(@ModelAttribute GuestbookVo vo) {
		System.out.println("FORM:" + vo);
		boolean success =guestbookServiceImpl.writeMessage(vo);
		
		System.out.println("Write Result:" + success);
		return "redirect:/guestbook";			// 성공적으로 끝나면, 게스트홈으로 돌아가라
	}
	
	
	@RequestMapping(value="/delete/{no}", method=RequestMethod.GET)
	public String deleteForm(@PathVariable("no") Integer no, Model model) {
		model.addAttribute("no", no);
		return "guestbook/deleteform";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteAction(@ModelAttribute GuestbookVo vo) {
		boolean success = guestbookServiceImpl.deleteMessage(vo);
		System.out.println("Delete Result:" + success);
		return "redirect:/guestbook";
	}
	
	
}