package org.serratec.enums;

public enum BaseSalarialIR {
	FAIXA_1(1903.98), FAIXA_2(2826.65), FAIXA_3(3751.05), FAIXA_4(4664.68);

	private Double salario;

	private BaseSalarialIR(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}
	
}
