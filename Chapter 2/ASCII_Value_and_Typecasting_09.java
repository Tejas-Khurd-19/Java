// ASCII is a way to turn letters, numbers, and symbols into numbers so computers can understand them.

// Imagine you have a secret code where every letter and number has its own number. For example:

// The letter A becomes the number 65.
// The letter B becomes the number 66.
// The number 1 becomes 49.

public class ASCII_Value_and_Typecasting_09 {
    public static void main(String[] args) {
        char ch = 'A'; 
        int x = (int)ch; // Typecasting
        // Typecasting in Java refers to converting one data type into another.
        System.out.println(ch+", ASCII is: "+x);
        
        // int x = ch; is direct method to conert but {int x=(int)ch} is good practice 
    }
}
