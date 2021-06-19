package com.stacksimplify.restservices.services;

import com.stacksimplify.restservices.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(Long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long courseId);
}
