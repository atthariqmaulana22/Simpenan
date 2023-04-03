public class Music {
	String Judul;
	String Penyanyi;
	
	public Music(String Judul, String Penyanyi) {
		this.Judul = Judul;
		this.Penyanyi = Penyanyi;
		
	}
	
	public String getJudul() {
        return Judul;
    }
	
	public String getPenyanyi() {
        return Penyanyi;
    }
	@Override
	public String toString() {
		return "Judul='" + Judul + '\'' +
				", Penyanyi='" + Penyanyi + '\'' 
				;
	}
}	