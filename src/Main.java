import hn.edu.ujcv.progra.LectorDeTeclado;
import hn.edu.ujcv.progra.OVecR2;
import hn.edu.ujcv.progra.OVecR3;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {
        OVecR2 a = new OVecR2();
        OVecR2 b = new OVecR2();
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
               System.out.println("Introduzca sus datos de su primer vector");
               b.setX(lc.getDouble(msj));
               b.setY(lc.getDouble(msj));
               System.out.println(a.prodPunto(b));
               break;
                   case 2:
                       System.out.println("Introduzca sus datos de su primer vector");
                       a.setX(lc.getDouble(msj));
                       a.setY(lc.getDouble(msj));
                       System.out.println("Introduzca sus datos de su primer vector");
                       b.setX(lc.getDouble(msj));
                       b.setY(lc.getDouble(msj));
                       OVecR2 sum = new OVecR2();
                       
                       System.out.println(sum);
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



    }
}}
