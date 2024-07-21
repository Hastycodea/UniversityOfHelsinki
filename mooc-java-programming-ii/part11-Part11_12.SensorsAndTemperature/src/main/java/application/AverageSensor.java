package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private boolean isOn;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.isOn = false;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
        updateIsOnState(); // Update isOn state when a sensor is added
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
        sensors.forEach(Sensor::setOn); // Turn on all sensors
    }

    @Override
    public void setOff() {
        this.isOn = false;
        sensors.forEach(Sensor::setOff); // Turn off all sensors
    }
    
    @Override
    public int read() {
        if (!this.isOn || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors added");
        }
        double average = sensors.stream().mapToInt(Sensor::read).average().orElseThrow(() -> new IllegalStateException("Error calculating average"));
        return (int) average;
    }
    
    public List<Integer> readings() {
        if (!this.isOn) {
            throw new IllegalStateException("AverageSensor is off");
        }
        return sensors.stream().map(Sensor::read).collect(Collectors.toList());
    }
    
    private void updateIsOnState() {
        this.isOn = sensors.stream().anyMatch(Sensor::isOn); // Check if any sensor is on
    }
}
