package co.analicom.ws.controller;

import java.util.Calendar;

import co.analicom.ws.hc.dao.implementsdao.AgudezaVisualDao;
import co.analicom.ws.hc.modelo.AgudezaVisual;
import co.analicom.ws.hc.modelo.HistoriaVisiometria;

public class PruebaInsert {

	public static void main(String[] args) {
		
		//HistoriaVisiometria historiaVisiometria = new HistoriaVisiometria(, 28, 1018416696, 1094940706, "PERIÓDICO", "", fechaDiligenciamiento, fechaModificacion, impresionDiagnostica, impresionDiagnosticaObservacion, userModifica, impreso, cantImpresiones, estado, pacienteCompatibleLabor, pacienteCompatibleLabor_Observacion, requiereNuevaValoracion, requiereNuevaValoracion_Observacion, requiereRemisionEspecialista, requiereRemisionEspecialista_Observacion, firmaPaciente, firmaMedico)
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
