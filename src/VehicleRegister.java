import java.util.HashMap;

/**
 * Created by John on 9/9/2017.
 */
public class VehicleRegister{

    private HashMap<RegistrationPlate, String> owners;


    public VehicleRegister(){
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(owners.containsKey(plate )){
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate){
        if(!owners.containsKey(plate)){
            return null;
        }

        return  owners.get(plate);

    }

    public boolean delete(RegistrationPlate plate){
        if(!owners.containsKey(plate)){
            return false;
        }

        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates(){
        for(RegistrationPlate plate: this.owners.keySet()){
            System.out.println(plate.toString());
        }
    }

    public void printOwners(){
       // for(String key: ){
        System.out.println("Print owners");
        System.out.println("TEST AGAIN gotta commit");

    }
}
