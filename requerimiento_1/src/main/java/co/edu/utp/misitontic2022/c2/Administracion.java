package co.edu.utp.misitontic2022.c2;

public class Administracion {
public static void main(String[] args) {
    CalcularDiferencia(12, 150000, 0.1);

}
public static String CalcularDiferencia(int pTiempo, double pMonto, double pInteres){
       if(pTiempo<=0 || pMonto<=0 || pInteres<=0){ 

        String resultado= "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        return resultado;
    
        }        
        else{ 
            double totalInteresSimple = pMonto * pInteres * pTiempo;   
            double pCalculo = Math.pow((1 + pInteres),pTiempo);
            double totalInteresCompuesto = pMonto * (pCalculo-1);
            double compararInversion= totalInteresCompuesto-totalInteresSimple;
            String resultado= "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra; de: $" + compararInversion;
            return resultado;
        }
}

}

/*
public static void responderUsuario(int compararInversion){
    System.out.println("La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra; de: $" + compararInversion + ".");}
}
*/
