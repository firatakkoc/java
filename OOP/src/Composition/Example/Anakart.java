package Composition.Example;

public class Anakart {
    
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String operatingSys;

    public Anakart(String model, String uretici, int yuvaSayisi, String operatingSys){
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi =yuvaSayisi;
        this.operatingSys = operatingSys;
    }

    public void isletimSysYükle(String operatingSys){
        this.operatingSys = operatingSys;
        System.out.println("Isletim Sistemi Yüklendi "+ operatingSys);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }
}
