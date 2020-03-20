package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros

    private double a;
    private double b;
    private double c;
    private double d;
    private double a2;
    private double b2;
    private double c2;
    private double f;
    private double e;

    private LectorDeTeclado lt = new LectorDeTeclado();


    // accesoras y mutadoras
    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getA() {
        return a;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getE() {
        return e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getF() {
        return f;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    //METODOS

    public void transpuesta() {
        //TODO: implementar
        System.out.println(a + "\t" + d + "\t" + c2 + "\n" + b + "\t" + a2 + "\t" + e + "\n" + c + "\t" + b2 + "\t" + f);
    }


    public void suma(OMat3x3 z) {
        //TODO: implementar
        a = a + z.a;
        b = b + z.b;
        c = c + z.c;
        d = d + z.d;
        a2 = a2 + z.a2;
        b2 = b2 + z.b2;
        c2 = c2 + z.c2;
        e = e + z.e;
        f = f + z.f;
        System.out.println(a + "\t" + b + "\t" + c + "\n" + d + "\t" + a2 + "\t" + b2 + "\n" + c2 + "\t" + e + "\t" + f);

    }

    public void resta(OMat3x3 z) {
        //TODO: implementar
        a = a + z.a;
        b = b + z.b;
        c = c + z.c;
        d = d + z.d;
        a2 = a2 + z.a2;
        b2 = b2 + z.b2;
        c2 = c2 + z.c2;
        e = e + z.e;
        f = f + z.f;
        System.out.println(a + "\t" + b + "\t" + c + "\n" + d + "\t" + a2 + "\t" + b2 + "\n" + c2 + "\t" + e + "\t" + f);

    }

    public void mult(OMat3x3 z) {
        //TODO: implementar
        //   a  b  c
        //   d  a2  b2
        //     c2  e  f
        a = a * z.a + b * z.d + c * z.c2;
        b = a * z.b + b * z.a2 + c * z.e;
        c = a * z.c + b * z.b2 + c * z.f;
        d = d * z.a + a2 * z.d + b2 * z.c2;
        a2 = d * z.b + a2 * z.a2 + b2 * z.e;
        b2 = d * z.c + a2 * z.b2 + b2 * z.f;
        c2 = c2 * z.a + e * z.d + f * z.c2;
        e = c2 * z.b + e * z.a2 + f * z.e;
        f = c2 * z.c + e * z.b2 + f * z.f;
        System.out.println(a + "\t" + b + "\t" + c + "\n" + d + "\t" + a2 + "\t" + b2 + "\n" + c2 + "\t" + e + "\t" + f);


    }

    public void determinante() {
        //TODO: implementar
        double det = ((a * a2 * f) + (b * e * c) + (c2 * b * b2)) - ((c * a2 * c2) + (b2 * e * a) + (f * b * d));
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


        //TODO: implementar
        System.out.println("1\t0\t0\n0\t1\t0\n0\t0\t1");
    }

    // constructores
    public OMat3x3(){}


public OMat3x3( double a, double b, double c,
                double d, double a2, double b2,
                double c2, double e, double f){
        this.a=a;
        this.b2=b2;
        this.b= b;
        this.a2= a2;
        this.c=c;
        this.c2=c2;
        this.e=e;
        this.f=f;
        this.d=d;


}


}
