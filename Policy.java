// Apologies for the lack of comments.  They will be present in the final project. //

public class Policy
{
   // Fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   private double BMI;
   private double price;
   
   // Constructor
   public Policy(String number, String provider, String first, String last, int age,
                 String smoker, double height, double weight, double BMI, double price)
   {
      policyNumber = number;
      providerName = provider;
      firstName = first;
      lastName = last;
      holderAge = age;
      smokingStatus = smoker;
      holderHeight = height;
      holderWeight = weight;
    }
    
    public void setNumber(String number)
    {
      policyNumber = number;
    }
    
    public void setName(String provider)
    {
      providerName = provider;
    }
    
    public void setFirst(String first)
    {
      firstName = first;     
    }
    
    public void setLast(String last)
    {
      lastName = last;
    }
    
    public void setAge(int age)
    {
      holderAge = age;
    }
    
    public void setSmoker(String smoker)
    {
      smokingStatus = smoker;
    }
    
    public void setHeight(double height)
    {
      holderHeight = height;
    }
    
    public void setWeight(double weight)
    {
      holderWeight = weight;
    }
    
    // return
    public String getNumber()
    {
      return policyNumber;
    }
    
    public String getProvider()
    {
      return providerName;
    }
    
    public String getFirst()
    {
      return firstName;
    }
    
    public String getLast()
    {
      return lastName;
    }
    
    public int getAge()
    {
      return holderAge;
    }
    
    public String getSmoker()
    {
      return smokingStatus;
    }
    
    public double getHeight()
    {
      return holderHeight;
    }
    
    public double getWeight()
    {
      return holderWeight;
    }   
    
    public double getBMI()
    {
      double BMI = (holderWeight * 703) / (holderHeight * holderHeight);
      return BMI;
    }
    
    public double getPrice()
    {
      double base = 600;
      double ageFee = 0;
      double smokerFee = 0;
      double BMIFee = 0;
      
      if(holderAge > 50)
      {
         ageFee = 75;
      }
      
      if(smokingStatus == "Y")
      {
         smokerFee = 100;
      }
      
      if(BMI > 35)
      {
         BMIFee = (BMI - 35) * 20;
      }
      
      double price = (base + ageFee + smokerFee + BMIFee);
      return price;
   }   
 }
      
    