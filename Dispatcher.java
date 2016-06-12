// A classe dispatcher conhece as classes de funções do sistema e é 
// responsável por chamar as funções baseado no tipo do pedido

public class Dispatcher {
	private MenuPrincipal menuPrincipal;
	private MenuContato menuContato;
	private MenuClientes menuClientes;

	public Dispatcher() {
		menuPrincipal = new MenuPrincipal();
		menuContato = new MenuContato();
		menuClientes = new MenuClientes();
	}

	public void despacharSolicitação(String pedido) {
		if (pedido.equals(Constants.MENU_PRINCIPAL)) {
			menuPrincipal.abrirPagina();
		} else if (pedido.equals(Constants.MENU_CONTATO)) {
			menuContato.abrirPagina();
		} else{
			menuClientes.abrirPagina();
		}
	}
}
