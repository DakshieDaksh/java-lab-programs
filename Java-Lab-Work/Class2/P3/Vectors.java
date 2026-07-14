import java.util.Vector;

/*

Programme for Vector in Java
Vectors are similar to ArrayList but are synchronized, 
 can grow and shrink in size, 
 allows duplicate elements, 
 maintains insertion order.
 Slower then arrayList because of synchronization overhead.

*/
public class Vectors {

  public static void main(String[] args) {
    Vector<String> cities = new Vector<>();

    // Adding elements
    cities.add("Mumbai");
    cities.add("Pune");
    cities.add("Delhi");

    // Display elements
    System.out.println("Vector: " + cities);

    // Access an element
    System.out.println("First City: " + cities.get(0));

    // Update an element
    cities.set(1, "Bangalore");
    System.out.println("After Update: " + cities);

    // Remove an element
    cities.remove("Delhi");
    System.out.println("After Removal: " + cities);

    // Size of Vector
    System.out.println("Size: " + cities.size());
  }
}

/*
ASSIGNMENTS DUE

1
2
3
4
5
6


*/
