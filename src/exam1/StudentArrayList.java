package exam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentArrayList {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name of the Student");
        String studentName = scanner.nextLine();

        ArrayList<String>StringArrayList=new ArrayList<>();
        for (int n=0;n<StringArrayList.size();n++){
            System.out.println(StringArrayList.get(n));
        }


    }
}
