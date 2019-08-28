package mentoring;

import java.util.Scanner;

public class TestScannerPractice {
    public static int calculator(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x+y;
        return z;
    }

    public static void employeeInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert name of the employee");
        String name = scanner.nextLine();
        System.out.println("insert age of the employee");
        int age = scanner.nextInt();
        System.out.println("insert gender of the employee");
        char gender = scanner.next().charAt(0);
        System.out.println("insert phNumber of the employee");
        long phNumber = scanner.nextLong();
        System.out.println("Employee name is: "+name);
        System.out.println("Employee age is: "+age);
        System.out.println("Employee gender is: "+gender);
        System.out.println("Employee phone number is: "+phNumber);
    }

    public static void main(String[] args) {
       // int result = calculator();
       // System.out.println(result);

        employeeInfo();
    }

}
