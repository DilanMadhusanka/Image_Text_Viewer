package com.project.imageTextViewer.Image.Text.Viewer.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LoginModel {

	@Id
	private ObjectId id;
	
	private String username;
	
	private String password;
	
	public LoginModel() {
		
	}
	
	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public LoginModel(ObjectId id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
