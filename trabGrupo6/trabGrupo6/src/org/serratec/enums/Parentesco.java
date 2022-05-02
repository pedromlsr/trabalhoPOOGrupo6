package org.serratec.enums;

import org.serratec.exceptions.DependenteException;

public enum Parentesco {
	FILHO("FILHO"), SOBRINHO("SOBRINHO"), OUTROS("OUTROS");

	private String parentesco;

	private Parentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}

	public static String verificarParentesco(String parentesco, String nome, String cpf) throws DependenteException {
		
		for (Parentesco p : Parentesco.values()) {
			
			if (parentesco.equals(p.getParentesco())) {
				return parentesco;
			}
			
		}
		
		throw new DependenteException(
				"Erro 203: Só é permitido cadastrar dependentes de parentesco FILHO, SOBRINHO ou OUTROS. O(A) dependente " + nome
						+ " (CPF: " + cpf + ") não foi cadastrado(a).");
	}
	
}
