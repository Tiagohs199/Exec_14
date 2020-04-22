package entities;

public class Juridica extends Fisica{
	private int funcionarios;
	
	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual,  int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public Double imposto() {
		double imp;
		if (funcionarios > 10) {
			return imp = super.getRendaAnual() *0.14;
		}else {
			return imp = super.getRendaAnual() * 0.16;
						}
		}

	@Override
	public String toString() {
		return super.getNome()+":  $ " + String.format("%.2f",imposto());
	}


}
