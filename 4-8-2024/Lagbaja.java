import java.util.Scanner;

public class Lagbaja {
    private String courseName;
    private int[][] grades; 

    public Lagbaja(String courseName, int[][] grades) {
        this.courseName = courseName; 
        this.grades = grades; 
    } 

    public void setCourseName(String courseName) {
        this.courseName = courseName; 
    } 

    public String getCourseName() {
        return courseName;
    } 

    public double getAverage(int[] setOfGrades) { 
        int total = 0; 
        for (int grade : setOfGrades) { 
            total += grade; 
        } 
        return (double) total / setOfGrades.length; 
    } 


	public int getTotal(int[] setOfGrades) { 
        int total = 0; 
        for (int grade : setOfGrades) { 
            total += grade; 
        } 
        return total; 
    } 

public void outputGrades() {
    System.out.printf("%-15s", ""); 
    
    for (int subject = 0; subject < grades[0].length; subject++) {
        System.out.printf("Sub %d ", subject + 1);
    }
    System.out.printf("Total  Average%n");

    
    for (int student = 0; student < grades.length; student++) {
        System.out.printf("Student %2d", student + 1); 
        for (int subject : grades[student]) {
            System.out.printf("%8d", subject);
        }

         int total = getTotal(grades[student]);
        double average = getAverage(grades[student]);
        System.out.printf("%8d%8.2f%n", total, average);
    }
}


        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course name: ");
        String courseName = input.nextLine();

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        
        int[][] gradesArray = new int[numStudents][numSubjects];

        
        for (int index = 0; index < numStudents; index++) {
            System.out.printf("Enter grades for Student %d:%n", index + 1);
            for (int count = 0; count < numSubjects;count++) {
                System.out.printf("Subject %d: ", count + 1);
                gradesArray[index][count] = input.nextInt();
            }
        }

        var myGradeBook = new Lagbaja(courseName, gradesArray);

       
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.outputGrades();

            }
}
