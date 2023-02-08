/*
* Table Printout
* Step 1. Caculate scale
* Step 2. Caculate charging power for different currents and phases
* Step 3. Caculate charging time Charging time = Battery capacity (KWh) / Charging power(kWh)
* Step 4. printf() all formated data
*
*@Haiwei, haiweiliu
*/
class Main {
  // List all constants
  final static double VOLTAGE_230 = 230;
  final static double VOLTAGE_400 = 400;
  final static double BATTERRY_CAPACITY = 35.8;

  public static void main(String[] args) {
    // Declare varibles for current (5 such values)
    double current1 = 10.0;
    double current2 = 16.0;
    double current3 = 10.0;
    double current4 = 16.0;
    double current5 = 32.0;
    
    // Declare varibles for charging power(5 such values)
    double chargingPower1 = 0.0;
    double chargingPower2 = 0.0;
    double chargingPower3 = 0.0;
    double chargingPower4 = 0.0;
    double chargingPower5 = 0.0;
    
    // Declare varibles for charging time(5 such values)
    double chargingTime1 = 0.0;
    double chargingTime2 = 0.0;
    double chargingTime3 = 0.0;
    double chargingTime4 = 0.0;
    double chargingTime5 = 0.0;

    // Rounding scale
    int noOfDecimals = 2;
    double scale = 0;
    scale = Math.pow(10, noOfDecimals);

    // Caculate all the charging power and charging time
    chargingPower1 = (current1 * VOLTAGE_230) / 1000;
    chargingPower1 = Math.round(chargingPower1 * scale) / scale;
    chargingTime1 = BATTERRY_CAPACITY / chargingPower1;
    chargingTime1 = Math.round(chargingTime1 * scale) / scale;

    chargingPower2 = (current2 * VOLTAGE_230) / 1000;
    chargingPower2 = Math.round(chargingPower2 * scale) / scale;
    chargingTime2 = BATTERRY_CAPACITY / chargingPower2;
    chargingTime2 = Math.round(chargingTime2 * scale) / scale;

    chargingPower3 = (current3 * VOLTAGE_400* Math.sqrt(3)) / 1000;
    chargingPower3 = Math.round(chargingPower3 * scale) / scale;
    chargingTime3 = BATTERRY_CAPACITY / chargingPower3;
    chargingTime3 = Math.round(chargingTime3 * scale) / scale;

    chargingPower4 = (current4 * VOLTAGE_400* Math.sqrt(3)) / 1000;
    chargingPower4 = Math.round(chargingPower4 * scale) / scale;
    chargingTime4 = BATTERRY_CAPACITY / chargingPower4;
    chargingTime4 = Math.round(chargingTime4 * scale) / scale;

    chargingPower5 = (current5 * VOLTAGE_400* Math.sqrt(3)) / 1000;
    chargingPower5 = Math.round(chargingPower5 * scale) / scale;
    chargingTime5 = BATTERRY_CAPACITY / chargingPower5;
    chargingTime5 = Math.round(chargingTime5 * scale) / scale;

    // Print out table 
    System.out.printf("%-7s %-4s %-5s %n", "Battery:", BATTERRY_CAPACITY, "(kwh)");
    System.out.printf("%-10s %-10s %-20s %-15s %n", "Current(A)", "Voltage(V)", "Charging Power(KW)",
        "Charging Time(h)");
     System.out.printf("%-10s %-10s %-20s %-15s %n", current1, VOLTAGE_230, chargingPower1,
        chargingTime1);
      System.out.printf("%-10s %-10s %-20s %-15s %n", current2, VOLTAGE_230, chargingPower2,
        chargingTime2);
     System.out.printf("%-10s %-10s %-20s %-15s %n", current3, VOLTAGE_400, chargingPower3,
        chargingTime3);
      System.out.printf("%-10s %-10s %-20s %-15s %n", current4, VOLTAGE_400, chargingPower4,
        chargingTime4);
     System.out.printf("%-10s %-10s %-20s %-15s %n", current5, VOLTAGE_400, chargingPower5,
        chargingTime5);
  }
}