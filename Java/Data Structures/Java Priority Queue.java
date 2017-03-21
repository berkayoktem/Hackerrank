import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      PriorityQueue<Student> queue = new PriorityQueue<Student>(totalEvents, new CompareTo());
      while(totalEvents > 0){
         String event = in.next();
         if(event.equals("ENTER")) {
             String name = in.next();
             double cgpa = in.nextDouble();
             int token = in.nextInt();
             queue.add(new Student(token, name, cgpa));
         }
         else if(event.equals("SERVED")) {
             queue.poll();
         }
         totalEvents--;
      }
      if(queue.isEmpty()) {
          System.out.println("EMPTY");
      }
      else {
          while(!queue.isEmpty()) {
              Student stu = queue.remove();
              System.out.println(stu.getFname());
          }
      }
    }
}

class CompareTo implements Comparator<Student> {
    double e = 0.001;
    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > e) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
        } else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getToken() - s2.getToken();
        }
    }
}
