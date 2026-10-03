import java.util.Scanner;
class RooftopSolarEnergyMonitorB{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Energy Generated in kWh: ");
int EnergyGenerated;
EnergyGenerated=sc.nextInt();

if(EnergyGenerated>=10){

System.out.println("Good Energy Generation");

 }else {
System.out.println("Low Energy Generation");

}
}
}