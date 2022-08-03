abstract public class Animal {
    private String dateOfBirth;
    private boolean registered;

    public Animal(String dateOfBirth, boolean registered) {
        this.dateOfBirth = dateOfBirth;
        this.registered = registered;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    abstract void show();

    @Override
    public String toString() {
        return "Animal {" + "'Date of birth" +
                dateOfBirth +'\'' +
                ", registed =" + registered + '}';
    }
}
