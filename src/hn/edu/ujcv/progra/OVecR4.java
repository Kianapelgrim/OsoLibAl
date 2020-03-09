package hn.edu.ujcv.progra;

public class OVecR4 {
    // miembros


    private double b;
    private double a;
    private double b2;
    private double a2;

    // accesoras y mutadoras
    public double getA () {return a;}
    public double getA2 () {return a2;}

    public double getB () {
        return b;
    }
    public double getB2 () {
        return b2;
    }
    public void setA( double a){
        this.a = a;
    }
    public void setA2( double a2){
        this.a2 = a2;
    }
    public void setB(double b) {
        this.b = b;
    }


    public void setB2( double b2) {
        this.b2 = b2;
    }
    // metodos

    public OVecR4 suma(OVecR4 b){
        //TODO: implementar
        return new OVecR4();
    }

    public OVecR4 resta(OVecR4 b){
        //TODO: implementar
        return new OVecR4();
    }

    public double prodPunto(OVecR4 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }

    // constructores
}
