import java.util.Scanner;

public class Exe_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double descontoImp = 0, descontoInss = 0;
		
		System.out.print("Quanto voce ganha em uma hora?");
		double salarioHr = sc.nextDouble();
		System.out.print("Quantos horas voce trabalha por mes?");
		double horas = sc.nextDouble();
		
		double salarioBruto = salarioHr * horas;
		
		if((salarioBruto > 1903.98) || (salarioBruto <=  2826.65)) {
			descontoImp = salarioBruto * 0.075;
		}else if((salarioBruto > 2826.65) || (salarioBruto <= 3751.05)) {
			descontoImp = salarioBruto * 0.15;
		}else if((salarioBruto > 3751.05) || (salarioBruto <= 4664.68)) {
			descontoImp = salarioBruto * 0.22;
		}else if(salarioBruto > 4664.68) {
			descontoImp = salarioBruto * 0.275;
		}
		
		if(salarioBruto < 1212.00) {
			descontoInss = salarioBruto * 0.075;
		}else if((salarioBruto > 1212.00) || (salarioBruto <= 2427.35)) {
			descontoInss = salarioBruto * 0.09;
		}else if((salarioBruto > 2427.35) || (salarioBruto <= 3641.03)) {
			descontoInss = salarioBruto * 0.12;
		}else if(salarioBruto >  7087.22) {
			descontoInss = salarioBruto * 0.14;
		}
		
		System.out.println("Salario Bruto:..... " + salarioBruto);
		System.out.println("Imposto de Renda:.. " + descontoImp);
		System.out.println("INSS:.............. " + descontoInss);
		System.out.printf("FGTS:............... %.2f\n", salarioBruto * 0.08);
		System.out.printf("Total dos descontos: %.2f\n", descontoImp + descontoInss);
		System.out.printf("Salario liquido:.... %.2f", salarioBruto - (descontoImp + descontoInss));
		sc.close();

	}

}
