package posttest2;

/**
 *
 * @author dimsgusti
 */
public class Kargo {
    private int id;
    private String namaKrg;
    private String tujuanKrg;
    private int beratKrg;
    private int biayaKrg;

public Kargo(int Id, String NamaKrg, String TujuanKrg, int BeratKrg, int BiayaKrg){
    this.id = Id;
    this.namaKrg = NamaKrg;
    this.tujuanKrg = TujuanKrg;
    this.beratKrg = BeratKrg;
    this.biayaKrg = BiayaKrg;
}

public int getId(){
    return id;
}

public String getNamaKrg(){
    return namaKrg;
}

public String getTujuanKrg(){
    return tujuanKrg;
}

public int getBeratKrg(){
    return beratKrg;
}

public int getBiayaKrg(){
    return biayaKrg;
}


    

}
