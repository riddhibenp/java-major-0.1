package com.example.cybage.service;

import java.util.List;
import java.util.Optional;

import com.example.cybage.entity.Category;
import com.example.cybage.entity.Course;
import com.example.cybage.entity.Video;

public interface AdminService {
	public List<Category> getAllCategory();
	public Optional<Category> getCategoryById(int id);
	public boolean addCategory(Category c);
	public void deleteCategory(int id);
	

	public List<Course> getAllCourse();
	public Optional<Course> getCourseById(int id);
	public boolean addCourse(Course c,int id);
	public void deleteCourse(int i);
	
	
	public List<Video> getAllVideo();
	public Optional<Video> getVideoById(int id);
	public boolean addVideo(Video c);
	public void deleteVideo(int i);
	
	
}