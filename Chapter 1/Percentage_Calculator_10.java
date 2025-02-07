// Write a Java program to calculate the percentage of a student based on the marks obtained in 5 subjects.
// Each subject has a total of 100 marks.

public class Percentage_Calculator_10 {
    public static void main(String[] args) {
        
        double subject1 = 92; 
        double subject2 = 90; 
        double subject3 = 98; 
        double subject4 = 92; 
        double subject5 = 94; 

    
        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

    
        double percentage = totalMarks / 5;

        System.out.println(percentage);
    }
}
