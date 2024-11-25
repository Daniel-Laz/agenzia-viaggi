package agenzia;

public class PacchettoPasti extends Pacchetto{
    private boolean pensioneCompleta; // true = pensione completa ; false = mezza pensione

    public PacchettoPasti(){super();}
    public PacchettoPasti(String destinazione, int durata, double costoBase, boolean pensioneCompleta){
        super(destinazione,durata,costoBase);
        this.pensioneCompleta = pensioneCompleta;
    }

    public boolean getPensioneCompleta(){
        return pensioneCompleta;
    }
    public void setPensioneCompleta(boolean ritorno){
        this.pensioneCompleta = pensioneCompleta;
    }

    public double calcolaCosto() {
        if (pensioneCompleta){
            return super.getCostoBase()+super.getDurata()*35;
        }else return super.getCostoBase()+super.getDurata()*25;
    }

    public String toString(){
        String str="";
        if (pensioneCompleta){
            str= " - pensione completa";
        }else str=" - mezza pensione";
        return super.toString()+str;
    }

    public boolean equals(Object o){
        if(o instanceof PacchettoPasti){
            PacchettoPasti p = (PacchettoPasti) o;
            return super.equals(p) && p.pensioneCompleta == this.pensioneCompleta;
        }else return false;
    }

}
