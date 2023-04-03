public class AlatTulisKantor{
	
    String Kode;
	String Jenis;
	String Nama;
	int Stok;

    public AlatTulisKantor(String kode, String jenis, String nama, int stok) {
        this.Kode = kode;
        this.Jenis = jenis;
        this.Nama = nama;
        this.Stok = stok;
    }

    @Override
    public String toString() {
        return "AlatTulisKantor [Kode = " + Kode + ", Jenis = " + Jenis + ", Nama = " + Nama + ", Stok = " + Stok + " ]";
    }

    public void setKode(String kode) {
        Kode = kode;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setStok(int stok) {
        Stok = stok;
    }
}

DataPegawai DataPegawai1 = new DataPegawai ("123", "Yasser", "Manager");
		DataPegawai DataPegawai2 = new DataPegawai ("124", "Fajar", "Supervisor");
		DataPegawai DataPegawai3 = new DataPegawai ("125", "Syfa", "Producer");
		DataPegawai DataPegawai4 = new DataPegawai ("126", "Fauzi", "HRD");
		DataPegawai DataPegawai5 = new DataPegawai ("126", "Chaeza", "Investor");
		
		TelUJaya.tambahDepan(DataPegawai1);
		TelUJaya.tambahDepan(DataPegawai2);
		TelUJaya.tambahDepan(DataPegawai3);
		TelUJaya.tambahDepan(DataPegawai4);
		TelUJaya.tambahDepan(DataPegawai5);