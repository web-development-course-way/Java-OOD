package org.example;

class PreProcessingHandler extends BaseHandler {
    public PreProcessingHandler(String name) {
        super(name);
    }
    @Override
    public synchronized boolean handleRequest() {
        System.out.println("Pre-processing request");
        System.out.println("I have " + previousHandlers.size() + " previous  Handlers");
        System.out.println("I have " + nextHandlers.size() + " next  Handlers");
        return true;
    }
}