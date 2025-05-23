package com.example.chatsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chatsystem.dao.ChatDao;
import com.example.chatsystem.model.Chat;

@Controller
public class ChatController {

    @Autowired
    private ChatDao chatDao;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("chatList", chatDao.findAll());
        model.addAttribute("chat", new Chat());
        return "view";
    }

    @PostMapping("/complete")
    public String complete(@ModelAttribute Chat chat, Model model) {
        chatDao.save(chat);
        model.addAttribute("chatList", chatDao.findAll());
        model.addAttribute("chat", new Chat());
        return "view";
    }
}
