package hn.edu.ujcv.progra;

public class OVecR3 {

    // miembros

    private double b;
    private double a;
    private double b2;

    public double getA () {return a;}

    public double getB () {
        return b;
    }
    public double getB2 () {
        return b2;
    }
    public void setA( double a){
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


    public void setB2( double b2) {
        this.b2 = b2;
    }

    // accesoras y mutadoras

    public OVecR3 suma(OVecR3 s){
        //TODO: implementar
        return new OVecR3(this.a + s.a, this.b + s.b, this.b2 + s.b2);
    }

    public OVecR3 resta(OVecR3 b){
        //TODO: implementar
        return new OVecR3(this.a - b.a, this.b - b.b, this.b2 - b.b2);
    }

    public OVecR3 prodCruz(OVecR3 z){
        //
        //  x  y  z
        //  x1 y1 z1       i = y * z1 - z * y1;
        //                 j = - ();
        //                 k = ;
        //
        return new OVecR3(this.b* z.b2 - this.b2*z.b, -(this.a* z.b2 - this.b2 * z.a), this.a*z.b-this.b*z.a );
    }

    public double prodPunto(OVecR3 b){
        //TODO: implementar
        return this.a * b.a + this.b * b.b + this.b2 * b.b2;
    }

    public double magnitud(){
        //TODO: implementar
        return Math.sqrt(this.a * this.a + this.b * this.b + this.b2 * this.b2);
    }

    // metodos

    // constructores
    public OVecR3() { }

    public OVecR3 (OVecR3 s){
        this.a = s.a;
        this.b = s.b;
        this.b2 = s.b2;
    }

    public OVecR3(double a, double b, double b2){
        this.a = a;
        this.b = b;
        this.b2 = b2;
    }
    @Override
    public String toString() {
        return " {" +
                "X=" + getA() +
                ", Y=" + getB() + ", Z=" + getB2() +
                '}';
    }
}
