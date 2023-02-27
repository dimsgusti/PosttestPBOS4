import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        Scanner inputan = new Scanner(System.in);
        
        System.out.print ("Masukan berat badan dalam pound: ");
        double berat = inputan.nextDouble();
        
        System.out.print ("Masukan tinggi badan dalam inci : ");
        double tinggi = inputan.nextDouble();
        
        final double kilogram_per_pound = 0.45359237;
        final double meter_per_inci = 0.0254;
        
        double beratDalamKilogram = berat * kilogram_per_pound;
        double tinggiDalamMeter = tinggi * meter_per_inci;
        double bmi = beratDalamKilogram /
            (tinggiDalamMeter * tinggiDalamMeter );
        
        System.out.printf("BMI Anda adalah %5.2f\n", bmi);
            if (bmi < 16)
              System.out.println("Anda sangat kurus");
            else if (bmi < 18)
              System.out.println("Anda kurus");
            else if (bmi < 24)
              System.out.println("Anda normal");
            else if (bmi < 29)
              System.out.println("Anda gemuk");
            else if (bmi < 35)
              System.out.println("Anda sangat gemuk");
            else
              System.out.println("Anda terlalu gemuk"); 
        
    }
}
