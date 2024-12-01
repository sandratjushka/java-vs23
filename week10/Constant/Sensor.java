package week10.Constant;

public interface Sensor {
    boolean isOn();
    void on();
    void off();
    int measure();
}