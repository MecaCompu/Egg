package Utilidad;
import java.util.Date;


public class Utilidad {

	public static String cambioFecha(Date fecha){
		int dia = fecha.getDate();
		int mes = fecha.getMonth() +1 ;
		int anio = fecha.getYear();
		return dia +  "/" +  mes + "/" + anio;
	}

}
