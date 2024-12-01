package week10.Constant;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private boolean isOn;
    private List<Integer> measurementHistory;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.isOn = false;
        this.measurementHistory = new ArrayList<>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        return isOn && sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
        this.isOn = true;
    }

    @Override
    public void off() {
        if (!sensors.isEmpty()) {
            sensors.get(0).off();
        }
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (!this.isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or has no sensors.");
        }

        int sum = sensors.stream().mapToInt(Sensor::measure).sum();
        int average = sum / sensors.size();
        measurementHistory.add(average);
        return average;
    }

    public List<Integer> readings() {
        return new ArrayList<>(measurementHistory);
    }

    public static void main(String[] args) {
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("The temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("The temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("The temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");

        System.out.println("Readings: " + helsinkiArea.readings());
    }
}