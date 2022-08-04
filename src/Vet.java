public class Vet extends Person {
    private String graduatedSchool;
    private int operationTime;

    public Vet(String name, String id, String graduatedSchool,int operationTime) {
        super(name, id);
        this.graduatedSchool = graduatedSchool;
        this.operationTime = operationTime;
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
