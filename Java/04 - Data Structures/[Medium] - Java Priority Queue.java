// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.util.PriorityQueue;
import java.util.Comparator;
import java.lang.*;
/*
The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
*/

class StudentComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student uno, Student due) {
        if (uno.getCGPA() == due.getCGPA()) {
            if (uno.getName() == due.getName()) {
                return uno.getID() - due.getID();
            }
            return uno.getName().compareTo(due.getName());
        }
        return Double.compare(due.getCGPA(), uno.getCGPA());
    }
}

class Student {
    String name;
    Double cgpa;
    int id;
    
    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID() { return this.id; }
    public String getName() { return this.name; }
    public double getCGPA() { return this.cgpa; }
    
    
}

class Priorities {
    PriorityQueue<Student> students;
    
    public Priorities() {
        students = new PriorityQueue<Student>(new StudentComparator());
    }
    
    public List<Student> getStudents(List<String> events) { 
        
        for (String e : events) {
            
            String[] values = e.split(" ");
                        
            if (values[0].equals("ENTER")) {
                students.add(new Student(values[1],Double.parseDouble(values[2]),Integer.parseInt(values[3])));
            } else if (values[0].equals("SERVED")) {
                students.poll();
            } else {
                System.out.println("Errore");
            }
        }
        
        //Ritorno una lista ordinata
        List<Student> test = new ArrayList<Student>();
        while (!students.isEmpty()) {
            test.add(students.poll());
        }
        
        return test;
                                                          
    }
    
}
