package br.ce.israel.servicos;

import br.ce.israel.entidades.Filme;
import br.ce.israel.entidades.NotaAluguel;
import br.ce.israel.entidades.TipoAluguel;
import br.ce.israel.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, TipoAluguel tipo) {
		if(filme.getEstoque() == 0 ) 
			throw new RuntimeException("Filme sem estoque");
		NotaAluguel nota = new  NotaAluguel();
		switch (tipo) {
		case COMUM:
			nota.setPreco(filme.getValorAluguel());
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
			nota.setPontuacao(1);
			break;
		case EXTENDIDO:
			nota.setPreco(filme.getValorAluguel() * 2);
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
			nota.setPontuacao(2);
			break;
		case SEMANAL:
			nota.setPreco(filme.getValorAluguel() * 3);
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(7));
			nota.setPontuacao(3);
			break;

		}
		filme.setEstoque(filme.getEstoque() -1);
		return nota;
	}
}
