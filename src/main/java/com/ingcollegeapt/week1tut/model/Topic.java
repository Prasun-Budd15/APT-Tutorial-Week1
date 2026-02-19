package com.ingcollegeapt.week1tut.model;

//Create a POJO Class for Topic
import java.time.LocalDateTime;
/*
It has id, name, created and updated TimeStamp
*/
public class Topic {
    private int topic_id;
    private String topic_name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Topic(int topic_id, String topic_name) {
        this.topic_id = topic_id;
        this.topic_name = topic_name;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        this.updatedAt=LocalDateTime.now(); 
    }

    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
        this.updatedAt=LocalDateTime.now(); 
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    
    
    
}
