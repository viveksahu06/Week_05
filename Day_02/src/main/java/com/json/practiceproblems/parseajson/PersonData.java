package com.json.practiceproblems.parseajson;


public class PersonData {
    String name;
    int age;
    String email;
    public PersonData(){}

    //Constructor to initialize
    public PersonData(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

