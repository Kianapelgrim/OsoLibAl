package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private OVecR4 col1;
    private OVecR4 col2;
    private OVecR4 col3;
    private OVecR4 col4;
    // accesoras y mutadoras
    public OVecR4 getColumna1(){
        return col1;
    }

    public OVecR4 getFila1(){
        return new OVecR4(col1.getA(),col2.getA(),col3.getA(),col4.getA());
    }
    public void setCol1(OVecR4 b){
        col1 = new OVecR4(b);
    }
    public void setFila1(OVecR4 fila){
        col1.setA(fila.getA());
        col2.setA(fila.getA());
        col3.setA(fila.getA());
        col4.setA(fila.getA());
    }
    public OVecR4 getColumna2(){
        return col2;
    }
    public OVecR4 getFila2(){
        return new OVecR4(col1.getB(),col2.getB(),col3.getB(),col4.getB());
    }

    public void setCol2(OVecR4 col2) {

        this.col2 = new OVecR4(col2);
    }
    public void setFila2(OVecR4 fila) {
        col1.setB(fila.getB());
        col2.setB(fila.getB());
        col3.setB(fila.getB());
        col4.setB(fila.getB());
    }
    public OVecR4 getColumna3(){
        return col3;
    }

    public OVecR4 getFila3() {
        return new OVecR4(col1.getB2(), col2.getB2(), col3.getB2(),col4.getB2());
    }
    public void setCol3(OVecR4 col3){

        this.col3 = new OVecR4(col3);
    }
    public void setFila4(OVecR4 fila) {
        col1.setA2(fila.getA2());
        col2.setA2(fila.getA2());
        col3.setA2(fila.getA2());
        col4.setA2(fila.getA2());
    }
    public OVecR4 getColumna4(){
        return col4;
    }

    public OVecR4 getFila4() {return new OVecR4(col1.getA2(), col2.getA2(), col3.getA2(),col4.getA2());}
    public void setCol4(OVecR4 col4){

        this.col4 = new OVecR4(col4);
    }
    public void setFila3(OVecR4 fila) {
        col1.setB2(fila.getB2());
        col2.setB2(fila.getB2());
        col3.setB2(fila.getB2());
        col4.setB2(fila.getB2());
    }

    // metodos

    public OMat4x4 transpuesta(){
        //TODO: implementar
        return new OMat4x4(col1.getA(), col2.getA(), col3.getA(),col4.getA(),
                col1.getB(), col2.getB(), col3.getB(), col4.getB(),
                col1.getB2(), col2.getB2(), col3.getB2(), col4.getB2(),
                col1.getA2(), col2.getA2(), col3.getA2(), col4.getA2());
    }

    public OMat4x4 inversa(){
        //TODO: implementar
        return new OMat4x4();
    }
    public OMat4x4 suma(OMat4x4 b){
        //TODO:implementar
        return new OMat4x4(col1.suma(b.col1), col2.suma(b.col2), col3.suma(b.col3), col4.suma(b.col4));
    }

    public OMat4x4 resta(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4(col1.resta(b.col1), col2.resta(b.col2), col3.resta(b.col3), col4.resta(b.col4));
    }

    public OMat4x4 mult(OMat4x4 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22

        return new OMat4x4(getFila1().prodPunto(b.col1), getFila1().prodPunto(b.col2), getFila1().prodPunto(b.col3),
                getFila1().prodPunto(b.col4),
                getFila2().prodPunto(b.col1),getFila2().prodPunto(b.col2),getFila2().prodPunto(b.col3),
                getFila2().prodPunto(b.col4),
                getFila3().prodPunto(b.col1),getFila3().prodPunto(b.col2), getFila3().prodPunto(b.col3),
                getFila3().prodPunto(b.col4),
                getFila4().prodPunto(b.col1),getFila4().prodPunto(b.col2), getFila4().prodPunto(b.col3),
                getFila4().prodPunto(b.col4));
    }

    public double determinante(){
        //TODO: implementar


    return 0.0f;}

    // Metodos de la clase.
    public static OMat4x4 rotX(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotY(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotZ(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotW(double alpha){

        return new OMat4x4();
    }

    public static OMat4x4 identidad(){


        //TODO: implementar
        return new OMat4x4();
    }

    // constructores
    public OMat4x4(){}

    public OMat4x4(OVecR4 col1,OVecR4 col2, OVecR4 col3,OVecR4 col4){
        this.col1 = col1;
        this.col3  = col3;
        this.col2 = col2;
        this.col4 = col4;
    }

    public OMat4x4(double m11, double m12, double m13, double m14,
                   double m21, double m22, double m23, double m24,
                   double m31, double m32, double m33, double m34,
                   double m41, double m42, double m43, double m44
    ){}}
