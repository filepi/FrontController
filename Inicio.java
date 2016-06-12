public class Inicio {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.abrirPagina(Constants.MENU_PRINCIPAL);
		frontController.abrirPagina(Constants.MENU_CONTATO);
		frontController.abrirPagina(Constants.MENU_CLIENTES);
	}
}
