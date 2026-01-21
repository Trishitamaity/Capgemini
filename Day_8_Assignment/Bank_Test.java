package Day_8_Assignment;

public class Bank_Test {
    public static void main(String[] args) {
        Account a = new Account();
        a.setB(new SBI());
        Bank b1 = a.getB();
        b1.interest();
        b1.branch();
        a.setB(new HDFC());
        Bank b2 = a.getB();
        b2.interest();
        b2.branch();
    }
}