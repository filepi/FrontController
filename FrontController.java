public class FrontController {
	
	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	private void registrarPedido(String pedido) {
		System.out.println("Página requisitada: " + pedido);
	}

	public void abrirPagina(String pedido) {

		registrarPedido(pedido);
		dispatcher.despacharSolicitação(pedido);
	}
}
