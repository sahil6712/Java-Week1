// Question
// Create a program to convert the distance of 10.8 kilometers to miles.
// Hint: 1 km = 1.6 miles
// I/P => NONE
// O/P => The distance  ___ km in miles is ___


public class DistanceConversion {
    public static void main(String[] args) {
        // given distance in kilometers
        double distanceInKm = 10.8;

        // converting kilometers into miles
        double distanceInMile = distanceInKm / 1.6;

        // showing the output
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMile);
    }
}
