package Exception;

public class Class_Cast_Exception {
    public static void main(String[] args) {
        Object obj = "Hello World";
        try {
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Class cast exception caught");
        }
        System.out.println("Program continues normally");
    }
}