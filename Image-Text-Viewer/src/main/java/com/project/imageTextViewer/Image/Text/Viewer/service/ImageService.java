//package com.project.imageTextViewer.Image.Text.Viewer.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.project.imageTextViewer.Image.Text.Viewer.jpa.ImageRepository;
//import com.project.imageTextViewer.Image.Text.Viewer.model.ImageModel;
//
//@Service
//public class ImageService {
//	
//	@Autowired
//	ImageRepository imageRepository;
//
//	public List<byte[]> getImageDetailsList() {
//		List<byte[]> list = new ArrayList<>();
//		
//		for (ImageModel imageModel : imageRepository.findAll()) {
//			list.add(imageModel.getImage());
//		}
//		
//		return list;
//	}
//}
