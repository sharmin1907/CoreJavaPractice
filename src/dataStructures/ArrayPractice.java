package dataStructures;

public class ArrayPractice {

    public static void main(String[] args) {
        //Array -- []
        String [] name = {"Mr X", "Mr Y","Mr Z","Mr A","Mr B"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name.length);
        System.out.println("**************");

        for(int a =0;a<name.length;a++){
            System.out.println(name[a]);
        }

        System.out.println("***************");

       /* int [] numbers ={12,13,23,543,7654};
        Object [] objectArray = {"Mr B",1};
        for (int i = 0; i <objectArray.length; i++){
            System.out.println(objectArray[i]);
        }*/


        System.out.println("*****************");

        //enhanced for loop / for each

        int [] id ={12,13,23,543,7654};
        for (int s : id){
            System.out.println(s);
        }
        System.out.println("*******New types of Array**********");

        int [] numbers =new int[3];
        numbers[0]=12;
        numbers[1]=13;
        numbers[2]=17;
        System.out.println(numbers.length);
        System.out.println(numbers[2]);
        int [] newArray = numbers.clone();
        System.out.println(newArray.length);
        System.out.println(newArray[1]);

        //creating string array
        String [] person = new String[4];
        person[0]="David";
        person[1]="John";
        person[2]="Thea";
        person[3]="Orion";
        System.out.println(person.length);
        System.out.println(person[2]);
        for (String s : person){
            System.out.println(s);
        }
        String [] newString = person.clone();
        System.out.println(newString.length);
        System.out.println(newString[1]);
    }


}


