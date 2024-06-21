import java.util.ArrayList;
import java.util.List;

public class searchArray {
   public static void main(String[] args) {
      List<Student> list = new ArrayList<>();
      list.add(new Student(1, "Zara"));
      list.add(new Student(2, "Mahnaz"));
      list.add(new Student(3, "Ayan"));
      System.out.println("List: " + list);
      //Student student = new Student(3, "Ayan");
      Student missingStudent = new Student(4, "Aman");
      //System.out.println("Ayan is present at: " + list.indexOf(student));
      System.out.println("Aman index: " + list.indexOf(missingStudent));
      //System.out.println("List contains Ayan: " + list.contains(student));
      System.out.println("List contains Aman: " + list.contains(missingStudent));
   }
}
class Student {
   private int id;
   private String name;
   public Student(int id, String name) {
      this.id = id;
      this.name = name;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   @Override
   public boolean equals(Object obj) {
      if(!(obj instanceof Student)) {
         return false;
      }
      Student student = (Student)obj;
      return this.id == student.getId() && this.name.equals(student.getName());
   }
   @Override
   public String toString() {
      return "[" + this.id + "," + this.name + "]";
   }
}