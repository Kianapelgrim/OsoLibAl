import hn.edu.ujcv.progra.*;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {
        OVecR2 a = new OVecR2();
        OVecR2 b = new OVecR2();
        OVecR3 x = new OVecR3();
        OVecR3 y = new OVecR3();
        OVecR4 x1 = new OVecR4();
        OVecR4 y1 = new OVecR4();
        OVecR4 z1 = new OVecR4();
        OVecR4 w1 = new OVecR4();
        OMat2x2 x2 = new OMat2x2();
        OMat2x2 y2 = new OMat2x2();
        OMat3x3 x3 = new OMat3x3();
        OMat3x3 y3= new OMat3x3();
        OMat4x4 x4 = new OMat4x4();
        OMat4x4 y4 = new OMat4x4();
        int resp1= 1;
        int resp2 = 1;
        do{
        String msj = "Intente de nuevo con un valor valido";
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("\t\t\t\tCALCULADORA ALGEBRA LINEAL");
        System.out.println("\n ¿Con cuál desearía trabajar? \n 1: Vector en r2 \n 2: Vector en r3 \n 3: Vector en r4 \n" +
                " 4:Matriz de 2x2\n 5: Matriz de 3x3 \n 6: Matriz de 4x4 \n 0: Si desea SALIR");
       resp1 = lc.getInteger(msj);
       switch (resp1) {
           case 1:
               System.out.println("\n ¿Qué operación desea realizar? \n 1: Producto punto \n 2: Suma \n 3: Resta \n" +
                       " 4: Magnitud\n 0: Si desea SALIR ");

               resp2 = lc.getInteger(msj);
               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       System.out.println(a.prodPunto(b));break;

                   case 2:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       System.out.println(a.suma(b));break;

                   case 3:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       System.out.println(a.resta(b));break;

                   case 4: System.out.println("Introduzca sus datos de su vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println(a.magnitud());break;
                   case 0:
                       break;
       }break;
       //VECTOR R3
           case 2: System.out.println("\n ¿Qué operación desea realizar? \n 1: Producto punto \n 2: Suma \n 3: Resta \n" +
                   " 4: Magnitud\n 5: ProdCruz \n 0: Si desea SALIR ");
               resp2 = lc.getInteger(msj);
               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.prodPunto(y)); break;

                   case 2:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.suma(y));break;

                   case 3:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.resta(y));break;

                   case 4:
                       System.out.println("Introduzca sus datos de su vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println(x.magnitud());break;

                   case 5:
                       System.out.println("Introduzca sus datos de su vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.prodCruz(y));break;

                   case 0: break;
               }break;
               //VECTOR R4
           case 3:
               System.out.println("\n ¿Qué operación desea realizar? \n 1: Producto punto \n 2: Suma \n 3: Resta \n" +
                       " 4: Magnitud\n 0: Si desea SALIR ");
               resp2 = lc.getInteger(msj);
               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x1.setA(lc.getDouble(msj));
                       x1.setB(lc.getDouble(msj));
                       x1.setB2(lc.getDouble(msj));
                       x1.setA2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       y1.setA(lc.getDouble(msj));
                       y1.setB(lc.getDouble(msj));
                       y1.setB2(lc.getDouble(msj));
                       y1.setA2(lc.getDouble(msj));
                       System.out.println(x1.prodPunto(y1));
                       break;
                   case 2:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x1.setA(lc.getDouble(msj));
                       x1.setB(lc.getDouble(msj));
                       x1.setB2(lc.getDouble(msj));
                       x1.setA2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       y1.setA(lc.getDouble(msj));
                       y1.setB(lc.getDouble(msj));
                       y1.setB2(lc.getDouble(msj));
                       y1.setA2(lc.getDouble(msj));
                       System.out.println(x1.suma(y1));
                       break;
                   case 3:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x1.setA(lc.getDouble(msj));
                       x1.setB(lc.getDouble(msj));
                       x1.setB2(lc.getDouble(msj));
                       x1.setA2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       y1.setA(lc.getDouble(msj));
                       y1.setB(lc.getDouble(msj));
                       y1.setB2(lc.getDouble(msj));
                       y1.setA2(lc.getDouble(msj));
                       System.out.println(x1.resta(y1));
                       break;
                   case 4: System.out.println("Introduzca sus datos de su vector");
                       x1.setA(lc.getDouble(msj));
                       x1.setB(lc.getDouble(msj));
                       x1.setB2(lc.getDouble(msj));
                       x1.setA2(lc.getDouble(msj));
                       System.out.println(x1.magnitud());
                       break;
                   case 0:break;
                       }break;
           case 4: //MATRIZ 2X2
               System.out.println("\n ¿Qué operación desea realizar? \n 1: Transpuesta \n 2: Suma \n 3: Resta \n" +
                       " 4: Inversa\n 5: Multiplicación \n 6: Determinante \n 7: Rotación \n 8: Matriz de rotación \n 9: Identidad \n  0:Si desea SALIR ");
               resp2 = lc.getInteger(msj);
               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       x2.transpuesta();break;
                   case 2:
                       System.out.println("Introduzca datos de la primera matriz");
                       System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       System.out.println("Introduzca datos de la segunda matriz");
                       System.out.println("Introduzca datos por fila");
                       y2.setA(lc.getDouble(msj));
                       y2.setB(lc.getDouble(msj));
                       y2.setC(lc.getDouble(msj));
                       y2.setD(lc.getDouble(msj));
                       x2.suma(y2);break;
                   case 3:
                       System.out.println("Introduzca datos de la primera matriz");
                       System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       System.out.println("Introduzca datos de la segunda matriz");
                       System.out.println("Introduzca datos por fila");
                       y2.setA(lc.getDouble(msj));
                       y2.setB(lc.getDouble(msj));
                       y2.setC(lc.getDouble(msj));
                       y2.setD(lc.getDouble(msj));
                       x2.resta(y2);break;
                   case 5:
                       System.out.println("Introduzca datos de la primera matriz");
                       System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       System.out.println("Introduzca datos de la segunda matriz");
                       System.out.println("Introduzca datos por fila");
                       y2.setA(lc.getDouble(msj));
                       y2.setB(lc.getDouble(msj));
                       y2.setC(lc.getDouble(msj));
                       y2.setD(lc.getDouble(msj));
                       x2.multi(y2);break;
                   case 4: System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       x2.inversa();break;
                   case 6: System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       x2.determinante();break;
                   case 7:  System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                       double s = lc.getDouble(msj);
                       x2.rot(s);break;
                   case 8:  System.out.println("Introduzca datos por fila");
                       x2.setA(lc.getDouble(msj));
                       x2.setB(lc.getDouble(msj));
                       x2.setC(lc.getDouble(msj));
                       x2.setD(lc.getDouble(msj));
                       System.out.println("Introduzca datos de vector");
                    a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       x2.multivec(a);break;
                   case 9: x2.identidad();break;
                   case 0: break;
                       }break;
           case 5:    System.out.println("\n ¿Qué operación desea realizar? \n 1: Transpuesta \n 2: Suma \n 3: Resta \n" +
                   " 4: Multiplicación\n 5: Determinante \n 6: Rotación en x\n 7: Rotación en y \n 8: Rotación en z \n 9: Identidad \n 0:Si desea SALIR ");
               resp2 = lc.getInteger(msj);

               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca datos de su matriz por filas");
                       x3.setA(lc.getDouble(msj));
                       x3.setB(lc.getDouble(msj));
                       x3.setC(lc.getDouble(msj));
                       x3.setD(lc.getDouble(msj));
                       x3.setA2(lc.getDouble(msj));
                       x3.setB2(lc.getDouble(msj));
                       x3.setC2(lc.getDouble(msj));
                       x3.setE(lc.getDouble(msj));
                       x3.setF(lc.getDouble(msj));
                       x3.transpuesta();break;
                   case 2:
                       System.out.println("Introduzca datos de su primera matriz por fila");
                       x3.setA(lc.getDouble(msj));
                       x3.setB(lc.getDouble(msj));
                       x3.setC(lc.getDouble(msj));
                       x3.setD(lc.getDouble(msj));
                       x3.setA2(lc.getDouble(msj));
                       x3.setB2(lc.getDouble(msj));
                       x3.setC2(lc.getDouble(msj));
                       x3.setE(lc.getDouble(msj));
                       x3.setF(lc.getDouble(msj));
                       System.out.println("Introduzca datos de su segunda matriz");
                       y3.setA(lc.getDouble(msj));
                       y3.setB(lc.getDouble(msj));
                       y3.setC(lc.getDouble(msj));
                       y3.setD(lc.getDouble(msj));
                       y3.setA2(lc.getDouble(msj));
                       y3.setB2(lc.getDouble(msj));
                       y3.setC2(lc.getDouble(msj));
                       y3.setE(lc.getDouble(msj));
                       y3.setF(lc.getDouble(msj));
                       x3.suma(y3);break;
                   case 3: System.out.println("Introduzca datos de su primera matriz por fila");
                       x3.setA(lc.getDouble(msj));
                       x3.setB(lc.getDouble(msj));
                       x3.setC(lc.getDouble(msj));
                       x3.setD(lc.getDouble(msj));
                       x3.setA2(lc.getDouble(msj));
                       x3.setB2(lc.getDouble(msj));
                       x3.setC2(lc.getDouble(msj));
                       x3.setE(lc.getDouble(msj));
                       x3.setF(lc.getDouble(msj));
                       System.out.println("Introduzca datos de su segunda matriz");
                       y3.setA(lc.getDouble(msj));
                       y3.setB(lc.getDouble(msj));
                       y3.setC(lc.getDouble(msj));
                       y3.setD(lc.getDouble(msj));
                       y3.setA2(lc.getDouble(msj));
                       y3.setB2(lc.getDouble(msj));
                       y3.setC2(lc.getDouble(msj));
                       y3.setE(lc.getDouble(msj));
                       y3.setF(lc.getDouble(msj));
                       x3.resta(y3);break;
                   case 4:  System.out.println("Introduzca datos de su primera matriz por fila");
                       x3.setA(lc.getDouble(msj));
                       x3.setB(lc.getDouble(msj));
                       x3.setC(lc.getDouble(msj));
                       x3.setD(lc.getDouble(msj));
                       x3.setA2(lc.getDouble(msj));
                       x3.setB2(lc.getDouble(msj));
                       x3.setC2(lc.getDouble(msj));
                       x3.setE(lc.getDouble(msj));
                       x3.setF(lc.getDouble(msj));
                       System.out.println("Introduzca datos de su segunda matriz");
                       y3.setA(lc.getDouble(msj));
                       y3.setB(lc.getDouble(msj));
                       y3.setC(lc.getDouble(msj));
                       y3.setD(lc.getDouble(msj));
                       y3.setA2(lc.getDouble(msj));
                       y3.setB2(lc.getDouble(msj));
                       y3.setC2(lc.getDouble(msj));
                       y3.setE(lc.getDouble(msj));
                       y3.setF(lc.getDouble(msj));
                       x3.mult(y3);break;
                   case 5: System.out.println("Introduzca datos de su matriz por filas");
                       x3.setA(lc.getDouble(msj));
                       x3.setB(lc.getDouble(msj));
                       x3.setC(lc.getDouble(msj));
                       x3.setD(lc.getDouble(msj));
                       x3.setA2(lc.getDouble(msj));
                       x3.setB2(lc.getDouble(msj));
                       x3.setC2(lc.getDouble(msj));
                       x3.setE(lc.getDouble(msj));
                       x3.setF(lc.getDouble(msj));
                       x3.determinante();break;
                   case 6: System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                       double alpha=lc.getDouble(msj);
                       x3.rotX(alpha);
                       break;

                   case 7:System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                        alpha =lc.getDouble(msj);
                       x3.rotY(alpha);break;

                   case 8: System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                       alpha =lc.getDouble(msj);
                       x3.rotZ(alpha); break;
                   case 0:  break;

               }break;
           case 6:  System.out.println("\n ¿Qué operación desea realizar? \n 1: Transpuesta \n 2: Suma \n 3: Resta \n" +
                   " 4: Multiplicación \n 5: Rotación en x\n 6: Rotación en y \n 7: Rotación en z \n 8: Identidad \n 0:Si desea SALIR ");
               resp2 = lc.getInteger(msj);

               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca los datos de matriz por filas");
                       x4.setM11(lc.getDouble(msj));
                       x4.setM12(lc.getDouble(msj));
                       x4.setM13(lc.getDouble(msj));
                       x4.setM14(lc.getDouble(msj));
                       x4.setM21(lc.getDouble(msj));
                       x4.setM22(lc.getDouble(msj));
                       x4.setM23(lc.getDouble(msj));
                       x4.setM24(lc.getDouble(msj));
                       x4.setM31(lc.getDouble(msj));
                       x4.setM32(lc.getDouble(msj));
                       x4.setM33(lc.getDouble(msj));
                       x4.setM34(lc.getDouble(msj));
                       x4.setM41(lc.getDouble(msj));
                       x4.setM42(lc.getDouble(msj));
                       x4.setM43(lc.getDouble(msj));
                       x4.setM44(lc.getDouble(msj));
                       x4.transpuesta();
                       break;
                   case 2:System.out.println("Introduzca los datos de matriz por filas");
                       x4.setM11(lc.getDouble(msj));
                       x4.setM12(lc.getDouble(msj));
                       x4.setM13(lc.getDouble(msj));
                       x4.setM14(lc.getDouble(msj));
                       x4.setM21(lc.getDouble(msj));
                       x4.setM22(lc.getDouble(msj));
                       x4.setM23(lc.getDouble(msj));
                       x4.setM24(lc.getDouble(msj));
                       x4.setM31(lc.getDouble(msj));
                       x4.setM32(lc.getDouble(msj));
                       x4.setM33(lc.getDouble(msj));
                       x4.setM34(lc.getDouble(msj));
                       x4.setM41(lc.getDouble(msj));
                       x4.setM42(lc.getDouble(msj));
                       x4.setM43(lc.getDouble(msj));
                       x4.setM44(lc.getDouble(msj));
                       System.out.println("Introduzca los datos de su segunda matriz por filas");
                       y4.setM11(lc.getDouble(msj));
                       y4.setM12(lc.getDouble(msj));
                       y4.setM13(lc.getDouble(msj));
                       y4.setM14(lc.getDouble(msj));
                       y4.setM21(lc.getDouble(msj));
                       y4.setM22(lc.getDouble(msj));
                       y4.setM23(lc.getDouble(msj));
                       y4.setM24(lc.getDouble(msj));
                       y4.setM31(lc.getDouble(msj));
                       y4.setM32(lc.getDouble(msj));
                       y4.setM33(lc.getDouble(msj));
                       y4.setM34(lc.getDouble(msj));
                       y4.setM41(lc.getDouble(msj));
                       y4.setM42(lc.getDouble(msj));
                       y4.setM43(lc.getDouble(msj));
                       y4.setM44(lc.getDouble(msj));
                       x4.suma(y4);break;
                   case 3:
                       System.out.println("Introduzca los datos de matriz por filas");
                       x4.setM11(lc.getDouble(msj));
                       x4.setM12(lc.getDouble(msj));
                       x4.setM13(lc.getDouble(msj));
                       x4.setM14(lc.getDouble(msj));
                       x4.setM21(lc.getDouble(msj));
                       x4.setM22(lc.getDouble(msj));
                       x4.setM23(lc.getDouble(msj));
                       x4.setM24(lc.getDouble(msj));
                       x4.setM31(lc.getDouble(msj));
                       x4.setM32(lc.getDouble(msj));
                       x4.setM33(lc.getDouble(msj));
                       x4.setM34(lc.getDouble(msj));
                       x4.setM41(lc.getDouble(msj));
                       x4.setM42(lc.getDouble(msj));
                       x4.setM43(lc.getDouble(msj));
                       x4.setM44(lc.getDouble(msj));
                       System.out.println("Introduzca los datos de su segunda matriz por filas");
                       y4.setM11(lc.getDouble(msj));
                       y4.setM12(lc.getDouble(msj));
                       y4.setM13(lc.getDouble(msj));
                       y4.setM14(lc.getDouble(msj));
                       y4.setM21(lc.getDouble(msj));
                       y4.setM22(lc.getDouble(msj));
                       y4.setM23(lc.getDouble(msj));
                       y4.setM24(lc.getDouble(msj));
                       y4.setM31(lc.getDouble(msj));
                       y4.setM32(lc.getDouble(msj));
                       y4.setM33(lc.getDouble(msj));
                       y4.setM34(lc.getDouble(msj));
                       y4.setM41(lc.getDouble(msj));
                       y4.setM42(lc.getDouble(msj));
                       y4.setM43(lc.getDouble(msj));
                       y4.setM44(lc.getDouble(msj));
                       x4.resta(y4);break;

                   case 4: System.out.println("Introduzca los datos de matriz por filas");
                       x4.setM11(lc.getDouble(msj));
                       x4.setM12(lc.getDouble(msj));
                       x4.setM13(lc.getDouble(msj));
                       x4.setM14(lc.getDouble(msj));
                       x4.setM21(lc.getDouble(msj));
                       x4.setM22(lc.getDouble(msj));
                       x4.setM23(lc.getDouble(msj));
                       x4.setM24(lc.getDouble(msj));
                       x4.setM31(lc.getDouble(msj));
                       x4.setM32(lc.getDouble(msj));
                       x4.setM33(lc.getDouble(msj));
                       x4.setM34(lc.getDouble(msj));
                       x4.setM41(lc.getDouble(msj));
                       x4.setM42(lc.getDouble(msj));
                       x4.setM43(lc.getDouble(msj));
                       x4.setM44(lc.getDouble(msj));
                       System.out.println("Introduzca los datos de su segunda matriz por filas");
                       y4.setM11(lc.getDouble(msj));
                       y4.setM12(lc.getDouble(msj));
                       y4.setM13(lc.getDouble(msj));
                       y4.setM14(lc.getDouble(msj));
                       y4.setM21(lc.getDouble(msj));
                       y4.setM22(lc.getDouble(msj));
                       y4.setM23(lc.getDouble(msj));
                       y4.setM24(lc.getDouble(msj));
                       y4.setM31(lc.getDouble(msj));
                       y4.setM32(lc.getDouble(msj));
                       y4.setM33(lc.getDouble(msj));
                       y4.setM34(lc.getDouble(msj));
                       y4.setM41(lc.getDouble(msj));
                       y4.setM42(lc.getDouble(msj));
                       y4.setM43(lc.getDouble(msj));
                       y4.setM44(lc.getDouble(msj));
                       x4.mult(zy4);break;
                   case 5:
                       System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                       double alpha=lc.getDouble(msj);
                       x4.rotX(alpha); break;
                   case 6:
                       System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                     alpha=lc.getDouble(msj);
                       x4.rotY(alpha); break;
                   case 7:
                       System.out.println("Introduzca su valor en grados que desea su matriz de rotación");
                      alpha=lc.getDouble(msj);
                       x4.rotX(alpha); break;
                   case 8:
                       x4.identidad();
    }break;
}
    }while(resp1!=0);
    }
}


