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

    public OMat2x2 transpuesta(){
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 inversa(){
        //TODO: implementar
        return new OMat2x2();
    }
    public OMat2x2 suma(OVecR2 b){
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 resta(OVecR2 b){
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 mult(OVecR2 b){
        //TODO: implementar
        return new OMat2x2();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat2x2 rot(double alpha){
        //TODO: implementar
        return new OMat2x2();
    }

    public static OMat2x2 identidad(){
        //TODO: implementar
        return new OMat2x2();
    }


    // constructores

 public OMat2x2(){}

    public OMat2x2(OVecR2 a){}

    public OMat2x2(double m11, double m12,
        double m21, double m22){}

    public OMat2x2(OVecR2 a, OVecR2 b, boolean esColumna){}

}
