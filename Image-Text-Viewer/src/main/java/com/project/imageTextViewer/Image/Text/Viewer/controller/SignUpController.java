package com.project.imageTextViewer.Image.Text.Viewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.imageTextViewer.Image.Text.Viewer.jpa.LoginRepository;
import com.project.imageTextViewer.Image.Text.Viewer.model.LoginModel;

@RestController
public class SignUpController {
	
	@Autowired
	LoginRepository loginRepository;

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public void saveData(@RequestParam String username, @RequestParam String password) {
		loginRepository.save(new LoginModel(username, password));
	}
}
