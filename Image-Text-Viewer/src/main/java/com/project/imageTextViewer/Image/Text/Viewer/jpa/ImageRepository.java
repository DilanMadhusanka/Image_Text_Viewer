package com.project.imageTextViewer.Image.Text.Viewer.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.imageTextViewer.Image.Text.Viewer.model.ImageModel;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Integer>{

}
