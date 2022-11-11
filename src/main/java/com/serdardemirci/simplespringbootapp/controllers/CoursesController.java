package com.serdardemirci.simplespringbootapp.controllers;

import com.serdardemirci.simplespringbootapp.entities.Course;
import com.serdardemirci.simplespringbootapp.services.CourseServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    private final CourseServiceImpl courseService;

    public CoursesController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }


    @GetMapping()
    public Set<Course> getAll() {
        return this.courseService.getAllCourses();
    }

    @PostMapping
    public void add(@RequestBody Course course) {
        this.courseService.add(course);
    }
}
