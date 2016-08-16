package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.UserT;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserTController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		UserT user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}

