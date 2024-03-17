package com.madeeasy;

/**
 * The Handler interface defines the methods that concrete handlers must implement.
 * It includes the handleRequest method to process requests and the setSuccessor method
 * to set the next handler in the chain.
 */
public interface Handler {
    /**
     * Handles the request based on the implemented logic.
     * @param request The request to be handled.
     */
    void handleRequest(int request);

    /**
     * Sets the successor handler in the chain.
     * @param successor The handler to be set as the successor.
     */
    void setSuccessor(Handler successor);
}

