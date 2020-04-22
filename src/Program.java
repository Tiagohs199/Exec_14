import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Fisica> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.printf("Tax payer #%d data:%n",i+1);
			System.out.print("Individual or campany (i/c)?");
			char ponto = sc.next().charAt(0);
			if(ponto == 'i') {
				System.out.print("Name: ");
				String name =sc.next();
				System.out.print("Anual income: ");
				double renda = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double saude = sc.nextDouble();
				
				list.add(new Fisica(name, renda, saude));
			}else {
				System.out.print("Name: ");
				String name =sc.next();
				System.out.print("Anual income: ");
				double renda = sc.nextDouble();
				System.out.print("Number of employees: ");
				int funcionarios = sc.nextInt();
				
				list.add(new Juridica(name, renda, funcionarios));
			}
			
		}
		
		System.out.println("Taxes Paid: ");
		for(Fisica fisi: list) {
			
			System.out.println(fisi.toString());
		}
		
		double sum=0;
		for(Fisica fise: list) {
			sum += fise.imposto();
		}
		System.out.printf("total tax: %.2f", sum);

	}

}
