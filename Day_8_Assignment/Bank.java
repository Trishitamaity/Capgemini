package Day_8_Assignment;

public interface Bank {
    void interest();
    void branch();
}
class SBI implements Bank {
    public void interest() {
        System.out.println("SBI gives 6% interest");
    }
    public void branch() {
        System.out.println("SBI has many branches");
    }
}
class HDFC implements Bank {
    public void interest() {
        System.out.println("HDFC gives 7% interest");
    }
    public void branch() {
        System.out.println("HDFC has limited branches");
    }
}
class Account {
    private Bank b;
    public Bank getB() {
        return b;
    }
    public void setB(Bank b) {
        this.b = b;
    }
}