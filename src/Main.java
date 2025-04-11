//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GradeManager manager = new GradeManager(5);

        int[] grades = {32, 90, 90, 92, 12};

        for (int grade : grades) {
            manager.addGrade(grade);
        }

        System.out.println("Original grades: ");
        manager.displayGrades();

        System.out.println("Sorted grades: ");
        manager.sortGrades();
        manager.displayGrades();

        System.out.println("Index of grade 90: " + manager.searchGrade(90));

        try {
            System.out.println("Grade at index 10: " + manager.getGrade(10)); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

