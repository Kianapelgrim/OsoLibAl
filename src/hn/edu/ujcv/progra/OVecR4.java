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
        return new OVecR4(this.a + b.a, this.a2 + b.a2, this.b + b.b, this.b2 + b.b2);
    }

    public OVecR4 resta(OVecR4 b){
        //TODO: implementar
        return new OVecR4(this.a - b.a, this.a2 - b.a2, this.b - b.b, this.b2 - b.b2);
    }

    public double prodPunto(OVecR4 b){
        //TODO: implementar
        return this.a * b.a + this.a2*b.a2 + this.b * b.b + this.b2 * b.b2;
    }

    public double magnitud(){
        //TODO: implementar
        return Math.sqrt(this.a * this.a +this.a2 * this.a2+ this.b * this.b + this.b2 * this.b2);
    }

    // constructores
    public OVecR4() { }
    public OVecR4(double a, double b, double a2, double b2) {
        this.a = a;
        this.a = a2;
        this.b = b;
        this.b2 = b2;
    }
    public OVecR4 (OVecR4 s){
        this.a = s.a;
        this.a2 = s.a2;
        this.b = s.b;
        this.b2 = s.b2;
    }


    @Override
    public String toString() {
        return " {" +
                "X=" + getA() +
                ", Y=" + getB() + ", Z=" + getB2() +  ", K=" + getB2() +
                '}';
}}



