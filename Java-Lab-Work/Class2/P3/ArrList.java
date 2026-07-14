import java.util.ArrayList;

/*

Programme for ArrayList in Java
Dynamic Array,
 can grow and shrink in size, 
 allows duplicate elements, 
 maintains insertion order, 
 not synchronized.


*/

public class ArrList {

  public static void main(String[] args) {
    ArrayList<String> students = new ArrayList<>();
    ArrayList<Integer> marks = new ArrayList<>();
    // Adding elements
    students.add("Daksh");
    students.add("Harpal");
    students.add("Dhyana");
    marks.add(100);
    marks.add(69);
    marks.add(67);
    // Display elements
    System.out.println("ArrayList: " + students);
    System.out.println("Marks: " + marks);

    // Access an element
    System.out.println("First Student: " + students.get(0));

    // Update an element
    students.set(1, "Arpan");
    System.out.println("After Update: " + students);

    System.out.println("Size: " + students.size());
    // Remove an element
    students.remove("Dhyana");
    System.out.println("After Removal: " + students);

    // Size of ArrayList
    System.out.println("Size: " + students.size());
  }
}
