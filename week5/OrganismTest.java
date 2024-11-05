package week5;

interface Movable {
    void move(int dx, int dy);
}

class Organism implements Movable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}

public class OrganismTest {
    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);

        organism.move(-10, 5);
        System.out.println(organism);

        organism.move(50, 20);
        System.out.println(organism);
    }
}
