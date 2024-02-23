package org.example;

class ProcessingHandler extends BaseHandler {
    public ProcessingHandler(String name) {
        super(name);
    }
    @Override
    public synchronized boolean handleRequest() {
        System.out.println(" processed request");
        System.out.println("I have " + previousHandlers.size() + " previous  Handlers");
        System.out.println("I have " + nextHandlers.size() + " next  Handlers");
        return true; // Request handled
    }
}