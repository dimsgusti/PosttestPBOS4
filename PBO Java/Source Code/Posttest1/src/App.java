import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException{
        String nama_barang;
        int pil, id;
        
        ArrayList<String> kargo = new ArrayList<String>();

        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while(true){
            System.out.println("\n = = = = = = = = = = = = = = = = = = = = = = ");
            System.out.println("Sistem Pendataan Ekspedisi Pengiriman Barang");
            System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
            System.out.println("1. Buat data baru");
            System.out.println("2. Lihat data");
            System.out.println("3. Ubah data");
            System.out.println("4. Hapus data");
            System.out.println("5. Keluar program");
            
            System.out.print("Pilihan menu: ");
            pil = Integer.parseInt(br.readLine());
            
            switch(pil){
                case 1:
                System.out.println("\nNama barang:");
                nama_barang = br.readLine();
                kargo.add(nama_barang);
                break;
                case 2:
                System.out.println("\nData yang tersimpan:");
                if(kargo.size() > 0){
                    for(int i = 0; i < kargo.size(); i++){
                        System.out.println(i+1 + ". " + kargo.get(i));
                    }
                } else{
                    System.out.println("Tidak ada data tersimpan");
                }
                loading.wait(1000);
                break;
                case 3:
                System.out.println("\nUbah data");
                if(kargo.size() > 0){
                    for(int i = 0; i < kargo.size(); i++){
                        System.out.println(i + ". " + kargo.get(i));
                    }
                } else{
                    System.out.println("Tidak ada data tersimpan");
                }
                System.out.print("ID barang yang ingin di ubah: ");
                id = Integer.parseInt(br.readLine());
                System.out.print("Nama barang terbaru: ");
                nama_barang = br.readLine();
                kargo.set(id, nama_barang);
                
                break;
                case 4:
                System.out.println("\nHapus data");
                if(kargo.size() > 0){
                    for(int i = 0; i < kargo.size(); i++){
                        System.out.println(i + ". " + kargo.get(i));
                    }
                } else{
                    System.out.println("Tidak ada data tersimpan");
                }
                System.out.println("ID barang yang ingin di hapus: ");
                id = Integer.parseInt(br.readLine());
                kargo.remove(id);
                break;
                case 5:
                System.exit(0);
                default:
                System.out.println("\nPilihan belum tersedia");
            }
        }
        
    }
}