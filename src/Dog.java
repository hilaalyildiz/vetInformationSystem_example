public class Dog extends Animal {
    private int numberOfVaccines;
    private String genus;

    public Dog(String dateOfBirth, boolean registered, int numberOfVaccines,String genus) {
        super(dateOfBirth, registered);
        this.numberOfVaccines = numberOfVaccines;
        this.genus = genus;
    }

    @Override
    void show() {
        System.out.println(toString()+" "+super.toString());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "numberOfVaccines=" + numberOfVaccines +
                ", genus='" + genus + '\'' +
                '}';
    }
}
