package unit2.loopPractice;
import codehs.ConsoleProgram;


/**
 * Write a program TripCalculator that allows the user to enter how many trips they’ve travelled (in km)
 * and then the distance travelled for each trip.It should then output the total distance travelled.
 *
 * Modify #4 so that it calculates the total amount spent on fuel by allowing the user to specify
 * the fuel economy of a car (litres/100 km), and then output the distance and
 * cost of fuel (in $/L) for the total trip.
 */
public class TripCalculator extends ConsoleProgram{

    public void run(){

        int numTrips = readInt("Enter the number of trips: ");
        double distance;
        double totalDistance = 0;
        double fuelEfficiency, fuelCostPerLitre;
        double totalLitres, fuelCost;

        fuelEfficiency = readDouble("Enter the fuel efficiency of the car: ");
        fuelCostPerLitre = readDouble("Enter the cost of fuel (for one litre): ");

        for(int tripCount = 1; tripCount <= numTrips; tripCount++){
            distance = readDouble("Enter the distance travelled for trip " + tripCount + ": ");
            totalDistance += distance;
        }

        totalLitres = (fuelEfficiency * totalDistance)/100.0;
        fuelCost = fuelCostPerLitre * totalLitres;

        System.out.println("The total fuel cost is " + Math.round(fuelCost * 100)/100.0);


    }
}
