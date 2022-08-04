public class Main {
    public static void main(String[] args){

        createFirstObj();

    }

    private static void createFirstObj(){

        Cat cat = new Cat("01-01-2021",true,"Tekir");
        Cat cat2 = new Cat("11-05-2011",true,"Siyam");

        Dog dog = new Dog("03-06-2016",true,3,"Golden");
        Dog dog2 = new Dog("23-07-2015",true,4,"Golden");

        dog.show();
        // kalıtım yoluyla aldığımız ve sonradan sınıfa özgü yazdığımız tüm özellikler calısıyor.
        System.out.println(dog);
        // nesneyi yazdırdığımızda sadece köpek sınıfına ait olan özellikler calısıyor.

        Customer c1 = new Customer("emre","123","Ankara");
        Customer c2 = new Customer("hasan","783","Izmir");
        c1.addAnimals(cat);
        c2.addAnimals(dog);

        /*
        System.out.println(c2);
        c1.introduceYourself();
        */


        Vet v1 =  new Vet("ayse", "456","Sakarya Universitesi",10);
        Vet v2 =  new Vet("mehmet", "7416","Kocaeli Universitesi",15);

        v1.addCustomer(c1);
        v2.addCustomer(c2);

        v1.listCustomers();

        /*
        System.out.println(v1);
        v2.introduceYourself();
        */

        System.out.println("Yönetim Paneli");
        ManagementPanel<Customer> customerManagementPanel = new ManagementPanel<>();
        customerManagementPanel.showInformation(c1);
    }

}
