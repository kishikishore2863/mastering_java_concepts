package miniP;

import jdk.jshell.execution.Util;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student(101,"leana","A+");
        Student s2 = new Student(101,"akash","A");
        Student s3 = new Student(101,"kavya","B");
        Student s4 = new Student(101,"sahana","D");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

//        System.out.println(list);

//        for(Student s :list){
//            System.out.println(s);
//        }

//        System.out.println("enter 0 to insert student");
//        insert( list);

//        Iterator<Student> s = list.iterator();
//        while (s.hasNext()){
//            System.out.println(s);
//            s.next();
//        }

        ListIterator<Student> back = list.listIterator(list.size());
        while (back.hasPrevious()) {
            System.out.println(back.previous());
        }
    }

//    public static void insert(List list){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter id");
//        int id = scanner.nextInt();
//        System.out.println("enter name");
//        String name = scanner.next();
//        System.out.println("enter grade");
//        String grade = scanner.next();
//
//        Student student = new Student(id,name,grade);
//        list.add(student);
//        System.out.println("inserted student");
//        System.out.println(list);
//
//    }
}
