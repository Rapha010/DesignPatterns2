package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cha extends Bebida {

	@Override
	protected List<String> adicionarIngredientes() {
		List<String> ingredientes = new ArrayList<>();
		ingredientes.add("Adicionar um sachê de chá");
		return ingredientes;
	}


}
