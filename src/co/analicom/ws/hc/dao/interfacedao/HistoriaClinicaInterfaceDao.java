/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import java.util.Date;

import co.analicom.ws.hc.modelo.HistoriaClinica;

/**
 * @author Cristian Cruz
 */
public interface HistoriaClinicaInterfaceDao {
	
	public boolean insertHistoriaClinica(HistoriaClinica clinica);
	
	public int obtenerID(String fk_IDT_DocumentoID);
}
