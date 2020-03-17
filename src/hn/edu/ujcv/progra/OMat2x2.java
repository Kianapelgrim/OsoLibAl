package hn.edu.ujcv.progra;

import java.util.concurrent.Callable;

public class OMat2x2 {

    // miembros
private OVecR2 col1;
private OVecR2 col2;



    // accesoras y mutadoras
    //getFilaX
    //getColY
    public OVecR2 getColumna1(){
        return col1;
    }

    public OVecR2 getFila1(){
        return new OVecR2(col1.getX(),col2.getX());
    }
    public void setCol1(OVecR2 b){
        col1 = new OVecR2(b);
    }
    public void setFila1(OVecR2 fila){
        col1.setX(fila.getX());
        col2.setX(fila.getY());
    }
    public OVecR2 getColumna2(){
        return col2;
    }
    public OVecR2 getFila2(){
        return new OVecR2(col1.getY(),col2.getY());
    }

    public void setCol2(OVecR2 col2) {

        this.col2 = new OVecR2(col2);
        // metodos
    }
    public void setFila2(OVecR3 fila){
        col1.setY(fila.getA());
        col2.setY(fila.getB());
    }
    public OMat2x2 transpuesta(){
        //TODO: implementar
        return new OMat2x2(col1.getX(), col2.getX(), col1.getY(), col2.getY());
    }

    public OMat2x2 inversa(){
        //TODO: implementar
        OVecR2 col1I = new OVecR2(1,0);
        OVecR2 col2I = new OVecR2(0,1);
        return  new OMat2x2(col1I , col2I);
    }
    public OMat2x2 suma(OMat2x2 b){
        //TODO: implementar
        return new OMat2x2(col1.suma(b.col1) , col2.suma(b.col2));
    }

    public OMat2x2 resta(OMat2x2 b){
        //TODO: implementar
        return new OMat2x2(col1.resta(b.col1) , col2.resta(b.col2));
    }

    public OMat2x2 mult(OMat2x2 b){
        //TODO: implementar
        return new OMat2x2(col1.prodPunto(b.getFila1()),col1.prodPunto(b.getFila2()),col2.prodPunto(b.getFila1()),col1.prodPunto(b.getFila2()));
    }

    public double determinante(){
        //TODO: implementar
        return col1.getX() * col2.getY() - col2.getX() * col1.getY();
    }

    // Metodos de la clase.
    public static OMat2x2 rot(double alpha){
        //TODO: implementar
        return new OMat2x2();
    }

    public static OMat2x2 identidad(){
        //TODO: implementar
        OVecR2 col1I = new OVecR2(1,0);
        OVecR2 col2I = new OVecR2(0,1);
        return  new OMat2x2(col1I , col2I);
    }


    // constructores

 public OMat2x2(){}

    public OMat2x2(double m11, double m12,
        double m21, double m22){}


    public OMat2x2( OVecR2 col1, OVecR2 col2){
        this.col1=col1;
        this.col2=col2;
    }


}
