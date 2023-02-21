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

  public static void main(String[] args) {

    // Declare all constants
    final double VOLTAGE_230 = 230;
    final double VOLTAGE_400 = 400;
    final double BATTERRY_CAPACITY = 35.8;

    // Declare varibles for current (3 such values)
    final double CURRENT_10 = 10.0;
    final double CURRENT_16 = 16.0;
    final double CURRENT_32 = 32.0;

    // Rounding scale
    int noOfDecimals = 2;
    double scale = 0;
    scale = Math.pow(10, noOfDecimals);

    // Caculate all the charging power and charging time
    double chargingPower1 = 0.0;
    double chargingTime1 = 0.0;
    chargingPower1 = Math.round((CURRENT_10 * VOLTAGE_230) / 1000 * scale) / scale;
    chargingTime1 = Math.round((BATTERRY_CAPACITY / chargingPower1) * scale) / scale;

    double chargingPower2 = 0.0;
    double chargingTime2 = 0.0;
    chargingPower2 = Math.round((CURRENT_16 * VOLTAGE_230) / 1000 * scale) / scale;
    chargingTime2 = Math.round((BATTERRY_CAPACITY / chargingPower2) * scale) / scale;

    double chargingPower3 = 0.0;
    double chargingTime3 = 0.0;
    chargingPower3 = Math.round((CURRENT_10 * VOLTAGE_400 * Math.sqrt(3)) / 1000 * scale) / scale;
    chargingTime3 = Math.round((BATTERRY_CAPACITY / chargingPower3) * scale) / scale;

    double chargingPower4 = 0.0;
    double chargingTime4 = 0.0;
    chargingPower4 = Math.round((CURRENT_16 * VOLTAGE_400 * Math.sqrt(3)) / 1000 * scale) / scale;
    chargingTime4 = Math.round((BATTERRY_CAPACITY / chargingPower4) * scale) / scale;

    double chargingPower5 = 0.0;
    double chargingTime5 = 0.0;
    chargingPower5 = Math.round((CURRENT_32 * VOLTAGE_400 * Math.sqrt(3)) / 1000 * scale) / scale;
    chargingTime5 = Math.round((BATTERRY_CAPACITY / chargingPower5) * scale) / scale;

    // Print out table
    System.out.printf("%-7s %-4s %-5s %n", "Battery:", BATTERRY_CAPACITY, "(kwh)");
    System.out.printf("%-10s %-10s %-20s %-15s %n", "Current(A)", "Voltage(V)", "Charging Power(KW)",
        "Charging Time(h)");
    System.out.printf("%-10s %-10s %-20s %-15s %n", CURRENT_10, VOLTAGE_230, chargingPower1, chargingTime1);
    System.out.printf("%-10s %-10s %-20s %-15s %n", CURRENT_16, VOLTAGE_230, chargingPower2, chargingTime2);
    System.out.printf("%-10s %-10s %-20s %-15s %n", CURRENT_10, VOLTAGE_400, chargingPower3, chargingTime3);
    System.out.printf("%-10s %-10s %-20s %-15s %n", CURRENT_16, VOLTAGE_400, chargingPower4, chargingTime4);
    System.out.printf("%-10s %-10s %-20s %-15s %n", CURRENT_32, VOLTAGE_400, chargingPower5, chargingTime5);
  }
}