import hn.edu.ujcv.progra.LectorDeTeclado;
import hn.edu.ujcv.progra.OVecR2;
import hn.edu.ujcv.progra.OVecR3;
import hn.edu.ujcv.progra.OVecR4;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {
        OVecR2 a = new OVecR2();
        OVecR2 b = new OVecR2();
        OVecR3 x = new OVecR3();
        OVecR3 y = new OVecR3();
        OVecR4 x1 = new OVecR4();
        OVecR4 y1 = new OVecR4();
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("CALCULADORA ALGEBRA LINEAL");
        System.out.println("\n ¿Con cuál desearía trabajar? \n 1: Vector en r2 \n 2: Vector en r3 \n 3: Vector en r4 \n" +
                " 4:Matriz de 2x2\n 5: Matriz de 3x3 \n 6: Matriz de 4x4 \n 7: Si desea SALIR");
        String msj = "Intente de nuevo con un valor valido";
        int resp1;
       resp1 = lc.getInteger(msj);
       switch (resp1) {
           case 1:
               System.out.println("\n ¿Qué operación desea realizar? \n 1: Producto punto \n 2: Suma \n 3: Resta \n" +
                       " 4: Magnitud\n 5: Si desea SALIR ");
               int resp2;
               resp2 = lc.getInteger(msj);
               switch (resp2) {
                   case 1:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       System.out.println(a.prodPunto(b));
                       break;
                   case 2:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       System.out.println(a.suma(b));
                       break;
                   case 3:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       System.out.println(a.resta(b));
                       break;
                   case 4: System.out.println("Introduzca sus datos de su vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println(a.magnitud());
                       break;
                   case 5:break;
       }
       //VECTOR R3
           case 2: System.out.println("\n ¿Qué operación desea realizar? \n 1: Producto punto \n 2: Suma \n 3: Resta \n" +
                   " 4: Magnitud\n 5: ProdCruz \n 6: Si desea SALIR ");
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
                       System.out.println(x.prodPunto(y));
                       break;
                   case 2:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su segundo vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.suma(y));
                       break;
                   case 3:
                       System.out.println("Introduzca sus datos de su primer vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.resta(y));
                       break;
                   case 4:
                       System.out.println("Introduzca sus datos de su vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println(x.magnitud());
                       break;
                   case 5:
                       System.out.println("Introduzca sus datos de su vector");
                       x.setA(lc.getDouble(msj));
                       x.setB(lc.getDouble(msj));
                       x.setB2(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       y.setA(lc.getDouble(msj));
                       y.setB(lc.getDouble(msj));
                       y.setB2(lc.getDouble(msj));
                       System.out.println(x.prodCruz(y));
                       break;}
               //VECTOR R4
               System.out.println("\n ¿Qué operación desea realizar? \n 1: Producto punto \n 2: Suma \n 3: Resta \n" +
                       " 4: Magnitud\n 5: Si desea SALIR ");
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
                   case 5:break;


                       }
}}}
