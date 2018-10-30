/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.Paciente;

/**
 * @author Christian Bernal
 */
public interface PacienteDao {

	public void insertPaciente(Paciente paciente);

	public boolean verificarPacienteExiste(String documento);

}
