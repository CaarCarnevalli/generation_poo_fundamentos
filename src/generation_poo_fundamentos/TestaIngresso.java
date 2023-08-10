package generation_poo_fundamentos;

import java.util.Calendar;

public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar data = Calendar.getInstance();
         data.set(2023,Calendar.AUGUST, 26, 14,00,00);
		Ingresso Taylor = new Ingresso("Taylor", data.getTime(), 150.00f, "Rio de janeiro", 98765);

		Taylor.visualizar();

	}

}
