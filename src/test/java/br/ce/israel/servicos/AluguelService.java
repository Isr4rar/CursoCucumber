package br.ce.israel.servicos;

import java.util.Calendar;

import br.ce.israel.entidades.Filme;
import br.ce.israel.entidades.NotaAluguel;

public class AluguelService {
	
	public NotaAluguel alugar(Filme filme) {
		if(filme.getEstoque() == 0 ) 
			throw new RuntimeException("Filme sem estoque");
		NotaAluguel nota = new  NotaAluguel();
		nota.setPreco(filme.getValorAluguel());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		filme.setEstoque(filme.getEstoque() -1);
		return nota;
	}

}
