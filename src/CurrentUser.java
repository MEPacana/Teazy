/**
 * Created by Noah Dominic on 11/04/2017.
 */
public class CurrentUser {
    private static String firstName;
    private static String lastName;
    private static String currentSchool;
    private static String username;
    private static String password;

    /*TODO
    * private Vector<Task> taskVector = new Vector();
    * */

    public CurrentUser(){
        firstName = lastName = currentSchool = username = password = null;
    }

    public void setUp(String firstName, String lastName, String currentSchool, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentSchool = currentSchool;
        this.username = username;
        this.password = password;
    }
}
