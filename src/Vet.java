import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vet extends Person {
    private String graduatedSchool;
    private int operationTime;
    private ArrayList<Customer> vetsCustomer;
    private int theNumberOfCustomer;

    public Vet(String name, String id, String graduatedSchool,int operationTime) {
        super(name, id);
        this.graduatedSchool = graduatedSchool;
        this.operationTime = operationTime;
        vetsCustomer = new ArrayList<>();
        theNumberOfCustomer = 0;
    }

    public void addCustomer(Customer customer){
        vetsCustomer.add(customer);
        theNumberOfCustomer++;
    }

    public void listCustomers(){
        for (Customer c: vetsCustomer){
            c.introduceYourself();
        }
    }

    @Override
    void introduceYourself() {
        System.out.println(toString()+ " I'm a vet");
    }

    @Override
    public String toString() {
        return super.toString() +  "Vet{" +
                "graduatedSchool='" + graduatedSchool + '\'' +
                ", operationTime=" + operationTime +
                '}';
    }
}
