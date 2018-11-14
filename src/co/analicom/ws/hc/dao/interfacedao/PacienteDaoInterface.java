/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.Paciente;

/**
 * @author Christian Bernal
 */
public interface PacienteDaoInterface {

	public boolean insertPaciente(Paciente paciente);

	public boolean verificarPacienteExiste(String documento);

}
