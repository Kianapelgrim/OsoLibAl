package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros

    private OVecR3 col1;
    private OVecR3 col2;
    private OVecR3 col3;


    // accesoras y mutadoras
    public OVecR3 getColumna1(){
        return col1;
    }

    public OVecR3 getFila1(){
        return new OVecR3(col1.getA(),col2.getA(),col3.getA());
    }
    public void setCol1(OVecR3 b){
        col1 = new OVecR3(b);
    }
    public void setFila1(OVecR3 fila){
        col1.setA(fila.getA());
        col2.setA(fila.getA());
        col3.setA(fila.getA());
    }
    public OVecR3 getColumna2(){
        return col2;
    }
    public OVecR3 getFila2(){
        return new OVecR3(col1.getB(),col2.getB(),col3.getB());
    }

    public void setCol2(OVecR3 col2) {

        this.col2 = new OVecR3(col2);
}
    public void setFila2(OVecR3 fila) {
        col1.setB(fila.getB());
        col2.setB(fila.getB());
        col3.setB(fila.getB());
    }
    public OVecR3 getColumna3(){
        return col3;
    }

    public OVecR3 getFila3() {
            return new OVecR3(col1.getB2(), col2.getB2(), col3.getB2());
        }
    public void setCol3(OVecR3 col2) {

        this.col3 = new OVecR3(col3);
    }
    public void setFila3(OVecR3 fila) {
        col1.setB2(fila.getB2());
        col2.setB2(fila.getB2());
        col3.setB2(fila.getB2());
    }
    //METODOS

    public OMat3x3 transpuesta(){
        //TODO: implementar
        return new OMat3x3(col1.getA(), col2.getA(), col3.getA(),
                col1.getB(), col2.getB(), col3.getB2(), 
                col1.getB2(), col2.getB2(), col3.getB2());
    }

    public OMat3x3 inversa(){
        //TODO: implementar
        return new OMat3x3();
    }
    public OMat3x3 suma(OMat3x3 b){
        //TODO: implementar
        return new OMat3x3();
    }

    public OMat3x3 resta(OMat3x3 b){
        //TODO: implementar
        return new OMat3x3();
    }

    public OMat3x3 mult(OMat3x3 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat3x3();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat3x3 rotX(double alpha){


        return new OMat3x3();
    }

    public static OMat3x3 rotY(double alpha){


        return new OMat3x3();
    }

    public static OMat3x3 rotZ(double alpha){


        return new OMat3x3();
    }

    public static OMat3x3 identidad(){


        //TODO: implementar
        return new OMat3x3();
    }

    // constructores
    public OMat3x3(){}

    public OMat3x3(OVecR3 a){}

    public OMat3x3(double m11, double m12, double m13,
                   double m21, double m22, double m23,
                   double m31, double m32, double m33){}



    public OMat3x3(OVecR2 a, OVecR2 b, boolean esColumna,OVecR3 col3){}
    public OMat3x3( OVecR3 col1, OVecR3 col2,OVecR3 col3) {
    }


}
