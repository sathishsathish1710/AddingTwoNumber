package com.example.addnumberspring.AddController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.addnumberspring.domain.addtion;

@Controller
public class AdditionController {
	
	@GetMapping("/index")
	public String ViewForm(Model model)
	{
		model.addAttribute("Addition",new addtion());
		return "index";
	}
	
	
	@PostMapping("/calculate")
	public String addForm(@ModelAttribute addtion addtion,BindingResult result,Model model)
	{
	  model.addAttribute("addtion",addtion);
	  return "calculate";
	}

}
