package org.example;

class PostProcessingHandler extends BaseHandler {
    public PostProcessingHandler(String name) {
        super(name);
    }
    @Override
    public synchronized boolean handleRequest() {
        System.out.println("Post-processing request");
        System.out.println("I have " + previousHandlers.size() + " previous  Handlers");
        System.out.println("I have " + nextHandlers.size() + " next  Handlers");
        return true; // Request handled
    }
}
