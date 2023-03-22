package posttest3;

public class KargoTerkirim extends Kargo{
    private String status;
    private String namaPenerima;
    private int tglDiterima;
    public KargoTerkirim (int Id, String NamaKrg, String TujuanKrg, int BeratKrg, int BiayaKrg, String Status, String NamaPenerima, int TglDiterima){
        super(Id, NamaKrg, TujuanKrg, BeratKrg, BiayaKrg);
        this.status = Status;
        this.namaPenerima = NamaPenerima;
        this.tglDiterima = TglDiterima;
    }

    public void setStatus(String Status){
        status = Status;
    }

    public String getStatus(){
        return status;
    }
    
    public void setNamaPenerima(String namaPenerima){
        this.namaPenerima = namaPenerima;
    }
    
    public String getNamaPenerima(){
        return namaPenerima;
    }
    
    public void setTglDiterima(int tglDiterima){
        this.tglDiterima = tglDiterima;
    }

    public int getTglDiterima(){
        return tglDiterima;
    }
}
