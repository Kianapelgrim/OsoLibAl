package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private double m11; private double m12; private  double m13;private double m14;
    private double m21; private double m22; private double m23; private double m24;
    private double m31; private double m32; private double m33; private double m34;
    private double m41; private double m42; private double m43; private double m44;
    // accesoras y mutadoras
    public double getM11() {
        return m11;   }

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

    public double getM14(){
        return m14;
    }

    public void setM14(double m14) {
        this.m14 = m14;
    }

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

    public double getM24() {
        return m24;
    }

    public void setM31(double m31) {
        this.m31 = m31;
    }

    public double getM31() {
        return m31;
    }

    public void setM24(double m24) {
        this.m24 = m24;

    }
    public void setM32(double m32)
    {
        this.m32 = m32;
    }

    public void setM33(double m33)
    {
        this.m33 = m33;
    }

    public void setM34(double m34)
    {
        this.m34 = m34;
    }

    public void setM41(double m41)
    {
        this.m41 = m41;
    }

    public void setM42(double m42)
    {
        this.m42 = m42;
    }

    public void setM43(double m43)
    {
        this.m43 = m43;
    }

    public void setM44(double m44)
    {
        this.m44 = m44;
    }
    public double getM32()
    {
        return m32;
    }

    public double getM33()
    {
        return m33;
    }

    public double getM34()
    {
        return m34;
    }

    public double getM41()
    {
        return m41;
    }

    public double getM42()
    {
        return m42;
    }


    public double getM43()
    {
        return m43;
    }


    public double getM44()
    {
        return m44;
    }



    // metodos

    public void  transpuesta(){
        //TODO: implementar
        System.out.println(m11+ "\t" +m21+ "\t"+ m31+ "\t" + m41+"\n" +
                m12+"\t"+ m22+"\t"+ m32+"\t"+m42+"\n" +
                m13+"\t"+ m23+"\t"+ m33+"\t"+m43+"\n" +
                m14+"\t"+ m24+"\t"+ m34+"\t"+ m44);
    }


    public void suma(OMat4x4 b){
        //TODO:implementar
        m11=m11+b.m11;
        m12=m12+b.m12;
        m13=m13+b.m13;
        m14=m14+b.m14;
        m21=m21+b.m21;
        m22=m22+b.m22;
        m23=m23+b.m23;
        m24=m24+b.m24;
        m31=m31+b.m31;
        m32=m32+b.m32;
        m33=m33+b.m33;
        m34=m34+b.m34;
        m41=m41+b.m41;
        m42=m42+b.m42;
        m43=m43+b.m43;
        m44=m44+b.m44;
        System.out.println(m11+ "\t" +m12+ "\t"+ m13+ "\t" + m14+"\n" +
                m21+"\t"+ m22+"\t"+ m23+"\t"+m24+"\n" +
                m31+"\t"+ m32+"\t"+ m33+"\t"+m34+"\n" +
                m41+"\t"+ m42+"\t"+ m43+"\t"+ m44);

    }

    public void resta(OMat4x4 b){
        //TODO: implementar
        //TODO:implementar
        m11=m11-b.m11;
        m12=m12-b.m12;
        m13=m13-b.m13;
        m14=m14-b.m14;
        m21=m21-b.m21;
        m22=m22-b.m22;
        m23=m23-b.m23;
        m24=m24-b.m24;
        m31=m31-b.m31;
        m32=m32-b.m32;
        m33=m33-b.m33;
        m34=m34-b.m34;
        m41=m41-b.m41;
        m42=m42-b.m42;
        m43=m43-b.m43;
        m44=m44-b.m44;
        System.out.println(m11+ "\t" +m12+ "\t"+ m13+ "\t" + m14+"\n" +
                m21+"\t"+ m22+"\t"+ m23+"\t"+m24+"\n" +
                m31+"\t"+ m32+"\t"+ m33+"\t"+m34+"\n" +
                m41+"\t"+ m42+"\t"+ m43+"\t"+ m44);
    }

    public void mult(OMat4x4 b) {
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
       double m11z= this.m11 * b.m11 + this.m12 * b.m21 + this.m13 * b.m31 + this.m14 * b.m41;
       double m12z= this.m11 * b.m12 + this.m12 * b.m22 + this.m13 * b.m32 + this.m14 * b.m42;
       double m13z= this.m11 * b.m13 + this.m12 * b.m23 + this.m13 * b.m33 + this.m14 * b.m43;
       double m14z= this.m11 * b.m14 + this.m12 * b.m24 + this.m13 * b.m34 + this.m14 * b.m44;
       double m21z= this.m21 * b.m11 + this.m22 * b.m21 + this.m23 * b.m31 + this.m24 * b.m41;
       double m22z= this.m21 * b.m12 + this.m22 * b.m22 + this.m23 * b.m32 + this.m24 * b.m42;
       double m23z= this.m21 * b.m13 + this.m22 * b.m23 + this.m23 * b.m33 + this.m24 * b.m43;
       double m24z= this.m21 * b.m14 + this.m22 * b.m24 + this.m23 * b.m34 + this.m24 * b.m44;
       double m31z= this.m31 * b.m11 + this.m32 * b.m21 + this.m33 * b.m31 + this.m34 * b.m41;
       double m32z= this.m31 * b.m12 + this.m32 * b.m22 + this.m33 * b.m32 + this.m34 * b.m42;
       double m33z= this.m31 * b.m13 + this.m32 * b.m23 + this.m33 * b.m33 + this.m34 * b.m43;
       double m34z= this.m31 * b.m14 + this.m32 * b.m24 + this.m33 * b.m34 + this.m34 * b.m44;
       double m41z= this.m41 * b.m11 + this.m42 * b.m21 + this.m43 * b.m31 + this.m44 * b.m41;
       double m42z= this.m41 * b.m12 + this.m42 * b.m22 + this.m43 * b.m32 + this.m44 * b.m42;
       double m43z= this.m41 * b.m13 + this.m42 * b.m23 + this.m43 * b.m33 + this.m44 * b.m43;
       double m44z= this.m41 * b.m14 + this.m42 * b.m24 + this.m43 * b.m34 + this.m44 * b.m44;
        System.out.println(m11z+ "\t" +m12z+ "\t"+ m13z+ "\t" + m14z+"\n" +
                m21z+"\t"+ m22z+"\t"+ m23z+"\t"+m24z+"\n" +
                m31z+"\t"+ m32z+"\t"+ m33z+"\t"+m34z+"\n" +
                m41z+"\t"+ m42z+"\t"+ m43z+"\t"+ m44z);
    }


    public void determinante() {
        //TODO: implementar
        // m11 m12 m13 m14
        // m21 m22 m23 m24    m22 m23 m24
        // m31 m32 m33 m34    m32 m33 m34
        // m41 m42 m43 m44    m42 m43 m44
        double det = m11*(m22*((m33*m44)-(m34*m43))-m23*((m32*m44)-(m42*m34))+m24*((m32*m43)-(m42*m33)))-
                m12*(m21*((m33*m44)-(m43*m34))-m23*((m31*m44)-(m41*m34))+m24*((m31*m43)-(m41*m33)))+
                m13*(m21*((m32*m44)-(m42*m34))-m22*((m31*m44)-(m41*m34))+m24*((m31*m42)-(m41*m32)))-
                m14*(m21*((m32*m43)-(m42*m33))-m22*((m31*m43)-(m41*m33))+m23*((m31*m42)-(m41*m32)));
        System.out.println(det);
    }


//m11 m12 m13 m14
//m21 m22 m23 m24
//m31 m32 m33 m34
//m41 m42 m43 m44

    // Metodos de la clase.
    public void rotX(double alpha){
m11 = Math.cos(alpha);
m12 = Math.sin(alpha);
m22 = -Math.sin(alpha);


System.out.println("1\t0\t0\t0\n0"+ m11+ "\t"+m22+"\t" + "0\n0"+m12+"\t"+m11+"\t0\n0\t0\t0\t1");
    }

    public void rotY(double alpha){
        m11 = Math.cos(alpha);
        m12 = Math.sin(alpha);
        m22 = -Math.sin(alpha);

        System.out.println(m11+"\t0\t"+ m12+"\t0\n"+"0\t1\t0\t0\n"+m22+"\t0\t"+m11+"\t0\n0\t0\t0\t1");
    }

    public void rotZ(double alpha){
        m11 = Math.cos(alpha);
        m12 = Math.sin(alpha);
        m22 = -Math.sin(alpha);
        System.out.println(m11+"\t"+m22+"\t0\t0\n"+m12+"\t"+m11+"\t0\t0\n0\t0\t1\t0\n0\t0\t0\t0\t1");

    }


    public static OMat4x4 rotW(double alpha){

        return new OMat4x4();
    }

    public static void identidad(){


        //TODO: implementar
      System.out.println("1\t0\t0\t0\n0\t1\t0\t0\n0\t0\t1\t0\n0\t0\t0\t1");
    }

    // constructores
    public OMat4x4(){}


    public OMat4x4(double m11, double m12, double m13, double m14,
                   double m21, double m22, double m23, double m24,
                   double m31, double m32, double m33, double m34,
                   double m41, double m42, double m43, double m44
    ){
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m14 = m14;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m24 = m24;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        this.m34 = m34;
        this.m41 = m41;
        this.m42 = m42;
        this.m43 = m43;
        this.m44 = m44;
    }


}
