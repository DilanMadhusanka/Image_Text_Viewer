package com.project.imageTextViewer.Image.Text.Viewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.imageTextViewer.Image.Text.Viewer.service.VerificationService;

@RestController
public class LoginController {
	
	@Autowired
	VerificationService verificationService;

	@RequestMapping("/login")
	public boolean handleLoginRequest(@RequestParam String username, @RequestParam String password) {
		return verificationService.validateUser(username, password);
	}
}
