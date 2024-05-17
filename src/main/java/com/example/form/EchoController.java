package com.example.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class EchoController {
	@ModelAttribute
	public EchoForm setUpEchoForm() {
		EchoForm form = new EchoForm();
		return form;
	}

//	indexに戻る
	@RequestMapping
	public String index(Model model) {
		return "index";
	}

//	入力があった場合echo画面に遷移
	@RequestMapping(value = "echo", method = RequestMethod.POST)
	public String echo(@Validated EchoForm echoForm, BindingResult result, Model model) {
		if (result.hasErrors() ) {
			model.addAttribute("name", echoForm.getName());
			return "index";
		}
		model.addAttribute("name", echoForm.getName());
		return "echo";
	}
}
