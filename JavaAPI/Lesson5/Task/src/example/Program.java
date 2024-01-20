package example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Teacher{
    String name;
    String surName;
    String subject;
    Teacher(String name, String surName, String subject){
        this.name = name;
        this.surName = surName;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

class Class{
    Integer number;
    String literal;
    public Class(Integer number, String literal) {
        this.number = number;
        this.literal = literal;
    }
    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", literal='" + literal + '\'' +
                '}';
    }
}

public class Program {
    public static void main(String[] args) {
        Map<Teacher, LinkedList<Class>> school = new HashMap<Teacher, LinkedList<Class>>();
        LinkedList<Class> classes1 = new LinkedList<Class>();
        classes1.add(new Class(1, "A"));
        classes1.add(new Class(2, "A"));
        classes1.add(new Class(1, "B"));
        classes1.add(new Class(1, "C"));
        school.put(new Teacher("David", "Smith", "math"), classes1);
        LinkedList<Class> classes2 = new LinkedList<Class>();
        classes2.add(new Class(3, "A"));
        classes2.add(new Class(2, "B"));
        classes2.add(new Class(1, "A"));
        classes2.add(new Class(1, "C"));
        school.put(new Teacher("Maria", "Adams", "literature"), classes2);

        for (Map.Entry<Teacher, LinkedList<Class>> item: school.entrySet()) {
            System.out.printf("Teacher: %s\n", item.getKey());
            for (Class class_item: item.getValue()) {
                System.out.printf("\tClass: %s\n", class_item);
            }
        }
        
    }
}
