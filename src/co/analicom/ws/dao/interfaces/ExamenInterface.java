package co.analicom.ws.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import co.analicom.ws.modelo.lis.Examen;


public interface ExamenInterface {

	public List<String> buscarSufijos(int id_examen);


	public List<String> listaParametrosExamenCadena(int examen);

	public List<Integer> listaExamenesOrdenPorAnalizador(String orden, int analizador);

	public List<Examen> listExamenesFM();

	public List<Examen> listExamenesMySQL();

	public void updateCatalogoWeb(Examen examen);
	
	public void deleteCatalogoWeb();
	
	public void insertCatalogoWEB(Examen examen);

}
