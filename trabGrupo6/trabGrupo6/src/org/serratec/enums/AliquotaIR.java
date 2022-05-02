package org.serratec.enums;

public enum AliquotaIR {
	FAIXA_1(0.00), FAIXA_2(0.075), FAIXA_3(0.15), FAIXA_4(0.225), FAIXA_5(0.275);
	
	private Double aliquota;

	private AliquotaIR(Double aliquota) {
		this.aliquota = aliquota;
	}

	public Double getAliquota() {
		return aliquota;
	}
	
}
