package co.analicom.ws.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class prueba {

	public static void main(String[] args) {
		try {
			String fecha = "14/11/2018 9:49:08 a.m.";
			fecha = fecha.replace(".","");
			java.util.Date dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(fecha);
			System.out.println(dateFechaDeDiligenciamiento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
