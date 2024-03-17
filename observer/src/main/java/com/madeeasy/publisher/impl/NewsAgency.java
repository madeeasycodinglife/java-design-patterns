package com.madeeasy.publisher.impl;

import com.madeeasy.NewsPublisher;
import com.madeeasy.Subscriber;

import java.util.ArrayList;
import java.util.List;

// Concrete subject: NewsAgency
public class NewsAgency implements NewsPublisher {
    private List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("NewsAgency publishes: " + news);
        notifySubscribers(news);
    }
}

