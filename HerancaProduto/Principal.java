package HerancaProduto;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto (23, "Veja", 13.0);
		System.out.println("Produto");
		System.out.println("id:" + produto.getId());
		System.out.println("Nome:" + produto.getNome  ( ));
		System.out.println("preco:" + produto.getPreco());
		
		Sorvete sorvete = new Sorvete (23, "Veja", 13.0, 10);
		System.out.println("Sorvete");
		System.out.println("id:" + produto.getId());
		System.out.println("Nome:" + produto.getNome  ( ));
		System.out.println("preco:" + produto.getPreco());
		System.out.println("TempAdequada: " + sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa (23, "Veja", 13.0, "preto", "Algodão Tricoline", "P");
		System.out.println("Camisa");
		System.out.println("id: " + produto.getId());
		System.out.println("Nome:" + produto.getNome  ( ));
		System.out.println("preco:" + produto.getPreco());
		System.out.println("Cor:" + camisa.getCor());
		System.out.println("Tecido: " + camisa.getTecido());
		System.out.println("Tamanho: " + camisa.getTamanho());

	}

}
