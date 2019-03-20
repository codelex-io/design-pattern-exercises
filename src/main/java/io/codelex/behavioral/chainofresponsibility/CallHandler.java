package io.codelex.behavioral.chainofresponsibility;

abstract class CallHandler {
    private final CallHandler next;

    CallHandler(CallHandler next) {
        this.next = next;
    }

    void handle(IncomingCall call) {
        if (next == null) {
            return;
        }
        next.handle(call);
        call.processedBy(name());
    }

    abstract String name();
}
