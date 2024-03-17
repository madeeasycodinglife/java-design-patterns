package com.madeeasy;

import com.madeeasy.animal.impl.ConcreteHandler1;
import com.madeeasy.animal.impl.ConcreteHandler2;
import com.madeeasy.animal.impl.ConcreteHandler3;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // Set up the chain
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        // Send requests to the chain
        handler1.handleRequest(5); // Handled by ConcreteHandler1: 5
        handler1.handleRequest(15); // Handled by ConcreteHandler2: 15
        handler1.handleRequest(25); // No handler found for: 25
        handler1.handleRequest(35); // Handled by ConcreteHandler3: 35
        handler1.handleRequest(45); // No handlers found for: 45

    }
}


/**
 * Here are the steps of how the provided Chain of Responsibility example works:
 * <p>
 * 1. **Creation of Handlers**: Three concrete handler classes are created: `ConcreteHandler1`, `ConcreteHandler2`, and `ConcreteHandler3`. Each handler implements the `Handler` interface and overrides the `handleRequest()` method to define its specific handling logic.
 * <p>
 * 2. **Setting up the Chain**: In the `Main` class, instances of the concrete handlers are created: `handler1`, `handler2`, and `handler3`. The chain is set up by calling the `setSuccessor()` method on each handler, linking them together. Each handler knows its successor in the chain.
 * <p>
 * 3. **Handling Requests**: When a request is made, it is passed to the first handler in the chain (`handler1`) by calling its `handleRequest()` method with the request parameter.
 * <p>
 * 4. **Handling by Current Handler**: The current handler (`handler1`) checks if it can handle the request based on its criteria (i.e., if the request falls within a specific range). If the condition is met, it handles the request and prints a corresponding message.
 * <p>
 * 5. **Passing Requests Along the Chain**: If the current handler cannot handle the request (i.e., the condition is not met), it calls the `handleRequest()` method of its successor handler, passing the request to it.
 * <p>
 * 6. **Successive Handling**: The same process repeats for subsequent handlers in the chain (`handler2` and `handler3`). Each handler checks if it can handle the request based on its criteria. If none of the handlers can handle the request, a message indicating that no handler is found for the request is printed.
 * <p>
 * 7. **Output**: Depending on the value of the request and the criteria defined in each handler, the appropriate handler processes the request and prints a message indicating that it has handled the request. If no handler is found for the request, a message indicating this is printed.
 * <p>
 * In summary, the Chain of Responsibility pattern allows multiple handlers to process a request sequentially, with each handler in the chain either handling the request or passing it to the next handler until it is handled or until the end of the chain is reached.
 */




