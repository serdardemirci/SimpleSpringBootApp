package com.serdardemirci.simplespringbootapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Comparable<Course> {
    private Integer id;
    private String courseName;
    private String category;




    @Override
    public int compareTo(Course o) {
        if (this.courseName.equals(o.courseName)) return 0;
        return this.id.compareTo(o.id);
    }
}
