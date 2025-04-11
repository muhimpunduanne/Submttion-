import java.util.Arrays;

public class GradeManager {
    private int[] grades;
    private int count;

    public GradeManager(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than zero.");
        }
        grades = new int[size];
        count = 0;
    }
    public void addGrade(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Grade cannot be negative.");
        }
        if (count >= grades.length) {
            throw new ArrayIndexOutOfBoundsException("No more grades can be added.");
        }
        grades[count] = grade;
        count++;
    }

    public void displayGrades() {
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }

    // Method to sort grades
    public void sortGrades() {
        Arrays.sort(grades, 0, count); // Sort only added grades
    }

    public int searchGrade(int grade) {
        for (int i = 0; i < count; i++) {
            if (grades[i] == grade) {
                return i; // Return index of the grade
            }
        }
        return -1; // Grade not found
    }

    public int getGrade(int index) {
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        return grades[index];
    }
}

