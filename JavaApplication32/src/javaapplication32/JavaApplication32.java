package javaapplication32;
import java.util.Random;
import java.util.Scanner;
public class JavaApplication32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alumnos;
        double promedioEstu, calACD, calAPE, calAA, promedioACD, promedioAPE, promedioAA, porcentajeA, porcentajeR, totalA, totalR;
        String paralelo = "A";
        porcentajeA = 0;
        porcentajeR = 0;
        String[] prefijos = {"Juan", "David", "Pablo", "Andrea", "Anthony", "Valeria", "Manuel", "Mateo", "José", "Carla", "Sara", "Xavier", "Maria", "Daniel", "Débora"};
        String[] sufijos = {"Landi", "Álvares", "Bustamante", "Pauta", "Cueva", "Valdiviezo", "Valverde", "Cuenca", "Gonzáles", "Ruíz", "Chávez", "Palacios", "Zapata", "Ordóñez", "Salinas"};
        String[] materias = {"Estructuras discretas"};
        System.out.println("Cuantos estudiantes desea ingresar");
        alumnos = teclado.nextInt();
        Random random = new Random();
        for (int i = 0; i < alumnos; i++) {
            String nombreAleatorio = generarNombreAleatorio(prefijos, sufijos, materias, random);
            System.out.println(nombreAleatorio);
            while (true) {
                Random r = new Random();
                int num = r.nextInt();
                int cantidad = (int) Math.abs(Math.log10(num) + 1);
                calACD = (Math.random() * (10 - 1 + 1) + 1);
                calAPE = (Math.random() * (10 - 1 + 1) + 1);
                calAA = (Math.random() * (10 - 1 + 1) + 1);
                if (cantidad < 5) {
                    num = r.nextInt();
                } else if (cantidad >= 8) {
                    num = r.nextInt();
                } else {
                    System.out.println("110" + num);
                    {
                        if (calACD < 10 && calAPE < 10 && calAA < 10);
                        calACD = r.nextDouble() * 10;
                        calAPE = r.nextDouble() * 10;
                        calAA = r.nextDouble() * 10;
                        System.out.println("ACD: " + calACD);
                        promedioACD = calACD * 0.35;
                        System.out.println("APE: " + calAPE);
                        promedioAPE = calAPE * 0.35;
                        System.out.println("AA: " + calAA);
                        promedioAA = calAA * 0.30;
                        promedioEstu = (promedioACD + promedioAPE + promedioAA);
                        System.out.println("El promedio del estudinte es: " + promedioEstu);
                        if (promedioEstu >= 7) {
                            porcentajeA = porcentajeA + 1;
                            System.out.println("Usted aprobó la materia");
                        } else {
                            porcentajeR = porcentajeR + 1;
                            promedioEstu = (promedioEstu * 0.60);
                            System.out.println("Usted tiene que dar un examen de recuperación con el puntaje de 3,5/10 sumando su nota acumulada que es: " + promedioEstu);
                        }
                        break;
                    }
                }
            }
        }
        totalA = ((porcentajeA * 100) / alumnos);
        totalR = ((porcentajeR * 100) / alumnos);
        System.out.println("=========================================================");
        System.out.println("PARALELO " + paralelo);
        System.out.println("El porcentaje de estudiantes aprobados es de: " + totalA + "%");
        System.out.println("El porcentaje de estudiantes reprobados es de: " + totalR + "%");
    }
    public static String generarNombreAleatorio(String[] prefijos, String[] sufijos, String[] materias, Random random) {
        System.out.println("" + materias[random.nextInt(materias.length)]);
        String nombreAleatorio = prefijos[random.nextInt(prefijos.length)]
                + " "
                + sufijos[random.nextInt(sufijos.length)];
        return nombreAleatorio;
    }
}
