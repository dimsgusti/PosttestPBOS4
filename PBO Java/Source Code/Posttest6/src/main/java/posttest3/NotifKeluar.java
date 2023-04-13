package posttest3;

public class NotifKeluar extends Notif{
    @Override
    public void notification(String namaAdmin){
        System.out.println("\nTerima kasih " + namaAdmin);
    }
}
