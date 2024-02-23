package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

abstract class BaseHandler implements Handler {
    protected Map<String, Handler> nextHandlers = new HashMap<>();
    protected Map<String, Handler> previousHandlers = new HashMap<>();
    protected Map<String, Request> requestsReceived = new HashMap<>();
    private int inputsReceived = 0;
    private String name;

    public BaseHandler(String name){
        this.name = name;
    }
    @Override
    public void setNextHandler(String key, Handler nextHandler) {
        nextHandlers.put(key, nextHandler);
    }

    @Override
    public void setPreviousHandler(String key, Handler previousHandler) {
        previousHandlers.put(key, previousHandler);
    }

    public synchronized void submitRequest(String name, Request request) {
        inputsReceived++;
        requestsReceived.put(name, request);
        if ((inputsReceived == previousHandlers.size()) || (previousHandlers.isEmpty())) {
            inputsReceived = 0; // Reset inputsReceived for the next request
            handleRequest();
            processNext(request);
        }
    }
    @Override
    public void processNext(Request request) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (Map.Entry<String, Handler> entry : nextHandlers.entrySet()) {
            executor.submit(() -> entry.getValue().submitRequest(this.name, request));
        }

        executor.shutdown();
    }
}