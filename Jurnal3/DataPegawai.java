public class DataPegawai {
	
	String Nip;
	String Nama;
	String Divisi;
	
	public DataPegawai(String nip, String nama, String divisi){
		this.Nip = nip;
		this.Nama = nama;
		this.Divisi = divisi;
	}
	
	@Override
    public String toString() {
        return "DataPegawai [ NIP = " + Nip + ", Nama = " + Nama + ", Divisi = " + Divisi + " ]";
	}
	
	public void setNip(String nip){
		Nip = nip;
	}
	
	public void setNama(String nama){
		Nama = nama;
	}
	
	public void setDivisi(String divisi){
		Divisi = divisi;
	}
}