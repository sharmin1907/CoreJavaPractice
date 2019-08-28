package exceptionPractice;

public class ExceptionHandlingClassWork {
    public static void main(String[] args) {
        //create an int array with 3 index. try to print last index+1's value
        //handle in the try catch block
        //print "exception occurred"

        int[] num ={12,13,14};
        try {
            System.out.println(num[3]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("exception occurred");
        }
    }
}
