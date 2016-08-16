package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.NewSuppUser;
import com.cn.hnust.service.SuppUserService;

@Controller
@RequestMapping("/suppuser")
public class SuppUserController {
	@Resource
	private SuppUserService suppUserService;
	
	@RequestMapping("/queryuserbynickname")
	public String findBySupp_user_nickname(HttpServletRequest request,Model model){
		String nickname = request.getParameter("nickname");
		NewSuppUser newuser = suppUserService.getUserByNickname(nickname);
		model.addAttribute("user",newuser);
		return "showUserByNickname";
	}
}

