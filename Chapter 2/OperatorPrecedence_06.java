// Hierarchy of Operations in Java 

public class OperatorPrecedence_06 {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;  // Multiplication (*) has higher precedence than addition (+)
        System.out.println(result); // Output: 20 (5 * 2 = 10, then 10 + 10 = 20)

        int result2 = (10 + 5) * 2; // Parentheses change precedence
        System.out.println(result2); // Output: 30 (10 + 5 = 15, then 15 * 2 = 30)
        
        int result3a = 2*3/4+7/4+8-2+5/8-2+5/8;
        System.out.println(result3a);
        
        // result3A = result3b
        int result3b = ((2*3)/4)+(7/4)+8-2+(5/8)-2+(5/8);
        System.out.println(result3b);

        boolean check = 10 > 5 && 5 < 2 || 3 == 3;
        System.out.println(check); // Output: true (AND evaluated first, then OR)
    }
}
