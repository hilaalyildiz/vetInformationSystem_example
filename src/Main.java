public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("01-01-2021",true,"Tekir");
        Cat cat2 = new Cat("11-05-2011",true,"Siyam");

        Dog dog = new Dog("03-06-2016",true,3,"Golden");
        Dog dog2 = new Dog("23-07-2015",true,4,"Golden");

        dog.show();
        // kalıtım yoluyla aldığımız ve sonradan sınıfa özgü yazdığımız tüm özellikler calısıyor.
        System.out.println(dog);
        // nesneyi yazdırdığımızda sadece köpek sınıfına ait olan özellikler calısıyor.

    }
}
