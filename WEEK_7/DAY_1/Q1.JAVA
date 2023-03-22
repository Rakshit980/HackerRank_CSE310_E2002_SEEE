import java.util.Scanner;

public class TestEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctAnswers = sc.nextLine().toUpperCase();
        int numStudents = sc.nextInt();
        sc.nextLine(); 
        String[] studentAnswers = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            String answers = sc.nextLine().toUpperCase();
            studentAnswers[i] = answers;
        }
        double[] marks = evaluateTestPapers(correctAnswers, studentAnswers);
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
    }
    public static double[] evaluateTestPapers(String correctAnswers, String[] studentAnswers) {
        int numQuestions = correctAnswers.length();
        int numStudents = studentAnswers.length;
        double[] marks = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            String answers = studentAnswers[i];
            double mark = 0.0;
            if (answers.length() != numQuestions) {
                System.out.println("Incorrect Input");
                return null;
            }
            for (int j = 0; j < numQuestions; j++) {
                char correctAnswer = correctAnswers.charAt(j);
                char studentAnswer = answers.charAt(j);
                if (studentAnswer == 'X') {
                    continue; 
                } else if (studentAnswer == correctAnswer) {
                    mark += 1.0; 
                } else {
                    mark -= 0.25; 
                } }
            marks[i] = mark; }
        return marks; }}