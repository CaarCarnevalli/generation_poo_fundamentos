package generation_poo_fundamentos;

public class TestaLojaGamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto mouse = new Produto("Mouse Gamer Redragon", 94.90, 10, "Redragon", 123445);
		Produto teclado = new Produto("teclado Gamer Redragon", 130.50, 5, "Redragon", 543211);
	
		 mouse.visualizar();
		 teclado.visualizar();
	}
        
}
