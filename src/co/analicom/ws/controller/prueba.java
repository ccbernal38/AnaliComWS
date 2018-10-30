package co.analicom.ws.controller;

import java.util.Calendar;

import com.mysql.jdbc.Blob;

import co.analicom.ws.hc.dao.implementsdao.PacienteDao;
import co.analicom.ws.hc.modelo.Paciente;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PacienteDao dao = new PacienteDao();
		Blob blob = null;
		Paciente paciente = new Paciente("123456789", "CC", "Prueba", "Asd", "Masculino", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", 0, 0, 0, 0, blob, blob, Calendar.getInstance().getTime(),Calendar.getInstance().getTime());
		
		dao.insertPaciente(paciente);
	}

}
