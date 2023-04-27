package proyectoEntornos;

import java.util.regex.Pattern;
import clases.Calcula;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ProyectoEntornos {

    public static void main(String[] args) {

        //declaro las variables que voy a necesitar
        int num1, num2, resultado;
        String operacion, Snum;
        boolean salir;
        
        //instancio el Scanner
        Scanner teclado = new Scanner(System.in);
        
        //pido el tipo de operacion a realizar
        Pattern p = Pattern.compile("(suma|resta|multiplicacion|multiplicación|division|división)");
        salir = false;
        do{
            System.out.print("¿Qué operación desea realizar?: ");
            operacion = teclado.nextLine();
            operacion = operacion.toLowerCase();
            operacion = operacion.trim();
            Matcher m = p.matcher(operacion);
            if(m.matches())
                salir = true;
        } while(! salir);
        
        //pido el primer numero
        p = Pattern.compile("[0-9]{1,3}");
        salir = false;
        do{
            System.out.print("Introduce el primer numero: ");
            Snum = teclado.nextLine();
            num1 = Integer.parseInt(Snum);
            Matcher m = p.matcher(Snum);
            if(m.matches()){
                salir = true;
            }
        } while(! salir);
        
        //pido l segundo numero
        salir = false;
        do{
            System.out.print("Introduce el segundo numero: ");
            Snum = teclado.nextLine();
            num2 = Integer.parseInt(Snum);
            Matcher m = p.matcher(Snum);
            if(m.matches()){
                salir = true;
            }
        } while(! salir);
        
        //creo un objeto de mi clase Calcula
        Calcula c1 = new Calcula();
        
        //uso el metodo calcular de mi clase Calcula
        resultado = c1.calcular(num1, num2, operacion);
        
        //muestro el resuñtado por pantalla
        System.out.println("RESULTADO: " + resultado);
    }
}
