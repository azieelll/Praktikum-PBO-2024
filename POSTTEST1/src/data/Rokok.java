package data;

public class Rokok {
    String namaRokok;
    int nikotinRokok;
    int tarRokok;
    int hargaRokok;

    public Rokok(String namaRokok, int nikotinRokok, int tarRokok, int hargaRokok) {
        this.namaRokok = namaRokok;        
        this.nikotinRokok = nikotinRokok;        
        this.tarRokok = tarRokok;
        this.hargaRokok = hargaRokok;        
    }
    public String getNamaRokok() {
        return namaRokok;
    }
    public int getnikotinRokok() {
        return nikotinRokok;
    }
    public int gettarRokok() {
        return tarRokok;
    }
    public int gethargaRokok() {
        return hargaRokok;
    }

    public void setNamaRokok(String namaRokok) {
        this.namaRokok = namaRokok;
    }
    public void setnikotinRokok(int nikotinRokok) {
        this.nikotinRokok = nikotinRokok;
    }
    public void settarRokok(int tarRokok) {
        this.tarRokok = tarRokok;
    }
    public void sethargaRokok(int hargaRokok) {
        this.hargaRokok = hargaRokok;
    }
    
    public int getNikotinRokok() {
        return nikotinRokok;
    }
   public int getTarRokok() {
        return tarRokok;
    }
    public int getHargaRokok() {
        return hargaRokok;
    }
   
}