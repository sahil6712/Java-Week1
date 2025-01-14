// Question
// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
// I/P => NONE
// O/P => Sam’s average mark in PCM is ___ 


public class AverageMarks {
    public static void main(String[] args) {

        // storing name in string variable
        String studentName = "Sam";

        int mathsMark = 94, physicsMark = 95, chemistryMark = 96;
        int totalMark = 100 + 100 + 100;
        int totalMarkObtain = mathsMark + physicsMark + chemistryMark;
        
        // calculating the avg marks obtained
        double averageMark = (double)totalMarkObtain / (double)totalMark * 100;

        System.out.println(studentName + "'s average mark in PCM is " + averageMark + "%");

    }
}
