package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private OVecR2 col1;
    private OVecR2 col2;
    private OVecR2 col3;
    private OVecR2 col4;
    // accesoras y mutadoras

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

    // metodos

    public OMat4x4 transpuesta(){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 inversa(){
        //TODO: implementar
        return new OMat4x4();
    }
    public OMat4x4 suma(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 resta(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 mult(OMat4x4 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat4x4();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

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
}
