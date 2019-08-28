package enumPractice;

public class Year {
    Months months;
    public Year(Months months){
        this.months=months;
    }
    public void whatToDo(){
        switch (months){
            case June:
                System.out.println("summer started");
                break;
            case December:
                System.out.println("winter time");
                break;
            case March:
            case April:
            case May:
            case October:
            case November:
                System.out.println("working time don't think about holiday");
                break;
            default:
                System.out.println("do whatever you want");
                break;
        }
    }
}
