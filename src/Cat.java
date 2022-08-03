public class Cat extends Animal {
    private String type;
    private String genus;

    public Cat(String dateOfBirth, boolean registered, String genus){
        super(dateOfBirth,registered);
        this.type= "Cat";
        this.genus = genus;
    }

    @Override
    void show() {
        System.out.println(toString() + " register : " + isRegistered()
        + " Date of birth : "+getDateOfBirth());

    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }
}
