package mercado;

import java.util.ArrayList;

public class Mercado {

	public void listarMarca(String marca) {
		int qnt = 0;
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getMarca().equals(marca)) {
				qnt++;
				System.out.println(produtos.get(i).toString());
			}
		}
		System.out.println("\nQuantidade de produtos desta marca: " + qnt);
	}

	public void listar() {
		System.out.println(produtos.toString());
	}

	public boolean remover(int cod) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCodigo() == cod) {
				produtos.remove(i);
			}
		}
		return true;
	}

	public boolean adicionar(Produto novoProduto) {
		return produtos.add(novoProduto);
	}

	public Mercado() {
		this.produtos = new ArrayList<Produto>();
	}

	private ArrayList<Produto> produtos;

}
