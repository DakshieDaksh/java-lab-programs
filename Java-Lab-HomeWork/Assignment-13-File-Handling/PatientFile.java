package JAVA.Lab.java-lab-programs.Java-Lab-HomeWork.Assignment-13-File-Handling;

import java.io.*;

public class PatientFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient ID: 101\n");
            writer.write("Name: Rahul\n");
            writer.write("Age: 25\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            BufferedReader reader =
                    new BufferedReader(new FileReader("patient.txt"));

            String line;

            System.out.println("Patient Details:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
