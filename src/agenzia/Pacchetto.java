package agenzia;

public class Pacchetto{
    private String destinazione;
    private int durata;
    private double costoBase;

    public Pacchetto(){}
    public Pacchetto(String destinazione, int durata, double costoBase){
        this.destinazione=destinazione;
        setDurata(durata);
        setCostoBase(costoBase);
    }

    public String getDestinazione(){
        return destinazione;
    }
    public int getDurata(){
        return durata;
    }
    public double getCostoBase(){
        return costoBase;
    }

    public void setDestinazione(String destinazione){
        this.destinazione=destinazione;
    }
    public void setDurata(int durata){
        if (durata> 0){
            this.durata = durata;
        }

    }
    public void setCostoBase(double costoBase){
        if (costoBase>0){
            this.costoBase = costoBase;
        }
    }

    public String toString(){
        return "destinazione: "+destinazione+" - durata: "+durata+" giorni - costo base: "+costoBase;
    }

    public boolean equals(Object o){
        if(o instanceof Pacchetto){
            Pacchetto p = (Pacchetto) o;
            return p.costoBase==this.costoBase && p.durata==this.durata && p.destinazione.equals(this.destinazione);
        }else return false;
    }
    public double calcolaCosto(){
        return costoBase;
    }
}
