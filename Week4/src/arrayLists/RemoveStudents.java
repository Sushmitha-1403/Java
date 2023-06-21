package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveStudents {

    public static void main(String[] args) {
        List<StudentsArray> studentsList = new ArrayList<>();
        studentsList.add(new StudentsArray("vishal", "cis", 3.3));
        studentsList.add(new StudentsArray("vivek", "cis", 3.4));
        studentsList.add(new StudentsArray("kranthi", "cis", 3.5));
        studentsList.add(new StudentsArray("sushmitha", "cis", 3.7));


        double totalGpa = 0;
        for (StudentsArray student : studentsList) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / studentsList.size();

        System.out.println("Average GPA: " + averageGpa);
        System.out.println("Students before removal: " + studentsList);

        Iterator<StudentsArray> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            StudentsArray student = iterator.next();
            if (student.getGpa() < averageGpa) {
                iterator.remove();
            }
        }
        System.out.println("Students after removal: " + studentsList);
    }
}