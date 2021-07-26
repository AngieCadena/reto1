package co.edu.utp.misitontic2022.c2;
import java.util.Scanner;
public class PromedioNotas {
   //funciones que resuleven el problema
   //seccion principal o punto de entrada a las funciones 
public static int obtenerPeorNota(int nota1, int nota2, int nota3, int nota4, int nota5){
    int peorNota = nota1;
    if(peorNota>nota2){
        peorNota = nota2;
    }
    if(peorNota>nota3){
        peorNota = nota3;
    }
    return peorNota;

}
public static double calcularPromedioAjustado(int nota1, int nota2, int nota3, int nota4, int nota5){
    int peorNota = obtenerPeorNota(nota1, nota2, nota3, nota4, nota5);
    int sumatoria = 0;
    double promedioAjustado=0;
    sumatoria = (nota1+nota2+nota3+nota4+nota5)-peorNota;
    promedioAjustado = (double) sumatoria/4;
    return promedioAjustado;
}
public static double convertirEscala5(double calificacion100){
return calificacion100*0.05;

}

//Funcion para mensaje de salida
public static void reportarPromedioAjustado(String codigo, double promedioAjustado){
    System.out.println("El promedio ajustado del estudiante " + codigo + "es: "+ promedioAjustado);

}
public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el codigo del estudiante: ");
    String codigoEstudiante = sc.nextLine();
    System.out.println("Ingrese la nota 1: ");
    int nota1 = sc.nextInt();
    System.out.println("Ingrese la nota 2: ");
    int nota2 = sc.nextInt();
    System.out.println("Ingrese la nota 3: ");
    int nota3 = sc.nextInt();
    System.out.println("Ingrese la nota 4: ");
    int nota4 = sc.nextInt();
    System.out.println("Ingrese la nota 5: ");
    int nota5 = sc.nextInt();

    //Ejecutar las funciones
    double promedioAjustado = convertirEscala5(calcularPromedioAjustado(nota1, nota2, nota3, nota4, nota5));
    
    reportarPromedioAjustado(codigoEstudiante, Math.round(promedioAjustado));

}




}
