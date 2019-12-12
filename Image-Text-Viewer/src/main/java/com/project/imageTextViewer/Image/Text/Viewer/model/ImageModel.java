package com.project.imageTextViewer.Image.Text.Viewer.model;

import java.io.File;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ImageModel {

	@Id
	private ObjectId id;
	
	private String text;
	
	private File image_path;

	public ImageModel() {
		
	}

	public ImageModel(String text, File image_path) {
		super();
		this.text = text;
		this.image_path = image_path;
	}
	
	public ImageModel(ObjectId id, String text, File image_path) {
		super();
		this.id = id;
		this.text = text;
		this.image_path = image_path;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public File getImage_path() {
		return image_path;
	}

	public void setImage_path(File image_path) {
		this.image_path = image_path;
	}
	
}
