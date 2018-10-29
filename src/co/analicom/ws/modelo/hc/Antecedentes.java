/**
 * 
 */
package co.analicom.ws.modelo.hc;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class Antecedentes {

	/**
	 * 
	 */
	public Antecedentes() {
		// TODO Auto-generated constructor stub
	}

	private String AF_Patologia_Alergias, AF_Patologia_Alergias_Parentesco, AF_Patologia_Artitis,
			AF_Patologia_Artitis_Parentesco, AF_Patologia_Asma, AF_Patologia_Asma_Parentesco, AF_Patologia_Cancer,
			AF_Patologia_Cancer_Parentesco, AF_Patologia_cardiaco, AF_Patologia_Diabetes,
			AF_Patologia_Diabetes_Parentesco, AF_Patologia_Dislipidemia, AF_Patologia_Dislipidemia_Parentesco,
			AF_Patologia_EAP, AF_Patologia_EAP_Parentesco, AF_Patologia_ECV, AF_Patologia_ECV_Parentesco,
			AF_Patologia_EnfermedadColagenosis, AF_Patologia_EnfermedadColagenosis_Parentesco,
			AF_Patologia_EnfermedadCoronaria, AF_Patologia_EnfermedadCoronaria_Parentesco, AF_Patologia_EnfermedadRenal,
			AF_Patologia_EnfermedadRenal_Parentesco, AF_Patologia_EnfermedadTiroidea,
			AF_Patologia_EnfermedadTiroidea_Parentesco, AF_Patologia_hipertension, AF_Patologia_HTA,
			AF_Patologia_HTA_Parentesco, AF_Patologia_Otra, AF_Patologia_Otra_Cual, AF_Patologia_TBC,
			AF_Patologia_TBC_Parentesco, AF_Patologia_Varices, AF_Patologia_Varices_Parentesco, AG_Ciclos,
			AG_MetodoPlanificacion, AG_UltimaCitologia_Resultado, AI_CarnetVacunacion, AI_FiebreAmarilla,
			AI_Hepatitis_A, AI_Hepatitis_B, AI_Influenza, AI_Otros, AI_Tetano, AI_TripleViral, AI_Varicela,
			AO_FOtologicos, AO_OActual, AO_OActual_T, AO_OAnterior, AO_OAnterior_T, AO_OJornadaLaboral, AO_OLabores,
			AO_OLabores_Horario, AO_OProteccion, AO_OProteccion_Tipo, AO_OProteccion_Tipo_Tiempo,
			AO_OTiempoExposicionRuido, AO_PExtraLaboral_Audifonos, AO_PExtraLaboral_Cuales, AO_PExtraLaboral_Moto,
			AO_PExtraLaboral_MusicaAlta, AO_PExtraLaboral_Otros, AO_PExtraLaboral_ServicioMilitar,
			AO_PExtraLaboral_Tejo, AO_POtologicos_Cual, AO_POtologicos_Otalgia, AO_POtologicos_Otitis,
			AO_POtologicos_Otorrea, AO_POtologicos_Otros, AO_POtologicos_Prurito, AO_POtologicos_Sensacion,
			AO_POtologicos_Tinitus, AO_POtologicos_Vertigo, AO_PPatologicos_Cuales, AO_PPatologicos_Diabetes,
			AO_PPatologicos_Hipertension, AO_PPatologicos_Otros, AO_PPatologicos_Parotiditis,
			AO_PPatologicos_Rinitis_Sinusitis, AO_PPatologicos_Rubeola, AO_PPatologicos_Sarampion,
			AO_PQuirurgicos_Cirugia_Oido, AO_PQuirurgicos_Cuales, AO_PQuirurgicos_Otros, AO_PQuirurgicos_Timpanoplastia,
			AO_PToxicos_Farmacos, AO_PToxicos_Industriales, AO_PTraumaticos_Acustico, AO_PTraumaticos_Craneo,
			AO_PTraumaticos_Cuales, AO_PTraumaticos_Otros, AP_Catarata, AP_Catarata_escribir, AP_Esquirlas,
			AP_Esquirlas_escribir, AP_Farmacologicos_Alergicos, AP_Farmacologicos_Alergicos_escribir, AP_Galucoma,
			AP_Galucoma_escribir, AP_Otros, AP_Otros_escribir, AP_Patologicos, AP_Patologicos_escribir, AP_Quimicos,
			AP_Quimicos_escribir, AP_Quirurgicos, AP_Quirurgicos_escribir, AP_RehabilitacionVisual,
			AP_RehabilitacionVisual_escribir, AP_Transfusionales, AP_Transfusionales_escribir, AP_Traumaticos,
			AP_Traumaticos_escribir, AP_UsuariosRx, AP_UsuariosRx_escribir, OtrosOculares, OtrosOcularesEscribir;

	private int _fk_IDT_DocumentoID, AG_Dias, AG_FObstetrica_A, AG_FObstetrica_C, AG_FObstetrica_E, AG_FObstetrica_G,
			AG_FObstetrica_P, AG_FObstetrica_V, AG_Menarquia;
	private Date AG_FUP, AG_FUR, AG_UltimaCitologia_Fecha, FechaDeDiligenciamiento, FechaDeModificacion;
	

	/**
	 * @param aF_Patologia_Alergias
	 * @param aF_Patologia_Alergias_Parentesco
	 * @param aF_Patologia_Artitis
	 * @param aF_Patologia_Artitis_Parentesco
	 * @param aF_Patologia_Asma
	 * @param aF_Patologia_Asma_Parentesco
	 * @param aF_Patologia_Cancer
	 * @param aF_Patologia_Cancer_Parentesco
	 * @param aF_Patologia_cardiaco
	 * @param aF_Patologia_Diabetes
	 * @param aF_Patologia_Diabetes_Parentesco
	 * @param aF_Patologia_Dislipidemia
	 * @param aF_Patologia_Dislipidemia_Parentesco
	 * @param aF_Patologia_EAP
	 * @param aF_Patologia_EAP_Parentesco
	 * @param aF_Patologia_ECV
	 * @param aF_Patologia_ECV_Parentesco
	 * @param aF_Patologia_EnfermedadColagenosis
	 * @param aF_Patologia_EnfermedadColagenosis_Parentesco
	 * @param aF_Patologia_EnfermedadCoronaria
	 * @param aF_Patologia_EnfermedadCoronaria_Parentesco
	 * @param aF_Patologia_EnfermedadRenal
	 * @param aF_Patologia_EnfermedadRenal_Parentesco
	 * @param aF_Patologia_EnfermedadTiroidea
	 * @param aF_Patologia_EnfermedadTiroidea_Parentesco
	 * @param aF_Patologia_hipertension
	 * @param aF_Patologia_HTA
	 * @param aF_Patologia_HTA_Parentesco
	 * @param aF_Patologia_Otra
	 * @param aF_Patologia_Otra_Cual
	 * @param aF_Patologia_TBC
	 * @param aF_Patologia_TBC_Parentesco
	 * @param aF_Patologia_Varices
	 * @param aF_Patologia_Varices_Parentesco
	 * @param aG_Ciclos
	 * @param aG_MetodoPlanificacion
	 * @param aG_UltimaCitologia_Resultado
	 * @param aI_CarnetVacunacion
	 * @param aI_FiebreAmarilla
	 * @param aI_Hepatitis_A
	 * @param aI_Hepatitis_B
	 * @param aI_Influenza
	 * @param aI_Otros
	 * @param aI_Tetano
	 * @param aI_TripleViral
	 * @param aI_Varicela
	 * @param aO_FOtologicos
	 * @param aO_OActual
	 * @param aO_OActual_T
	 * @param aO_OAnterior
	 * @param aO_OAnterior_T
	 * @param aO_OJornadaLaboral
	 * @param aO_OLabores
	 * @param aO_OLabores_Horario
	 * @param aO_OProteccion
	 * @param aO_OProteccion_Tipo
	 * @param aO_OProteccion_Tipo_Tiempo
	 * @param aO_OTiempoExposicionRuido
	 * @param aO_PExtraLaboral_Audifonos
	 * @param aO_PExtraLaboral_Cuales
	 * @param aO_PExtraLaboral_Moto
	 * @param aO_PExtraLaboral_MusicaAlta
	 * @param aO_PExtraLaboral_Otros
	 * @param aO_PExtraLaboral_ServicioMilitar
	 * @param aO_PExtraLaboral_Tejo
	 * @param aO_POtologicos_Cual
	 * @param aO_POtologicos_Otalgia
	 * @param aO_POtologicos_Otitis
	 * @param aO_POtologicos_Otorrea
	 * @param aO_POtologicos_Otros
	 * @param aO_POtologicos_Prurito
	 * @param aO_POtologicos_Sensacion
	 * @param aO_POtologicos_Tinitus
	 * @param aO_POtologicos_Vertigo
	 * @param aO_PPatologicos_Cuales
	 * @param aO_PPatologicos_Diabetes
	 * @param aO_PPatologicos_Hipertension
	 * @param aO_PPatologicos_Otros
	 * @param aO_PPatologicos_Parotiditis
	 * @param aO_PPatologicos_Rinitis_Sinusitis
	 * @param aO_PPatologicos_Rubeola
	 * @param aO_PPatologicos_Sarampion
	 * @param aO_PQuirurgicos_Cirugia_Oido
	 * @param aO_PQuirurgicos_Cuales
	 * @param aO_PQuirurgicos_Otros
	 * @param aO_PQuirurgicos_Timpanoplastia
	 * @param aO_PToxicos_Farmacos
	 * @param aO_PToxicos_Industriales
	 * @param aO_PTraumaticos_Acustico
	 * @param aO_PTraumaticos_Craneo
	 * @param aO_PTraumaticos_Cuales
	 * @param aO_PTraumaticos_Otros
	 * @param aP_Catarata
	 * @param aP_Catarata_escribir
	 * @param aP_Esquirlas
	 * @param aP_Esquirlas_escribir
	 * @param aP_Farmacologicos_Alergicos
	 * @param aP_Farmacologicos_Alergicos_escribir
	 * @param aP_Galucoma
	 * @param aP_Galucoma_escribir
	 * @param aP_Otros
	 * @param aP_Otros_escribir
	 * @param aP_Patologicos
	 * @param aP_Patologicos_escribir
	 * @param aP_Quimicos
	 * @param aP_Quimicos_escribir
	 * @param aP_Quirurgicos
	 * @param aP_Quirurgicos_escribir
	 * @param aP_RehabilitacionVisual
	 * @param aP_RehabilitacionVisual_escribir
	 * @param aP_Transfusionales
	 * @param aP_Transfusionales_escribir
	 * @param aP_Traumaticos
	 * @param aP_Traumaticos_escribir
	 * @param aP_UsuariosRx
	 * @param aP_UsuariosRx_escribir
	 * @param otrosOculares
	 * @param otrosOcularesEscribir
	 * @param _fk_IDT_DocumentoID
	 * @param aG_Dias
	 * @param aG_FObstetrica_A
	 * @param aG_FObstetrica_C
	 * @param aG_FObstetrica_E
	 * @param aG_FObstetrica_G
	 * @param aG_FObstetrica_P
	 * @param aG_FObstetrica_V
	 * @param aG_Menarquia
	 * @param aG_FUP
	 * @param aG_FUR
	 * @param aG_UltimaCitologia_Fecha
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Antecedentes(String aF_Patologia_Alergias, String aF_Patologia_Alergias_Parentesco,
			String aF_Patologia_Artitis, String aF_Patologia_Artitis_Parentesco, String aF_Patologia_Asma,
			String aF_Patologia_Asma_Parentesco, String aF_Patologia_Cancer, String aF_Patologia_Cancer_Parentesco,
			String aF_Patologia_cardiaco, String aF_Patologia_Diabetes, String aF_Patologia_Diabetes_Parentesco,
			String aF_Patologia_Dislipidemia, String aF_Patologia_Dislipidemia_Parentesco, String aF_Patologia_EAP,
			String aF_Patologia_EAP_Parentesco, String aF_Patologia_ECV, String aF_Patologia_ECV_Parentesco,
			String aF_Patologia_EnfermedadColagenosis, String aF_Patologia_EnfermedadColagenosis_Parentesco,
			String aF_Patologia_EnfermedadCoronaria, String aF_Patologia_EnfermedadCoronaria_Parentesco,
			String aF_Patologia_EnfermedadRenal, String aF_Patologia_EnfermedadRenal_Parentesco,
			String aF_Patologia_EnfermedadTiroidea, String aF_Patologia_EnfermedadTiroidea_Parentesco,
			String aF_Patologia_hipertension, String aF_Patologia_HTA, String aF_Patologia_HTA_Parentesco,
			String aF_Patologia_Otra, String aF_Patologia_Otra_Cual, String aF_Patologia_TBC,
			String aF_Patologia_TBC_Parentesco, String aF_Patologia_Varices, String aF_Patologia_Varices_Parentesco,
			String aG_Ciclos, String aG_MetodoPlanificacion, String aG_UltimaCitologia_Resultado,
			String aI_CarnetVacunacion, String aI_FiebreAmarilla, String aI_Hepatitis_A, String aI_Hepatitis_B,
			String aI_Influenza, String aI_Otros, String aI_Tetano, String aI_TripleViral, String aI_Varicela,
			String aO_FOtologicos, String aO_OActual, String aO_OActual_T, String aO_OAnterior, String aO_OAnterior_T,
			String aO_OJornadaLaboral, String aO_OLabores, String aO_OLabores_Horario, String aO_OProteccion,
			String aO_OProteccion_Tipo, String aO_OProteccion_Tipo_Tiempo, String aO_OTiempoExposicionRuido,
			String aO_PExtraLaboral_Audifonos, String aO_PExtraLaboral_Cuales, String aO_PExtraLaboral_Moto,
			String aO_PExtraLaboral_MusicaAlta, String aO_PExtraLaboral_Otros, String aO_PExtraLaboral_ServicioMilitar,
			String aO_PExtraLaboral_Tejo, String aO_POtologicos_Cual, String aO_POtologicos_Otalgia,
			String aO_POtologicos_Otitis, String aO_POtologicos_Otorrea, String aO_POtologicos_Otros,
			String aO_POtologicos_Prurito, String aO_POtologicos_Sensacion, String aO_POtologicos_Tinitus,
			String aO_POtologicos_Vertigo, String aO_PPatologicos_Cuales, String aO_PPatologicos_Diabetes,
			String aO_PPatologicos_Hipertension, String aO_PPatologicos_Otros, String aO_PPatologicos_Parotiditis,
			String aO_PPatologicos_Rinitis_Sinusitis, String aO_PPatologicos_Rubeola, String aO_PPatologicos_Sarampion,
			String aO_PQuirurgicos_Cirugia_Oido, String aO_PQuirurgicos_Cuales, String aO_PQuirurgicos_Otros,
			String aO_PQuirurgicos_Timpanoplastia, String aO_PToxicos_Farmacos, String aO_PToxicos_Industriales,
			String aO_PTraumaticos_Acustico, String aO_PTraumaticos_Craneo, String aO_PTraumaticos_Cuales,
			String aO_PTraumaticos_Otros, String aP_Catarata, String aP_Catarata_escribir, String aP_Esquirlas,
			String aP_Esquirlas_escribir, String aP_Farmacologicos_Alergicos,
			String aP_Farmacologicos_Alergicos_escribir, String aP_Galucoma, String aP_Galucoma_escribir,
			String aP_Otros, String aP_Otros_escribir, String aP_Patologicos, String aP_Patologicos_escribir,
			String aP_Quimicos, String aP_Quimicos_escribir, String aP_Quirurgicos, String aP_Quirurgicos_escribir,
			String aP_RehabilitacionVisual, String aP_RehabilitacionVisual_escribir, String aP_Transfusionales,
			String aP_Transfusionales_escribir, String aP_Traumaticos, String aP_Traumaticos_escribir,
			String aP_UsuariosRx, String aP_UsuariosRx_escribir, String otrosOculares, String otrosOcularesEscribir,
			int _fk_IDT_DocumentoID, int aG_Dias, int aG_FObstetrica_A, int aG_FObstetrica_C, int aG_FObstetrica_E,
			int aG_FObstetrica_G, int aG_FObstetrica_P, int aG_FObstetrica_V, int aG_Menarquia, Date aG_FUP,
			Date aG_FUR, Date aG_UltimaCitologia_Fecha, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		AF_Patologia_Alergias = aF_Patologia_Alergias;
		AF_Patologia_Alergias_Parentesco = aF_Patologia_Alergias_Parentesco;
		AF_Patologia_Artitis = aF_Patologia_Artitis;
		AF_Patologia_Artitis_Parentesco = aF_Patologia_Artitis_Parentesco;
		AF_Patologia_Asma = aF_Patologia_Asma;
		AF_Patologia_Asma_Parentesco = aF_Patologia_Asma_Parentesco;
		AF_Patologia_Cancer = aF_Patologia_Cancer;
		AF_Patologia_Cancer_Parentesco = aF_Patologia_Cancer_Parentesco;
		AF_Patologia_cardiaco = aF_Patologia_cardiaco;
		AF_Patologia_Diabetes = aF_Patologia_Diabetes;
		AF_Patologia_Diabetes_Parentesco = aF_Patologia_Diabetes_Parentesco;
		AF_Patologia_Dislipidemia = aF_Patologia_Dislipidemia;
		AF_Patologia_Dislipidemia_Parentesco = aF_Patologia_Dislipidemia_Parentesco;
		AF_Patologia_EAP = aF_Patologia_EAP;
		AF_Patologia_EAP_Parentesco = aF_Patologia_EAP_Parentesco;
		AF_Patologia_ECV = aF_Patologia_ECV;
		AF_Patologia_ECV_Parentesco = aF_Patologia_ECV_Parentesco;
		AF_Patologia_EnfermedadColagenosis = aF_Patologia_EnfermedadColagenosis;
		AF_Patologia_EnfermedadColagenosis_Parentesco = aF_Patologia_EnfermedadColagenosis_Parentesco;
		AF_Patologia_EnfermedadCoronaria = aF_Patologia_EnfermedadCoronaria;
		AF_Patologia_EnfermedadCoronaria_Parentesco = aF_Patologia_EnfermedadCoronaria_Parentesco;
		AF_Patologia_EnfermedadRenal = aF_Patologia_EnfermedadRenal;
		AF_Patologia_EnfermedadRenal_Parentesco = aF_Patologia_EnfermedadRenal_Parentesco;
		AF_Patologia_EnfermedadTiroidea = aF_Patologia_EnfermedadTiroidea;
		AF_Patologia_EnfermedadTiroidea_Parentesco = aF_Patologia_EnfermedadTiroidea_Parentesco;
		AF_Patologia_hipertension = aF_Patologia_hipertension;
		AF_Patologia_HTA = aF_Patologia_HTA;
		AF_Patologia_HTA_Parentesco = aF_Patologia_HTA_Parentesco;
		AF_Patologia_Otra = aF_Patologia_Otra;
		AF_Patologia_Otra_Cual = aF_Patologia_Otra_Cual;
		AF_Patologia_TBC = aF_Patologia_TBC;
		AF_Patologia_TBC_Parentesco = aF_Patologia_TBC_Parentesco;
		AF_Patologia_Varices = aF_Patologia_Varices;
		AF_Patologia_Varices_Parentesco = aF_Patologia_Varices_Parentesco;
		AG_Ciclos = aG_Ciclos;
		AG_MetodoPlanificacion = aG_MetodoPlanificacion;
		AG_UltimaCitologia_Resultado = aG_UltimaCitologia_Resultado;
		AI_CarnetVacunacion = aI_CarnetVacunacion;
		AI_FiebreAmarilla = aI_FiebreAmarilla;
		AI_Hepatitis_A = aI_Hepatitis_A;
		AI_Hepatitis_B = aI_Hepatitis_B;
		AI_Influenza = aI_Influenza;
		AI_Otros = aI_Otros;
		AI_Tetano = aI_Tetano;
		AI_TripleViral = aI_TripleViral;
		AI_Varicela = aI_Varicela;
		AO_FOtologicos = aO_FOtologicos;
		AO_OActual = aO_OActual;
		AO_OActual_T = aO_OActual_T;
		AO_OAnterior = aO_OAnterior;
		AO_OAnterior_T = aO_OAnterior_T;
		AO_OJornadaLaboral = aO_OJornadaLaboral;
		AO_OLabores = aO_OLabores;
		AO_OLabores_Horario = aO_OLabores_Horario;
		AO_OProteccion = aO_OProteccion;
		AO_OProteccion_Tipo = aO_OProteccion_Tipo;
		AO_OProteccion_Tipo_Tiempo = aO_OProteccion_Tipo_Tiempo;
		AO_OTiempoExposicionRuido = aO_OTiempoExposicionRuido;
		AO_PExtraLaboral_Audifonos = aO_PExtraLaboral_Audifonos;
		AO_PExtraLaboral_Cuales = aO_PExtraLaboral_Cuales;
		AO_PExtraLaboral_Moto = aO_PExtraLaboral_Moto;
		AO_PExtraLaboral_MusicaAlta = aO_PExtraLaboral_MusicaAlta;
		AO_PExtraLaboral_Otros = aO_PExtraLaboral_Otros;
		AO_PExtraLaboral_ServicioMilitar = aO_PExtraLaboral_ServicioMilitar;
		AO_PExtraLaboral_Tejo = aO_PExtraLaboral_Tejo;
		AO_POtologicos_Cual = aO_POtologicos_Cual;
		AO_POtologicos_Otalgia = aO_POtologicos_Otalgia;
		AO_POtologicos_Otitis = aO_POtologicos_Otitis;
		AO_POtologicos_Otorrea = aO_POtologicos_Otorrea;
		AO_POtologicos_Otros = aO_POtologicos_Otros;
		AO_POtologicos_Prurito = aO_POtologicos_Prurito;
		AO_POtologicos_Sensacion = aO_POtologicos_Sensacion;
		AO_POtologicos_Tinitus = aO_POtologicos_Tinitus;
		AO_POtologicos_Vertigo = aO_POtologicos_Vertigo;
		AO_PPatologicos_Cuales = aO_PPatologicos_Cuales;
		AO_PPatologicos_Diabetes = aO_PPatologicos_Diabetes;
		AO_PPatologicos_Hipertension = aO_PPatologicos_Hipertension;
		AO_PPatologicos_Otros = aO_PPatologicos_Otros;
		AO_PPatologicos_Parotiditis = aO_PPatologicos_Parotiditis;
		AO_PPatologicos_Rinitis_Sinusitis = aO_PPatologicos_Rinitis_Sinusitis;
		AO_PPatologicos_Rubeola = aO_PPatologicos_Rubeola;
		AO_PPatologicos_Sarampion = aO_PPatologicos_Sarampion;
		AO_PQuirurgicos_Cirugia_Oido = aO_PQuirurgicos_Cirugia_Oido;
		AO_PQuirurgicos_Cuales = aO_PQuirurgicos_Cuales;
		AO_PQuirurgicos_Otros = aO_PQuirurgicos_Otros;
		AO_PQuirurgicos_Timpanoplastia = aO_PQuirurgicos_Timpanoplastia;
		AO_PToxicos_Farmacos = aO_PToxicos_Farmacos;
		AO_PToxicos_Industriales = aO_PToxicos_Industriales;
		AO_PTraumaticos_Acustico = aO_PTraumaticos_Acustico;
		AO_PTraumaticos_Craneo = aO_PTraumaticos_Craneo;
		AO_PTraumaticos_Cuales = aO_PTraumaticos_Cuales;
		AO_PTraumaticos_Otros = aO_PTraumaticos_Otros;
		AP_Catarata = aP_Catarata;
		AP_Catarata_escribir = aP_Catarata_escribir;
		AP_Esquirlas = aP_Esquirlas;
		AP_Esquirlas_escribir = aP_Esquirlas_escribir;
		AP_Farmacologicos_Alergicos = aP_Farmacologicos_Alergicos;
		AP_Farmacologicos_Alergicos_escribir = aP_Farmacologicos_Alergicos_escribir;
		AP_Galucoma = aP_Galucoma;
		AP_Galucoma_escribir = aP_Galucoma_escribir;
		AP_Otros = aP_Otros;
		AP_Otros_escribir = aP_Otros_escribir;
		AP_Patologicos = aP_Patologicos;
		AP_Patologicos_escribir = aP_Patologicos_escribir;
		AP_Quimicos = aP_Quimicos;
		AP_Quimicos_escribir = aP_Quimicos_escribir;
		AP_Quirurgicos = aP_Quirurgicos;
		AP_Quirurgicos_escribir = aP_Quirurgicos_escribir;
		AP_RehabilitacionVisual = aP_RehabilitacionVisual;
		AP_RehabilitacionVisual_escribir = aP_RehabilitacionVisual_escribir;
		AP_Transfusionales = aP_Transfusionales;
		AP_Transfusionales_escribir = aP_Transfusionales_escribir;
		AP_Traumaticos = aP_Traumaticos;
		AP_Traumaticos_escribir = aP_Traumaticos_escribir;
		AP_UsuariosRx = aP_UsuariosRx;
		AP_UsuariosRx_escribir = aP_UsuariosRx_escribir;
		OtrosOculares = otrosOculares;
		OtrosOcularesEscribir = otrosOcularesEscribir;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		AG_Dias = aG_Dias;
		AG_FObstetrica_A = aG_FObstetrica_A;
		AG_FObstetrica_C = aG_FObstetrica_C;
		AG_FObstetrica_E = aG_FObstetrica_E;
		AG_FObstetrica_G = aG_FObstetrica_G;
		AG_FObstetrica_P = aG_FObstetrica_P;
		AG_FObstetrica_V = aG_FObstetrica_V;
		AG_Menarquia = aG_Menarquia;
		AG_FUP = aG_FUP;
		AG_FUR = aG_FUR;
		AG_UltimaCitologia_Fecha = aG_UltimaCitologia_Fecha;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}
	
	/**
	 * @return the aF_Patologia_Alergias
	 */
	public String getAF_Patologia_Alergias() {
		return AF_Patologia_Alergias;
	}
	/**
	 * @param aF_Patologia_Alergias the aF_Patologia_Alergias to set
	 */
	public void setAF_Patologia_Alergias(String aF_Patologia_Alergias) {
		AF_Patologia_Alergias = aF_Patologia_Alergias;
	}
	/**
	 * @return the aF_Patologia_Alergias_Parentesco
	 */
	public String getAF_Patologia_Alergias_Parentesco() {
		return AF_Patologia_Alergias_Parentesco;
	}
	/**
	 * @param aF_Patologia_Alergias_Parentesco the aF_Patologia_Alergias_Parentesco to set
	 */
	public void setAF_Patologia_Alergias_Parentesco(String aF_Patologia_Alergias_Parentesco) {
		AF_Patologia_Alergias_Parentesco = aF_Patologia_Alergias_Parentesco;
	}
	/**
	 * @return the aF_Patologia_Artitis
	 */
	public String getAF_Patologia_Artitis() {
		return AF_Patologia_Artitis;
	}
	/**
	 * @param aF_Patologia_Artitis the aF_Patologia_Artitis to set
	 */
	public void setAF_Patologia_Artitis(String aF_Patologia_Artitis) {
		AF_Patologia_Artitis = aF_Patologia_Artitis;
	}
	/**
	 * @return the aF_Patologia_Artitis_Parentesco
	 */
	public String getAF_Patologia_Artitis_Parentesco() {
		return AF_Patologia_Artitis_Parentesco;
	}
	/**
	 * @param aF_Patologia_Artitis_Parentesco the aF_Patologia_Artitis_Parentesco to set
	 */
	public void setAF_Patologia_Artitis_Parentesco(String aF_Patologia_Artitis_Parentesco) {
		AF_Patologia_Artitis_Parentesco = aF_Patologia_Artitis_Parentesco;
	}
	/**
	 * @return the aF_Patologia_Asma
	 */
	public String getAF_Patologia_Asma() {
		return AF_Patologia_Asma;
	}
	/**
	 * @param aF_Patologia_Asma the aF_Patologia_Asma to set
	 */
	public void setAF_Patologia_Asma(String aF_Patologia_Asma) {
		AF_Patologia_Asma = aF_Patologia_Asma;
	}
	/**
	 * @return the aF_Patologia_Asma_Parentesco
	 */
	public String getAF_Patologia_Asma_Parentesco() {
		return AF_Patologia_Asma_Parentesco;
	}
	/**
	 * @param aF_Patologia_Asma_Parentesco the aF_Patologia_Asma_Parentesco to set
	 */
	public void setAF_Patologia_Asma_Parentesco(String aF_Patologia_Asma_Parentesco) {
		AF_Patologia_Asma_Parentesco = aF_Patologia_Asma_Parentesco;
	}
	/**
	 * @return the aF_Patologia_Cancer
	 */
	public String getAF_Patologia_Cancer() {
		return AF_Patologia_Cancer;
	}
	/**
	 * @param aF_Patologia_Cancer the aF_Patologia_Cancer to set
	 */
	public void setAF_Patologia_Cancer(String aF_Patologia_Cancer) {
		AF_Patologia_Cancer = aF_Patologia_Cancer;
	}
	/**
	 * @return the aF_Patologia_Cancer_Parentesco
	 */
	public String getAF_Patologia_Cancer_Parentesco() {
		return AF_Patologia_Cancer_Parentesco;
	}
	/**
	 * @param aF_Patologia_Cancer_Parentesco the aF_Patologia_Cancer_Parentesco to set
	 */
	public void setAF_Patologia_Cancer_Parentesco(String aF_Patologia_Cancer_Parentesco) {
		AF_Patologia_Cancer_Parentesco = aF_Patologia_Cancer_Parentesco;
	}
	/**
	 * @return the aF_Patologia_cardiaco
	 */
	public String getAF_Patologia_cardiaco() {
		return AF_Patologia_cardiaco;
	}
	/**
	 * @param aF_Patologia_cardiaco the aF_Patologia_cardiaco to set
	 */
	public void setAF_Patologia_cardiaco(String aF_Patologia_cardiaco) {
		AF_Patologia_cardiaco = aF_Patologia_cardiaco;
	}
	/**
	 * @return the aF_Patologia_Diabetes
	 */
	public String getAF_Patologia_Diabetes() {
		return AF_Patologia_Diabetes;
	}
	/**
	 * @param aF_Patologia_Diabetes the aF_Patologia_Diabetes to set
	 */
	public void setAF_Patologia_Diabetes(String aF_Patologia_Diabetes) {
		AF_Patologia_Diabetes = aF_Patologia_Diabetes;
	}
	/**
	 * @return the aF_Patologia_Diabetes_Parentesco
	 */
	public String getAF_Patologia_Diabetes_Parentesco() {
		return AF_Patologia_Diabetes_Parentesco;
	}
	/**
	 * @param aF_Patologia_Diabetes_Parentesco the aF_Patologia_Diabetes_Parentesco to set
	 */
	public void setAF_Patologia_Diabetes_Parentesco(String aF_Patologia_Diabetes_Parentesco) {
		AF_Patologia_Diabetes_Parentesco = aF_Patologia_Diabetes_Parentesco;
	}
	/**
	 * @return the aF_Patologia_Dislipidemia
	 */
	public String getAF_Patologia_Dislipidemia() {
		return AF_Patologia_Dislipidemia;
	}
	/**
	 * @param aF_Patologia_Dislipidemia the aF_Patologia_Dislipidemia to set
	 */
	public void setAF_Patologia_Dislipidemia(String aF_Patologia_Dislipidemia) {
		AF_Patologia_Dislipidemia = aF_Patologia_Dislipidemia;
	}
	/**
	 * @return the aF_Patologia_Dislipidemia_Parentesco
	 */
	public String getAF_Patologia_Dislipidemia_Parentesco() {
		return AF_Patologia_Dislipidemia_Parentesco;
	}
	/**
	 * @param aF_Patologia_Dislipidemia_Parentesco the aF_Patologia_Dislipidemia_Parentesco to set
	 */
	public void setAF_Patologia_Dislipidemia_Parentesco(String aF_Patologia_Dislipidemia_Parentesco) {
		AF_Patologia_Dislipidemia_Parentesco = aF_Patologia_Dislipidemia_Parentesco;
	}
	/**
	 * @return the aF_Patologia_EAP
	 */
	public String getAF_Patologia_EAP() {
		return AF_Patologia_EAP;
	}
	/**
	 * @param aF_Patologia_EAP the aF_Patologia_EAP to set
	 */
	public void setAF_Patologia_EAP(String aF_Patologia_EAP) {
		AF_Patologia_EAP = aF_Patologia_EAP;
	}
	/**
	 * @return the aF_Patologia_EAP_Parentesco
	 */
	public String getAF_Patologia_EAP_Parentesco() {
		return AF_Patologia_EAP_Parentesco;
	}
	/**
	 * @param aF_Patologia_EAP_Parentesco the aF_Patologia_EAP_Parentesco to set
	 */
	public void setAF_Patologia_EAP_Parentesco(String aF_Patologia_EAP_Parentesco) {
		AF_Patologia_EAP_Parentesco = aF_Patologia_EAP_Parentesco;
	}
	/**
	 * @return the aF_Patologia_ECV
	 */
	public String getAF_Patologia_ECV() {
		return AF_Patologia_ECV;
	}
	/**
	 * @param aF_Patologia_ECV the aF_Patologia_ECV to set
	 */
	public void setAF_Patologia_ECV(String aF_Patologia_ECV) {
		AF_Patologia_ECV = aF_Patologia_ECV;
	}
	/**
	 * @return the aF_Patologia_ECV_Parentesco
	 */
	public String getAF_Patologia_ECV_Parentesco() {
		return AF_Patologia_ECV_Parentesco;
	}
	/**
	 * @param aF_Patologia_ECV_Parentesco the aF_Patologia_ECV_Parentesco to set
	 */
	public void setAF_Patologia_ECV_Parentesco(String aF_Patologia_ECV_Parentesco) {
		AF_Patologia_ECV_Parentesco = aF_Patologia_ECV_Parentesco;
	}
	/**
	 * @return the aF_Patologia_EnfermedadColagenosis
	 */
	public String getAF_Patologia_EnfermedadColagenosis() {
		return AF_Patologia_EnfermedadColagenosis;
	}
	/**
	 * @param aF_Patologia_EnfermedadColagenosis the aF_Patologia_EnfermedadColagenosis to set
	 */
	public void setAF_Patologia_EnfermedadColagenosis(String aF_Patologia_EnfermedadColagenosis) {
		AF_Patologia_EnfermedadColagenosis = aF_Patologia_EnfermedadColagenosis;
	}
	/**
	 * @return the aF_Patologia_EnfermedadColagenosis_Parentesco
	 */
	public String getAF_Patologia_EnfermedadColagenosis_Parentesco() {
		return AF_Patologia_EnfermedadColagenosis_Parentesco;
	}
	/**
	 * @param aF_Patologia_EnfermedadColagenosis_Parentesco the aF_Patologia_EnfermedadColagenosis_Parentesco to set
	 */
	public void setAF_Patologia_EnfermedadColagenosis_Parentesco(String aF_Patologia_EnfermedadColagenosis_Parentesco) {
		AF_Patologia_EnfermedadColagenosis_Parentesco = aF_Patologia_EnfermedadColagenosis_Parentesco;
	}
	/**
	 * @return the aF_Patologia_EnfermedadCoronaria
	 */
	public String getAF_Patologia_EnfermedadCoronaria() {
		return AF_Patologia_EnfermedadCoronaria;
	}
	/**
	 * @param aF_Patologia_EnfermedadCoronaria the aF_Patologia_EnfermedadCoronaria to set
	 */
	public void setAF_Patologia_EnfermedadCoronaria(String aF_Patologia_EnfermedadCoronaria) {
		AF_Patologia_EnfermedadCoronaria = aF_Patologia_EnfermedadCoronaria;
	}
	/**
	 * @return the aF_Patologia_EnfermedadCoronaria_Parentesco
	 */
	public String getAF_Patologia_EnfermedadCoronaria_Parentesco() {
		return AF_Patologia_EnfermedadCoronaria_Parentesco;
	}
	/**
	 * @param aF_Patologia_EnfermedadCoronaria_Parentesco the aF_Patologia_EnfermedadCoronaria_Parentesco to set
	 */
	public void setAF_Patologia_EnfermedadCoronaria_Parentesco(String aF_Patologia_EnfermedadCoronaria_Parentesco) {
		AF_Patologia_EnfermedadCoronaria_Parentesco = aF_Patologia_EnfermedadCoronaria_Parentesco;
	}
	/**
	 * @return the aF_Patologia_EnfermedadRenal
	 */
	public String getAF_Patologia_EnfermedadRenal() {
		return AF_Patologia_EnfermedadRenal;
	}
	/**
	 * @param aF_Patologia_EnfermedadRenal the aF_Patologia_EnfermedadRenal to set
	 */
	public void setAF_Patologia_EnfermedadRenal(String aF_Patologia_EnfermedadRenal) {
		AF_Patologia_EnfermedadRenal = aF_Patologia_EnfermedadRenal;
	}
	/**
	 * @return the aF_Patologia_EnfermedadRenal_Parentesco
	 */
	public String getAF_Patologia_EnfermedadRenal_Parentesco() {
		return AF_Patologia_EnfermedadRenal_Parentesco;
	}
	/**
	 * @param aF_Patologia_EnfermedadRenal_Parentesco the aF_Patologia_EnfermedadRenal_Parentesco to set
	 */
	public void setAF_Patologia_EnfermedadRenal_Parentesco(String aF_Patologia_EnfermedadRenal_Parentesco) {
		AF_Patologia_EnfermedadRenal_Parentesco = aF_Patologia_EnfermedadRenal_Parentesco;
	}
	/**
	 * @return the aF_Patologia_EnfermedadTiroidea
	 */
	public String getAF_Patologia_EnfermedadTiroidea() {
		return AF_Patologia_EnfermedadTiroidea;
	}
	/**
	 * @param aF_Patologia_EnfermedadTiroidea the aF_Patologia_EnfermedadTiroidea to set
	 */
	public void setAF_Patologia_EnfermedadTiroidea(String aF_Patologia_EnfermedadTiroidea) {
		AF_Patologia_EnfermedadTiroidea = aF_Patologia_EnfermedadTiroidea;
	}
	/**
	 * @return the aF_Patologia_EnfermedadTiroidea_Parentesco
	 */
	public String getAF_Patologia_EnfermedadTiroidea_Parentesco() {
		return AF_Patologia_EnfermedadTiroidea_Parentesco;
	}
	/**
	 * @param aF_Patologia_EnfermedadTiroidea_Parentesco the aF_Patologia_EnfermedadTiroidea_Parentesco to set
	 */
	public void setAF_Patologia_EnfermedadTiroidea_Parentesco(String aF_Patologia_EnfermedadTiroidea_Parentesco) {
		AF_Patologia_EnfermedadTiroidea_Parentesco = aF_Patologia_EnfermedadTiroidea_Parentesco;
	}
	/**
	 * @return the aF_Patologia_hipertension
	 */
	public String getAF_Patologia_hipertension() {
		return AF_Patologia_hipertension;
	}
	/**
	 * @param aF_Patologia_hipertension the aF_Patologia_hipertension to set
	 */
	public void setAF_Patologia_hipertension(String aF_Patologia_hipertension) {
		AF_Patologia_hipertension = aF_Patologia_hipertension;
	}
	/**
	 * @return the aF_Patologia_HTA
	 */
	public String getAF_Patologia_HTA() {
		return AF_Patologia_HTA;
	}
	/**
	 * @param aF_Patologia_HTA the aF_Patologia_HTA to set
	 */
	public void setAF_Patologia_HTA(String aF_Patologia_HTA) {
		AF_Patologia_HTA = aF_Patologia_HTA;
	}
	/**
	 * @return the aF_Patologia_HTA_Parentesco
	 */
	public String getAF_Patologia_HTA_Parentesco() {
		return AF_Patologia_HTA_Parentesco;
	}
	/**
	 * @param aF_Patologia_HTA_Parentesco the aF_Patologia_HTA_Parentesco to set
	 */
	public void setAF_Patologia_HTA_Parentesco(String aF_Patologia_HTA_Parentesco) {
		AF_Patologia_HTA_Parentesco = aF_Patologia_HTA_Parentesco;
	}
	/**
	 * @return the aF_Patologia_Otra
	 */
	public String getAF_Patologia_Otra() {
		return AF_Patologia_Otra;
	}
	/**
	 * @param aF_Patologia_Otra the aF_Patologia_Otra to set
	 */
	public void setAF_Patologia_Otra(String aF_Patologia_Otra) {
		AF_Patologia_Otra = aF_Patologia_Otra;
	}
	/**
	 * @return the aF_Patologia_Otra_Cual
	 */
	public String getAF_Patologia_Otra_Cual() {
		return AF_Patologia_Otra_Cual;
	}
	/**
	 * @param aF_Patologia_Otra_Cual the aF_Patologia_Otra_Cual to set
	 */
	public void setAF_Patologia_Otra_Cual(String aF_Patologia_Otra_Cual) {
		AF_Patologia_Otra_Cual = aF_Patologia_Otra_Cual;
	}
	/**
	 * @return the aF_Patologia_TBC
	 */
	public String getAF_Patologia_TBC() {
		return AF_Patologia_TBC;
	}
	/**
	 * @param aF_Patologia_TBC the aF_Patologia_TBC to set
	 */
	public void setAF_Patologia_TBC(String aF_Patologia_TBC) {
		AF_Patologia_TBC = aF_Patologia_TBC;
	}
	/**
	 * @return the aF_Patologia_TBC_Parentesco
	 */
	public String getAF_Patologia_TBC_Parentesco() {
		return AF_Patologia_TBC_Parentesco;
	}
	/**
	 * @param aF_Patologia_TBC_Parentesco the aF_Patologia_TBC_Parentesco to set
	 */
	public void setAF_Patologia_TBC_Parentesco(String aF_Patologia_TBC_Parentesco) {
		AF_Patologia_TBC_Parentesco = aF_Patologia_TBC_Parentesco;
	}
	/**
	 * @return the aF_Patologia_Varices
	 */
	public String getAF_Patologia_Varices() {
		return AF_Patologia_Varices;
	}
	/**
	 * @param aF_Patologia_Varices the aF_Patologia_Varices to set
	 */
	public void setAF_Patologia_Varices(String aF_Patologia_Varices) {
		AF_Patologia_Varices = aF_Patologia_Varices;
	}
	/**
	 * @return the aF_Patologia_Varices_Parentesco
	 */
	public String getAF_Patologia_Varices_Parentesco() {
		return AF_Patologia_Varices_Parentesco;
	}
	/**
	 * @param aF_Patologia_Varices_Parentesco the aF_Patologia_Varices_Parentesco to set
	 */
	public void setAF_Patologia_Varices_Parentesco(String aF_Patologia_Varices_Parentesco) {
		AF_Patologia_Varices_Parentesco = aF_Patologia_Varices_Parentesco;
	}
	/**
	 * @return the aG_Ciclos
	 */
	public String getAG_Ciclos() {
		return AG_Ciclos;
	}
	/**
	 * @param aG_Ciclos the aG_Ciclos to set
	 */
	public void setAG_Ciclos(String aG_Ciclos) {
		AG_Ciclos = aG_Ciclos;
	}
	/**
	 * @return the aG_MetodoPlanificacion
	 */
	public String getAG_MetodoPlanificacion() {
		return AG_MetodoPlanificacion;
	}
	/**
	 * @param aG_MetodoPlanificacion the aG_MetodoPlanificacion to set
	 */
	public void setAG_MetodoPlanificacion(String aG_MetodoPlanificacion) {
		AG_MetodoPlanificacion = aG_MetodoPlanificacion;
	}
	/**
	 * @return the aG_UltimaCitologia_Resultado
	 */
	public String getAG_UltimaCitologia_Resultado() {
		return AG_UltimaCitologia_Resultado;
	}
	/**
	 * @param aG_UltimaCitologia_Resultado the aG_UltimaCitologia_Resultado to set
	 */
	public void setAG_UltimaCitologia_Resultado(String aG_UltimaCitologia_Resultado) {
		AG_UltimaCitologia_Resultado = aG_UltimaCitologia_Resultado;
	}
	/**
	 * @return the aI_CarnetVacunacion
	 */
	public String getAI_CarnetVacunacion() {
		return AI_CarnetVacunacion;
	}
	/**
	 * @param aI_CarnetVacunacion the aI_CarnetVacunacion to set
	 */
	public void setAI_CarnetVacunacion(String aI_CarnetVacunacion) {
		AI_CarnetVacunacion = aI_CarnetVacunacion;
	}
	/**
	 * @return the aI_FiebreAmarilla
	 */
	public String getAI_FiebreAmarilla() {
		return AI_FiebreAmarilla;
	}
	/**
	 * @param aI_FiebreAmarilla the aI_FiebreAmarilla to set
	 */
	public void setAI_FiebreAmarilla(String aI_FiebreAmarilla) {
		AI_FiebreAmarilla = aI_FiebreAmarilla;
	}
	/**
	 * @return the aI_Hepatitis_A
	 */
	public String getAI_Hepatitis_A() {
		return AI_Hepatitis_A;
	}
	/**
	 * @param aI_Hepatitis_A the aI_Hepatitis_A to set
	 */
	public void setAI_Hepatitis_A(String aI_Hepatitis_A) {
		AI_Hepatitis_A = aI_Hepatitis_A;
	}
	/**
	 * @return the aI_Hepatitis_B
	 */
	public String getAI_Hepatitis_B() {
		return AI_Hepatitis_B;
	}
	/**
	 * @param aI_Hepatitis_B the aI_Hepatitis_B to set
	 */
	public void setAI_Hepatitis_B(String aI_Hepatitis_B) {
		AI_Hepatitis_B = aI_Hepatitis_B;
	}
	/**
	 * @return the aI_Influenza
	 */
	public String getAI_Influenza() {
		return AI_Influenza;
	}
	/**
	 * @param aI_Influenza the aI_Influenza to set
	 */
	public void setAI_Influenza(String aI_Influenza) {
		AI_Influenza = aI_Influenza;
	}
	/**
	 * @return the aI_Otros
	 */
	public String getAI_Otros() {
		return AI_Otros;
	}
	/**
	 * @param aI_Otros the aI_Otros to set
	 */
	public void setAI_Otros(String aI_Otros) {
		AI_Otros = aI_Otros;
	}
	/**
	 * @return the aI_Tetano
	 */
	public String getAI_Tetano() {
		return AI_Tetano;
	}
	/**
	 * @param aI_Tetano the aI_Tetano to set
	 */
	public void setAI_Tetano(String aI_Tetano) {
		AI_Tetano = aI_Tetano;
	}
	/**
	 * @return the aI_TripleViral
	 */
	public String getAI_TripleViral() {
		return AI_TripleViral;
	}
	/**
	 * @param aI_TripleViral the aI_TripleViral to set
	 */
	public void setAI_TripleViral(String aI_TripleViral) {
		AI_TripleViral = aI_TripleViral;
	}
	/**
	 * @return the aI_Varicela
	 */
	public String getAI_Varicela() {
		return AI_Varicela;
	}
	/**
	 * @param aI_Varicela the aI_Varicela to set
	 */
	public void setAI_Varicela(String aI_Varicela) {
		AI_Varicela = aI_Varicela;
	}
	/**
	 * @return the aO_FOtologicos
	 */
	public String getAO_FOtologicos() {
		return AO_FOtologicos;
	}
	/**
	 * @param aO_FOtologicos the aO_FOtologicos to set
	 */
	public void setAO_FOtologicos(String aO_FOtologicos) {
		AO_FOtologicos = aO_FOtologicos;
	}
	/**
	 * @return the aO_OActual
	 */
	public String getAO_OActual() {
		return AO_OActual;
	}
	/**
	 * @param aO_OActual the aO_OActual to set
	 */
	public void setAO_OActual(String aO_OActual) {
		AO_OActual = aO_OActual;
	}
	/**
	 * @return the aO_OActual_T
	 */
	public String getAO_OActual_T() {
		return AO_OActual_T;
	}
	/**
	 * @param aO_OActual_T the aO_OActual_T to set
	 */
	public void setAO_OActual_T(String aO_OActual_T) {
		AO_OActual_T = aO_OActual_T;
	}
	/**
	 * @return the aO_OAnterior
	 */
	public String getAO_OAnterior() {
		return AO_OAnterior;
	}
	/**
	 * @param aO_OAnterior the aO_OAnterior to set
	 */
	public void setAO_OAnterior(String aO_OAnterior) {
		AO_OAnterior = aO_OAnterior;
	}
	/**
	 * @return the aO_OAnterior_T
	 */
	public String getAO_OAnterior_T() {
		return AO_OAnterior_T;
	}
	/**
	 * @param aO_OAnterior_T the aO_OAnterior_T to set
	 */
	public void setAO_OAnterior_T(String aO_OAnterior_T) {
		AO_OAnterior_T = aO_OAnterior_T;
	}
	/**
	 * @return the aO_OJornadaLaboral
	 */
	public String getAO_OJornadaLaboral() {
		return AO_OJornadaLaboral;
	}
	/**
	 * @param aO_OJornadaLaboral the aO_OJornadaLaboral to set
	 */
	public void setAO_OJornadaLaboral(String aO_OJornadaLaboral) {
		AO_OJornadaLaboral = aO_OJornadaLaboral;
	}
	/**
	 * @return the aO_OLabores
	 */
	public String getAO_OLabores() {
		return AO_OLabores;
	}
	/**
	 * @param aO_OLabores the aO_OLabores to set
	 */
	public void setAO_OLabores(String aO_OLabores) {
		AO_OLabores = aO_OLabores;
	}
	/**
	 * @return the aO_OLabores_Horario
	 */
	public String getAO_OLabores_Horario() {
		return AO_OLabores_Horario;
	}
	/**
	 * @param aO_OLabores_Horario the aO_OLabores_Horario to set
	 */
	public void setAO_OLabores_Horario(String aO_OLabores_Horario) {
		AO_OLabores_Horario = aO_OLabores_Horario;
	}
	/**
	 * @return the aO_OProteccion
	 */
	public String getAO_OProteccion() {
		return AO_OProteccion;
	}
	/**
	 * @param aO_OProteccion the aO_OProteccion to set
	 */
	public void setAO_OProteccion(String aO_OProteccion) {
		AO_OProteccion = aO_OProteccion;
	}
	/**
	 * @return the aO_OProteccion_Tipo
	 */
	public String getAO_OProteccion_Tipo() {
		return AO_OProteccion_Tipo;
	}
	/**
	 * @param aO_OProteccion_Tipo the aO_OProteccion_Tipo to set
	 */
	public void setAO_OProteccion_Tipo(String aO_OProteccion_Tipo) {
		AO_OProteccion_Tipo = aO_OProteccion_Tipo;
	}
	/**
	 * @return the aO_OProteccion_Tipo_Tiempo
	 */
	public String getAO_OProteccion_Tipo_Tiempo() {
		return AO_OProteccion_Tipo_Tiempo;
	}
	/**
	 * @param aO_OProteccion_Tipo_Tiempo the aO_OProteccion_Tipo_Tiempo to set
	 */
	public void setAO_OProteccion_Tipo_Tiempo(String aO_OProteccion_Tipo_Tiempo) {
		AO_OProteccion_Tipo_Tiempo = aO_OProteccion_Tipo_Tiempo;
	}
	/**
	 * @return the aO_OTiempoExposicionRuido
	 */
	public String getAO_OTiempoExposicionRuido() {
		return AO_OTiempoExposicionRuido;
	}
	/**
	 * @param aO_OTiempoExposicionRuido the aO_OTiempoExposicionRuido to set
	 */
	public void setAO_OTiempoExposicionRuido(String aO_OTiempoExposicionRuido) {
		AO_OTiempoExposicionRuido = aO_OTiempoExposicionRuido;
	}
	/**
	 * @return the aO_PExtraLaboral_Audifonos
	 */
	public String getAO_PExtraLaboral_Audifonos() {
		return AO_PExtraLaboral_Audifonos;
	}
	/**
	 * @param aO_PExtraLaboral_Audifonos the aO_PExtraLaboral_Audifonos to set
	 */
	public void setAO_PExtraLaboral_Audifonos(String aO_PExtraLaboral_Audifonos) {
		AO_PExtraLaboral_Audifonos = aO_PExtraLaboral_Audifonos;
	}
	/**
	 * @return the aO_PExtraLaboral_Cuales
	 */
	public String getAO_PExtraLaboral_Cuales() {
		return AO_PExtraLaboral_Cuales;
	}
	/**
	 * @param aO_PExtraLaboral_Cuales the aO_PExtraLaboral_Cuales to set
	 */
	public void setAO_PExtraLaboral_Cuales(String aO_PExtraLaboral_Cuales) {
		AO_PExtraLaboral_Cuales = aO_PExtraLaboral_Cuales;
	}
	/**
	 * @return the aO_PExtraLaboral_Moto
	 */
	public String getAO_PExtraLaboral_Moto() {
		return AO_PExtraLaboral_Moto;
	}
	/**
	 * @param aO_PExtraLaboral_Moto the aO_PExtraLaboral_Moto to set
	 */
	public void setAO_PExtraLaboral_Moto(String aO_PExtraLaboral_Moto) {
		AO_PExtraLaboral_Moto = aO_PExtraLaboral_Moto;
	}
	/**
	 * @return the aO_PExtraLaboral_MusicaAlta
	 */
	public String getAO_PExtraLaboral_MusicaAlta() {
		return AO_PExtraLaboral_MusicaAlta;
	}
	/**
	 * @param aO_PExtraLaboral_MusicaAlta the aO_PExtraLaboral_MusicaAlta to set
	 */
	public void setAO_PExtraLaboral_MusicaAlta(String aO_PExtraLaboral_MusicaAlta) {
		AO_PExtraLaboral_MusicaAlta = aO_PExtraLaboral_MusicaAlta;
	}
	/**
	 * @return the aO_PExtraLaboral_Otros
	 */
	public String getAO_PExtraLaboral_Otros() {
		return AO_PExtraLaboral_Otros;
	}
	/**
	 * @param aO_PExtraLaboral_Otros the aO_PExtraLaboral_Otros to set
	 */
	public void setAO_PExtraLaboral_Otros(String aO_PExtraLaboral_Otros) {
		AO_PExtraLaboral_Otros = aO_PExtraLaboral_Otros;
	}
	/**
	 * @return the aO_PExtraLaboral_ServicioMilitar
	 */
	public String getAO_PExtraLaboral_ServicioMilitar() {
		return AO_PExtraLaboral_ServicioMilitar;
	}
	/**
	 * @param aO_PExtraLaboral_ServicioMilitar the aO_PExtraLaboral_ServicioMilitar to set
	 */
	public void setAO_PExtraLaboral_ServicioMilitar(String aO_PExtraLaboral_ServicioMilitar) {
		AO_PExtraLaboral_ServicioMilitar = aO_PExtraLaboral_ServicioMilitar;
	}
	/**
	 * @return the aO_PExtraLaboral_Tejo
	 */
	public String getAO_PExtraLaboral_Tejo() {
		return AO_PExtraLaboral_Tejo;
	}
	/**
	 * @param aO_PExtraLaboral_Tejo the aO_PExtraLaboral_Tejo to set
	 */
	public void setAO_PExtraLaboral_Tejo(String aO_PExtraLaboral_Tejo) {
		AO_PExtraLaboral_Tejo = aO_PExtraLaboral_Tejo;
	}
	/**
	 * @return the aO_POtologicos_Cual
	 */
	public String getAO_POtologicos_Cual() {
		return AO_POtologicos_Cual;
	}
	/**
	 * @param aO_POtologicos_Cual the aO_POtologicos_Cual to set
	 */
	public void setAO_POtologicos_Cual(String aO_POtologicos_Cual) {
		AO_POtologicos_Cual = aO_POtologicos_Cual;
	}
	/**
	 * @return the aO_POtologicos_Otalgia
	 */
	public String getAO_POtologicos_Otalgia() {
		return AO_POtologicos_Otalgia;
	}
	/**
	 * @param aO_POtologicos_Otalgia the aO_POtologicos_Otalgia to set
	 */
	public void setAO_POtologicos_Otalgia(String aO_POtologicos_Otalgia) {
		AO_POtologicos_Otalgia = aO_POtologicos_Otalgia;
	}
	/**
	 * @return the aO_POtologicos_Otitis
	 */
	public String getAO_POtologicos_Otitis() {
		return AO_POtologicos_Otitis;
	}
	/**
	 * @param aO_POtologicos_Otitis the aO_POtologicos_Otitis to set
	 */
	public void setAO_POtologicos_Otitis(String aO_POtologicos_Otitis) {
		AO_POtologicos_Otitis = aO_POtologicos_Otitis;
	}
	/**
	 * @return the aO_POtologicos_Otorrea
	 */
	public String getAO_POtologicos_Otorrea() {
		return AO_POtologicos_Otorrea;
	}
	/**
	 * @param aO_POtologicos_Otorrea the aO_POtologicos_Otorrea to set
	 */
	public void setAO_POtologicos_Otorrea(String aO_POtologicos_Otorrea) {
		AO_POtologicos_Otorrea = aO_POtologicos_Otorrea;
	}
	/**
	 * @return the aO_POtologicos_Otros
	 */
	public String getAO_POtologicos_Otros() {
		return AO_POtologicos_Otros;
	}
	/**
	 * @param aO_POtologicos_Otros the aO_POtologicos_Otros to set
	 */
	public void setAO_POtologicos_Otros(String aO_POtologicos_Otros) {
		AO_POtologicos_Otros = aO_POtologicos_Otros;
	}
	/**
	 * @return the aO_POtologicos_Prurito
	 */
	public String getAO_POtologicos_Prurito() {
		return AO_POtologicos_Prurito;
	}
	/**
	 * @param aO_POtologicos_Prurito the aO_POtologicos_Prurito to set
	 */
	public void setAO_POtologicos_Prurito(String aO_POtologicos_Prurito) {
		AO_POtologicos_Prurito = aO_POtologicos_Prurito;
	}
	/**
	 * @return the aO_POtologicos_Sensacion
	 */
	public String getAO_POtologicos_Sensacion() {
		return AO_POtologicos_Sensacion;
	}
	/**
	 * @param aO_POtologicos_Sensacion the aO_POtologicos_Sensacion to set
	 */
	public void setAO_POtologicos_Sensacion(String aO_POtologicos_Sensacion) {
		AO_POtologicos_Sensacion = aO_POtologicos_Sensacion;
	}
	/**
	 * @return the aO_POtologicos_Tinitus
	 */
	public String getAO_POtologicos_Tinitus() {
		return AO_POtologicos_Tinitus;
	}
	/**
	 * @param aO_POtologicos_Tinitus the aO_POtologicos_Tinitus to set
	 */
	public void setAO_POtologicos_Tinitus(String aO_POtologicos_Tinitus) {
		AO_POtologicos_Tinitus = aO_POtologicos_Tinitus;
	}
	/**
	 * @return the aO_POtologicos_Vertigo
	 */
	public String getAO_POtologicos_Vertigo() {
		return AO_POtologicos_Vertigo;
	}
	/**
	 * @param aO_POtologicos_Vertigo the aO_POtologicos_Vertigo to set
	 */
	public void setAO_POtologicos_Vertigo(String aO_POtologicos_Vertigo) {
		AO_POtologicos_Vertigo = aO_POtologicos_Vertigo;
	}
	/**
	 * @return the aO_PPatologicos_Cuales
	 */
	public String getAO_PPatologicos_Cuales() {
		return AO_PPatologicos_Cuales;
	}
	/**
	 * @param aO_PPatologicos_Cuales the aO_PPatologicos_Cuales to set
	 */
	public void setAO_PPatologicos_Cuales(String aO_PPatologicos_Cuales) {
		AO_PPatologicos_Cuales = aO_PPatologicos_Cuales;
	}
	/**
	 * @return the aO_PPatologicos_Diabetes
	 */
	public String getAO_PPatologicos_Diabetes() {
		return AO_PPatologicos_Diabetes;
	}
	/**
	 * @param aO_PPatologicos_Diabetes the aO_PPatologicos_Diabetes to set
	 */
	public void setAO_PPatologicos_Diabetes(String aO_PPatologicos_Diabetes) {
		AO_PPatologicos_Diabetes = aO_PPatologicos_Diabetes;
	}
	/**
	 * @return the aO_PPatologicos_Hipertension
	 */
	public String getAO_PPatologicos_Hipertension() {
		return AO_PPatologicos_Hipertension;
	}
	/**
	 * @param aO_PPatologicos_Hipertension the aO_PPatologicos_Hipertension to set
	 */
	public void setAO_PPatologicos_Hipertension(String aO_PPatologicos_Hipertension) {
		AO_PPatologicos_Hipertension = aO_PPatologicos_Hipertension;
	}
	/**
	 * @return the aO_PPatologicos_Otros
	 */
	public String getAO_PPatologicos_Otros() {
		return AO_PPatologicos_Otros;
	}
	/**
	 * @param aO_PPatologicos_Otros the aO_PPatologicos_Otros to set
	 */
	public void setAO_PPatologicos_Otros(String aO_PPatologicos_Otros) {
		AO_PPatologicos_Otros = aO_PPatologicos_Otros;
	}
	/**
	 * @return the aO_PPatologicos_Parotiditis
	 */
	public String getAO_PPatologicos_Parotiditis() {
		return AO_PPatologicos_Parotiditis;
	}
	/**
	 * @param aO_PPatologicos_Parotiditis the aO_PPatologicos_Parotiditis to set
	 */
	public void setAO_PPatologicos_Parotiditis(String aO_PPatologicos_Parotiditis) {
		AO_PPatologicos_Parotiditis = aO_PPatologicos_Parotiditis;
	}
	/**
	 * @return the aO_PPatologicos_Rinitis_Sinusitis
	 */
	public String getAO_PPatologicos_Rinitis_Sinusitis() {
		return AO_PPatologicos_Rinitis_Sinusitis;
	}
	/**
	 * @param aO_PPatologicos_Rinitis_Sinusitis the aO_PPatologicos_Rinitis_Sinusitis to set
	 */
	public void setAO_PPatologicos_Rinitis_Sinusitis(String aO_PPatologicos_Rinitis_Sinusitis) {
		AO_PPatologicos_Rinitis_Sinusitis = aO_PPatologicos_Rinitis_Sinusitis;
	}
	/**
	 * @return the aO_PPatologicos_Rubeola
	 */
	public String getAO_PPatologicos_Rubeola() {
		return AO_PPatologicos_Rubeola;
	}
	/**
	 * @param aO_PPatologicos_Rubeola the aO_PPatologicos_Rubeola to set
	 */
	public void setAO_PPatologicos_Rubeola(String aO_PPatologicos_Rubeola) {
		AO_PPatologicos_Rubeola = aO_PPatologicos_Rubeola;
	}
	/**
	 * @return the aO_PPatologicos_Sarampion
	 */
	public String getAO_PPatologicos_Sarampion() {
		return AO_PPatologicos_Sarampion;
	}
	/**
	 * @param aO_PPatologicos_Sarampion the aO_PPatologicos_Sarampion to set
	 */
	public void setAO_PPatologicos_Sarampion(String aO_PPatologicos_Sarampion) {
		AO_PPatologicos_Sarampion = aO_PPatologicos_Sarampion;
	}
	/**
	 * @return the aO_PQuirurgicos_Cirugia_Oido
	 */
	public String getAO_PQuirurgicos_Cirugia_Oido() {
		return AO_PQuirurgicos_Cirugia_Oido;
	}
	/**
	 * @param aO_PQuirurgicos_Cirugia_Oido the aO_PQuirurgicos_Cirugia_Oido to set
	 */
	public void setAO_PQuirurgicos_Cirugia_Oido(String aO_PQuirurgicos_Cirugia_Oido) {
		AO_PQuirurgicos_Cirugia_Oido = aO_PQuirurgicos_Cirugia_Oido;
	}
	/**
	 * @return the aO_PQuirurgicos_Cuales
	 */
	public String getAO_PQuirurgicos_Cuales() {
		return AO_PQuirurgicos_Cuales;
	}
	/**
	 * @param aO_PQuirurgicos_Cuales the aO_PQuirurgicos_Cuales to set
	 */
	public void setAO_PQuirurgicos_Cuales(String aO_PQuirurgicos_Cuales) {
		AO_PQuirurgicos_Cuales = aO_PQuirurgicos_Cuales;
	}
	/**
	 * @return the aO_PQuirurgicos_Otros
	 */
	public String getAO_PQuirurgicos_Otros() {
		return AO_PQuirurgicos_Otros;
	}
	/**
	 * @param aO_PQuirurgicos_Otros the aO_PQuirurgicos_Otros to set
	 */
	public void setAO_PQuirurgicos_Otros(String aO_PQuirurgicos_Otros) {
		AO_PQuirurgicos_Otros = aO_PQuirurgicos_Otros;
	}
	/**
	 * @return the aO_PQuirurgicos_Timpanoplastia
	 */
	public String getAO_PQuirurgicos_Timpanoplastia() {
		return AO_PQuirurgicos_Timpanoplastia;
	}
	/**
	 * @param aO_PQuirurgicos_Timpanoplastia the aO_PQuirurgicos_Timpanoplastia to set
	 */
	public void setAO_PQuirurgicos_Timpanoplastia(String aO_PQuirurgicos_Timpanoplastia) {
		AO_PQuirurgicos_Timpanoplastia = aO_PQuirurgicos_Timpanoplastia;
	}
	/**
	 * @return the aO_PToxicos_Farmacos
	 */
	public String getAO_PToxicos_Farmacos() {
		return AO_PToxicos_Farmacos;
	}
	/**
	 * @param aO_PToxicos_Farmacos the aO_PToxicos_Farmacos to set
	 */
	public void setAO_PToxicos_Farmacos(String aO_PToxicos_Farmacos) {
		AO_PToxicos_Farmacos = aO_PToxicos_Farmacos;
	}
	/**
	 * @return the aO_PToxicos_Industriales
	 */
	public String getAO_PToxicos_Industriales() {
		return AO_PToxicos_Industriales;
	}
	/**
	 * @param aO_PToxicos_Industriales the aO_PToxicos_Industriales to set
	 */
	public void setAO_PToxicos_Industriales(String aO_PToxicos_Industriales) {
		AO_PToxicos_Industriales = aO_PToxicos_Industriales;
	}
	/**
	 * @return the aO_PTraumaticos_Acustico
	 */
	public String getAO_PTraumaticos_Acustico() {
		return AO_PTraumaticos_Acustico;
	}
	/**
	 * @param aO_PTraumaticos_Acustico the aO_PTraumaticos_Acustico to set
	 */
	public void setAO_PTraumaticos_Acustico(String aO_PTraumaticos_Acustico) {
		AO_PTraumaticos_Acustico = aO_PTraumaticos_Acustico;
	}
	/**
	 * @return the aO_PTraumaticos_Craneo
	 */
	public String getAO_PTraumaticos_Craneo() {
		return AO_PTraumaticos_Craneo;
	}
	/**
	 * @param aO_PTraumaticos_Craneo the aO_PTraumaticos_Craneo to set
	 */
	public void setAO_PTraumaticos_Craneo(String aO_PTraumaticos_Craneo) {
		AO_PTraumaticos_Craneo = aO_PTraumaticos_Craneo;
	}
	/**
	 * @return the aO_PTraumaticos_Cuales
	 */
	public String getAO_PTraumaticos_Cuales() {
		return AO_PTraumaticos_Cuales;
	}
	/**
	 * @param aO_PTraumaticos_Cuales the aO_PTraumaticos_Cuales to set
	 */
	public void setAO_PTraumaticos_Cuales(String aO_PTraumaticos_Cuales) {
		AO_PTraumaticos_Cuales = aO_PTraumaticos_Cuales;
	}
	/**
	 * @return the aO_PTraumaticos_Otros
	 */
	public String getAO_PTraumaticos_Otros() {
		return AO_PTraumaticos_Otros;
	}
	/**
	 * @param aO_PTraumaticos_Otros the aO_PTraumaticos_Otros to set
	 */
	public void setAO_PTraumaticos_Otros(String aO_PTraumaticos_Otros) {
		AO_PTraumaticos_Otros = aO_PTraumaticos_Otros;
	}
	/**
	 * @return the aP_Catarata
	 */
	public String getAP_Catarata() {
		return AP_Catarata;
	}
	/**
	 * @param aP_Catarata the aP_Catarata to set
	 */
	public void setAP_Catarata(String aP_Catarata) {
		AP_Catarata = aP_Catarata;
	}
	/**
	 * @return the aP_Catarata_escribir
	 */
	public String getAP_Catarata_escribir() {
		return AP_Catarata_escribir;
	}
	/**
	 * @param aP_Catarata_escribir the aP_Catarata_escribir to set
	 */
	public void setAP_Catarata_escribir(String aP_Catarata_escribir) {
		AP_Catarata_escribir = aP_Catarata_escribir;
	}
	/**
	 * @return the aP_Esquirlas
	 */
	public String getAP_Esquirlas() {
		return AP_Esquirlas;
	}
	/**
	 * @param aP_Esquirlas the aP_Esquirlas to set
	 */
	public void setAP_Esquirlas(String aP_Esquirlas) {
		AP_Esquirlas = aP_Esquirlas;
	}
	/**
	 * @return the aP_Esquirlas_escribir
	 */
	public String getAP_Esquirlas_escribir() {
		return AP_Esquirlas_escribir;
	}
	/**
	 * @param aP_Esquirlas_escribir the aP_Esquirlas_escribir to set
	 */
	public void setAP_Esquirlas_escribir(String aP_Esquirlas_escribir) {
		AP_Esquirlas_escribir = aP_Esquirlas_escribir;
	}
	/**
	 * @return the aP_Farmacologicos_Alergicos
	 */
	public String getAP_Farmacologicos_Alergicos() {
		return AP_Farmacologicos_Alergicos;
	}
	/**
	 * @param aP_Farmacologicos_Alergicos the aP_Farmacologicos_Alergicos to set
	 */
	public void setAP_Farmacologicos_Alergicos(String aP_Farmacologicos_Alergicos) {
		AP_Farmacologicos_Alergicos = aP_Farmacologicos_Alergicos;
	}
	/**
	 * @return the aP_Farmacologicos_Alergicos_escribir
	 */
	public String getAP_Farmacologicos_Alergicos_escribir() {
		return AP_Farmacologicos_Alergicos_escribir;
	}
	/**
	 * @param aP_Farmacologicos_Alergicos_escribir the aP_Farmacologicos_Alergicos_escribir to set
	 */
	public void setAP_Farmacologicos_Alergicos_escribir(String aP_Farmacologicos_Alergicos_escribir) {
		AP_Farmacologicos_Alergicos_escribir = aP_Farmacologicos_Alergicos_escribir;
	}
	/**
	 * @return the aP_Galucoma
	 */
	public String getAP_Galucoma() {
		return AP_Galucoma;
	}
	/**
	 * @param aP_Galucoma the aP_Galucoma to set
	 */
	public void setAP_Galucoma(String aP_Galucoma) {
		AP_Galucoma = aP_Galucoma;
	}
	/**
	 * @return the aP_Galucoma_escribir
	 */
	public String getAP_Galucoma_escribir() {
		return AP_Galucoma_escribir;
	}
	/**
	 * @param aP_Galucoma_escribir the aP_Galucoma_escribir to set
	 */
	public void setAP_Galucoma_escribir(String aP_Galucoma_escribir) {
		AP_Galucoma_escribir = aP_Galucoma_escribir;
	}
	/**
	 * @return the aP_Otros
	 */
	public String getAP_Otros() {
		return AP_Otros;
	}
	/**
	 * @param aP_Otros the aP_Otros to set
	 */
	public void setAP_Otros(String aP_Otros) {
		AP_Otros = aP_Otros;
	}
	/**
	 * @return the aP_Otros_escribir
	 */
	public String getAP_Otros_escribir() {
		return AP_Otros_escribir;
	}
	/**
	 * @param aP_Otros_escribir the aP_Otros_escribir to set
	 */
	public void setAP_Otros_escribir(String aP_Otros_escribir) {
		AP_Otros_escribir = aP_Otros_escribir;
	}
	/**
	 * @return the aP_Patologicos
	 */
	public String getAP_Patologicos() {
		return AP_Patologicos;
	}
	/**
	 * @param aP_Patologicos the aP_Patologicos to set
	 */
	public void setAP_Patologicos(String aP_Patologicos) {
		AP_Patologicos = aP_Patologicos;
	}
	/**
	 * @return the aP_Patologicos_escribir
	 */
	public String getAP_Patologicos_escribir() {
		return AP_Patologicos_escribir;
	}
	/**
	 * @param aP_Patologicos_escribir the aP_Patologicos_escribir to set
	 */
	public void setAP_Patologicos_escribir(String aP_Patologicos_escribir) {
		AP_Patologicos_escribir = aP_Patologicos_escribir;
	}
	/**
	 * @return the aP_Quimicos
	 */
	public String getAP_Quimicos() {
		return AP_Quimicos;
	}
	/**
	 * @param aP_Quimicos the aP_Quimicos to set
	 */
	public void setAP_Quimicos(String aP_Quimicos) {
		AP_Quimicos = aP_Quimicos;
	}
	/**
	 * @return the aP_Quimicos_escribir
	 */
	public String getAP_Quimicos_escribir() {
		return AP_Quimicos_escribir;
	}
	/**
	 * @param aP_Quimicos_escribir the aP_Quimicos_escribir to set
	 */
	public void setAP_Quimicos_escribir(String aP_Quimicos_escribir) {
		AP_Quimicos_escribir = aP_Quimicos_escribir;
	}
	/**
	 * @return the aP_Quirurgicos
	 */
	public String getAP_Quirurgicos() {
		return AP_Quirurgicos;
	}
	/**
	 * @param aP_Quirurgicos the aP_Quirurgicos to set
	 */
	public void setAP_Quirurgicos(String aP_Quirurgicos) {
		AP_Quirurgicos = aP_Quirurgicos;
	}
	/**
	 * @return the aP_Quirurgicos_escribir
	 */
	public String getAP_Quirurgicos_escribir() {
		return AP_Quirurgicos_escribir;
	}
	/**
	 * @param aP_Quirurgicos_escribir the aP_Quirurgicos_escribir to set
	 */
	public void setAP_Quirurgicos_escribir(String aP_Quirurgicos_escribir) {
		AP_Quirurgicos_escribir = aP_Quirurgicos_escribir;
	}
	/**
	 * @return the aP_RehabilitacionVisual
	 */
	public String getAP_RehabilitacionVisual() {
		return AP_RehabilitacionVisual;
	}
	/**
	 * @param aP_RehabilitacionVisual the aP_RehabilitacionVisual to set
	 */
	public void setAP_RehabilitacionVisual(String aP_RehabilitacionVisual) {
		AP_RehabilitacionVisual = aP_RehabilitacionVisual;
	}
	/**
	 * @return the aP_RehabilitacionVisual_escribir
	 */
	public String getAP_RehabilitacionVisual_escribir() {
		return AP_RehabilitacionVisual_escribir;
	}
	/**
	 * @param aP_RehabilitacionVisual_escribir the aP_RehabilitacionVisual_escribir to set
	 */
	public void setAP_RehabilitacionVisual_escribir(String aP_RehabilitacionVisual_escribir) {
		AP_RehabilitacionVisual_escribir = aP_RehabilitacionVisual_escribir;
	}
	/**
	 * @return the aP_Transfusionales
	 */
	public String getAP_Transfusionales() {
		return AP_Transfusionales;
	}
	/**
	 * @param aP_Transfusionales the aP_Transfusionales to set
	 */
	public void setAP_Transfusionales(String aP_Transfusionales) {
		AP_Transfusionales = aP_Transfusionales;
	}
	/**
	 * @return the aP_Transfusionales_escribir
	 */
	public String getAP_Transfusionales_escribir() {
		return AP_Transfusionales_escribir;
	}
	/**
	 * @param aP_Transfusionales_escribir the aP_Transfusionales_escribir to set
	 */
	public void setAP_Transfusionales_escribir(String aP_Transfusionales_escribir) {
		AP_Transfusionales_escribir = aP_Transfusionales_escribir;
	}
	/**
	 * @return the aP_Traumaticos
	 */
	public String getAP_Traumaticos() {
		return AP_Traumaticos;
	}
	/**
	 * @param aP_Traumaticos the aP_Traumaticos to set
	 */
	public void setAP_Traumaticos(String aP_Traumaticos) {
		AP_Traumaticos = aP_Traumaticos;
	}
	/**
	 * @return the aP_Traumaticos_escribir
	 */
	public String getAP_Traumaticos_escribir() {
		return AP_Traumaticos_escribir;
	}
	/**
	 * @param aP_Traumaticos_escribir the aP_Traumaticos_escribir to set
	 */
	public void setAP_Traumaticos_escribir(String aP_Traumaticos_escribir) {
		AP_Traumaticos_escribir = aP_Traumaticos_escribir;
	}
	/**
	 * @return the aP_UsuariosRx
	 */
	public String getAP_UsuariosRx() {
		return AP_UsuariosRx;
	}
	/**
	 * @param aP_UsuariosRx the aP_UsuariosRx to set
	 */
	public void setAP_UsuariosRx(String aP_UsuariosRx) {
		AP_UsuariosRx = aP_UsuariosRx;
	}
	/**
	 * @return the aP_UsuariosRx_escribir
	 */
	public String getAP_UsuariosRx_escribir() {
		return AP_UsuariosRx_escribir;
	}
	/**
	 * @param aP_UsuariosRx_escribir the aP_UsuariosRx_escribir to set
	 */
	public void setAP_UsuariosRx_escribir(String aP_UsuariosRx_escribir) {
		AP_UsuariosRx_escribir = aP_UsuariosRx_escribir;
	}
	/**
	 * @return the otrosOculares
	 */
	public String getOtrosOculares() {
		return OtrosOculares;
	}
	/**
	 * @param otrosOculares the otrosOculares to set
	 */
	public void setOtrosOculares(String otrosOculares) {
		OtrosOculares = otrosOculares;
	}
	/**
	 * @return the otrosOcularesEscribir
	 */
	public String getOtrosOcularesEscribir() {
		return OtrosOcularesEscribir;
	}
	/**
	 * @param otrosOcularesEscribir the otrosOcularesEscribir to set
	 */
	public void setOtrosOcularesEscribir(String otrosOcularesEscribir) {
		OtrosOcularesEscribir = otrosOcularesEscribir;
	}
	/**
	 * @return the _fk_IDT_DocumentoID
	 */
	public int get_fk_IDT_DocumentoID() {
		return _fk_IDT_DocumentoID;
	}
	/**
	 * @param _fk_IDT_DocumentoID the _fk_IDT_DocumentoID to set
	 */
	public void set_fk_IDT_DocumentoID(int _fk_IDT_DocumentoID) {
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
	}
	/**
	 * @return the aG_Dias
	 */
	public int getAG_Dias() {
		return AG_Dias;
	}
	/**
	 * @param aG_Dias the aG_Dias to set
	 */
	public void setAG_Dias(int aG_Dias) {
		AG_Dias = aG_Dias;
	}
	/**
	 * @return the aG_FObstetrica_A
	 */
	public int getAG_FObstetrica_A() {
		return AG_FObstetrica_A;
	}
	/**
	 * @param aG_FObstetrica_A the aG_FObstetrica_A to set
	 */
	public void setAG_FObstetrica_A(int aG_FObstetrica_A) {
		AG_FObstetrica_A = aG_FObstetrica_A;
	}
	/**
	 * @return the aG_FObstetrica_C
	 */
	public int getAG_FObstetrica_C() {
		return AG_FObstetrica_C;
	}
	/**
	 * @param aG_FObstetrica_C the aG_FObstetrica_C to set
	 */
	public void setAG_FObstetrica_C(int aG_FObstetrica_C) {
		AG_FObstetrica_C = aG_FObstetrica_C;
	}
	/**
	 * @return the aG_FObstetrica_E
	 */
	public int getAG_FObstetrica_E() {
		return AG_FObstetrica_E;
	}
	/**
	 * @param aG_FObstetrica_E the aG_FObstetrica_E to set
	 */
	public void setAG_FObstetrica_E(int aG_FObstetrica_E) {
		AG_FObstetrica_E = aG_FObstetrica_E;
	}
	/**
	 * @return the aG_FObstetrica_G
	 */
	public int getAG_FObstetrica_G() {
		return AG_FObstetrica_G;
	}
	/**
	 * @param aG_FObstetrica_G the aG_FObstetrica_G to set
	 */
	public void setAG_FObstetrica_G(int aG_FObstetrica_G) {
		AG_FObstetrica_G = aG_FObstetrica_G;
	}
	/**
	 * @return the aG_FObstetrica_P
	 */
	public int getAG_FObstetrica_P() {
		return AG_FObstetrica_P;
	}
	/**
	 * @param aG_FObstetrica_P the aG_FObstetrica_P to set
	 */
	public void setAG_FObstetrica_P(int aG_FObstetrica_P) {
		AG_FObstetrica_P = aG_FObstetrica_P;
	}
	/**
	 * @return the aG_FObstetrica_V
	 */
	public int getAG_FObstetrica_V() {
		return AG_FObstetrica_V;
	}
	/**
	 * @param aG_FObstetrica_V the aG_FObstetrica_V to set
	 */
	public void setAG_FObstetrica_V(int aG_FObstetrica_V) {
		AG_FObstetrica_V = aG_FObstetrica_V;
	}
	/**
	 * @return the aG_Menarquia
	 */
	public int getAG_Menarquia() {
		return AG_Menarquia;
	}
	/**
	 * @param aG_Menarquia the aG_Menarquia to set
	 */
	public void setAG_Menarquia(int aG_Menarquia) {
		AG_Menarquia = aG_Menarquia;
	}
	/**
	 * @return the aG_FUP
	 */
	public Date getAG_FUP() {
		return AG_FUP;
	}
	/**
	 * @param aG_FUP the aG_FUP to set
	 */
	public void setAG_FUP(Date aG_FUP) {
		AG_FUP = aG_FUP;
	}
	/**
	 * @return the aG_FUR
	 */
	public Date getAG_FUR() {
		return AG_FUR;
	}
	/**
	 * @param aG_FUR the aG_FUR to set
	 */
	public void setAG_FUR(Date aG_FUR) {
		AG_FUR = aG_FUR;
	}
	/**
	 * @return the aG_UltimaCitologia_Fecha
	 */
	public Date getAG_UltimaCitologia_Fecha() {
		return AG_UltimaCitologia_Fecha;
	}
	/**
	 * @param aG_UltimaCitologia_Fecha the aG_UltimaCitologia_Fecha to set
	 */
	public void setAG_UltimaCitologia_Fecha(Date aG_UltimaCitologia_Fecha) {
		AG_UltimaCitologia_Fecha = aG_UltimaCitologia_Fecha;
	}
	/**
	 * @return the fechaDeDiligenciamiento
	 */
	public Date getFechaDeDiligenciamiento() {
		return FechaDeDiligenciamiento;
	}
	/**
	 * @param fechaDeDiligenciamiento the fechaDeDiligenciamiento to set
	 */
	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}
	/**
	 * @return the fechaDeModificacion
	 */
	public Date getFechaDeModificacion() {
		return FechaDeModificacion;
	}
	/**
	 * @param fechaDeModificacion the fechaDeModificacion to set
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}
	
	

}
