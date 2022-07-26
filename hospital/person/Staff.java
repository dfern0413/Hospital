package person;

public class Staff extends Person {
    int staffNum;
    String department;

    public Staff( int age, char sex, String fullName, int staffNum, String department){
        super(age, sex, fullName);
        this.staffNum = staffNum;
        this.department = department;
    }

}
