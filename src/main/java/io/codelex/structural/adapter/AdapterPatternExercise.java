package io.codelex.structural.adapter;

class AdapterPatternExercise {
    private final GreatBritainSocket socket = new GreatBritainSocket();

    void chargePhone(EuropePhoneCharger charger) {
        throw new UnsupportedOperationException();
    }
}
