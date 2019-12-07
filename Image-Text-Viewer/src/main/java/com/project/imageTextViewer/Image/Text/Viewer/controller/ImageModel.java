package com.project.imageTextViewer.Image.Text.Viewer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageModel {

	@RequestMapping("/save")
	public String getStr() {
		return "Hi";
	}
}
