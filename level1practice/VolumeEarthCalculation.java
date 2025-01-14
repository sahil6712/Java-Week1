// Question
// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____


public class VolumeEarthCalculation {
    public static void main(String[] args) {
        
        // radious of earth in km
        int radiusOfEarth = 6378;

        // calculating volume of earth
        long volumeEarthKm = (long) (4.0 / 3.0 * Math.PI * Math.pow(radiusOfEarth, 3));

        // conversion of cubic kilometers into cubic miles
        long volumeEarthMiles = (long)((double) volumeEarthKm * 0.239913);

        // output
        System.out.println("The volume of earth in cubic kilometers is "+ volumeEarthKm +" and cubic miles is " + volumeEarthMiles);
    }
}
