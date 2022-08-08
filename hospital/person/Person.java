package person;

import exceptions.InvalidNameException;

import java.util.Objects;

public abstract class Person {
    String fullName;

    public Person(String fullName) {
        try {
            this.fullName = fullName;
            ValidatePersonName();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

    public void ValidatePersonName() throws InvalidNameException {
        if(fullName == null || fullName.equals("")){
            throw new InvalidNameException("Name Cannot be blank");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
