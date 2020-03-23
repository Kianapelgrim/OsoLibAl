package hn.edu.ujcv.progra;

import java.util.concurrent.Callable;

public class OMat2x2 {

    // miembros
    private double a;
    private double b;
    private double c;
    private double d;
    private LectorDeTeclado lt = new LectorDeTeclado();


    // accesoras y mutadoras

    public double getA() {
        return a;
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

    public void transpuesta() {
        System.out.println(a + "\t" + c +"\n" + b + "\t" + d);
    }
public void suma(OMat2x2 k) {
        a = this.a + k.a;
    b = this.b + k.b;
    c = this.c + k.c;
    d = this.d + k.d;
    System.out.println(a + "\t" + b +"\n" + c + "\t" + d);
}
    public void  resta(OMat2x2 k) {
        a = this.a - k.a;
        b = this.b - k.b;
        c = this.c - k.c;
        d = this.d - k.d;
        System.out.println(a + "\t" + b +"\n" + c + "\t" + d);
    }
    public void multi (OMat2x2 k){
     double a1 = a * k.a + b * k.c;
      double b1 = a * k.b + b * k.d;
     double c1 = c * k.a + d * k.c;
      double d1 = c * k.b + d * k.d;
        System.out.println(a1 + "\t" + b1 +"\n" + c1 + "\t" + d1);
    }
public void inversa () {
        double det = (a * d) - (c * b);
  double a1= ((1) / (det)) * d;
  double b1= ((1) / (det) )* -b;
         double c1= ((1) / (det)) * -c;
               double   d1= ((1) / (det)) * a;
                  System.out.println(a1 + "\t" + b1 +"\n" + c1+ "\t" + d1);
}

    public void determinante(){
        double det =(a * d) - (c * b);
        System.out.println(det);
    }
public void rot(double alpha){
    double a = Math.cos(alpha);
    double b = -Math.sin(alpha);
    double c = Math.sin(alpha);
    double d = Math.cos(alpha);
    System.out.println(a + "\t" + b +"\n" + c + "\t" + d);
}
public void identidad() {
        System.out.println("1\t0\n0\t1");
}
public void multivec(OVecR2 z){
        a = a * z.getX() +  z.getY();
        b = c * z.getX() + d * z.getX();
    System.out.println(a + "\t" +b);
}
    // constructores
public OMat2x2(){}

public OMat2x2(OMat2x2 a){}

public OMat2x2(double a, double b,
        double c, double d){
        this.a = a; this.b = b; this.c = c; this.d = d;
        }

        }
