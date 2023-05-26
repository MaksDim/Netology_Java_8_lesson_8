package ru.netology.domain;

public class Conditioner {
    private int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setToMax() {
        currentTemperature = 30;
    }

    public void increase50p() {
        setCurrentTemperature(currentTemperature * 150 / 100);
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > 30) {
            return;
        }

        if (currentTemperature < 0) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }
}
