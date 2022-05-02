package org.serratec.enums;

public enum BaseSalarialINSS {
	FAIXA_1(1212.00), FAIXA_2(2427.35), FAIXA_3(3641.03), FAIXA_4(7087.22);

	private Double salario;

	private BaseSalarialINSS(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

}
