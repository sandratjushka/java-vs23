package week10.Constant;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn;
    private Random random;

    public Thermometer() {
        this.isOn = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (!this.isOn) {
            throw new IllegalStateException("Thermometer is off. Turn it on to measure.");
        }
        return -30 + random.nextInt(61);
    }

    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        System.out.println("Thermometer is initially off: " + thermometer.isOn());

        try {
            thermometer.measure();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        thermometer.on();
        System.out.println("Thermometer is now on: " + thermometer.isOn());

        System.out.println("Random temperature measurement: " + thermometer.measure());

        thermometer.off();
        System.out.println("Thermometer turned off: " + thermometer.isOn());
    }
}
