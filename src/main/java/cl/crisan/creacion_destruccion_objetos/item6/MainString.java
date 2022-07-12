package cl.crisan.creacion_destruccion_objetos.item6;

/**
 * Clase que clarifica la diferencia entre la creación de un String con constructos y
 * la creación sin el constructor
 */
public class MainString {

    public static void main(String[] args) {
        /**
         * El concepto de Java new String es a veces difícil de entender para
         * los programadores cuando uno empieza. Vamos a intentarlo explicar de forma sencilla .
         * Cuando nosotros trabajamos con Strings en Java somos conscientes de que
         * estamos trabajando con una clase que genera objetos.
         * Por ejemplo podemos construir el siguiente código:
         */
        String texto1= new String("hola");
        String texto2= new String("hola");
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto1.equals(texto2));
        // Salida:
        // hola
        // hola
        // true

        // Segundo Ejemplo
        String texto3= "hola";
        String texto4 = "hola";
        System.out.println(texto3);
        System.out.println(texto4);
        System.out.println(texto3.equals(texto4));
        // Salida:
        // hola
        // hola
        // true

        // Tercer ejemplo
        // En este ejemplo los objetos se crean distinto cada uno,
        // el texto5 es uno y el texto6 es otro que cada uno apunta
        // a un espacio de memoria distinto
        String texto5= new String("hola");
        String texto6= new String("hola");
        System.out.println(texto5);
        System.out.println(texto6);
        System.out.println(texto5.equals(texto6));
        System.out.println(texto5==texto6);
        // Salida:
        // hola
        // hola
        // true
        // false

        // Cuarto ejemplo
        // En este ejemplo los objetos se crean distinto cada uno,
        // el texto5 es uno y el texto6 es otro que cada uno apunta
        // a un espacio de memoria distinto
        String texto7= "hola";
        String texto8= "hola";
        System.out.println(texto7);
        System.out.println(texto8);
        System.out.println(texto7.equals(texto8));
        System.out.println(texto7==texto8);
        // Salida:
        // hola
        // hola
        // true
        // true
        // En este caso solo se ha creado un objeto en memoria y
        // las dos variables apuntando al mismo, esto se debe a que
        // a nivel de maquina virtual cada vez que generamos un literal
        // las almacena en un pool para su posterior reutilizacion
    }
}
