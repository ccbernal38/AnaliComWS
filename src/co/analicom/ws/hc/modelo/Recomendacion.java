/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class Recomendacion {

	private String HabitosEVS, HabitosEVS_ConducirVentanaCerrada, HabitosEVS_ControlNutricionalPeso,
			HabitosEVS_DejarDeFumar, HabitosEVS_InicioActividadFisica, HabitosEVS_ReducirConsumoAlcohol, IngresoPVE,
			IngresoSVE, IngresoSVE_Biologico, IngresoSVE_CardiovascularMetabolico, IngresoSVE_Ergonomico,
			IngresoSVE_Psicolaboral, IngresoSVE_Ruido, IngresoSVE_Visual, Medicas, Medicas_AudiometriaConfirmatoria,
			Medicas_CitologiaCervicoVaginal, Medicas_ContinuarManejoMedico, Medicas_ControlAnualOptometrico,
			Medicas_ControlAudilogicoAnual, Medicas_ControlAudilogicoPeriodico, Medicas_ControlAudilogicoSemestral,
			Medicas_ControlOdontologicoPeriodico, Medicas_EsquemaVacunacionAdulto, Medicas_ExamenesComplementarios,
			Medicas_Otros, Medicas_RemisionaEPS, Medicas_RemisionARP, Medicas_RemisionEPS, Medicas_SeguimientoCasoxARP,
			Medicas_TamizajeProstatico, Medicas_Valoracion_ControlORL, Ocupacionales,
			Ocupacionales_DistribucionFuerzasCargas, Ocupacionales_EPPAuditivo, Ocupacionales_HigienePostural,
			Ocupacionales_PausasActivas45min, Ocupacionales_ReposoAuditivoExtralaboral,
			Ocupacionales_RotaDiademaTelefonica, Ocupacionales_UsoDeEPP, ProductosPracticos, PruebasComplementarias,
			RecomendacionesAdicionales, Restricciones;

	private int _fk_DocumentoMD, _fk_IDT_DocumentoID;

	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public Recomendacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the habitosEVS
	 */
	public String getHabitosEVS() {
		return HabitosEVS;
	}

	/**
	 * @param habitosEVS the habitosEVS to set
	 */
	public void setHabitosEVS(String habitosEVS) {
		HabitosEVS = habitosEVS;
	}

	/**
	 * @return the habitosEVS_ConducirVentanaCerrada
	 */
	public String getHabitosEVS_ConducirVentanaCerrada() {
		return HabitosEVS_ConducirVentanaCerrada;
	}

	/**
	 * @param habitosEVS_ConducirVentanaCerrada the
	 *                                          habitosEVS_ConducirVentanaCerrada to
	 *                                          set
	 */
	public void setHabitosEVS_ConducirVentanaCerrada(String habitosEVS_ConducirVentanaCerrada) {
		HabitosEVS_ConducirVentanaCerrada = habitosEVS_ConducirVentanaCerrada;
	}

	/**
	 * @return the habitosEVS_ControlNutricionalPeso
	 */
	public String getHabitosEVS_ControlNutricionalPeso() {
		return HabitosEVS_ControlNutricionalPeso;
	}

	/**
	 * @param habitosEVS_ControlNutricionalPeso the
	 *                                          habitosEVS_ControlNutricionalPeso to
	 *                                          set
	 */
	public void setHabitosEVS_ControlNutricionalPeso(String habitosEVS_ControlNutricionalPeso) {
		HabitosEVS_ControlNutricionalPeso = habitosEVS_ControlNutricionalPeso;
	}

	/**
	 * @return the habitosEVS_DejarDeFumar
	 */
	public String getHabitosEVS_DejarDeFumar() {
		return HabitosEVS_DejarDeFumar;
	}

	/**
	 * @param habitosEVS_DejarDeFumar the habitosEVS_DejarDeFumar to set
	 */
	public void setHabitosEVS_DejarDeFumar(String habitosEVS_DejarDeFumar) {
		HabitosEVS_DejarDeFumar = habitosEVS_DejarDeFumar;
	}

	/**
	 * @return the habitosEVS_InicioActividadFisica
	 */
	public String getHabitosEVS_InicioActividadFisica() {
		return HabitosEVS_InicioActividadFisica;
	}

	/**
	 * @param habitosEVS_InicioActividadFisica the habitosEVS_InicioActividadFisica
	 *                                         to set
	 */
	public void setHabitosEVS_InicioActividadFisica(String habitosEVS_InicioActividadFisica) {
		HabitosEVS_InicioActividadFisica = habitosEVS_InicioActividadFisica;
	}

	/**
	 * @return the habitosEVS_ReducirConsumoAlcohol
	 */
	public String getHabitosEVS_ReducirConsumoAlcohol() {
		return HabitosEVS_ReducirConsumoAlcohol;
	}

	/**
	 * @param habitosEVS_ReducirConsumoAlcohol the habitosEVS_ReducirConsumoAlcohol
	 *                                         to set
	 */
	public void setHabitosEVS_ReducirConsumoAlcohol(String habitosEVS_ReducirConsumoAlcohol) {
		HabitosEVS_ReducirConsumoAlcohol = habitosEVS_ReducirConsumoAlcohol;
	}

	/**
	 * @return the ingresoPVE
	 */
	public String getIngresoPVE() {
		return IngresoPVE;
	}

	/**
	 * @param ingresoPVE the ingresoPVE to set
	 */
	public void setIngresoPVE(String ingresoPVE) {
		IngresoPVE = ingresoPVE;
	}

	/**
	 * @return the ingresoSVE
	 */
	public String getIngresoSVE() {
		return IngresoSVE;
	}

	/**
	 * @param ingresoSVE the ingresoSVE to set
	 */
	public void setIngresoSVE(String ingresoSVE) {
		IngresoSVE = ingresoSVE;
	}

	/**
	 * @return the ingresoSVE_Biologico
	 */
	public String getIngresoSVE_Biologico() {
		return IngresoSVE_Biologico;
	}

	/**
	 * @param ingresoSVE_Biologico the ingresoSVE_Biologico to set
	 */
	public void setIngresoSVE_Biologico(String ingresoSVE_Biologico) {
		IngresoSVE_Biologico = ingresoSVE_Biologico;
	}

	/**
	 * @return the ingresoSVE_CardiovascularMetabolico
	 */
	public String getIngresoSVE_CardiovascularMetabolico() {
		return IngresoSVE_CardiovascularMetabolico;
	}

	/**
	 * @param ingresoSVE_CardiovascularMetabolico the
	 *                                            ingresoSVE_CardiovascularMetabolico
	 *                                            to set
	 */
	public void setIngresoSVE_CardiovascularMetabolico(String ingresoSVE_CardiovascularMetabolico) {
		IngresoSVE_CardiovascularMetabolico = ingresoSVE_CardiovascularMetabolico;
	}

	/**
	 * @return the ingresoSVE_Ergonomico
	 */
	public String getIngresoSVE_Ergonomico() {
		return IngresoSVE_Ergonomico;
	}

	/**
	 * @param ingresoSVE_Ergonomico the ingresoSVE_Ergonomico to set
	 */
	public void setIngresoSVE_Ergonomico(String ingresoSVE_Ergonomico) {
		IngresoSVE_Ergonomico = ingresoSVE_Ergonomico;
	}

	/**
	 * @return the ingresoSVE_Psicolaboral
	 */
	public String getIngresoSVE_Psicolaboral() {
		return IngresoSVE_Psicolaboral;
	}

	/**
	 * @param ingresoSVE_Psicolaboral the ingresoSVE_Psicolaboral to set
	 */
	public void setIngresoSVE_Psicolaboral(String ingresoSVE_Psicolaboral) {
		IngresoSVE_Psicolaboral = ingresoSVE_Psicolaboral;
	}

	/**
	 * @return the ingresoSVE_Ruido
	 */
	public String getIngresoSVE_Ruido() {
		return IngresoSVE_Ruido;
	}

	/**
	 * @param ingresoSVE_Ruido the ingresoSVE_Ruido to set
	 */
	public void setIngresoSVE_Ruido(String ingresoSVE_Ruido) {
		IngresoSVE_Ruido = ingresoSVE_Ruido;
	}

	/**
	 * @return the ingresoSVE_Visual
	 */
	public String getIngresoSVE_Visual() {
		return IngresoSVE_Visual;
	}

	/**
	 * @param ingresoSVE_Visual the ingresoSVE_Visual to set
	 */
	public void setIngresoSVE_Visual(String ingresoSVE_Visual) {
		IngresoSVE_Visual = ingresoSVE_Visual;
	}

	/**
	 * @return the medicas
	 */
	public String getMedicas() {
		return Medicas;
	}

	/**
	 * @param medicas the medicas to set
	 */
	public void setMedicas(String medicas) {
		Medicas = medicas;
	}

	/**
	 * @return the medicas_AudiometriaConfirmatoria
	 */
	public String getMedicas_AudiometriaConfirmatoria() {
		return Medicas_AudiometriaConfirmatoria;
	}

	/**
	 * @param medicas_AudiometriaConfirmatoria the medicas_AudiometriaConfirmatoria
	 *                                         to set
	 */
	public void setMedicas_AudiometriaConfirmatoria(String medicas_AudiometriaConfirmatoria) {
		Medicas_AudiometriaConfirmatoria = medicas_AudiometriaConfirmatoria;
	}

	/**
	 * @return the medicas_CitologiaCervicoVaginal
	 */
	public String getMedicas_CitologiaCervicoVaginal() {
		return Medicas_CitologiaCervicoVaginal;
	}

	/**
	 * @param medicas_CitologiaCervicoVaginal the medicas_CitologiaCervicoVaginal to
	 *                                        set
	 */
	public void setMedicas_CitologiaCervicoVaginal(String medicas_CitologiaCervicoVaginal) {
		Medicas_CitologiaCervicoVaginal = medicas_CitologiaCervicoVaginal;
	}

	/**
	 * @return the medicas_ContinuarManejoMedico
	 */
	public String getMedicas_ContinuarManejoMedico() {
		return Medicas_ContinuarManejoMedico;
	}

	/**
	 * @param medicas_ContinuarManejoMedico the medicas_ContinuarManejoMedico to set
	 */
	public void setMedicas_ContinuarManejoMedico(String medicas_ContinuarManejoMedico) {
		Medicas_ContinuarManejoMedico = medicas_ContinuarManejoMedico;
	}

	/**
	 * @return the medicas_ControlAnualOptometrico
	 */
	public String getMedicas_ControlAnualOptometrico() {
		return Medicas_ControlAnualOptometrico;
	}

	/**
	 * @param medicas_ControlAnualOptometrico the medicas_ControlAnualOptometrico to
	 *                                        set
	 */
	public void setMedicas_ControlAnualOptometrico(String medicas_ControlAnualOptometrico) {
		Medicas_ControlAnualOptometrico = medicas_ControlAnualOptometrico;
	}

	/**
	 * @return the medicas_ControlAudilogicoAnual
	 */
	public String getMedicas_ControlAudilogicoAnual() {
		return Medicas_ControlAudilogicoAnual;
	}

	/**
	 * @param medicas_ControlAudilogicoAnual the medicas_ControlAudilogicoAnual to
	 *                                       set
	 */
	public void setMedicas_ControlAudilogicoAnual(String medicas_ControlAudilogicoAnual) {
		Medicas_ControlAudilogicoAnual = medicas_ControlAudilogicoAnual;
	}

	/**
	 * @return the medicas_ControlAudilogicoPeriodico
	 */
	public String getMedicas_ControlAudilogicoPeriodico() {
		return Medicas_ControlAudilogicoPeriodico;
	}

	/**
	 * @param medicas_ControlAudilogicoPeriodico the
	 *                                           medicas_ControlAudilogicoPeriodico
	 *                                           to set
	 */
	public void setMedicas_ControlAudilogicoPeriodico(String medicas_ControlAudilogicoPeriodico) {
		Medicas_ControlAudilogicoPeriodico = medicas_ControlAudilogicoPeriodico;
	}

	/**
	 * @return the medicas_ControlAudilogicoSemestral
	 */
	public String getMedicas_ControlAudilogicoSemestral() {
		return Medicas_ControlAudilogicoSemestral;
	}

	/**
	 * @param medicas_ControlAudilogicoSemestral the
	 *                                           medicas_ControlAudilogicoSemestral
	 *                                           to set
	 */
	public void setMedicas_ControlAudilogicoSemestral(String medicas_ControlAudilogicoSemestral) {
		Medicas_ControlAudilogicoSemestral = medicas_ControlAudilogicoSemestral;
	}

	/**
	 * @return the medicas_ControlOdontologicoPeriodico
	 */
	public String getMedicas_ControlOdontologicoPeriodico() {
		return Medicas_ControlOdontologicoPeriodico;
	}

	/**
	 * @param medicas_ControlOdontologicoPeriodico the
	 *                                             medicas_ControlOdontologicoPeriodico
	 *                                             to set
	 */
	public void setMedicas_ControlOdontologicoPeriodico(String medicas_ControlOdontologicoPeriodico) {
		Medicas_ControlOdontologicoPeriodico = medicas_ControlOdontologicoPeriodico;
	}

	/**
	 * @return the medicas_EsquemaVacunacionAdulto
	 */
	public String getMedicas_EsquemaVacunacionAdulto() {
		return Medicas_EsquemaVacunacionAdulto;
	}

	/**
	 * @param medicas_EsquemaVacunacionAdulto the medicas_EsquemaVacunacionAdulto to
	 *                                        set
	 */
	public void setMedicas_EsquemaVacunacionAdulto(String medicas_EsquemaVacunacionAdulto) {
		Medicas_EsquemaVacunacionAdulto = medicas_EsquemaVacunacionAdulto;
	}

	/**
	 * @return the medicas_ExamenesComplementarios
	 */
	public String getMedicas_ExamenesComplementarios() {
		return Medicas_ExamenesComplementarios;
	}

	/**
	 * @param medicas_ExamenesComplementarios the medicas_ExamenesComplementarios to
	 *                                        set
	 */
	public void setMedicas_ExamenesComplementarios(String medicas_ExamenesComplementarios) {
		Medicas_ExamenesComplementarios = medicas_ExamenesComplementarios;
	}

	/**
	 * @return the medicas_Otros
	 */
	public String getMedicas_Otros() {
		return Medicas_Otros;
	}

	/**
	 * @param medicas_Otros the medicas_Otros to set
	 */
	public void setMedicas_Otros(String medicas_Otros) {
		Medicas_Otros = medicas_Otros;
	}

	/**
	 * @return the medicas_RemisionaEPS
	 */
	public String getMedicas_RemisionaEPS() {
		return Medicas_RemisionaEPS;
	}

	/**
	 * @param medicas_RemisionaEPS the medicas_RemisionaEPS to set
	 */
	public void setMedicas_RemisionaEPS(String medicas_RemisionaEPS) {
		Medicas_RemisionaEPS = medicas_RemisionaEPS;
	}

	/**
	 * @return the medicas_RemisionARP
	 */
	public String getMedicas_RemisionARP() {
		return Medicas_RemisionARP;
	}

	/**
	 * @param medicas_RemisionARP the medicas_RemisionARP to set
	 */
	public void setMedicas_RemisionARP(String medicas_RemisionARP) {
		Medicas_RemisionARP = medicas_RemisionARP;
	}

	/**
	 * @return the medicas_RemisionEPS
	 */
	public String getMedicas_RemisionEPS() {
		return Medicas_RemisionEPS;
	}

	/**
	 * @param medicas_RemisionEPS the medicas_RemisionEPS to set
	 */
	public void setMedicas_RemisionEPS(String medicas_RemisionEPS) {
		Medicas_RemisionEPS = medicas_RemisionEPS;
	}

	/**
	 * @return the medicas_SeguimientoCasoxARP
	 */
	public String getMedicas_SeguimientoCasoxARP() {
		return Medicas_SeguimientoCasoxARP;
	}

	/**
	 * @param medicas_SeguimientoCasoxARP the medicas_SeguimientoCasoxARP to set
	 */
	public void setMedicas_SeguimientoCasoxARP(String medicas_SeguimientoCasoxARP) {
		Medicas_SeguimientoCasoxARP = medicas_SeguimientoCasoxARP;
	}

	/**
	 * @return the medicas_TamizajeProstatico
	 */
	public String getMedicas_TamizajeProstatico() {
		return Medicas_TamizajeProstatico;
	}

	/**
	 * @param medicas_TamizajeProstatico the medicas_TamizajeProstatico to set
	 */
	public void setMedicas_TamizajeProstatico(String medicas_TamizajeProstatico) {
		Medicas_TamizajeProstatico = medicas_TamizajeProstatico;
	}

	/**
	 * @return the medicas_Valoracion_ControlORL
	 */
	public String getMedicas_Valoracion_ControlORL() {
		return Medicas_Valoracion_ControlORL;
	}

	/**
	 * @param medicas_Valoracion_ControlORL the medicas_Valoracion_ControlORL to set
	 */
	public void setMedicas_Valoracion_ControlORL(String medicas_Valoracion_ControlORL) {
		Medicas_Valoracion_ControlORL = medicas_Valoracion_ControlORL;
	}

	/**
	 * @return the ocupacionales
	 */
	public String getOcupacionales() {
		return Ocupacionales;
	}

	/**
	 * @param ocupacionales the ocupacionales to set
	 */
	public void setOcupacionales(String ocupacionales) {
		Ocupacionales = ocupacionales;
	}

	/**
	 * @return the ocupacionales_DistribucionFuerzasCargas
	 */
	public String getOcupacionales_DistribucionFuerzasCargas() {
		return Ocupacionales_DistribucionFuerzasCargas;
	}

	/**
	 * @param ocupacionales_DistribucionFuerzasCargas the
	 *                                                ocupacionales_DistribucionFuerzasCargas
	 *                                                to set
	 */
	public void setOcupacionales_DistribucionFuerzasCargas(String ocupacionales_DistribucionFuerzasCargas) {
		Ocupacionales_DistribucionFuerzasCargas = ocupacionales_DistribucionFuerzasCargas;
	}

	/**
	 * @return the ocupacionales_EPPAuditivo
	 */
	public String getOcupacionales_EPPAuditivo() {
		return Ocupacionales_EPPAuditivo;
	}

	/**
	 * @param ocupacionales_EPPAuditivo the ocupacionales_EPPAuditivo to set
	 */
	public void setOcupacionales_EPPAuditivo(String ocupacionales_EPPAuditivo) {
		Ocupacionales_EPPAuditivo = ocupacionales_EPPAuditivo;
	}

	/**
	 * @return the ocupacionales_HigienePostural
	 */
	public String getOcupacionales_HigienePostural() {
		return Ocupacionales_HigienePostural;
	}

	/**
	 * @param ocupacionales_HigienePostural the ocupacionales_HigienePostural to set
	 */
	public void setOcupacionales_HigienePostural(String ocupacionales_HigienePostural) {
		Ocupacionales_HigienePostural = ocupacionales_HigienePostural;
	}

	/**
	 * @return the ocupacionales_PausasActivas45min
	 */
	public String getOcupacionales_PausasActivas45min() {
		return Ocupacionales_PausasActivas45min;
	}

	/**
	 * @param ocupacionales_PausasActivas45min the ocupacionales_PausasActivas45min
	 *                                         to set
	 */
	public void setOcupacionales_PausasActivas45min(String ocupacionales_PausasActivas45min) {
		Ocupacionales_PausasActivas45min = ocupacionales_PausasActivas45min;
	}

	/**
	 * @return the ocupacionales_ReposoAuditivoExtralaboral
	 */
	public String getOcupacionales_ReposoAuditivoExtralaboral() {
		return Ocupacionales_ReposoAuditivoExtralaboral;
	}

	/**
	 * @param ocupacionales_ReposoAuditivoExtralaboral the
	 *                                                 ocupacionales_ReposoAuditivoExtralaboral
	 *                                                 to set
	 */
	public void setOcupacionales_ReposoAuditivoExtralaboral(String ocupacionales_ReposoAuditivoExtralaboral) {
		Ocupacionales_ReposoAuditivoExtralaboral = ocupacionales_ReposoAuditivoExtralaboral;
	}

	/**
	 * @return the ocupacionales_RotaDiademaTelefonica
	 */
	public String getOcupacionales_RotaDiademaTelefonica() {
		return Ocupacionales_RotaDiademaTelefonica;
	}

	/**
	 * @param ocupacionales_RotaDiademaTelefonica the
	 *                                            ocupacionales_RotaDiademaTelefonica
	 *                                            to set
	 */
	public void setOcupacionales_RotaDiademaTelefonica(String ocupacionales_RotaDiademaTelefonica) {
		Ocupacionales_RotaDiademaTelefonica = ocupacionales_RotaDiademaTelefonica;
	}

	/**
	 * @return the ocupacionales_UsoDeEPP
	 */
	public String getOcupacionales_UsoDeEPP() {
		return Ocupacionales_UsoDeEPP;
	}

	/**
	 * @param ocupacionales_UsoDeEPP the ocupacionales_UsoDeEPP to set
	 */
	public void setOcupacionales_UsoDeEPP(String ocupacionales_UsoDeEPP) {
		Ocupacionales_UsoDeEPP = ocupacionales_UsoDeEPP;
	}

	/**
	 * @return the productosPracticos
	 */
	public String getProductosPracticos() {
		return ProductosPracticos;
	}

	/**
	 * @param productosPracticos the productosPracticos to set
	 */
	public void setProductosPracticos(String productosPracticos) {
		ProductosPracticos = productosPracticos;
	}

	/**
	 * @return the pruebasComplementarias
	 */
	public String getPruebasComplementarias() {
		return PruebasComplementarias;
	}

	/**
	 * @param pruebasComplementarias the pruebasComplementarias to set
	 */
	public void setPruebasComplementarias(String pruebasComplementarias) {
		PruebasComplementarias = pruebasComplementarias;
	}

	/**
	 * @return the recomendacionesAdicionales
	 */
	public String getRecomendacionesAdicionales() {
		return RecomendacionesAdicionales;
	}

	/**
	 * @param recomendacionesAdicionales the recomendacionesAdicionales to set
	 */
	public void setRecomendacionesAdicionales(String recomendacionesAdicionales) {
		RecomendacionesAdicionales = recomendacionesAdicionales;
	}

	/**
	 * @return the restricciones
	 */
	public String getRestricciones() {
		return Restricciones;
	}

	/**
	 * @param restricciones the restricciones to set
	 */
	public void setRestricciones(String restricciones) {
		Restricciones = restricciones;
	}

	/**
	 * @return the _fk_DocumentoMD
	 */
	public int get_fk_DocumentoMD() {
		return _fk_DocumentoMD;
	}

	/**
	 * @param _fk_DocumentoMD the _fk_DocumentoMD to set
	 */
	public void set_fk_DocumentoMD(int _fk_DocumentoMD) {
		this._fk_DocumentoMD = _fk_DocumentoMD;
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

	/**
	 * @param habitosEVS
	 * @param habitosEVS_ConducirVentanaCerrada
	 * @param habitosEVS_ControlNutricionalPeso
	 * @param habitosEVS_DejarDeFumar
	 * @param habitosEVS_InicioActividadFisica
	 * @param habitosEVS_ReducirConsumoAlcohol
	 * @param ingresoPVE
	 * @param ingresoSVE
	 * @param ingresoSVE_Biologico
	 * @param ingresoSVE_CardiovascularMetabolico
	 * @param ingresoSVE_Ergonomico
	 * @param ingresoSVE_Psicolaboral
	 * @param ingresoSVE_Ruido
	 * @param ingresoSVE_Visual
	 * @param medicas
	 * @param medicas_AudiometriaConfirmatoria
	 * @param medicas_CitologiaCervicoVaginal
	 * @param medicas_ContinuarManejoMedico
	 * @param medicas_ControlAnualOptometrico
	 * @param medicas_ControlAudilogicoAnual
	 * @param medicas_ControlAudilogicoPeriodico
	 * @param medicas_ControlAudilogicoSemestral
	 * @param medicas_ControlOdontologicoPeriodico
	 * @param medicas_EsquemaVacunacionAdulto
	 * @param medicas_ExamenesComplementarios
	 * @param medicas_Otros
	 * @param medicas_RemisionaEPS
	 * @param medicas_RemisionARP
	 * @param medicas_RemisionEPS
	 * @param medicas_SeguimientoCasoxARP
	 * @param medicas_TamizajeProstatico
	 * @param medicas_Valoracion_ControlORL
	 * @param ocupacionales
	 * @param ocupacionales_DistribucionFuerzasCargas
	 * @param ocupacionales_EPPAuditivo
	 * @param ocupacionales_HigienePostural
	 * @param ocupacionales_PausasActivas45min
	 * @param ocupacionales_ReposoAuditivoExtralaboral
	 * @param ocupacionales_RotaDiademaTelefonica
	 * @param ocupacionales_UsoDeEPP
	 * @param productosPracticos
	 * @param pruebasComplementarias
	 * @param recomendacionesAdicionales
	 * @param restricciones
	 * @param _fk_DocumentoMD
	 * @param _fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Recomendacion(String habitosEVS, String habitosEVS_ConducirVentanaCerrada,
			String habitosEVS_ControlNutricionalPeso, String habitosEVS_DejarDeFumar,
			String habitosEVS_InicioActividadFisica, String habitosEVS_ReducirConsumoAlcohol, String ingresoPVE,
			String ingresoSVE, String ingresoSVE_Biologico, String ingresoSVE_CardiovascularMetabolico,
			String ingresoSVE_Ergonomico, String ingresoSVE_Psicolaboral, String ingresoSVE_Ruido,
			String ingresoSVE_Visual, String medicas, String medicas_AudiometriaConfirmatoria,
			String medicas_CitologiaCervicoVaginal, String medicas_ContinuarManejoMedico,
			String medicas_ControlAnualOptometrico, String medicas_ControlAudilogicoAnual,
			String medicas_ControlAudilogicoPeriodico, String medicas_ControlAudilogicoSemestral,
			String medicas_ControlOdontologicoPeriodico, String medicas_EsquemaVacunacionAdulto,
			String medicas_ExamenesComplementarios, String medicas_Otros, String medicas_RemisionaEPS,
			String medicas_RemisionARP, String medicas_RemisionEPS, String medicas_SeguimientoCasoxARP,
			String medicas_TamizajeProstatico, String medicas_Valoracion_ControlORL, String ocupacionales,
			String ocupacionales_DistribucionFuerzasCargas, String ocupacionales_EPPAuditivo,
			String ocupacionales_HigienePostural, String ocupacionales_PausasActivas45min,
			String ocupacionales_ReposoAuditivoExtralaboral, String ocupacionales_RotaDiademaTelefonica,
			String ocupacionales_UsoDeEPP, String productosPracticos, String pruebasComplementarias,
			String recomendacionesAdicionales, String restricciones, int _fk_DocumentoMD, int _fk_IDT_DocumentoID,
			Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		HabitosEVS = habitosEVS;
		HabitosEVS_ConducirVentanaCerrada = habitosEVS_ConducirVentanaCerrada;
		HabitosEVS_ControlNutricionalPeso = habitosEVS_ControlNutricionalPeso;
		HabitosEVS_DejarDeFumar = habitosEVS_DejarDeFumar;
		HabitosEVS_InicioActividadFisica = habitosEVS_InicioActividadFisica;
		HabitosEVS_ReducirConsumoAlcohol = habitosEVS_ReducirConsumoAlcohol;
		IngresoPVE = ingresoPVE;
		IngresoSVE = ingresoSVE;
		IngresoSVE_Biologico = ingresoSVE_Biologico;
		IngresoSVE_CardiovascularMetabolico = ingresoSVE_CardiovascularMetabolico;
		IngresoSVE_Ergonomico = ingresoSVE_Ergonomico;
		IngresoSVE_Psicolaboral = ingresoSVE_Psicolaboral;
		IngresoSVE_Ruido = ingresoSVE_Ruido;
		IngresoSVE_Visual = ingresoSVE_Visual;
		Medicas = medicas;
		Medicas_AudiometriaConfirmatoria = medicas_AudiometriaConfirmatoria;
		Medicas_CitologiaCervicoVaginal = medicas_CitologiaCervicoVaginal;
		Medicas_ContinuarManejoMedico = medicas_ContinuarManejoMedico;
		Medicas_ControlAnualOptometrico = medicas_ControlAnualOptometrico;
		Medicas_ControlAudilogicoAnual = medicas_ControlAudilogicoAnual;
		Medicas_ControlAudilogicoPeriodico = medicas_ControlAudilogicoPeriodico;
		Medicas_ControlAudilogicoSemestral = medicas_ControlAudilogicoSemestral;
		Medicas_ControlOdontologicoPeriodico = medicas_ControlOdontologicoPeriodico;
		Medicas_EsquemaVacunacionAdulto = medicas_EsquemaVacunacionAdulto;
		Medicas_ExamenesComplementarios = medicas_ExamenesComplementarios;
		Medicas_Otros = medicas_Otros;
		Medicas_RemisionaEPS = medicas_RemisionaEPS;
		Medicas_RemisionARP = medicas_RemisionARP;
		Medicas_RemisionEPS = medicas_RemisionEPS;
		Medicas_SeguimientoCasoxARP = medicas_SeguimientoCasoxARP;
		Medicas_TamizajeProstatico = medicas_TamizajeProstatico;
		Medicas_Valoracion_ControlORL = medicas_Valoracion_ControlORL;
		Ocupacionales = ocupacionales;
		Ocupacionales_DistribucionFuerzasCargas = ocupacionales_DistribucionFuerzasCargas;
		Ocupacionales_EPPAuditivo = ocupacionales_EPPAuditivo;
		Ocupacionales_HigienePostural = ocupacionales_HigienePostural;
		Ocupacionales_PausasActivas45min = ocupacionales_PausasActivas45min;
		Ocupacionales_ReposoAuditivoExtralaboral = ocupacionales_ReposoAuditivoExtralaboral;
		Ocupacionales_RotaDiademaTelefonica = ocupacionales_RotaDiademaTelefonica;
		Ocupacionales_UsoDeEPP = ocupacionales_UsoDeEPP;
		ProductosPracticos = productosPracticos;
		PruebasComplementarias = pruebasComplementarias;
		RecomendacionesAdicionales = recomendacionesAdicionales;
		Restricciones = restricciones;
		this._fk_DocumentoMD = _fk_DocumentoMD;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

}
