package farmacia_java.repository;


import farmacia_java.model.Produto;

public interface ProdutoRespository {
	//Métodos CRUD (Create, Read, Update e Delete)
		public void procurarPorID(int id);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int id);
		
}
