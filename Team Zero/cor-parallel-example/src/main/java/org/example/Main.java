package org.example;


public class Main {
    public static void main(String[] args) {
        PreProcessingHandler preHandler = new PreProcessingHandler("Pre Handler");
        ProcessingHandler handler1 = new ProcessingHandler("Handler 1");
        ProcessingHandler handler2 = new ProcessingHandler("Handler 2");
        ProcessingHandler handler3 = new ProcessingHandler("Handler 3");
        PostProcessingHandler postHandler = new PostProcessingHandler("Post Handler");

        preHandler.setNextHandler("handler1", handler1);
        preHandler.setNextHandler("handler2", handler2);
        preHandler.setNextHandler("handler3", handler3);
        handler1.setPreviousHandler("preHandler", preHandler);
        handler2.setPreviousHandler("preHandler", preHandler);
        handler3.setPreviousHandler("preHandler", preHandler);

        handler1.setNextHandler("postHandler", postHandler);
        postHandler.setPreviousHandler("handler1", handler1);

        handler2.setNextHandler("postHandler", postHandler);
        postHandler.setPreviousHandler("handler2", handler2);

        handler3.setNextHandler("postHandler", postHandler);
        postHandler.setPreviousHandler("handler3", handler3);

        Request request = new Request("Sample request");
        preHandler.submitRequest("", request);
    }
}