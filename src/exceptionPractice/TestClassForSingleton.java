package exceptionPractice;

public class TestClassForSingleton {
    String x;
    private static TestClassForSingleton testClassForSingleton = null;

    //1.create private constructor
    private TestClassForSingleton() {
        x = "this is a singleton class";
    }
    //TestClassForSingleton testClassForSingleton =new TestClassForSingleton();
    //3.creating a public method
     public static TestClassForSingleton getInstance(){
        if(testClassForSingleton==null)

    {
        testClassForSingleton = new TestClassForSingleton();
    }
        return testClassForSingleton;
}
}
