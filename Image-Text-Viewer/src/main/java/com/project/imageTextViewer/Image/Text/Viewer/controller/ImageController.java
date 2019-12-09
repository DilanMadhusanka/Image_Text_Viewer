package com.project.imageTextViewer.Image.Text.Viewer.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.imageTextViewer.Image.Text.Viewer.jpa.ImageRepository;
import com.project.imageTextViewer.Image.Text.Viewer.model.ImageModel;
import com.project.imageTextViewer.Image.Text.Viewer.service.ReadText;

@RestController
public class ImageController {
	
	@Autowired
	ReadText readText;
	
	@Autowired
	ImageRepository imageRepository;
	
	@RequestMapping("/read")
	public String readText(@RequestParam String filePath) {
		File imageFile = new File(filePath);
		String results = readText.readText(imageFile);
		imageRepository.save(new ImageModel(results, filePath));
		return results;
        
    }
	
}
