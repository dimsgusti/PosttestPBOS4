/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package posttest2;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dimsgusti
 */
public class Posttest2 {

    public static void main(String[] args) throws IOException {
        ArrayList<Kargo> Kargos = new ArrayList<>();
        
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
            
            System.out.println("Pilih menu: ");
            int pil = Integer.parseInt(br.readLine());
            
            switch(pil){
                case 1:
                    System.out.println("\nCREATE");
                    int id = Kargos.size();
                    System.out.println("Nama barang: ");
                    String NamaKrg = br.readLine();
                    
                    System.out.println("Tujuan barang: ");
                    String TujuanKrg = br.readLine();
                    
                    System.out.println("Berat barang (Kilogram): ");
                    int BeratKrg = Integer.parseInt(br.readLine());
                    
                    System.out.println("Biaya ekspedisi: ");
                    int BiayaKrg = Integer.parseInt(br.readLine());
                    
                    Kargo Krg = new Kargo(id, NamaKrg, TujuanKrg, BeratKrg, BiayaKrg);
                    Kargos.add(Krg);
                    System.out.println("Loading");
                    loading.wait(100);
                    System.out.print(".");
                    loading.wait(100);
                    System.out.print(".");
                    loading.wait(100);
                    System.out.print(".\n");
                    System.out.println("Data berhasil di tambahkan!");
                    break;
                case 2:
                    System.out.println("Loading");
                    loading.wait(100);
                    System.out.print(".");
                    loading.wait(100);
                    System.out.print(".");
                    loading.wait(100);
                    System.out.print(".\n");
                    System.out.println("\nREAD");
                    if(Kargos.size() == 0){
                        System.out.println("Belum ada data tersimpan");
                    } else{
                        for(int i = 0; i < Kargos.size(); i++){
                            Kargo kargo = Kargos.get(i);
                            id = kargo.getId();
                            String namaKrg = kargo.getNamaKrg();
                            String tujuanKrg = kargo.getTujuanKrg();
                            int beratKrg = kargo.getBeratKrg();
                            int biayaKrg = kargo.getBiayaKrg();
                            System.out.println("ID\t\t:" + id);
                            System.out.println("Nama barang\t:" + namaKrg);
                            System.out.println("Tujuan\t\t:" + tujuanKrg);
                            System.out.println("Berat\t\t:" + beratKrg);
                            System.out.println("Biaya\t\t:" + biayaKrg);
                            System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                        }
                    }
                    break;
                case 3:
                    if(Kargos.size() > 0){
                        for(int i = 0; i < Kargos.size(); i++){
                            Kargo kargo = Kargos.get(i);
                            id = kargo.getId();
                            String namaKrg = kargo.getNamaKrg();
                            String tujuanKrg = kargo.getTujuanKrg();
                            int beratKrg = kargo.getBeratKrg();
                            int biayaKrg = kargo.getBiayaKrg();
                            System.out.println("ID\t\t:" + id);
                            System.out.println("Nama barang\t:" + namaKrg);
                            System.out.println("Tujuan\t\t:" + tujuanKrg);
                            System.out.println("Berat\t\t:" + beratKrg);
                            System.out.println("Biaya\t\t:" + biayaKrg);
                            System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                        }
    
                        System.out.println("\nUPDATE");
                        System.out.println("ID barang yang ingin di ubah: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > Kargos.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            System.out.println("Nama barang terbaru: ");
                            String NamaKrgB = br.readLine();
    
                            System.out.println("Tujuan barang terbaru: ");
                            String TujuanKrgB = br.readLine();
    
                            System.out.println("Berat barang terbaru: ");
                            int BeratKrgB = Integer.parseInt(br.readLine());
    
                            System.out.println("Biaya barang terbaru: ");
                            int BiayaKrgB = Integer.parseInt(br.readLine());
    
                            Kargo KrgUpdate = new Kargo(id, NamaKrgB, TujuanKrgB, BeratKrgB, BiayaKrgB);
                            Kargos.set(id, KrgUpdate);
                            System.out.println("Data berhasil diubah!");
                        }
                    } else{
                        System.out.println("Belum ada data tersimpan pada perangkat");
                    }
                    System.out.println("Loading");
                    loading.wait(150);
                    System.out.print(".");
                    loading.wait(150);
                    System.out.print(".");
                    loading.wait(150);
                    System.out.print(".\n");
                    break;
                case 4:
                    for(int i = 0; i < Kargos.size(); i++){
                        Kargo kargo = Kargos.get(i);
                        id = kargo.getId();
                        String namaKrg = kargo.getNamaKrg();
                        String tujuanKrg = kargo.getTujuanKrg();
                        int beratKrg = kargo.getBeratKrg();
                        int biayaKrg = kargo.getBiayaKrg();
                        System.out.println("ID\t\t:" + id);
                        System.out.println("Nama barang\t:" + namaKrg);
                        System.out.println("Tujuan\t\t:" + tujuanKrg);
                        System.out.println("Berat\t\t:" + beratKrg);
                        System.out.println("Biaya\t\t:" + biayaKrg);
                        System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                    }
                
                    System.out.println("\nDELETE");
                    if(Kargos.size() > 0){
                        System.out.println("ID barang yang ingin di hapus: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > Kargos.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            Kargos.remove(id);
                            System.out.println("Data berhasil dihapus!");
                        }
                    } else{
                        System.out.println("Belum ada data tersimpan pada perangakat");
                    }
                    System.out.println("Loading");
                    loading.wait(100);
                    System.out.print(".");
                    loading.wait(100);
                    System.out.print(".");
                    loading.wait(100);
                    System.out.print(".\n");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu belum tersedia");
            }
        }
    }
}
