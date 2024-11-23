package week9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.country = country;
        this.regCode = regCode;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegistrationPlate other = (RegistrationPlate) obj;
        return Objects.equals(this.regCode, other.regCode) &&
               Objects.equals(this.country, other.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, regCode);
    }

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newReg = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newReg)) {
            finnish.add(newReg);
        }
        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
    }
}
