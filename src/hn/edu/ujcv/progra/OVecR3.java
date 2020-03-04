package hn.edu.ujcv.progra;

public class OVecR3 {

    // miembros
    private OVecR2 a;
    private double b;
    private OVecR2 a2;
    private double b2;

    public OVecR2 getA () {return a;}

    public double getB() {
        return b;
    }

    public void setA(OVecR2 b){
        a = new OVecR2(b);
    }

    public void setB(double b) {
        this.b = b;
    }

    public OVecR2 getA2 () {return a2;}

    public double getB2() {
        return b2;
    }

    public void setA2(OVecR2 b2){
        a = new OVecR2(b2);
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }
    // accesoras y mutadoras

    public OVecR3 suma(OVecR3 b){
        //TODO: implementar
        return new OVecR3();
    }

    public OVecR3 resta(OVecR3 b){
        //TODO: implementar
        return new OVecR3();
    }

    public OVecR3 prodCruz(OVecR3 b){
        //
        //  x  y  z
        //  x1 y1 z1       i = y * z1 - z * y1;
        //                 j = - ();
        //                 k = ;
        //
        return new OVecR3();
    }

    public double prodPunto(OVecR3 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }

    // metodos

    // constructores
}
