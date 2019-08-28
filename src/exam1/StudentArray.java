package exam1;

public class StudentArray {
    public static void main(String[] args) {

        String[] name = new String[4];
                 name[0]="John";
                 name[1]="Bob";
                 name[2]="Kayle";
                 name[3]="Thea";
        System.out.println(name.length);
        for (String n : name){
            System.out.println(n);
        }
        String[] newArray = name.clone();
        System.out.println(newArray.length);
        System.out.println(newArray[1]);


        String[] subject = new String[4];
           subject[0]="Math";
           subject[1]="Accounting";
           subject[2]="Biology";
           subject[3]="Finance";
        System.out.println(subject.length);
        for (String s : subject){
            System.out.println(s);
        }


    }
}
