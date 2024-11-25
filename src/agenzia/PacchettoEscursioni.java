package agenzia;

public class PacchettoEscursioni extends PacchettoPasti{
    private int nEscursioni;

    public PacchettoEscursioni(){super();}
    public PacchettoEscursioni(String destinazione, int durata, double costoBase, boolean pensioneCompleta, int nEscursioni){
        super(destinazione,durata,costoBase,pensioneCompleta);
        this.nEscursioni = nEscursioni;
    }

    public int getnEscursioni(){
        return nEscursioni;
    }
    public void setnEscursioni(int nEscursioni){
        this.nEscursioni = nEscursioni;
    }

    public double calcolaCosto() {
        return super.calcolaCosto()+super.calcolaCosto()*((double) (15 * nEscursioni) /100);
    }

    public String toString(){
        return super.toString()+" - "+nEscursioni+" escursioni";
    }

    public boolean equals(Object o){
        if(o instanceof PacchettoEscursioni){
            PacchettoEscursioni p = (PacchettoEscursioni) o;
            return super.equals(p) && p.nEscursioni == this.nEscursioni;
        }else return false;
    }
}
