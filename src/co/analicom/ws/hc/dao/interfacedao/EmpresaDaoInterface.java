/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.Empresa;

/**
 * @author Cristian Cruz
 */
public interface EmpresaDaoInterface {
	
	public boolean insertEmpresa(Empresa empresa);
	public int obtenerID();
}
