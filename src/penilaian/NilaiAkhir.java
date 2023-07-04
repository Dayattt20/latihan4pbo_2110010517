package penilaian;

public class NilaiAkhir {
     private double uts;
    private double uas;
    private double tugas;
    
    public double getUts() {
        return uts;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double getTugas() {
        return tugas;
    }
    
    public void setTugas(double tugas) {
        this.tugas = tugas;
    }
    
    public double hitungNilaiAkhir() {
        
        double bobotUts = 0.4;
        double bobotUas = 0.4;
        double bobotTugas = 0.2;
        
        return (uts * bobotUts) + (uas * bobotUas) + (tugas * bobotTugas);
    }    
}
