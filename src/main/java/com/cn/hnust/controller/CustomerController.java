package com.cn.hnust.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.cn.hnust.pojo.NewSuppContact;
import com.cn.hnust.pojo.NewSuppUser;
import com.cn.hnust.pojo.SuppContact;
import com.cn.hnust.pojo.SuppCustomer;
import com.cn.hnust.selectCondition.CustomerCondition;
import com.cn.hnust.service.SuppContactService;
import com.cn.hnust.service.SuppCustcontactService;
import com.cn.hnust.service.SuppCustomerService;
import com.cn.hnust.service.SuppUserService;

@Controller
public class CustomerController {
	private static String[] roleArrary = {"管理员","商务","技术","运维"};
	
	@Resource(name = "suppUserService")
	private SuppUserService userService;

	@Resource
	private SuppContactService contactService;
	
	@Resource
	private SuppCustomerService customerService;
	
	@Resource
	private SuppCustcontactService custcontactService;
//	@Resource(name = "customerService")
//	private CustomerService customerService;
//	
//	@Resource(name = "contactService")
//	private ContactService contactService;
//	
//	@Resource(name = "userService")
//	private UserService userService;
	
	@RequestMapping("/queryCustomerList.do")
	public ModelAndView queryCustomerList(HttpServletRequest request) {
		CustomerCondition condition = new CustomerCondition("","","","","");
		List<SuppCustomer> listC = customerService.findCustomersByCondition(condition);
		request.setAttribute("customerList", listC);
		return new ModelAndView("customerList");
	}
	
	@RequestMapping("/customerDetails.do")
	public ModelAndView customerDetails(HttpServletRequest request,String nickname,String customer_id) {
		NewSuppUser user = userService.getUserByNickname(nickname);
//		request.setAttribute("userRole", user.getSupp_role_name());
		
		int custid = Integer.parseInt(customer_id);
		SuppCustomer customer = customerService.findBySupp_customer_id(custid);
		request.setAttribute("preCustomer", customer);
		List<NewSuppContact> listNewC = contactService.findContactsByCustomer_id(custid);
		String rolename = user.getSuppRoleName();
		List<NewSuppContact> listNewC2 = new ArrayList<NewSuppContact>();
		if(!"管理员".equals(rolename)) {
			for (NewSuppContact newc : listNewC) {
				if(rolename.equals(newc.getSuppRoleName())) {
					listNewC2.add(newc);
				}
			}
			listNewC = listNewC2;
		}
		request.setAttribute("contactList", listNewC);
		
		return new ModelAndView("customerDetails");
	}
	
	@RequestMapping("/addCustomer.do")
	public ModelAndView addCustomer(HttpServletRequest request) {
		
		return new ModelAndView("addCustomer");
	}
	
	@RequestMapping("/doAddCustomer.do")
	public ModelAndView doAddCustomer(HttpServletRequest request) {
		String supptype = request.getParameter("supptype");
		String company = request.getParameter("company");
		String chargeperson = request.getParameter("chargeperson");
		String issign = request.getParameter("issign");
		String signtime = request.getParameter("signtime").trim();
//		Timestamp ts = new Timestamp(System.currentTimeMillis());
//		ts = Timestamp.valueOf(signtime);
		String isproduct = request.getParameter("isproduct");
		String status = request.getParameter("status");
		String registercapital = request.getParameter("registercapital");
		SuppCustomer customer = new SuppCustomer(0, supptype, company, chargeperson, issign, signtime, isproduct, status, registercapital);
		customer.setSuppCustomerSupptype(supptype);
		customer.setSuppCustomerCompany(company);
		customer.setSuppCustomerChargePerson(chargeperson);
		customer.setSuppCustomerIssign(issign);
		customer.setSuppCustomerSigntime(signtime);
		customer.setSuppCustomerIsproduct(isproduct);
		customer.setSuppCustomerStatus(status);
		customer.setSuppCustomerRegisterCapital(registercapital);
		customerService.insertCustomerBySequence(customer);
		int i = customer.getSuppCustomerId();
		System.out.println("第"+i+"号数据源客户添加成功");
		return new ModelAndView(new RedirectView("queryCustomerList.do"));
	}
	
	@RequestMapping("/updateCustomer.do")
	public ModelAndView updateCustomer(HttpServletRequest request,String nickname,String customer_id) {
		NewSuppUser user = userService.getUserByNickname(nickname);
//		request.setAttribute("userRole", user.getSupp_role_name());
		
		int custid = Integer.parseInt(customer_id);
		SuppCustomer customer = customerService.findBySupp_customer_id(custid);
		request.setAttribute("preCustomer", customer);
		
		List<NewSuppContact> listNewC = contactService.findContactsByCustomer_id(custid);
		String rolename = user.getSuppRoleName();
		List<NewSuppContact> listNewC2 = new ArrayList<NewSuppContact>();
		if(!"管理员".equals(rolename)) {
			for (NewSuppContact newc : listNewC) {
				if(rolename.equals(newc.getSuppRoleName())) {
					listNewC2.add(newc);
				}
			}
			listNewC = listNewC2;
		}
		request.setAttribute("contactList", listNewC);
		request.setAttribute("contactNum", listNewC.size());
		
		return new ModelAndView("updateCustomer");
	}
	
	@RequestMapping("/doUpdateCustomer.do")
	public ModelAndView doUpdateCustomer(HttpServletRequest request) {
		int customer_id = Integer.valueOf(request.getParameter("customer_id"));
		String chargeperson = request.getParameter("chargeperson");
		String supptype = request.getParameter("supptype");
		String status = request.getParameter("status");
		String registercapital = request.getParameter("registercapital");
		int contactNum = Integer.valueOf(request.getParameter("contactNum"));
		SuppCustomer cust = customerService.findBySupp_customer_id(customer_id);
		cust.setSuppCustomerChargePerson(chargeperson);
		cust.setSuppCustomerSupptype(supptype);
		cust.setSuppCustomerStatus(status);
		cust.setSuppCustomerRegisterCapital(registercapital);
//		customerService.--------更新Customersupp_contact_id;
		customerService.updateCustomerBySupp_customer(cust);
		for(int i = 1; i<=contactNum; i++) {
			int contact_id = Integer.valueOf(request.getParameter("contact_id"+i));
			String contact_name = request.getParameter("contact_name"+i);
			String role_name = request.getParameter("role_name"+i);
			int role_id = contactService.selectRoleIdByRoleName(role_name);
			String departposition = request.getParameter("departposition"+i);
			String mobilephone = request.getParameter("mobilephone"+i);
			String officephone = request.getParameter("officephone"+i);
			String email = request.getParameter("email"+i);
			String fax = request.getParameter("fax"+i);
			String qq = request.getParameter("qq"+i);
			String address = request.getParameter("address"+i);
			String note = request.getParameter("note"+i);
			SuppContact cont = new SuppContact(contact_id, contact_name, role_id, departposition, mobilephone, officephone, email, fax, qq, address, note);
			contactService.updateContactBySupp_contact(cont);
		}
		String nickname = request.getParameter("nickname");
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("nickname", nickname);
		map.put("customer_id", customer_id);
		return new ModelAndView(new RedirectView("customerDetails.do"),map);
	}
	
//	/deleteCustomer.do?nickname=bint&customer_id=${customer.supp_customer_id
	@RequestMapping("/deleteCustomer.do")
	public ModelAndView deleteCustomer(HttpServletRequest request,String nickname,String customer_id) {
		int custid = Integer.parseInt(customer_id);
		custcontactService.deleteCustcontactByCustid(custid);
		customerService.deleteCustomerBySupp_customer_id(custid);
		
		return new ModelAndView(new RedirectView("queryCustomerList.do"));
	}
}
