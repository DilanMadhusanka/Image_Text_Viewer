package com.project.imageTextViewer.Image.Text.Viewer.controller;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@RestController
public class ImageController {

	@RequestMapping("/save")
	public String getStr() {
		return "Hi";
	}
	
	@RequestMapping("/read")
	public String readText(@RequestParam String filePath) {
		File imageFile = new File(filePath);
        ITesseract instance = new Tesseract();

        try {
            BufferedImage in = ImageIO.read(imageFile);

            BufferedImage newImage = new BufferedImage(
                    in.getWidth(), in.getHeight(), BufferedImage.TYPE_INT_ARGB);

            Graphics2D g = newImage.createGraphics();
            g.drawImage(in, 0, 0, null);
            g.dispose();

            String result = instance.doOCR(newImage);
            return result;

        } catch (TesseractException | IOException e) {
            return "Error while reading image";
        }
    }
	
}
