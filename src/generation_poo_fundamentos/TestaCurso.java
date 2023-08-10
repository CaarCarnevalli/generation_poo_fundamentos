package generation_poo_fundamentos;

import java.util.Calendar;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar data = Calendar.getInstance();
        data.set(2023,Calendar.SEPTEMBER, 26, 07,00,00);
	 Curso programação = new Curso ("Progamação","Generation",100.00f,data.getTime(),"segunda");
	

		
		programação.visualizar();
		
		
		
		
	}

}
