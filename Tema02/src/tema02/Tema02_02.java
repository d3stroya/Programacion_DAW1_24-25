/*
    TIPOS DE OPERADORES
    Los operadores nos permiten realizar operaciones
    como la suma y la resta, pero también asignación de valores
    o relacionales entre dos valores.

    1. Operadores aritméticos
        Suma: +
        Resta: -
        Multiplicación: *
        División: /
        Módulo: % -> Nos da el resto de una división. Se usa mucho para saber si un número es par o impar

    2. Operadores relacionales
        Mayor que: >
        Menor que: <
        Igual que: == -> ¡OJO! Para RELACIONAR dos valores usamos ==. Un sólo = se utiliza para ASIGNAR un valor
        Distinto que: !=
        Mayor o igual que: >=
        Menor o igual que: <=

    3. Operadores lógicos
        And: && -> True si se cumplen las dos condiciones
        Or: || -> True si se cumple alguna de las dos condiciones o las dos
        Negación: ! -> Si es true lo pasa a false y viceversa
        Xor: ^ -> True si se cumple sólo una de las dos condiciones

    4. Operadores unitarios
        Incrementar en uno: ++
        Decrementar en uno: --

    5. Operadores de asignación
        Asignación: =
        Suma y asignación: += -> Es lo mismo que num1 = num1 + num2
        Resta y asignación: -= -> Es lo mismo que num1 = num1 - num2
        Multiplicación y asignación: *= -> Es lo mismo que num1 = num1 * num2
        División y asignación: /= -> Es lo mismo que num1 = num1 / num2
        Módulo y asignación: %= -> Es lo mismo que num1 = num1 % num2

        CONVERSIÓN DE TIPOS (CASTING)
        A veces trabajaremos con distintos tipos de datos que tienen que combinarse.
        Recuerda que Java necesita reservar espacio en memoria para los datos y, 
        dependiendo del tipo de dato que sea, necesitará más o menos espacio.
            * Conversión de tipos implícita: la variable destino es más grande que la de origen (int <- short)
            * Conversión de tipos explícita: la variable destino es más pequeña y debemos explicitar el cambio de tipo byte <- (byte)int

*/


package tema02;

/**
 *
 * @author d3stroya
 */


public class Tema02_02 {
    public static void main(String[] args) {
        
        // OPERADORES
        int num1 = 3;
        int num2 = 4;
        int num3 = 3;
                
//        // Operadores aritméticos
//        System.out.println("\nOPERADORES ARITMÉTICOS");
//        System.out.println("Suma: " + num1 + num2);
//        System.out.println("Resta: " + (num1 - num2));
//        System.out.println("Multiplicación: " + num1 * num2);
//        System.out.println("División: " + num1 / num2);
//        System.out.println("Módulo: " + num1 % num2);
        
//        // Operadores relacionales
//        System.out.println("\nOPERADORES RELACIONALES");
//        System.out.print("¿Son iguales? ");
//        System.out.println(num1 == num2);
//        
//        System.out.print("¿Son distintos? ");
//        System.out.println(num1 != num2);
//        
//        System.out.println("¿num1 es mayor que num2? ");        
//        System.out.println(num1 > num2);
//        
//        System.out.println("¿num1 es menor o igual que num2? ");
//        System.out.println(num1 <= num2);
        
//        // Operadores lógicos
//        System.out.println("\nOPERADORES LÓGICOS");
//        System.out.println("¿num1 es mayor que num2 y num2 es mayor que num3?");
//        System.out.println(num1 > num2 && num2 > num3);
        
//        // Operadores unitarios
//        System.out.println("\nOPERADORES UNITARIOS");
//        num1++;
//        System.out.println("num1 incrementado en 1: " + num1);
//        num1--;
//        System.out.println("num1 decrementado en 1: " + num1);
        
//        // Operadores de asignación
//        System.out.println("\nOPERADORES DE ASIGNACIÓN");        
//        num3 += num1;
//        System.out.println("num3 += num1: " + num3);        
//        
//        num3 -= num1;
//        System.out.println("num3 -= num1: " + num3);
//        
//        num3 *= num1;
//        System.out.println("num3 *= num1: " + num3);
//        
//        num3 /= num1;
//        System.out.println("num3 /= num1: " + num3);        
//        
//        num3 %= num1;
//        System.out.println("num3 %= num1: " + num3);

        // CONVERSIÓN DE TIPOS
        
        // Conversión implícita: un short (16 bits) coge en un int (32 bits)
        short dato1 = 88;
        int dato2;
        
        dato2 = dato1;
        System.out.println(dato2);
        
        // Conversión explícita: un int (32 bits) no coge en un byte (8 bits)
        int dato3 = 88;
        byte dato4;
        
        //dato4 = dato3;  // Error de compilación: "Incompatible types"
        dato4 = (byte)dato3;    // SOLUCIÓN: Pasamos el int a byte
        System.out.println(dato4);
    }
}
