package org.serratec.enums;

public enum DeducaoINSS {
	FAIXA_1(0.00), FAIXA_2(18.18), FAIXA_3(91.00), FAIXA_4(163.82);
	
	private Double deducao;

	private DeducaoINSS(Double deducao) {
		this.deducao = deducao;
	}

	public Double getDeducao() {
		return deducao;
	}
	
}
