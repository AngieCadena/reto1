public class Administracion {
    public static void main(String args []){
        CalcularDiferencia(12,150000,0.1);
    }
    public String CalcularDiferencia(int pTiempo, double pMonto, double pInteres){
        double totalInteresSimple = pMonto * pInteres * pTiempo;   
        int pCalculo = math.pow((1 + pInteres),pTiempo);
        double totalInteresCompuesto = pMonto * (pCalculo-1);
        double compararInversion= totalInteresCompuesto-totalInteresSimple;
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra; de: $" + compararInversion + ".";

        return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";


    }}
    
