package com.mitrais.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mitrais.model.Makanan;

@Controller
public class MasterMenuController {
	
	@GetMapping("/list-makanan")
	public String pageMenuIndex(Model model) {
		
//		List<Makanan> listMakanan = new ArrayList<Makanan>();
//		listMakanan.add(new Makanan("Rendang",10000));
//		listMakanan.add(new Makanan("Tempe",5000));
//		listMakanan.add(new Makanan("Tahu",2500));
//		
//		System.out.println(listMakanan.toString());
//		
//		model.addAttribute("listMakanan", listMakanan);
		return "listMakanan";
	}
}
