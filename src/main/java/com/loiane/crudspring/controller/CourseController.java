package com.loiane.crudspring.controller;

import java.util.List;

import com.loiane.crudspring.model.Course;
import com.loiane.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
  
  //@Autowired
  private final CourseRepository courseRepository;

  //@RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public @ResponseBody List<Course> list() {
    return courseRepository.findAll();
  }
}
