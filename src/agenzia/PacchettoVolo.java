package agenzia;

public class PacchettoVolo extends Pacchetto{
    private boolean ritorno; // true = andata e ritorno ; false = andata

    public PacchettoVolo(){super();}
    public PacchettoVolo(String destinazione, int durata, double costoBase, boolean ritorno){
        super(destinazione,durata,costoBase);
        this.ritorno = ritorno;
    }

    public boolean getRitorno(){
        return ritorno;
    }
    public void setRitorno(boolean ritorno){
        this.ritorno = ritorno;
    }

    public double calcolaCosto() {
        if (ritorno){
            return super.getCostoBase()+getCostoBase()*85;
        }else return super.getCostoBase()+getCostoBase()*50;
    }

    public String toString(){
        String str="";
        if (ritorno){
            str= " - andata e ritorno";
        }else str=" - andata";
        return super.toString()+str;
    }

    public boolean equals(Object o){
        if(o instanceof PacchettoVolo){
            PacchettoVolo p = (PacchettoVolo) o;
            return super.equals(p) && p.ritorno == this.ritorno;
        }else return false;
    }
}
