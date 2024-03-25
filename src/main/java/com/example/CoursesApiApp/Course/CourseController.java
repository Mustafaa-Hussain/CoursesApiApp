package com.example.CoursesApiApp.Course;

import com.example.CoursesApiApp.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    //that what wire us to the Course service
    @Autowired
    private CourseService courseService;

    //get all course
    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourse(@PathVariable String id) {
        return courseService.getAllCourse(id);
    }

    //get a specific topic by id
    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    //adding new course
    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {

        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    //update course
    @PutMapping("/topics/{topicId}/course/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {

        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    //delete topic
    @DeleteMapping("/topics/{topicId}/course/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
