package week7;

public class Counter {

    private int value;
    private boolean check;

    //starting value and check flag
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    //only starting value, check is off
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    //only check flag, starting value is 0
    public Counter(boolean check) {
        this(0, check);
    }

    //starting value 0 and check off
    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (this.check && this.value <= 0) {
            return;
        }
        this.value--;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check) {
                this.value = Math.max(0, this.value - decreaseAmount);
            } else {
                this.value -= decreaseAmount;
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter(10, true);
        
        counter.decrease(5);
        System.out.println("Counter after decrease by 5: " + counter.value());

        counter.decrease(10);
        System.out.println("Counter after decrease by 10: " + counter.value());

        counter.increase(3);
        System.out.println("Counter after increase by 3: " + counter.value());

        counter.increase(-2);
        System.out.println("Counter after invalid increase by -2: " + counter.value());
    }
}

