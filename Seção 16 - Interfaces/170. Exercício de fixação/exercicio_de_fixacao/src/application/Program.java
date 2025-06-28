package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br>
     * Seção 16 - Interfaces</h1><br>
     * <b>170. Exercício de fixação<br><br></b>
     * Exercício de fixação<br><br>
     * Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
     * um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
     * número de meses desejado.<br><br>
     * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
     * Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
     * por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
     * juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.<br><br>
     * Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
     * e valor total do contrato). Em seguida, o programa deve ler o número de meses para
     * parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
     * sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
     * meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.<br><br>
     * Veja exemplo na próxima página.<br><br>
     * Example:<br><br>
     * Entre os dados do contrato:<br>
     * Numero: 8028<br>
     * Data (dd/MM/yyyy): 25/06/2018<br>
     * Valor do contrato: 600.00<br>
     * Entre com o numero de parcelas: 3<br>
     * Parcelas:<br>
     * 25/07/2018 - 206.04<br>
     * 25/08/2018 - 208.08<br>
     * 25/09/2018 - 210.12<br><br>
     * Cálculos (1% juro simples mensal + 2% taxa de pagamento):<br><br>
     * Parcela #1:<br>
     * 200 + 1% * 1 = 202<br>
     * 202 + 2% = 206.04<br><br>
     * Parcela #2:<br>
     * 200 + 1% * 2 = 204<br>
     * 204 + 2% = 208.08<br><br>
     * Parcela #3:<br>
     * 200 + 1% * 3 = 206<br>
     * 206 + 2% = 210.12<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 27/06/2025
     */
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas:");
        for (Installment installment : obj.getInstallmentList()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
