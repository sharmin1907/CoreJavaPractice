package mentoring;

public class Year {
    Months months;
    public Year(Months months){
        this.months=months;
    }
    public void whatToDo(){
        switch (months){
            case December:
                System.out.println("It's winter time");
                break;
            case July:
                System.out.println("Summer time");
                break;
            case November:
            case May:
            case October:
            case August:
                System.out.println("Busy for work");
                break;
            default:
                System.out.println("Do whatever you want");
                break;
        }
    }
}
