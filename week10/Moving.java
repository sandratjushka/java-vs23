package week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Thing {
    int getVolume();
}

class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.volume, other.volume);
    }
}

class Box implements Thing {
    private int maxCapacity;
    private List<Thing> things;
    private int currentVolume;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.things = new ArrayList<>();
        this.currentVolume = 0;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + currentVolume <= maxCapacity) {
            things.add(thing);
            currentVolume += thing.getVolume();
            return true;
        }
        return false;
    }

    public int getVolume() {
        return currentVolume;
    }

    @Override
    public String toString() {
        return "things in the box: " + currentVolume + " dm^3";
    }
}

class Packer {
    private int boxVolume;

    public Packer(int boxVolume) {
        this.boxVolume = boxVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Item> items = new ArrayList<>();
        for (Thing thing : things) {
            if (thing instanceof Item) {
                items.add((Item) thing);
            }
        }
        Collections.sort(items);
        
        List<Box> boxes = new ArrayList<>();
        Box currentBox = new Box(boxVolume);

        for (Item item : items) {
            if (!currentBox.addThing(item)) {
                boxes.add(currentBox);
                currentBox = new Box(boxVolume);
                currentBox.addThing(item);
            }
        }

        if (currentBox.getVolume() > 0) {
            boxes.add(currentBox);
        }

        return boxes;
    }
}

public class Moving {
    public static void main(String[] args) {
        // the things we want to pack
        List<Thing> things = new ArrayList<>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrush", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        // we create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings(things);

        System.out.println("number of boxes: " + boxes.size());
        for (Box box : boxes) {
            System.out.println("  " + box);
        }
    }
}
