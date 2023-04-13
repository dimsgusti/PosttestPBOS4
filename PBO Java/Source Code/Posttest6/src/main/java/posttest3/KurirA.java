package posttest3;

public class KurirA extends Pegawai{
    KurirA(int idPegawai, int umurPegawai, String namaPegawai){
        this.idPegawai = idPegawai;
        this.umurPegawai = umurPegawai;
        this.namaPegawai = namaPegawai;
    }
    public void setIdPegawai(int idPegawai){
        this.idPegawai = idPegawai;
    }
    
    public void setUmurPegawai(int umurPegawai){
        this.umurPegawai = umurPegawai;
    }

    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }

    public int getIdPegawai(){
        return idPegawai;
    }

    public int getUmurPegawai(){
        return umurPegawai;
    }

    public String getNamaPegawai(){
        return namaPegawai;
    }
    @Override
    protected void setNamaPegawai(int namaPegawai) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNamaPegawai'");
    }
}