package co.analicom.ws.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import co.analicom.ws.dao.implement.ExamenDao;
import co.analicom.ws.modelo.Examen;



public class SincronizacionController {

	public List<Examen> getExamenesFM() {
		ExamenDao dao = new ExamenDao();
		return dao.listExamenesFM();
	}

	public List<Examen> getExamenesMySQL() {
		ExamenDao dao = new ExamenDao();
		return dao.listExamenesMySQL();
	}
	
	public boolean sincronizarCatalogos() {
		List<Examen> list_FM = getExamenesFM();
		ExamenDao dao = new ExamenDao();
		dao.deleteCatalogoWeb();
		
		for (Examen examen : list_FM) {
			dao.insertCatalogoWEB(examen);
		}
		return true;
	}

	public void getExamenesComparacion() {
		System.out.println("ACTUALIZANDO CATALOGO WEB......");
		List<Examen> list_UW = getExamenesMySQL();
		List<Examen> list_FM = getExamenesFM();
		System.out.println("FM: " + list_FM.size() + " UW: " + list_UW.size());
		List<Examen> list_update = new ArrayList<>();

		for (Examen examen : list_FM) {
			Iterator<Examen> iter = list_UW.iterator();
			while (iter.hasNext()) {
				Examen examen_uw = iter.next();

				try {

					if (examen.getSigla().equals(examen_uw.getSigla())) {
						if (!examen.getDescripcion().equals(examen_uw.getDescripcion())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getDias_proceso().equals(examen_uw.getDias_proceso())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getHora_toma().equals(examen_uw.getHora_toma())) {
							examen.setId(examen_uw.getId());
							examen.setHora_toma(examen.getHora_toma().replace('\r', '\n'));
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getInstrucciones().equals(examen_uw.getInstrucciones())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getSignificado().equals(examen_uw.getSignificado())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getSignificado_clinico().equals(examen_uw.getSignificado_clinico())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getSinonimo().equals(examen_uw.getSinonimo())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getTecnica().equals(examen_uw.getTecnica())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getTiempo_proceso().equals(examen_uw.getTiempo_proceso())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						} else if (!examen.getTipoMuestra().equals(examen_uw.getTipoMuestra())) {
							examen.setId(examen_uw.getId());
							list_update.add(examen);
							iter.remove();
							break;
						}
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
		System.out.println("FM: " + list_FM.size() + " UW: " + list_UW.size());
		System.out.println(list_update.size());
		// list_update.addAll(list_UW);
		for (int j = 0; j < list_update.size(); j++) {
			new ExamenDao().updateCatalogoWeb(list_update.get(j));
		}
		return;

	}

}
