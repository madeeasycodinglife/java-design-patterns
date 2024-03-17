package com.madeeasy.subscriber.impl;

import com.madeeasy.Subscriber;

// Concrete observer: NewsReader
public class NewsReader implements Subscriber {
    private String name;

    public NewsReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " reads news: " + news);
    }
}
