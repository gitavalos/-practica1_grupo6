package practica1_grupo6;

/**
 *
 * @author Anibal Gramajo
 */
public class Factorial {

    static int factorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

}
