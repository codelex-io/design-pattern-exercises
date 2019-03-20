package io.codelex.structural.adapter;

class EuropePhoneCharger {
    private boolean charging;

    void plugInAndCharge() {
        this.charging = true;
    }

    public boolean isCharging() {
        return charging;
    }
}
