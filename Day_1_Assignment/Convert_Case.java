package Capgemini;

class Convert_Case {
    public static void main(String[] args) {
        char ch = 'M';
        char result = Character.toLowerCase(ch);
        System.out.println("Converted character: " + result);
        char letter = 'b';
        if(letter >= 'a' && letter <= 'z') {
        	char caps = (char)(letter - 32);
        	System.out.println("Converted character: " + caps);
        }else {
        	char small = (char)(letter + 32);
        	System.out.println("Converted character: " + small);
        }
    }
}