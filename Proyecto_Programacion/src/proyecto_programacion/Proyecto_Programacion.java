import java.util.Scanner;

public class Proyecto_Programacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAdv = (int) (Math.random() * (100 - 1 + 1) + 1);
        int limInten = 10;
        int intentos;

        System.out.println("Bienvenido al juego de adivinanza");
        System.out.println("Intenta adivinar el numero entre 1 y 100.");

        for (intentos = 1; intentos <= limInten; intentos++) {
            System.out.print("Ingresa tu numero: ");
            int numIng = teclado.nextInt();

            if (numIng == numAdv) {
                System.out.println("Felicidades, Adivinaste el numero en " + intentos + " intentos!");
                break;
            } else {
                if (intentos < limInten) {
                    if (numAdv > numIng) {
                        System.out.println("El numero es mayor. Te quedan " + (limInten - intentos) + " intentos.");
                    } else {
                        System.out.println("El numero es menor. Te quedan " + (limInten - intentos) + " intentos.");
                    }

                    System.out.print("Quieres una pista? (s/n): ");
                    char respuesta = teclado.next().charAt(0);

                    if (respuesta == 's' || respuesta == 'S') {
                        System.out.println("Elige el tipo de pista:");
                        System.out.println("[1]. Par o impar");
                        System.out.println("[2]. Multiplo de 5");
                        System.out.println("[3]. Primo");
                        System.out.println("[4]. Pertenece a la serie de Fibonacci");
                        
                        int opcionPista = teclado.nextInt();

                        switch (opcionPista) {
                            case 1:
                                System.out.println("Pista: El numero es " + (numAdv % 2 == 0 ? "par" : "impar") + ".");
                                break;
                            case 2:
                                if (numAdv % 5 == 0) {
                                    System.out.println("Pista: El numero es multiplo de 5.");
                                } else {
                                    System.out.println("Pista: El numero no es multiplo de 5.");
                                }
                                break;
                            case 3:
                                System.out.println("Pista: El numero " + (esPrimo(numAdv) ? "es primo." : "no es primo."));
                                break;
                            case 4:
                                System.out.println("Pista: El numero " + (perteneceAFibonacci(numAdv) ? "pertenece" : "no pertenece") + " a la serie de Fibonacci.");
                                break;
                           
                            case 5:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                        intentos++;
                    }
                } else {
                    System.out.println("GAME OVER. El numero correcto era: " + numAdv);
                }
            }
        }
    }

    
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    private static boolean perteneceAFibonacci(int numero) {
        int a = 0, b = 1, c;
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return false;
    }
}