package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.Chat;



@Controller
public class ChatController {

	private final ChatDao ChatDao;

	public ChatController(ChatDao ChatDao) {
		this.ChatDao = ChatDao;
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("chatList", ChatDao.findAll());
		model.addAttribute("chatForm", new Chat());
		return "index";
	}
	@PostMapping("/") 
    public String submit(@ModelAttribute("chatForm") Chat chat) {
        ChatDao.save(chat);
        return "redirect:/"; 
    }
	
}
