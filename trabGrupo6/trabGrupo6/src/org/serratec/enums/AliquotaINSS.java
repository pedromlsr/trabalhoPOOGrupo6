package org.serratec.enums;

public enum AliquotaINSS {
	FAIXA_1(0.075), FAIXA_2(0.09), FAIXA_3(0.12), FAIXA_4(0.14);
	
	private Double aliquota;

	private AliquotaINSS(Double aliquota) {
		this.aliquota = aliquota;
	}

	public Double getAliquota() {
		return aliquota;
	}
	
}
