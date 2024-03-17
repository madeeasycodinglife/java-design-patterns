package com.madeeasy;

// subject interface
public interface NewsPublisher {
    void registerSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers(String news);
}
