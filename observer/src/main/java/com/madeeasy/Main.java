package com.madeeasy;

import com.madeeasy.publisher.impl.NewsAgency;
import com.madeeasy.subscriber.impl.NewsReader;

// client code
public class Main {
    public static void main(String[] args) {
        // Create news agency
        NewsAgency newsAgency = new NewsAgency();

        // Create subscribers
        Subscriber subscriber1 = new NewsReader("John");
        Subscriber subscriber2 = new NewsReader("Alice");

        // Register subscribers
        newsAgency.registerSubscriber(subscriber1);
        newsAgency.registerSubscriber(subscriber2);

        // Publish news
        newsAgency.publishNews("New technology advancements!");

        // Unregister subscriber
        newsAgency.removeSubscriber(subscriber2);

        // Publish more news
        newsAgency.publishNews("Weather forecast for the weekend!");

    }
}