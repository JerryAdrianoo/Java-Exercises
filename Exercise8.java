import java.text.DecimalFormat;
public class Exercise8 {

        public static void main(String[] args) {
                double investimentoInicial = 1000;
                double taxaDeJurosAnual = 10;
                int numeroDeAnos = 5;

                System.out.println("Years    FutureValue");
                for (int anos = 1; anos <= numeroDeAnos; anos++) {
                        double valorFuturo = calcularValorFuturo(investimentoInicial, taxaDeJurosAnual, anos);
                        System.out.println(anos + "        " + formatarValor(valorFuturo));
                }
        }


        public static double calcularValorFuturo(double investimentoInicial, double taxaDeJurosAnual, int numeroDeAnos) {
                double taxaDeJurosMensal = taxaDeJurosAnual / 12 / 100;
                double valorFuturo;
                int periodos = numeroDeAnos * 12;

                return valorFuturo = investimentoInicial * Math.pow(1 + taxaDeJurosMensal, periodos);
        }

        public static String formatarValor(double valor) {
                DecimalFormat df = new DecimalFormat("#.##");
                return df.format(valor);
        }

//        Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
//                Sample data (Monthly compounded) and Output:
//        Input the investment amount: 1000
//        Input the rate of interest: 10
//        Input number of years: 5
//
//        Expected Output:
//
//        Years    FutureValue
//        1            1104.71
//        2            1220.39
//        3            1348.18
//        4            1489.35
//        5            1645.31
}
