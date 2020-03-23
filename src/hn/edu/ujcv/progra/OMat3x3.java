package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros

    private double m11;
    private double m12;
    private double m13;
    private double m21;
    private double m22;
    private double m23;
    private double m31;
    private double m32;
    private double m33;
    private LectorDeTeclado lt = new LectorDeTeclado();


    // accesoras y mutadoras
    public double getM21() {
        return m21;
    }

    public void setM21(double m21) {
        this.m21 = m21;
    }

    public double getM22() {
        return m22;
    }

    public void setM22(double m22) {
        this.m22 = m22;
    }

    public double getM23() {
        return m23;
    }

    public void setM23(double m23) {
        this.m23 = m23;
    }

    public double getM11() {
        return m11;
    }

    public void setM32(double m32) {
        this.m32 = m32;
    }

    public double getM32() {
        return m32;
    }

    public void setM31(double m31) {
        this.m31 = m31;
    }

    public double getM31() {
        return m31;
    }

    public void setM11(double m11) {
        this.m11 = m11;
    }

    public double getM12() {
        return m12;
    }

    public void setM12(double m12) {
        this.m12 = m12;
    }

    public double getM13() {
        return m13;
    }

    public void setM13(double m13) {
        this.m13 = m13;
    }

    public double getM33() {
        return m33;
    }

    public void setM33(double m33) {
        this.m33 = m33;
    }
    //METODOS

    public void transpuesta() {
        //TODO: implementar
        System.out.println(m11 + "\t" + m21 + "\t" + m31 + "\n" + m12 + "\t" + m22 + "\t" + m32 + "\n" + m13 + "\t" + m23 + "\t" + m33);
    }


    public void suma(OMat3x3 z) {
        //TODO: implementar
        m11 = m11 + z.m11;
        m12 = m12 + z.m12;
        m13 = m13 + z.m13;
        m33 = m33 + z.m33;
        m21 = m21 + z.m21;
        m22 = m22 + z.m22;
        m23 = m23 + z.m23;
        m32 = m32 + z.m32;
        m31 = m31 + z.m31;
        System.out.println(m11 + "\t" + m12 + "\t" + m13 + "\n" +   + m21 + "\t" + m22 + "\n" + m23 + "\t" + m31 + "\t" + m32 + "\t" +m33);

    }

    public void resta(OMat3x3 z) {
        //TODO: implementar
        m11 = m11 - z.m11;
        m12 = m12 - z.m12;
        m13 = m13 - z.m13;
        m33 = m33 - z.m33;
        m21 = m21 - z.m21;
        m22 = m22 - z.m22;
        m23 = m23 - z.m23;
        m32 = m32 - z.m32;
        m31 = m31 - z.m31;
        System.out.println(m11 + "\t" + m12 + "\t" + m13 + "\n" +   + m21 + "\t" + m22 + "\n" + m23 + "\t" + m31 + "\t" + m32 + "\t" +m33);

    }

    public void mult(OMat3x3 z) {
        //TODO: implementar
        //   a  b  c
        //   d  a2  b2
        //     c2  e  f
        double m11z = (m11 * z.m11) + (m12 * z.m21) + (m13 * z.m31);
        double m12z = (m11 * z.m21) + (m12 * z.m22) + (m13 * z.m32);
        double m13z = (m11 * z.m13) + (m12 * z.m23) + (m13 * z.m33);
        double m21z = (m21 * z.m11) + (m22 * z.m21) + (m23 * z.m31);
        double m22z = (m21 * z.m12) + (m22 * z.m22) + (m23 * z.m32);
        double m23z = (m21 * z.m13) + (m22 * z.m23) + (m23 * z.m33);
        double m31z = (m31 * z.m11) + (m32 * z.m21) + (m33 * z.m31);
        double m32z = (m31 * z.m12) + (m32 * z.m22) + (m33 * z.m32);
        double m33z = (m31 * z.m13) + (m32 * z.m23) + (m33 * z.m33);
        System.out.println(m11z + "\t" + m12z + "\t" + m13z + "\n" + m21z + "\t" + m22z + "\t" + m23z + "\n" + m31z + "\t" + m32z + "\t" +m33z);


    }

    public void determinante() {
        //TODO: implementar
        double det = m11*((m22*m33)-(m32*m23))-m12*((m21*m33)-(m31*m23))+m13*((m21*m32)-(m31*m22));
        System.out.println(det);

    }


    // Metodos de la clase.
    public static void rotX(double alpha) {
        OVecR3 col1 = new OVecR3(1, 0, 0);
        OVecR3 col2 = new OVecR3(0, Math.cos(alpha), Math.sin(alpha));
        OVecR3 col3 = new OVecR3(0, -Math.sin(alpha), Math.cos(alpha));
        System.out.println(col1.getA() + "\t" + col2.getA() + "\t" + col3.getA() + "\n" + col1.getB() + "\t"
                + col2.getB() + "\t" + col3.getB() + "\n" + col1.getB2() + "\t" + col2.getB2() + "\t" + col3.getB2());
    }

    public static void rotY(double alpha) {

        OVecR3 col1 = new OVecR3(Math.cos(alpha), 0, Math.sin(alpha));
        OVecR3 col2 = new OVecR3(0, 1, 0);
        OVecR3 col3 = new OVecR3(-Math.sin(alpha), 0, Math.cos(alpha));

        System.out.println(col1.getA() + "\t" + col2.getA() + "\t" + col3.getA() + "\n" + col1.getB() + "\t"
                + col2.getB() + "\t" + col3.getB() + "\n" + col1.getB2() + "\t" + col2.getB2() + "\t" + col3.getB2());
    }


    public static void rotZ(double alpha){

        OVecR3 col1 = new OVecR3(Math.cos(alpha), -Math.sin(alpha),0 );
        OVecR3 col2 = new OVecR3(Math.sin(alpha), Math.cos(alpha),0);
        OVecR3 col3 = new OVecR3(0 ,0,1);

        System.out.println(col1.getA() + "\t" + col2.getA() + "\t" + col3.getA() + "\n" + col1.getB() + "\t"
                + col2.getB() + "\t" + col3.getB() + "\n" + col1.getB2() + "\t" + col2.getB2() + "\t" + col3.getB2());
    }

    public static void identidad(){
        System.out.println("1\t0\t0\n0\t1\t0\n0\t0\t1");}

public OMat3x3(){}
public OMat3x3(double m11, double m12, double m13,
               double m33, double m21, double m22,
               double m23, double m32, double m31){
        this.m11= m11;
        this.m22 = m22;
        this.m12 = m12;
        this.m21 = m21;
        this.m13 = m13;
        this.m23 = m23;
        this.m32 = m32;
        this.m31 = m31;
        this.m33 = m33;


}


}
