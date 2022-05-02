package org.serratec.enums;

public enum DeducaoIR {
	FAIXA_1(0.00), FAIXA_2(142.80), FAIXA_3(354.80), FAIXA_4(636.13), FAIXA_5(869.36);
	
	private Double deducao;

	private DeducaoIR(Double deducao) {
		this.deducao = deducao;
	}

	public Double getDeducao() {
		return deducao;
	}
	
}
