package com.project.imageTextViewer.Image.Text.Viewer.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LoginModel {

	@Id
	private ObjectId id;
	
	private String email;
	
	private String password;
	
	public LoginModel() {
		
	}
	
	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public LoginModel(ObjectId id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
