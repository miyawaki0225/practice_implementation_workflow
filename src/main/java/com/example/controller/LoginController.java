package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.impl.UserServiceImpl;

@Controller
public class LoginController {
    
	@Autowired
    private UserServiceImpl userServiceImpl;

	
	/** ログイン画面を表示 */
    @GetMapping("/login")
    public String getLogin(Model model){
    	List<MUser> accountList = userServiceImpl.getAllUsers();
		// モデル設定
		model.addAttribute("accountList", accountList);
        return "login/login";
    }
    
    /** ユーザー一覧画面にリダイレクト */
    @PostMapping("/login")
    public String postLogin() {
        return "redirect:/user/list";
    }
}
