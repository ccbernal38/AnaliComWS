/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ManipulacionAlimentoDaoInterface;
import co.analicom.ws.hc.modelo.ManipulacionAlimentos;

/**
 * @author Cristian Cruz
 */
public class ManipulacionAlimentoDao implements ManipulacionAlimentoDaoInterface{
	
	Conexion conexion;
	
	public ManipulacionAlimentoDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertManipulacionAlimento(ManipulacionAlimentos manipulacionAlimentos) {
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
