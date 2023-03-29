package posttest3;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Posttest4 {

    public static void main(String[] args) throws IOException {
        String Status, NamaPenerima;
        int TglDiterima;
        String NamaKrg, TujuanKrg;
        int BeratKrg, BiayaKrg;

        ArrayList<KargoTerkirim> KargosTerkirim = new ArrayList<>();
        ArrayList<KargoDitolak> KargosDitolak = new ArrayList<>();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Notif ntf = new Notif();
        System.out.println("Masukkan username: ");
        String namaAdmin = br.readLine();

        ntf.notification(namaAdmin);
        
        while(true){
            System.out.println("\n = = = = = = = = = = = = = = = = = = = = = = ");
            System.out.println("Sistem Pendataan Ekspedisi Pengiriman Barang");
            System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
            System.out.println("1. Buat data baru");
            System.out.println("2. Lihat data");
            System.out.println("3. Ubah data");
            System.out.println("4. Hapus data");
            System.out.println("5. BARANG DITOLAK");
            System.out.println("6. Keluar program");
            
            System.out.println("Pilih menu: ");
            int pil = Integer.parseInt(br.readLine());
            
            switch(pil){
                case 1:
                    System.out.println("\nCREATE");
                    int id = KargosTerkirim.size();
                    
                    System.out.println("Nama barang: ");
                    NamaKrg = br.readLine();
                    
                    System.out.println("Tujuan barang: ");
                    TujuanKrg = br.readLine();
                    
                    System.out.println("Berat barang (Kilogram): ");
                    BeratKrg = Integer.parseInt(br.readLine());
                    
                    System.out.println("Biaya ekspedisi: ");
                    BiayaKrg = Integer.parseInt(br.readLine());
                    Status = "";
                    NamaPenerima = "";
                    TglDiterima = 0;
                    
                    KargoTerkirim Krg = new KargoTerkirim(id, NamaKrg, TujuanKrg, BeratKrg, BiayaKrg, Status, NamaPenerima, TglDiterima);
                    KargosTerkirim.add(Krg);
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
                    if(KargosTerkirim.size() == 0){
                        System.out.println("Belum ada data tersimpan");
                    } else{
                        for(int i = 0; i < KargosTerkirim.size(); i++){
                            KargoTerkirim kargo = KargosTerkirim.get(i);
                            id = kargo.getId();
                            String namaKrg = kargo.getNamaKrg();
                            String tujuanKrg = kargo.getTujuanKrg();
                            int beratKrg = kargo.getBeratKrg();
                            int biayaKrg = kargo.getBiayaKrg();
                            String status = kargo.getStatus();
                            String namaPenerima = kargo.getNamaPenerima();
                            int tglDiterima = kargo.getTglDiterima();
                            System.out.println("ID\t\t:" + id);
                            System.out.println("Nama barang\t:" + namaKrg);
                            System.out.println("Tujuan\t\t:" + tujuanKrg);
                            System.out.println("Berat\t\t:" + beratKrg);
                            System.out.println("Biaya\t\t:" + biayaKrg);
                            System.out.println("Status\t\t:" + status);
                            System.out.println("Nama penerima\t:" + namaPenerima);
                            System.out.println("Tanggal terima\t:" + tglDiterima);
                            System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                        }
                    }
                    break;
                case 3:
                    if(KargosTerkirim.size() > 0){
                        for(int i = 0; i < KargosTerkirim.size(); i++){
                            KargoTerkirim kargo = KargosTerkirim.get(i);
                            id = kargo.getId();
                            String namaKrg = kargo.getNamaKrg();
                            String tujuanKrg = kargo.getTujuanKrg();
                            int beratKrg = kargo.getBeratKrg();
                            int biayaKrg = kargo.getBiayaKrg();
                            String status = kargo.getStatus();
                            String namaPenerima = kargo.getNamaPenerima();
                            int tglDiterima = kargo.getTglDiterima();
                            System.out.println("ID\t\t:" + id);
                            System.out.println("Nama barang\t:" + namaKrg);
                            System.out.println("Tujuan\t\t:" + tujuanKrg);
                            System.out.println("Berat\t\t:" + beratKrg);
                            System.out.println("Biaya\t\t:" + biayaKrg);
                            System.out.println("Status\t\t:" + status);
                            System.out.println("Nama penerima\t:" + namaPenerima);
                            System.out.println("Tanggal terima\t:" + tglDiterima);
                            System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                        }

                        System.out.println("\nUPDATE");
                        System.out.println("ID barang yang ingin di ubah: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > KargosTerkirim.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            int Id = id;

                            System.out.println("Nama barang terbaru: ");
                            String NamaKrgB = br.readLine();

                            System.out.println("Tujuan barang terbaru: ");
                            String TujuanKrgB = br.readLine();

                            System.out.println("Berat barang terbaru: ");
                            int BeratKrgB = Integer.parseInt(br.readLine());
    
                            System.out.println("Biaya barang terbaru: ");
                            int BiayaKrgB = Integer.parseInt(br.readLine());

                            System.out.println("Status terbaru: ");
                            String statusB = br.readLine();

                            System.out.println("Nama penerima barang: ");
                            String namaPenerimaB = br.readLine();

                            System.out.println("Tanggal diterima: ");
                            int tglDiterimaB = Integer.parseInt(br.readLine());

                            KargoTerkirim KrgUpdate = new KargoTerkirim(Id, NamaKrgB, TujuanKrgB, BeratKrgB, BiayaKrgB, statusB, namaPenerimaB, tglDiterimaB);
                            KargosTerkirim.set(id, KrgUpdate);  

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
                for(int i = 0; i < KargosTerkirim.size(); i++){
                    KargoTerkirim kargo = KargosTerkirim.get(i);
                    id = kargo.getId();
                    String namaKrg = kargo.getNamaKrg();
                    String tujuanKrg = kargo.getTujuanKrg();
                    int beratKrg = kargo.getBeratKrg();
                    int biayaKrg = kargo.getBiayaKrg();
                    String status = kargo.getStatus();
                    String namaPenerima = kargo.getNamaPenerima();
                    int tglDiterima = kargo.getTglDiterima();
                    System.out.println("ID\t\t:" + id);
                    System.out.println("Nama barang\t:" + namaKrg);
                    System.out.println("Tujuan\t\t:" + tujuanKrg);
                    System.out.println("Berat\t\t:" + beratKrg);
                    System.out.println("Biaya\t\t:" + biayaKrg);
                    System.out.println("Status\t\t:" + status);
                    System.out.println("Nama penerima\t:" + namaPenerima);
                    System.out.println("Tanggal terima\t:" + tglDiterima);
                    System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                    }
                
                    System.out.println("\nDELETE");
                    if(KargosTerkirim.size() > 0){
                        System.out.println("ID barang yang ingin di hapus: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > KargosTerkirim.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            KargosTerkirim.remove(id);
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
                if(KargosTerkirim.size() == 0){
                    System.out.println("Belum ada data tersimpan");
                } else{
                    for(int i = 0; i < KargosTerkirim.size(); i++){
                        KargoTerkirim kargo = KargosTerkirim.get(i);
                        id = kargo.getId();
                        String namaKrg = kargo.getNamaKrg();
                        String tujuanKrg = kargo.getTujuanKrg();
                        int beratKrg = kargo.getBeratKrg();
                        int biayaKrg = kargo.getBiayaKrg();
                        String status = kargo.getStatus();
                        String namaPenerima = kargo.getNamaPenerima();
                        int tglDiterima = kargo.getTglDiterima();
                        System.out.println("ID\t\t:" + id);
                        System.out.println("Nama barang\t:" + namaKrg);
                        System.out.println("Tujuan\t\t:" + tujuanKrg);
                        System.out.println("Berat\t\t:" + beratKrg);
                        System.out.println("Biaya\t\t:" + biayaKrg);
                        System.out.println("Status\t\t:" + status);
                        System.out.println("Nama penerima\t:" + namaPenerima);
                        System.out.println("Tanggal terima\t:" + tglDiterima);
                        System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                    }
                }
                System.out.println("Barang Ditolak");
                System.out.println("ID barang yang ditolak: ");
                id = Integer.parseInt(br.readLine());
                if(id > KargosTerkirim.size()){
                    System.out.println("ID terpilih belum tersimpan");
                } else{
                    System.out.println("Alasan barang tertolak: ");
                    String Alasan = br.readLine();
                    for(int i = 0; i < KargosTerkirim.size(); i++){
                        KargoTerkirim kargo = KargosTerkirim.get(i);
                        id = kargo.getId();
                        NamaKrg = kargo.getNamaKrg();
                        System.out.println(NamaKrg);
                        TujuanKrg = kargo.getTujuanKrg();
                        BeratKrg = kargo.getBeratKrg();
                        BiayaKrg = kargo.getBiayaKrg();

                        KargoDitolak KrgDel = new KargoDitolak(id, NamaKrg, TujuanKrg, BeratKrg, BiayaKrg, Alasan);
                        KargosDitolak.add(KrgDel);
                    }
                }
                break;
                case 6:
                    NotifKeluar ntfK = new NotifKeluar();
                    ntfK.notification(namaAdmin);
                    System.exit(0);
                default:
                    System.out.println("Menu belum tersedia");
            }
        }
    }
}
