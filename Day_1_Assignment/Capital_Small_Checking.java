package Capgemini;

class Capital_Small_Checking {
    public static void main(String[] args) {
        char ch = 'T';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Capital Alphabet");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Small Alphabet");
        else
            System.out.println("Not an alphabet");
    }
}