import java.util.Scanner;
class RooftopSolarEnergyMonitorA{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter Panel ID: ");
        int PanelID;
        PanelID=sc.nextInt();
    
    System.out.println("Enter Energy Generated in kWh: ");    
    double EnergyGenerated;
        EnergyGenerated=sc.nextDouble();

   System.out.println("Enter Number of Solar Panels: ");
    int NumberOfSolarPanels;
        NumberOfSolarPanels=sc.nextInt();
        
   System.out.println("Enter System Status: ");
        char SystemStatus;
        SystemStatus=sc.next().charAt(0);
        
   
    System.out.println("Panel ID: " + PanelID);
      System.out.println("Energy Generated in kWh: " + EnergyGenerated);
    System.out.println("Number of Solar Panels: " + NumberOfSolarPanels);
System.out.println("System Status: " + SystemStatus);  
}
}