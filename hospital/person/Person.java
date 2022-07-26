package person;

import java.util.Objects;

public class Person {
    int age;
    char sex;
    String fullName;

    public Person(int age, char sex, String fullName){
        this.age = age;
        this.sex = sex;
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && sex == person.sex && Objects.equals(fullName, person.fullName);
    }

    // Getters
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public char getSex() {
        return sex;}

    // Setters
    public void setSex(char sex) {
        this.sex = sex;}
    public String getFullName() {
        return fullName;}
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
