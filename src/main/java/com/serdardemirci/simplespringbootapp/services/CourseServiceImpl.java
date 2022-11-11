package com.serdardemirci.simplespringbootapp.services;

import com.serdardemirci.simplespringbootapp.entities.Course;
import com.serdardemirci.simplespringbootapp.repositories.InMemory;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CourseServiceImpl {
    private final InMemory memory;

    public CourseServiceImpl(InMemory memory) {
        this.memory = memory;
    }

    public Set<Course> getAllCourses() {
        return memory.getAll();
    }

    public void add(Course course) {
        this.memory.addCourse(course);
    }
}
