package prueba2;

public class FormatoHoras {
public static void main(String [] args)  {
	int hh, mm ;
	hh = 2;//1 <= hh < 12
	mm = 1;// 0 <= mm < 60
	
	tempoNumerico(hh, mm);

	System.out.println("Formato numerico hh:mm -> " + hh+":"+mm );
}

private static void tempoNumerico(int hh, int mm) {
	String hora;
	String minuto;
	hora = cambiareOra(hh);
	minuto = cambiareMinuti(mm);
	if(minuto == "") {
		minuto = "cero";
		System.out.println("Formato texto de voz: " + hora + " horas y " + minuto +" minutos");
	}else {
		if(hora== "una") {
			System.out.println("Formato texto de voz: " + hora + " hora y " + minuto +" minutos");	
		}else {
		System.out.println("Formato texto de voz: " + hora + " horas y " + minuto +" minutos");
		}
	}
	

}
private static String cambiareOra(int parametro) {
	
	String [] numeri = 
		{"una", "dos", "tres", "cuatro","cinco", "seis", 
				"siete","ocho", "nueve","diez", "once", "cero"};
	String parola="";
	for(int i=0; i < numeri.length; i++) {
		
		if(i == parametro-1) {
			//System.out.println(numeri[i]);
			parola = numeri[i];
			break;
		}
	
	}
	
	//System.out.println("dato ingresado es: " + parametro);
	return parola;
}
private static String cambiareMinuti(int parametro) {
	String [] numeri = 
		{"cero","un", "dos", "tres", "cuatro","cinco", "seis", 
				"siete","ocho", "nueve","diez", "once", "doce",
				"trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte",
				"veintiuno","veintidos","veintitres", "veinticuatro", "veinticinco",
				"veintiseis","veintisiete","veintiocho", "veintinueve", "treinta",
				"treinta y un","treinta y dos","treinta y tres", "treinta y cuatro", "treinta y cinco",
				"treinta y seis","treinta y siete","treinta y ocho", "treinta y nueve", "cuarente",
				"cuarenta y un","cuarenta y dos","cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco",
				"cuarenta y seis","cuarenta y siete","cuarenta y ocho", "cuarenta y nueve", "cincuenta",
				"cincuenta y un","cincuenta y dos","cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco",
				"cincuenta y seis","cincuenta y siete","cincuenta y ocho","cincuenta y nueve"
		};
	String parola="";
	for(int i=0; i < numeri.length; i++) {
		
		if(i == parametro) {
			//System.out.println(numeri[i]);
			parola = numeri[i];
			break;
		}
	
	}
	
	//System.out.println("dato ingresado es: " + parametro);
	return parola;
}
}
