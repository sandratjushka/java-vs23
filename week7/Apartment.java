package week7;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    //calculate price difference
    public int priceDifference(Apartment otherApartment) {
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(thisPrice - otherPrice);
    }

    //check if more expensive than another
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return thisPrice > otherPrice;
    }

    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));

        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
    }
}
