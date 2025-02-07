// Write a Java program to calculate the percentage of a student based on the marks obtained in 4 subjects. 
// Each subject has a total of 60 marks.

public class Percentage_Calculator_11 {
    public static void main(String[] args) {
       
        double subject1 = 50; 
        double subject2 = 55; 
        double subject3 = 58; 
        double subject4 = 60; 

        double totalMarks = subject1 + subject2 + subject3 + subject4;

        double maxMarks = 240;

        double percentage = totalMarks / 2.4;

        System.out.println("Total Marks: " + totalMarks + " / " + maxMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}

