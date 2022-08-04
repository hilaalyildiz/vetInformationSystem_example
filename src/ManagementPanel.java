public class ManagementPanel <T>{
    public void showInformation(T object){
        System.out.println(object);
    }

    public <T extends Customer> void showYourAnimals(T customer){
        customer.listYourAnimals();
    }
}
