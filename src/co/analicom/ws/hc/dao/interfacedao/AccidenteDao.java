/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.Accidente;
import co.analicom.ws.hc.modelo.Paciente;

/**
 * @author Christian Bernal
 */
public interface AccidenteDao {

	public void insertAccidente(Accidente accidente);

	//public boolean verificarPacienteExiste(String documento);
}
