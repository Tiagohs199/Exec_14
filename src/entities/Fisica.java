package entities;

public class Fisica {
	
	private String nome;
	private Double rendaAnual;
	private Double gastoSaude;
	
	public Fisica() {
		
	}

	public Fisica(String nome, Double rendaAnual, Double gastoSaude) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastoSaude = gastoSaude;
	}
	public Fisica(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	public Boolean veri() {
		if(gastoSaude > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public Double imposto() {
		double imp;
		if (rendaAnual <= 20000.00) {
			return imp = rendaAnual *0.15;
		}else {
			if(veri()) {
				return imp = (rendaAnual*0.25)-(gastoSaude*0.5);
			}else {
				return imp = rendaAnual*0.25;
			}
		}
		
	}

	@Override
	public String toString() {
		return nome+": $ "+  String.format("%.2f",imposto());
	}
	
	
	
	
	

}
