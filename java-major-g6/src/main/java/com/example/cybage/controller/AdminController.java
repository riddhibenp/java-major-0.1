package com.example.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cybage.service.AdminServiceImpl;

import com.example.cybage.entity.Category;
import com.example.cybage.entity.Course;
import com.example.cybage.entity.Video;

@RestController
public class AdminController {
	
	@Autowired
	private AdminServiceImpl asi;
	
	
	
	//show all categories
	@GetMapping("/category")
	public  List<Category> AllCategory(){
		
	List<Category> li = asi.getAllCategory();
	for(Category l:li) {
			System.out.println(l);
	}
		return li;
	}
	//show category by id
	@GetMapping("/category/{id}")
	
	public Optional<Category> CategoryById(@PathVariable int id) {
		System.out.println(id);
	return asi.getCategoryById(id);
		
	}
	
	//add category
	@PostMapping("/category")
	public boolean addCategory(@RequestBody Category c) {
		return asi.addCategory(c);
	
	}
	
	//delete category by id
	@DeleteMapping("/category")
	public void deleteCategory(@PathVariable int id) {
		 asi.deleteCategory(id);
	} 
	
	
	
	//show all courses
	@GetMapping("/course")
	public  List<Course> AllCourse(){	
	List<Course> li = asi.getAllCourse();
		for(Course l:li) {
			System.out.println(l);
		}
		return li;
	}
	
	//show course by id
	@GetMapping("/course/{id}")
	public Optional<Course> CourseById(@PathVariable int id) {
	System.out.println(id);
		return asi.getCourseById(id);
	
	}
	
	//add course
	@PostMapping("/course")
	public boolean addCourse(@RequestBody Course c,@PathVariable int cat_id) {
		return asi.addCourse(c,cat_id);
		
	}
	
	//delete course by id
	@DeleteMapping("/course")
	public void deleteCourse(@PathVariable int id) {
		 asi.deleteCourse(id);
	} 
	
	
	
	//show all videos
	@GetMapping("/video")
	public  List<Video> AllVideo(){
		List<Video> li = asi.getAllVideo();
		for(Video l:li) {
		System.out.println(l);
		}
		return li;
	}
	
	//show video by id
	@GetMapping("/video/{id}")	
	public Optional<Video> VideoById(@PathVariable int id) {
			return asi.getVideoById(id);
		
	}
	
	//add video
	@PostMapping("/video")
	public boolean addVideo(@RequestBody Video c) {
		return asi.addVideo(c);
	}
	
	//delete video
	@DeleteMapping("/video")
	public void deleteVideo(@PathVariable int id) {
		 asi.deleteVideo(id);
	} 

}
