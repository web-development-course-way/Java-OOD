package org.example;

import java.util.Map;

interface Handler {
    void setNextHandler(String key, Handler nextHandler);
    void setPreviousHandler(String key, Handler previousHandler);
    void processNext(Request request);
    boolean handleRequest();

    void submitRequest(String name, Request request);
}