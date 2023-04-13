package posttest3;

public abstract class Pegawai {
    protected int idPegawai, umurPegawai;
    protected String namaPegawai;

    protected abstract void setIdPegawai(int idPegawai);
    protected abstract void setUmurPegawai(int umurPegawai);
    protected abstract void setNamaPegawai(int namaPegawai);
    protected abstract int getIdPegawai();
    protected abstract int getUmurPegawai();
    protected abstract String getNamaPegawai();
}
