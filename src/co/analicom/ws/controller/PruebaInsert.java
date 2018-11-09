package co.analicom.ws.controller;

import java.util.Calendar;

import co.analicom.ws.hc.dao.implementsdao.AgudezaVisualDao;
import co.analicom.ws.hc.modelo.AgudezaVisual;
import co.analicom.ws.hc.modelo.HistoriaVisiometria;

public class PruebaInsert {

	public static void main(String[] args) {
		AgudezaVisual agudezaVisual = new AgudezaVisual(10949, "12", "12345", "1094940705", "Prueba",
				"prueba 2", "prueba" ,"prueba", "impreison diag", 
				"impresionObserv", "Bernal", "impreso", "12", "prueba", "pacienteCompatible", 
				"pacienteCompatibleImpr", "Si requiere", "requiere prueba",
				"requiere remision", "requiere remision obser", "prueba", "prueba", "requiere remision", 
				"prueba", "prueba", "prueba", "prueba", "prueba", "prueba", "prueba", "prueba", "prueba", "prueba", "prueba", "prueba");
		AgudezaVisualDao dao = new AgudezaVisualDao();
		dao.insertarAgudezaVisual(agudezaVisual);
	}

}

