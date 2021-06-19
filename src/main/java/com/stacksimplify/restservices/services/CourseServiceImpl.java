package com.stacksimplify.restservices.services;

import com.stacksimplify.restservices.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    List<Course> listCourses;

    public CourseServiceImpl() {
        listCourses = new ArrayList<>();
        listCourses.add(new Course(145, "Java Core", "This course is basic"));
        listCourses.add(new Course(4343, "Spring boot", "This course is spring"));
    }

    @Override
    public List<Course> getCourses() {
        return listCourses;
    }

    @Override
    public Course getCourse(Long courseId) {
        return listCourses.stream().filter(z -> z.getId() == courseId).findAny().orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        listCourses.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        return listCourses.stream().map(courseList -> {
            long id = courseList.getId();
            courseList.setTitle(course.getTitle());
            courseList.setDescription(course.getDescription());
            return courseList;
        }).findAny().orElse(null);
    }

    @Override
    public void deleteCourse(Long courseId) {
        listCourses = listCourses.stream().filter(courseList -> courseList.getId() != courseId).collect(Collectors.toList());
    }
}
