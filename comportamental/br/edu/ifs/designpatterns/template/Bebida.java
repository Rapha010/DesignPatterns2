package br.edu.ifs.designpatterns.template;

import java.util.ArrayList;
import java.util.List;

public abstract class  Bebida {

	public List<String> obterPreparo() {
		
		List<String> preparo = new ArrayList<>();
		preparo.add("Preparar uma xícara");
		
		preparo.addAll(adicionarIngredientes());
		preparo.add("Adicionar água quente");
		
		return preparo;
	}

	protected abstract List<String> adicionarIngredientes();

}
