package enumPractice;

public class Week {
    Days days;

    public Week(Days days) {
        this.days = days;
    }

    public void whatToDo() {
        //switch(enum){--switch block starts
          //case --- keywords enum value
             //action against case
              //break--keyword
          //case --- keywords enum value
             //action against case
              //break --keyword
          //default:
              //action against default
               //break --keyword
        //}--switch block ends
        switch (days) {
            case Saturday:
                System.out.println("It's holiday i am not working");
                break;
            case Sunday:
                System.out.println("i am going for movie");
                break;
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("I am going to work today");
                break;
            default:
                System.out.println("I am going for vacation");
                break;
        }
    }

}
