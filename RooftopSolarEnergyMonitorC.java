import java.util.Scanner;
class RooftopSolarEnergyMonitorC{
 static double calculateTotalEnergy(double morningEnergy,double eveningEnergy){

return morningEnergy+eveningEnergy;

}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Morning Energy units: ");
double morningEnergy=sc.nextDouble();
System.out.println("Enter Evening Energy units: ");
double eveningEnergy=sc.nextDouble();
double totalEnergy=  calculateTotalEnergy(morningEnergy,eveningEnergy);
System.out.println("Total Energy units: "+totalEnergy);
}
}
