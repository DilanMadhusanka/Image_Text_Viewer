package com.project.imageTextViewer.Image.Text.Viewer.service;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DataTypeConvertionService {

	public static File convert(MultipartFile multipart) throws IllegalStateException, IOException {
//		System.out.println(file);
//		File file2 = new File("F:\\jp.png");
//		try {
//        File convFile = new File(file.getOriginalFilename());
//        convFile.createNewFile();
//        FileOutputStream fos = new FileOutputStream(convFile);
//        fos.write(file.getBytes());
//        fos.close();
//        return convFile;
//		}catch(IOException e) {
//			return file2;
//		}
		
		File convFile = new File(System.getProperty("java.io.tmpdir")+"/"+"fileName");
	    multipart.transferTo(convFile);
	    return convFile;
    }
}
