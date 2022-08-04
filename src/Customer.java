import java.util.ArrayList;

public class Customer extends Person {

    private String address;
    private ArrayList<Animal> customersAnimals;

    public Customer(String name, String id, String address) {
        super(name, id);
        this.address = address;
        customersAnimals=new ArrayList<>();
    }

    public void addAnimals(Animal animal){
        customersAnimals.add(animal);
        System.out.println(animal+getName()+" added cat to client");
    }

    public void listYourAnimals(){
        for(Animal a: customersAnimals){
            System.out.println(a);
        }
    }

    @Override
    void introduceYourself() {
        System.out.println(this.toString()+" I'm a customer");
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "address='" + address + '\'' +
                '}';
    }
}
