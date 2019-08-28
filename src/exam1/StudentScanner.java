package exam1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class StudentScanner {
    public static void studentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name of the student");
        String studentName = scanner.nextLine();
        System.out.println("Insert subject1 of the student");
        String subject1 = scanner.nextLine();
        System.out.println("Insert marks of subject1");
        int marks1 = scanner.nextInt();
        System.out.println("Insert subject2 of the student");
        String subject2 = scanner.next();
        System.out.println("Insert marks of subject2");
        int marks2 = scanner.nextInt();
        System.out.println("Insert subject3 of the student");
        String subject3 = scanner.next();
        System.out.println("Insert marks of subject3");
        int marks3 = scanner.nextInt();
        System.out.println("Insert subject4 of the student");
        String subject4 = scanner.next();
        System.out.println("Insert marks of subject4");
        int marks4 = scanner.nextInt();
        int totalMarks = (marks1 + marks2 + marks3 + marks4);
        System.out.println("Total marks is: " + totalMarks);
        int avgMarks = totalMarks / 4;
        System.out.println("Average marks is: " + avgMarks);


    }

    public static void main(String[] args) {
        studentInfo();
    }
}
