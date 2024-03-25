package com.example.CoursesApiApp.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    //that what wire us to the topic service
    @Autowired
    private TopicService topicService;

    //get all topics
    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    //get a specific topic by id
    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    //adding new topic
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    //update topic
    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    //delete topic
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
