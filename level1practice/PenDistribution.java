// Question
// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
// Hint => 
// Use Modulus Operator (%) to find the reminder.
// Use Division Operator to find the Quantity of pens
// I/P => NONE
// O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___


public class PenDistribution {
    public static void main(String[] args) {

        // given details
        int totalPen = 14, numberOfStudent = 3;
        
        // calculating pen distribution
        int penPerStudent = totalPen / numberOfStudent;

        // remaning pen not distributed
        int remainingPen = totalPen % numberOfStudent;

        // printing the result
        System.out.println("The Pen Per Student is "+ penPerStudent +" and the remaning pen not distributed is "+ remainingPen);
    }
}
