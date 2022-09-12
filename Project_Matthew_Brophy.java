import java.util.Scanner;

public class Project_Matthew_Brophy
{
   public static void main(String[] args)
   {
      String demoNumber;
      String demoProvider;
      String demoFirstName;
      String demoLastName;
      int demoAge;
      String demoSmoker;
      double demoHeight;
      double demoWeight;
      double demoBMI = 0;
      double demoPrice = 0.00;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      demoNumber = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      demoProvider = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      demoFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      demoLastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      demoAge = keyboard.nextInt();
      
      System.out.print("Please enter the Policyholder's Smoking Status: ");
      demoSmoker = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height: ");
      demoHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight: ");
      demoWeight = keyboard.nextDouble();
      
      Policy demoPolicy = new Policy(demoNumber, demoProvider, demoFirstName, 
                                     demoLastName,  demoAge, demoSmoker, 
                                     demoHeight, demoWeight, demoBMI, demoPrice);
                                     
      demoBMI = demoPolicy.getBMI();
      demoPrice = demoPolicy.getPrice();
      
      System.out.println("Policy Number: " + demoPolicy.getNumber());
      System.out.println("Provider Name: " + demoPolicy.getProvider());
      System.out.println("Policyholder's First Name: " + demoPolicy.getFirst());
      System.out.println("Policyholder's Last Name: " + demoPolicy.getLast());
      System.out.println("Policyholder's Age: " + demoPolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + demoPolicy.getSmoker());
      System.out.println("Policyholder's Height: " + demoPolicy.getHeight());
      System.out.println("Policyholder's Weight: " + demoPolicy.getWeight());
      System.out.println("Policyholder's BMI: " + demoPolicy.getBMI());
      System.out.println("Policy Price: " + demoPolicy.getPrice());     
   }
}
      