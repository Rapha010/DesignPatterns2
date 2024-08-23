package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cafe extends Bebida {

	@Override
	protected List<String> adicionarIngredientes() {
		
		List<String> ingredientes = new ArrayList<>();
		ingredientes.add("Adicionar uma colher de café");
		return ingredientes;
	}

}
