package com.project.imageTextViewer.Image.Text.Viewer.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.imageTextViewer.Image.Text.Viewer.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Integer> {

}
