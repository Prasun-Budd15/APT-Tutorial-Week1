package com.ingcollegeapt.week1tut;


import com.ingcollegeapt.week1tut.model.Topic;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Week1Tut{

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Topic> topics = new ArrayList();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.next();

            switch (choice){
                case "1":
                    // TODO: Add topic
                    System.out.println("Enter a topic name:");
                    String topic_name = scanner.next();
                    int topic_id = topics.size() + 1;
                    Topic newTopic = new Topic(topic_id, topic_name);
                    topics.add(newTopic);
                    System.out.println("Topic added succesfully");
                    break;
                case "2":
                    // TODO: View topics
                    for (Topic topic : topics){
                        System.out.println("ID : " + topic.getTopic_id() + ", Name: " + topic.getTopic_name());
                    }
                    break;
                case "3":
                    // TODO: Add entry to a topic
                    break;
                case "4":
                     // TODO: View entries
                    break;
                case "5":
                    //Exit
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            
            
            
           
        }
    }

    private static void showMenu() {
        System.out.println("\nLearning Logs Menu");
        System.out.println("1. Add Topic");
        System.out.println("2. View Topics");
        System.out.println("3. Add Entry");
        System.out.println("4. View Entries");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}
