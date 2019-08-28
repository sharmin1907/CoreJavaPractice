package utility;

import java.util.Scanner;

public class TestScanner {
    public static int calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********** insert first value ************");
        int a = scanner.nextInt();
        System.out.println("************* insert second value ***********");
        int b = scanner.nextInt();
        int c = a+b;
        return c;
    }

    public static void studentInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** insert name of the student");
        String name = scanner.nextLine();
        System.out.println("*** insert age of the student");
        int age = scanner.nextInt();
        System.out.println("*** insert mobileNumber of the student");
        long mobileNumber = scanner.nextLong();
        System.out.println("*** insert gender of the student");
        char gender = scanner.next().charAt(0);
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Mobile Number is : "+mobileNumber);
        System.out.println("Gender is : "+gender);
    }

    public static void main(String[] args) {
        //int result = calculator();
        //System.out.println("My total value is: "+result);
        studentInfo();
    }

}
