package hn.edu.ujcv.progra;

public class OVecR2 {
    // miembros
    private double x;
    private double y;
    // accesoras y mutadoras
    public double getX(){return x;}

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // metodos
    public OVecR2 suma(OVecR2 b){
        //TODO: implementar

        return new OVecR2(this.x + b.x, this.y + b.y);
    }

    public OVecR2 resta(OVecR2 b){
        //TODO: implementar
        return new OVecR2(this.x - b.x, this.y - b.y);
    }

    public double prodPunto(OVecR2 b){
        //TODO: implementar

        return this.y * b.y + this.x * b.x;
    }

    public double magnitud(){
        //TODO: implementar
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }


    // constructores
    public OVecR2() { }

    public OVecR2(double x, double y){
        this.x = x;
        this.y = y;}

        public OVecR2(OVecR2 a){

        }

    @Override
    public String toString() {
        return " {" +
                "i=" + getX() +
                ", j=" + getY() +
                '}';
    }

    }

