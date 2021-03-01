package com.example.cybage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cybage.dao.CategoryRepository;
import com.example.cybage.dao.CourseRepository;
import com.example.cybage.dao.VideoRepository;
import com.example.cybage.entity.Category;
import com.example.cybage.entity.Course;
import com.example.cybage.entity.Video;

@Service
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	CategoryRepository cat;
	@Autowired
	CourseRepository cou;
	@Autowired
	VideoRepository vr;
	
	

	@Override
	public List<Category> getAllCategory() {
		return cat.findAll();
	}

	@Override
	public Optional<Category> getCategoryById(int id) {
		return cat.findById(id);
	}

	@Override
	public boolean addCategory(Category c) {
		return cat.save(c) != null;
	}

	@Override
	public void deleteCategory(int id) {
		cat.deleteById(id);
		
	}

	@Override
	public List<Course> getAllCourse() {
		return cou.findAll();
	}

	@Override
	public Optional<Course> getCourseById(int id) {
	    return cou.findById(id);
	}

	@Override
	public boolean addCourse(Course c, int id) {
	 List<Course> courses=new ArrayList<>();
	 courses.add(c);
	 Optional<Category> category= cat.findById(id);
	 category.get().setCourses(courses);
	 cat.save(category.get());
	 return true;
	}

	@Override
	public void deleteCourse(int i) {
		cou.deleteById(i);
		
	}

	@Override
	public List<Video> getAllVideo() {
		return null;
	}

	@Override
	public Optional<Video> getVideoById(int id) {
		return vr.findById(id);
	}

	@Override
	public boolean addVideo(Video c) {
		return vr.save(c) != null;
	}

	@Override
	public void deleteVideo(int i) {
	     vr.deleteById(i);
		
	}
	

}