
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same example program as in the assignment

        VehicleRegister ar = new VehicleRegister();
        ar.add(new RegistrationPlate("FI", "ABC-123"),"Arto");
        ar.add(new RegistrationPlate("FI","BBB-222"),"Pekka");
        ar.printRegistrationPlates();

        System.out.println();

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        Map<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "John ");
        owners.put(reg3, "Bill");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found
        //add more comments fixed
    }
}
