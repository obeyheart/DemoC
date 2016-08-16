package com.cn.hnust.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.cn.hnust.pojo.SuppContact;
import com.cn.hnust.pojo.SuppCustContact;
import com.cn.hnust.service.SuppContactService;
import com.cn.hnust.service.SuppCustcontactService;

@Controller
public class ContactController {
	@Resource(name = "contactService")
	private SuppContactService contactService;
	
	@Resource(name = "custcontactService")
	private SuppCustcontactService custcontactService;
	
	@RequestMapping("/addContact.do")
	public ModelAndView deleteCustomer(HttpServletRequest request,String nickname,String customer_id) {
		request.setAttribute("nickname", nickname);
		request.setAttribute("customer_id", customer_id);
		return new ModelAndView("addContact");
	}
	
	@RequestMapping("/doAddContact.do")
	public ModelAndView doDeleteCustomer(HttpServletRequest request,String nickname,String customer_id) {
		String contact_name = request.getParameter("contact_name");
		String role_name = request.getParameter("role_name");
		int role_id = contactService.selectRoleIdByRoleName(role_name);
		String departposition = request.getParameter("departposition");
		String mobilephone = request.getParameter("mobilephone");
		String officephone = request.getParameter("officephone");
		String email = request.getParameter("email");
		String fax = request.getParameter("fax");
		String qq = request.getParameter("qq");
		String address = request.getParameter("address");
		String note = request.getParameter("note");
		SuppContact cont = new SuppContact();
		cont.setSuppContactName(contact_name);
		cont.setSuppRoleId(role_id);
		cont.setSuppContactDepartposition(departposition);
		cont.setSuppContactMobilephone(mobilephone);
		cont.setSuppContactOfficephone(officephone);
		cont.setSuppContactEmail(email);
		cont.setSuppContactFax(fax);
		cont.setSuppContactQQ(qq);
		cont.setSuppContactAddress(address);
		cont.setSuppContactNote(note);
		contactService.insertContactBySequence(cont);
		int contact_id = cont.getSuppContactId();
		SuppCustContact cc = new SuppCustContact();
		cc.setSuppContactId(contact_id);
		cc.setSuppCustomerId(Integer.valueOf(customer_id));
		custcontactService.insertCustcontact(cc);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("nickname", nickname);
		map.put("customer_id", customer_id);
		return new ModelAndView(new RedirectView("customerDetails.do"),map);
	}
	
	@RequestMapping("/deleteContact.do")
	public ModelAndView deleteContact(HttpServletRequest request,String nickname,String customer_id,String contact_id) {
		int contactid = Integer.valueOf(contact_id);
		SuppCustContact cc = new SuppCustContact();
		cc.setSuppContactId(contactid);
		cc.setSuppCustomerId(Integer.valueOf(customer_id));
		custcontactService.deleteCustcontact(cc);
		//这里不删除联系人表因为数据库设计有点问题，数据库里面是有一个联系人在多个客户中充当联系人角色，实际应该是一个联系人只能出现在一个客户联系人中，好比一个人同一时间只能在一家公司上班一样
//		contactService.deleteContactBySupp_contact_id(contactid);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("nickname", nickname);
		map.put("customer_id", customer_id);
		return new ModelAndView(new RedirectView("customerDetails.do"),map);
	}
}
