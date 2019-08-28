package enumPractice;

public class Execution {
    public static void main(String[] args) {
        Week week = new Week(Days.Holiday);
        week.whatToDo();
        System.out.println("***From months and year class*****");
        Year year = new Year(Months.April);
        year.whatToDo();
    }
}
