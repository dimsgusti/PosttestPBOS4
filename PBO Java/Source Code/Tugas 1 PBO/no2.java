public class no2 {
    public static void main(String[] args){
        double radius, tinggi;
        final double phi = 3.14;
        double luasSilinder, volumeSilinder;

        radius = 10;
        tinggi = 20;

        luasSilinder = 2 * (phi * radius * radius) + (2 * phi * radius * tinggi);
        volumeSilinder = (phi * radius * radius) * tinggi;
          
          System.out.println("Luas Silinder = " + luasSilinder);
          System.out.println("Volume Silinder = " + volumeSilinder);
    }
}
