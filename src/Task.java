public class Task {
    String description, category, deadline;
    int month, day, year;
    boolean done = false;

    private static int MONTH = 0;
    private static int DAY = 1;
    private static int YEAR = 2;
    private static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private static int daysinmonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean correct = false;

    public Task (){
        description = "<C'est un task default.>";
        category = "<C'est une categori default>";
        deadline = "<Vous pouvez le faire un jour>";
    }

    public Task (String desc, String deadlinestr, String category) throws Exception {
        this(desc, deadlinestr.split("/"), category);
    }

    public Task (String desc, String deadline[], String category) throws Exception {
        if(deadline.length > 3 || desc.length() == 0) {
            throw new Exception();
        }

        try {
            month = Integer.parseInt(deadline[MONTH]);
            day = Integer.parseInt(deadline[DAY]);
            year = Integer.parseInt(deadline[YEAR]);
            if(!isDateCorrect())
                throw new Exception();
        } catch (Exception e) {
            throw new Exception();
        }

        this.description = desc;

        this.category = category;
    }

    public String toStringDesc () {
        return description;
    }

    public String toStringDeadline (){
        return "due on " + months[month-1] + " " + day + ", " + year;
    }

    private boolean isDateCorrect() {
        correct = false;
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
            daysinmonth[1]=29;

        if (month < 13 && month > 0){
            if(day <= daysinmonth[month-1] && day > 0)
                if (year > 0)
                    correct = true;
        }

        return correct;
    }

    public void makeDone(){
        done = true;
    }

    public boolean isDone() {
        return done;
    }
}