package posttest3;

public class KargoDitolak extends Kargo{
    private String alasan;
    public KargoDitolak (int Id, String NamaKrg, String TujuanKrg, int BeratKrg, int BiayaKrg, String Alasan){
        super(Id, NamaKrg, TujuanKrg, BeratKrg, BiayaKrg);
        this.alasan = Alasan;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
}
