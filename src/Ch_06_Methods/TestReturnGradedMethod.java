package Ch_06_Methods;

public class TestReturnGradedMethod {
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(70.5));
        System.out.print("The grade is " + getGrade(59.5));
    }
    public static char getGrade(double score) {
        if (score >= 90) {
            return 'A';
        }
        else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else if (score >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
