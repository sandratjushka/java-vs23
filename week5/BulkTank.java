package week5;


public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (amount < 0) {
            return;
        }
        this.volume += Math.min(amount, howMuchFreeSpace());
    }

    public double getFromTank(double amount) {
        if (amount < 0) {
            return 0;
        }
        double amountTaken = Math.min(amount, this.volume);
        this.volume -= amountTaken;
        return amountTaken;
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }

    public static void main(String[] args) {
        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);  
    }
}
