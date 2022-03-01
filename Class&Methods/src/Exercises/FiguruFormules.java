package Exercises;

public class FiguruFormules {
    // Klasės atributai
    String pavadinimas;
    private double plotisKrastine;
    private double aukstisKrastine;

    //Getters & Setters


    public String getPavadinimas() {
        return pavadinimas;    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public double getPlotisKrastine() {
        return plotisKrastine;
    }
    public void setPlotisKrastine(double plotisKrastine) {
        this.plotisKrastine = plotisKrastine;
    }
    public double getAukstisKrastine() {
        return aukstisKrastine;
    }
    public void setAukstisKrastine(double aukstisKrastine) {
        this.aukstisKrastine = aukstisKrastine;
    }


    //Konstruktorius
    public FiguruFormules(String pavadinimas, double a, double b) {
        this.pavadinimas = pavadinimas;
        this.plotisKrastine = a;
        this.aukstisKrastine = b;
    }

    public FiguruFormules(String pavadinimas, double a) {
        this.pavadinimas = pavadinimas;
        this.plotisKrastine = a;
    }

    //Metodai
    public double printStatusisTrikampis(){
        return (getPlotisKrastine()*getAukstisKrastine())/2;
    }
    public double printStaciakampis(){
        return getPlotisKrastine()*getAukstisKrastine();
    }
    public double printKvadratas(){
        return  Math.pow(getPlotisKrastine(), 2);
    }
    public double printApskritimas(){
        return 3.1415*(Math.pow(getPlotisKrastine(), 2));
    }


}
