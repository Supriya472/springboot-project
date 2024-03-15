package com.gl.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.gl.entity.Ticket;
import com.gl.service.TicketServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class TicketController {
	@Autowired
	TicketServiceImpl service;
	

	@GetMapping("/")
	public String home(Model m) {
		List<Ticket> tic=service.getAllTic();
		m.addAttribute("tic",tic);
		return "index";
		
	}
	@GetMapping("/newticket")
	public String newTicketForm() {
		return "new_ticket";
		
	}
	
	@PostMapping("/register")
	public String ticketRegister(@ModelAttribute Ticket t){ 
		System.out.println(t);
		service.newTicket(t);
		
		return "redirect:/";
		
		}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Ticket t = service.getTicById(id);
		m.addAttribute("tic", t);
		return "edit";
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Ticket t, HttpSession session) {
		service.newTicket(t);
		session.setAttribute("msg", "Tic Data Update Sucessfully..");
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String deleteTic(@PathVariable int id,HttpSession session) {
		service.deleteTic(id);
		session.setAttribute("msg","Tic Data Delete Successfully...");
		return "redirect:/";
		
	}
	}

	


