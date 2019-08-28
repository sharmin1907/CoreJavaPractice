package dataStructures;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Mr.X");
        arrayList.add("Mr.Y");
        arrayList.add("Mr.Z");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
        System.out.println("*************After**********");
        arrayList.remove(2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));

        arrayList.clear();
        System.out.println(arrayList.size());

        /*ArrayList<String>stringArrayList=new ArrayList<>();
        stringArrayList.add("John");
        stringArrayList.add("Kale");
        for (int i=0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }*/


    }
}
