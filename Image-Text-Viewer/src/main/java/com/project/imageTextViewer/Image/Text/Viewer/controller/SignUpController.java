package com.project.imageTextViewer.Image.Text.Viewer.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.imageTextViewer.Image.Text.Viewer.jpa.LoginRepository;
import com.project.imageTextViewer.Image.Text.Viewer.model.LoginModel;
import com.project.imageTextViewer.Image.Text.Viewer.service.LoginService;
import com.project.imageTextViewer.Image.Text.Viewer.service.UserEmailSearch;

@RestController
public class SignUpController {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@Autowired
	UserEmailSearch userEmailSearch;
	
	@Autowired
	LoginRepository loginRepository;

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String saveData(@RequestParam String email, @RequestParam String password) throws MessagingException {
		
		if(userEmailSearch.searchEmail(email) == false) {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			helper.setTo(email);
			helper.setSubject("Verfication Email");
			helper.setText("Click here to verify your account<br/><p><a href='https://www.google.com/'>testing link<a/><p/>", true);
			
			javaMailSender.send(mimeMessage);
			
			loginRepository.save(new LoginModel(email, password));
			
			return "success";
		}
		
		else {
			return "fail";
		}
		
	}
}
