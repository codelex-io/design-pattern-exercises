package io.codelex.behavioral.chainofresponsibility;

import java.util.LinkedList;
import java.util.List;

class IncomingCall {
    enum Type {
        INFORMATION_ABOUT_LAST_BILL,
        FORGOT_PASSWORD,
        TECHNICAL_PROBLEM
    }

    private final Type type;
    private final List<String> handlers = new LinkedList<>();
    private boolean handled;

    IncomingCall(Type type) {
        this.type = type;
    }

    void processedBy(String handler) {
        handlers.add(handler);
    }

    void markHandled() {
        this.handled = true;
    }

    public Type getType() {
        return type;
    }

    public List<String> getHandlers() {
        return handlers;
    }

    public boolean isHandled() {
        return handled;
    }
}
