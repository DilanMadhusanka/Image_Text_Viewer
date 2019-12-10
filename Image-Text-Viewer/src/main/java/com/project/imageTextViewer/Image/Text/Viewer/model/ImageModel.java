package com.project.imageTextViewer.Image.Text.Viewer.model;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image_data")
public class ImageModel {

	@Id
	private int id;
	
	@Column(name="text")
	private String text;
	
	@Column(name="image_path")
	private File image_path;
	
	public ImageModel() {
		
	}

	public ImageModel(String text, File image_path) {
		super();
		this.text = text;
		this.image_path = image_path;
	}
	
	public ImageModel(int id, String text, File image_path) {
		super();
		this.id = id;
		this.text = text;
		this.image_path = image_path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
