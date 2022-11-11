package com.serdardemirci.simplespringbootapp.repositories;

import com.serdardemirci.simplespringbootapp.entities.Course;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.TreeSet;

@Service
public class InMemory {
    private Set<Course> courses;

    public InMemory() {
        this.courses = new TreeSet<>();
        this.addCourses();
    }

    private void addCourses() {
        this.courses.add(new Course(5, "Java", "Backend"));
        this.courses.add(new Course(3, "C#", "Backend"));
        this.courses.add(new Course(1, "C++", "Core"));
        this.courses.add(new Course(6, "Java", "Core"));
        this.courses.add(new Course(2, "Go", "Backend"));
        this.courses.add(new Course(4, "Python", "Backend"));

    }

    public Course addCourse(Course course) {
        System.out.println(this.courses.add(course));
        return course;
    }

    public Set<Course> getAll() {
        return courses;
    }

}
