import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

 System.out.println("Enter the units, Fahrenheit or Celcius");
  String unit = input.nextLine();
  if (!unit.equals("Fahrenheit") || !unit.equals("Celcius")){
    System.out.println("Now exiting ... Could not convert given unit types :/");
  }
  else if (unit.equals("Fahrenheit") || unit.equals("Celcius")){
 System.out.println("Enter a temperature"); 
  double temp = input.nextDouble();

  if (unit.equals("Fahrenheit")){
    temp = (temp - 32) * 5 / 9;
    System.out.println(temp+" °Celcius");
  if (temp > 0){
    System.out.println("The temperature is above freezing");
  }
  else {
    System.out.println("The temperature is below freezing");
  }
  }
else if (unit.equals("Celcius")){
temp = (temp * 9/5) + 32;
System.out.println(temp+" °Fahrenheit");

if (temp > 32){
    System.out.println("The temperature is above freezing");
  }
  else {
    System.out.println("The temperature is below freezing");
  }
}
  }
  }
}
