/**
 * 
 */
package co.analicom.ws.modelo.hc;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class ExamenFisico {

	private String Abdomen, Abdomen_Descripcion, Abdomen_Hernias, BA_Calor_Cadera_D, BA_Calor_Cadera_I,
			BA_Calor_Codos_D, BA_Calor_Codos_I, BA_Calor_Dedos_Mano_D, BA_Calor_Dedos_Mano_I, BA_Calor_Dedos_Pie_D,
			BA_Calor_Dedos_Pie_I, BA_Calor_Hombros_D, BA_Calor_Hombros_I, BA_Calor_Munecas_D, BA_Calor_Munecas_I,
			BA_Calor_Rodilla_D, BA_Calor_Rodilla_I, BA_Calor_Tobillos_D, BA_Calor_Tobillos_I, BA_Deformidad_Cadera_D,
			BA_Deformidad_Cadera_I, BA_Deformidad_Codos_D, BA_Deformidad_Codos_I, BA_Deformidad_Dedos_Mano_D,
			BA_Deformidad_Dedos_Mano_I, BA_Deformidad_Dedos_Pie_D, BA_Deformidad_Dedos_Pie_I, BA_Deformidad_Hombros_D,
			BA_Deformidad_Hombros_I, BA_Deformidad_Munecas_D, BA_Deformidad_Munecas_I, BA_Deformidad_Rodilla_D,
			BA_Deformidad_Rodilla_I, BA_Deformidad_Tobillos_D, BA_Deformidad_Tobillos_I, BA_Dolor_Cadera_D,
			BA_Dolor_Cadera_I, BA_Dolor_Codos_D, BA_Dolor_Codos_I, BA_Dolor_Dedos_Mano_D, BA_Dolor_Dedos_Mano_I,
			BA_Dolor_Dedos_Pie_D, BA_Dolor_Dedos_Pie_I, BA_Dolor_Hombros_D, BA_Dolor_Hombros_I, BA_Dolor_Munecas_D,
			BA_Dolor_Munecas_I, BA_Dolor_Rodilla_D, BA_Dolor_Rodilla_I, BA_Dolor_Tobillos_D, BA_Dolor_Tobillos_I,
			BA_Edema_Cadera_D, BA_Edema_Cadera_I, BA_Edema_Codos_D, BA_Edema_Codos_I, BA_Edema_Dedos_Mano_D,
			BA_Edema_Dedos_Mano_I, BA_Edema_Dedos_Pie_D, BA_Edema_Dedos_Pie_I, BA_Edema_Hombros_D, BA_Edema_Hombros_I,
			BA_Edema_Munecas_D, BA_Edema_Munecas_I, BA_Edema_Rodilla_D, BA_Edema_Rodilla_I, BA_Edema_Tobillos_D,
			BA_Edema_Tobillos_I, BA_Explicacion, BA_Limitacion_Arcos_Cadera_D, BA_Limitacion_Arcos_Cadera_I,
			BA_Limitacion_Arcos_Codos_D, BA_Limitacion_Arcos_Codos_I, BA_Limitacion_Arcos_Dedos_Mano_D,
			BA_Limitacion_Arcos_Dedos_Mano_I, BA_Limitacion_Arcos_Dedos_Pie_D, BA_Limitacion_Arcos_Dedos_Pie_I,
			BA_Limitacion_Arcos_Hombros_D, BA_Limitacion_Arcos_Hombros_I, BA_Limitacion_Arcos_Munecas_D,
			BA_Limitacion_Arcos_Munecas_I, BA_Limitacion_Arcos_Rodilla_D, BA_Limitacion_Arcos_Rodilla_I,
			BA_Limitacion_Arcos_Tobillos_D, BA_Limitacion_Arcos_Tobillos_I, BA_Rubor_Cadera_D, BA_Rubor_Cadera_I,
			BA_Rubor_Codos_D, BA_Rubor_Codos_I, BA_Rubor_Dedos_Mano_D, BA_Rubor_Dedos_Mano_I, BA_Rubor_Dedos_Pie_D,
			BA_Rubor_Dedos_Pie_I, BA_Rubor_Hombros_D, BA_Rubor_Hombros_I, BA_Rubor_Munecas_D, BA_Rubor_Munecas_I,
			BA_Rubor_Rodilla_D, BA_Rubor_Rodilla_I, BA_Rubor_Tobillos_D, BA_Rubor_Tobillos_I, BA_Sensibilidad_Cadera_D,
			BA_Sensibilidad_Cadera_I, BA_Sensibilidad_Codos_D, BA_Sensibilidad_Codos_I, BA_Sensibilidad_Dedos_Mano_D,
			BA_Sensibilidad_Dedos_Mano_I, BA_Sensibilidad_Dedos_Pie_D, BA_Sensibilidad_Dedos_Pie_I,
			BA_Sensibilidad_Hombros_D, BA_Sensibilidad_Hombros_I, BA_Sensibilidad_Munecas_D, BA_Sensibilidad_Munecas_I,
			BA_Sensibilidad_Rodilla_D, BA_Sensibilidad_Rodilla_I, BA_Sensibilidad_Tobillos_D,
			BA_Sensibilidad_Tobillos_I, BM_Antebrazo, BM_Antebrazo_Observaciones, BM_Brazo, BM_Brazo_Observaciones,
			BM_Cadera_Gluteo, BM_Cadera_Gluteo_Observaciones, BM_Cintura_Escapular, BM_Cintura_Escapular_Observaciones,
			BM_Explicacion, BM_Muslos, BM_Muslos_Observaciones, BM_Pectoral, BM_Pectoral_Observaciones, BM_Piernas,
			BM_Piernas_Observaciones, CabezaCuello, CabezaCuello_Descripcion, Columna, ColumnaInspeccionCurvatura,
			ColumnaInspeccionCurvatura_Descripcion, ColumnaInspeccionSimetria, ColumnaInspeccionSimetria_Descripcion,
			ColumnaMarchaPuntas, ColumnaMarchaPuntas_Descripcion, ColumnaMarchaTalones,
			ColumnaMarchaTalones_Descripcion, ColumnaMovilidadExtension, ColumnaMovilidadExtension_Descripcion,
			ColumnaMovilidadFlexion, ColumnaMovilidadFlexion_Descripcion, ColumnaMovilidadFlexionLateral,
			ColumnaMovilidadFlexionLateral_Descripcion, ColumnaMovilidadRotacion, ColumnaMovilidadRotacion_Descripcion,
			ColumnaPalpacionDolor, ColumnaPalpacionDolor_Descripcion, ColumnaPalpacionEspasmo,
			ColumnaPalpacionEspasmo_Descripcion, ColumnaTrofismoMuscular, ColumnaTrofismoMuscular_Descripcion,
			Dominancia, EstadoGeneral, ExtremidadInferior, ExtremidadInferior_Descripcion, ExtremidadInferior_Juanetes,
			ExtremidadInferior_Observaciones, ExtremidadInferior_Varices, ExtremidadSuperior,
			ExtremidadSuperior_Descripcion, ExtremidadSuperior_FinkelsteinDerecho,
			ExtremidadSuperior_FinkelsteinIzquierdo, ExtremidadSuperior_PhalenDerecho,
			ExtremidadSuperior_PhalenIzquierdo, ExtremidadSuperior_TinelDerecho, ExtremidadSuperior_TinelIzquierdo,
			FondoOjoDerecho, FondoOjoIzquierdo, FondoOjos_Descripcion, GenitalesExternos, GenitalesExternos_Descripcion,
			GenitalesExternos_Hernias, Neurologico, Neurologico_Cordinacion_MarchaEnLinea,
			Neurologico_Cordinacion_Observaciones, Neurologico_Cordinacion_Romberg, Neurologico_EsferaMental,
			Neurologico_ParesCraneanos, Neurologico_Reflejos, Neurologico_Sensibilidad, Oidos, Oidos_Descripcion, Ojos,
			Ojos_Descripcion, Piel, Piel_Descripcion, PruebaVertibular, PruebaVertibular_descripcion, Psicologico,
			Psicometrico, PsicometricosObservaciones, RayosX, RayosX2, RayosXObservaciones, RayosXObservaciones2,
			Reflejos_Osteotendinosos_1, Reflejos_Osteotendinosos_2, Reflejos_Osteotendinosos_3,
			Reflejos_Osteotendinosos_4, Reflejos_Osteotendinosos_5, Reflejos_Osteotendinosos_6,
			Reflejos_Osteotendinosos_7, Reflejos_Osteotendinosos_8, RsCs, RsCs_Descripcion, RsRs, Senos, Shober,
			Shower_Descripcion, Torax, Wells, Wells_Descripcion;

	private int FC, fk_DocumentoMD, fk_IDT_DocumentoID, FR, Fuerza_1, Fuerza_2, Fuerza_3, Fuerza_4, Fuerza_5, Fuerza_6,
			Fuerza_7, Fuerza_8, PerimetroAbdominal, Peso, T, TAD, Talla, TAS;

	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public ExamenFisico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param abdomen
	 * @param abdomen_Descripcion
	 * @param abdomen_Hernias
	 * @param bA_Calor_Cadera_D
	 * @param bA_Calor_Cadera_I
	 * @param bA_Calor_Codos_D
	 * @param bA_Calor_Codos_I
	 * @param bA_Calor_Dedos_Mano_D
	 * @param bA_Calor_Dedos_Mano_I
	 * @param bA_Calor_Dedos_Pie_D
	 * @param bA_Calor_Dedos_Pie_I
	 * @param bA_Calor_Hombros_D
	 * @param bA_Calor_Hombros_I
	 * @param bA_Calor_Munecas_D
	 * @param bA_Calor_Munecas_I
	 * @param bA_Calor_Rodilla_D
	 * @param bA_Calor_Rodilla_I
	 * @param bA_Calor_Tobillos_D
	 * @param bA_Calor_Tobillos_I
	 * @param bA_Deformidad_Cadera_D
	 * @param bA_Deformidad_Cadera_I
	 * @param bA_Deformidad_Codos_D
	 * @param bA_Deformidad_Codos_I
	 * @param bA_Deformidad_Dedos_Mano_D
	 * @param bA_Deformidad_Dedos_Mano_I
	 * @param bA_Deformidad_Dedos_Pie_D
	 * @param bA_Deformidad_Dedos_Pie_I
	 * @param bA_Deformidad_Hombros_D
	 * @param bA_Deformidad_Hombros_I
	 * @param bA_Deformidad_Munecas_D
	 * @param bA_Deformidad_Munecas_I
	 * @param bA_Deformidad_Rodilla_D
	 * @param bA_Deformidad_Rodilla_I
	 * @param bA_Deformidad_Tobillos_D
	 * @param bA_Deformidad_Tobillos_I
	 * @param bA_Dolor_Cadera_D
	 * @param bA_Dolor_Cadera_I
	 * @param bA_Dolor_Codos_D
	 * @param bA_Dolor_Codos_I
	 * @param bA_Dolor_Dedos_Mano_D
	 * @param bA_Dolor_Dedos_Mano_I
	 * @param bA_Dolor_Dedos_Pie_D
	 * @param bA_Dolor_Dedos_Pie_I
	 * @param bA_Dolor_Hombros_D
	 * @param bA_Dolor_Hombros_I
	 * @param bA_Dolor_Munecas_D
	 * @param bA_Dolor_Munecas_I
	 * @param bA_Dolor_Rodilla_D
	 * @param bA_Dolor_Rodilla_I
	 * @param bA_Dolor_Tobillos_D
	 * @param bA_Dolor_Tobillos_I
	 * @param bA_Edema_Cadera_D
	 * @param bA_Edema_Cadera_I
	 * @param bA_Edema_Codos_D
	 * @param bA_Edema_Codos_I
	 * @param bA_Edema_Dedos_Mano_D
	 * @param bA_Edema_Dedos_Mano_I
	 * @param bA_Edema_Dedos_Pie_D
	 * @param bA_Edema_Dedos_Pie_I
	 * @param bA_Edema_Hombros_D
	 * @param bA_Edema_Hombros_I
	 * @param bA_Edema_Munecas_D
	 * @param bA_Edema_Munecas_I
	 * @param bA_Edema_Rodilla_D
	 * @param bA_Edema_Rodilla_I
	 * @param bA_Edema_Tobillos_D
	 * @param bA_Edema_Tobillos_I
	 * @param bA_Explicacion
	 * @param bA_Limitacion_Arcos_Cadera_D
	 * @param bA_Limitacion_Arcos_Cadera_I
	 * @param bA_Limitacion_Arcos_Codos_D
	 * @param bA_Limitacion_Arcos_Codos_I
	 * @param bA_Limitacion_Arcos_Dedos_Mano_D
	 * @param bA_Limitacion_Arcos_Dedos_Mano_I
	 * @param bA_Limitacion_Arcos_Dedos_Pie_D
	 * @param bA_Limitacion_Arcos_Dedos_Pie_I
	 * @param bA_Limitacion_Arcos_Hombros_D
	 * @param bA_Limitacion_Arcos_Hombros_I
	 * @param bA_Limitacion_Arcos_Munecas_D
	 * @param bA_Limitacion_Arcos_Munecas_I
	 * @param bA_Limitacion_Arcos_Rodilla_D
	 * @param bA_Limitacion_Arcos_Rodilla_I
	 * @param bA_Limitacion_Arcos_Tobillos_D
	 * @param bA_Limitacion_Arcos_Tobillos_I
	 * @param bA_Rubor_Cadera_D
	 * @param bA_Rubor_Cadera_I
	 * @param bA_Rubor_Codos_D
	 * @param bA_Rubor_Codos_I
	 * @param bA_Rubor_Dedos_Mano_D
	 * @param bA_Rubor_Dedos_Mano_I
	 * @param bA_Rubor_Dedos_Pie_D
	 * @param bA_Rubor_Dedos_Pie_I
	 * @param bA_Rubor_Hombros_D
	 * @param bA_Rubor_Hombros_I
	 * @param bA_Rubor_Munecas_D
	 * @param bA_Rubor_Munecas_I
	 * @param bA_Rubor_Rodilla_D
	 * @param bA_Rubor_Rodilla_I
	 * @param bA_Rubor_Tobillos_D
	 * @param bA_Rubor_Tobillos_I
	 * @param bA_Sensibilidad_Cadera_D
	 * @param bA_Sensibilidad_Cadera_I
	 * @param bA_Sensibilidad_Codos_D
	 * @param bA_Sensibilidad_Codos_I
	 * @param bA_Sensibilidad_Dedos_Mano_D
	 * @param bA_Sensibilidad_Dedos_Mano_I
	 * @param bA_Sensibilidad_Dedos_Pie_D
	 * @param bA_Sensibilidad_Dedos_Pie_I
	 * @param bA_Sensibilidad_Hombros_D
	 * @param bA_Sensibilidad_Hombros_I
	 * @param bA_Sensibilidad_Munecas_D
	 * @param bA_Sensibilidad_Munecas_I
	 * @param bA_Sensibilidad_Rodilla_D
	 * @param bA_Sensibilidad_Rodilla_I
	 * @param bA_Sensibilidad_Tobillos_D
	 * @param bA_Sensibilidad_Tobillos_I
	 * @param bM_Antebrazo
	 * @param bM_Antebrazo_Observaciones
	 * @param bM_Brazo
	 * @param bM_Brazo_Observaciones
	 * @param bM_Cadera_Gluteo
	 * @param bM_Cadera_Gluteo_Observaciones
	 * @param bM_Cintura_Escapular
	 * @param bM_Cintura_Escapular_Observaciones
	 * @param bM_Explicacion
	 * @param bM_Muslos
	 * @param bM_Muslos_Observaciones
	 * @param bM_Pectoral
	 * @param bM_Pectoral_Observaciones
	 * @param bM_Piernas
	 * @param bM_Piernas_Observaciones
	 * @param cabezaCuello
	 * @param cabezaCuello_Descripcion
	 * @param columna
	 * @param columnaInspeccionCurvatura
	 * @param columnaInspeccionCurvatura_Descripcion
	 * @param columnaInspeccionSimetria
	 * @param columnaInspeccionSimetria_Descripcion
	 * @param columnaMarchaPuntas
	 * @param columnaMarchaPuntas_Descripcion
	 * @param columnaMarchaTalones
	 * @param columnaMarchaTalones_Descripcion
	 * @param columnaMovilidadExtension
	 * @param columnaMovilidadExtension_Descripcion
	 * @param columnaMovilidadFlexion
	 * @param columnaMovilidadFlexion_Descripcion
	 * @param columnaMovilidadFlexionLateral
	 * @param columnaMovilidadFlexionLateral_Descripcion
	 * @param columnaMovilidadRotacion
	 * @param columnaMovilidadRotacion_Descripcion
	 * @param columnaPalpacionDolor
	 * @param columnaPalpacionDolor_Descripcion
	 * @param columnaPalpacionEspasmo
	 * @param columnaPalpacionEspasmo_Descripcion
	 * @param columnaTrofismoMuscular
	 * @param columnaTrofismoMuscular_Descripcion
	 * @param dominancia
	 * @param estadoGeneral
	 * @param extremidadInferior
	 * @param extremidadInferior_Descripcion
	 * @param extremidadInferior_Juanetes
	 * @param extremidadInferior_Observaciones
	 * @param extremidadInferior_Varices
	 * @param extremidadSuperior
	 * @param extremidadSuperior_Descripcion
	 * @param extremidadSuperior_FinkelsteinDerecho
	 * @param extremidadSuperior_FinkelsteinIzquierdo
	 * @param extremidadSuperior_PhalenDerecho
	 * @param extremidadSuperior_PhalenIzquierdo
	 * @param extremidadSuperior_TinelDerecho
	 * @param extremidadSuperior_TinelIzquierdo
	 * @param fondoOjoDerecho
	 * @param fondoOjoIzquierdo
	 * @param fondoOjos_Descripcion
	 * @param genitalesExternos
	 * @param genitalesExternos_Descripcion
	 * @param genitalesExternos_Hernias
	 * @param neurologico
	 * @param neurologico_Cordinacion_MarchaEnLinea
	 * @param neurologico_Cordinacion_Observaciones
	 * @param neurologico_Cordinacion_Romberg
	 * @param neurologico_EsferaMental
	 * @param neurologico_ParesCraneanos
	 * @param neurologico_Reflejos
	 * @param neurologico_Sensibilidad
	 * @param oidos
	 * @param oidos_Descripcion
	 * @param ojos
	 * @param ojos_Descripcion
	 * @param piel
	 * @param piel_Descripcion
	 * @param pruebaVertibular
	 * @param pruebaVertibular_descripcion
	 * @param psicologico
	 * @param psicometrico
	 * @param psicometricosObservaciones
	 * @param rayosX
	 * @param rayosX2
	 * @param rayosXObservaciones
	 * @param rayosXObservaciones2
	 * @param reflejos_Osteotendinosos_1
	 * @param reflejos_Osteotendinosos_2
	 * @param reflejos_Osteotendinosos_3
	 * @param reflejos_Osteotendinosos_4
	 * @param reflejos_Osteotendinosos_5
	 * @param reflejos_Osteotendinosos_6
	 * @param reflejos_Osteotendinosos_7
	 * @param reflejos_Osteotendinosos_8
	 * @param rsCs
	 * @param rsCs_Descripcion
	 * @param rsRs
	 * @param senos
	 * @param shober
	 * @param shower_Descripcion
	 * @param torax
	 * @param wells
	 * @param wells_Descripcion
	 * @param fC
	 * @param fk_DocumentoMD
	 * @param fk_IDT_DocumentoID
	 * @param fR
	 * @param fuerza_1
	 * @param fuerza_2
	 * @param fuerza_3
	 * @param fuerza_4
	 * @param fuerza_5
	 * @param fuerza_6
	 * @param fuerza_7
	 * @param fuerza_8
	 * @param perimetroAbdominal
	 * @param peso
	 * @param t
	 * @param tAD
	 * @param talla
	 * @param tAS
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public ExamenFisico(String abdomen, String abdomen_Descripcion, String abdomen_Hernias, String bA_Calor_Cadera_D,
			String bA_Calor_Cadera_I, String bA_Calor_Codos_D, String bA_Calor_Codos_I, String bA_Calor_Dedos_Mano_D,
			String bA_Calor_Dedos_Mano_I, String bA_Calor_Dedos_Pie_D, String bA_Calor_Dedos_Pie_I,
			String bA_Calor_Hombros_D, String bA_Calor_Hombros_I, String bA_Calor_Munecas_D, String bA_Calor_Munecas_I,
			String bA_Calor_Rodilla_D, String bA_Calor_Rodilla_I, String bA_Calor_Tobillos_D,
			String bA_Calor_Tobillos_I, String bA_Deformidad_Cadera_D, String bA_Deformidad_Cadera_I,
			String bA_Deformidad_Codos_D, String bA_Deformidad_Codos_I, String bA_Deformidad_Dedos_Mano_D,
			String bA_Deformidad_Dedos_Mano_I, String bA_Deformidad_Dedos_Pie_D, String bA_Deformidad_Dedos_Pie_I,
			String bA_Deformidad_Hombros_D, String bA_Deformidad_Hombros_I, String bA_Deformidad_Munecas_D,
			String bA_Deformidad_Munecas_I, String bA_Deformidad_Rodilla_D, String bA_Deformidad_Rodilla_I,
			String bA_Deformidad_Tobillos_D, String bA_Deformidad_Tobillos_I, String bA_Dolor_Cadera_D,
			String bA_Dolor_Cadera_I, String bA_Dolor_Codos_D, String bA_Dolor_Codos_I, String bA_Dolor_Dedos_Mano_D,
			String bA_Dolor_Dedos_Mano_I, String bA_Dolor_Dedos_Pie_D, String bA_Dolor_Dedos_Pie_I,
			String bA_Dolor_Hombros_D, String bA_Dolor_Hombros_I, String bA_Dolor_Munecas_D, String bA_Dolor_Munecas_I,
			String bA_Dolor_Rodilla_D, String bA_Dolor_Rodilla_I, String bA_Dolor_Tobillos_D,
			String bA_Dolor_Tobillos_I, String bA_Edema_Cadera_D, String bA_Edema_Cadera_I, String bA_Edema_Codos_D,
			String bA_Edema_Codos_I, String bA_Edema_Dedos_Mano_D, String bA_Edema_Dedos_Mano_I,
			String bA_Edema_Dedos_Pie_D, String bA_Edema_Dedos_Pie_I, String bA_Edema_Hombros_D,
			String bA_Edema_Hombros_I, String bA_Edema_Munecas_D, String bA_Edema_Munecas_I, String bA_Edema_Rodilla_D,
			String bA_Edema_Rodilla_I, String bA_Edema_Tobillos_D, String bA_Edema_Tobillos_I, String bA_Explicacion,
			String bA_Limitacion_Arcos_Cadera_D, String bA_Limitacion_Arcos_Cadera_I,
			String bA_Limitacion_Arcos_Codos_D, String bA_Limitacion_Arcos_Codos_I,
			String bA_Limitacion_Arcos_Dedos_Mano_D, String bA_Limitacion_Arcos_Dedos_Mano_I,
			String bA_Limitacion_Arcos_Dedos_Pie_D, String bA_Limitacion_Arcos_Dedos_Pie_I,
			String bA_Limitacion_Arcos_Hombros_D, String bA_Limitacion_Arcos_Hombros_I,
			String bA_Limitacion_Arcos_Munecas_D, String bA_Limitacion_Arcos_Munecas_I,
			String bA_Limitacion_Arcos_Rodilla_D, String bA_Limitacion_Arcos_Rodilla_I,
			String bA_Limitacion_Arcos_Tobillos_D, String bA_Limitacion_Arcos_Tobillos_I, String bA_Rubor_Cadera_D,
			String bA_Rubor_Cadera_I, String bA_Rubor_Codos_D, String bA_Rubor_Codos_I, String bA_Rubor_Dedos_Mano_D,
			String bA_Rubor_Dedos_Mano_I, String bA_Rubor_Dedos_Pie_D, String bA_Rubor_Dedos_Pie_I,
			String bA_Rubor_Hombros_D, String bA_Rubor_Hombros_I, String bA_Rubor_Munecas_D, String bA_Rubor_Munecas_I,
			String bA_Rubor_Rodilla_D, String bA_Rubor_Rodilla_I, String bA_Rubor_Tobillos_D,
			String bA_Rubor_Tobillos_I, String bA_Sensibilidad_Cadera_D, String bA_Sensibilidad_Cadera_I,
			String bA_Sensibilidad_Codos_D, String bA_Sensibilidad_Codos_I, String bA_Sensibilidad_Dedos_Mano_D,
			String bA_Sensibilidad_Dedos_Mano_I, String bA_Sensibilidad_Dedos_Pie_D, String bA_Sensibilidad_Dedos_Pie_I,
			String bA_Sensibilidad_Hombros_D, String bA_Sensibilidad_Hombros_I, String bA_Sensibilidad_Munecas_D,
			String bA_Sensibilidad_Munecas_I, String bA_Sensibilidad_Rodilla_D, String bA_Sensibilidad_Rodilla_I,
			String bA_Sensibilidad_Tobillos_D, String bA_Sensibilidad_Tobillos_I, String bM_Antebrazo,
			String bM_Antebrazo_Observaciones, String bM_Brazo, String bM_Brazo_Observaciones, String bM_Cadera_Gluteo,
			String bM_Cadera_Gluteo_Observaciones, String bM_Cintura_Escapular,
			String bM_Cintura_Escapular_Observaciones, String bM_Explicacion, String bM_Muslos,
			String bM_Muslos_Observaciones, String bM_Pectoral, String bM_Pectoral_Observaciones, String bM_Piernas,
			String bM_Piernas_Observaciones, String cabezaCuello, String cabezaCuello_Descripcion, String columna,
			String columnaInspeccionCurvatura, String columnaInspeccionCurvatura_Descripcion,
			String columnaInspeccionSimetria, String columnaInspeccionSimetria_Descripcion, String columnaMarchaPuntas,
			String columnaMarchaPuntas_Descripcion, String columnaMarchaTalones,
			String columnaMarchaTalones_Descripcion, String columnaMovilidadExtension,
			String columnaMovilidadExtension_Descripcion, String columnaMovilidadFlexion,
			String columnaMovilidadFlexion_Descripcion, String columnaMovilidadFlexionLateral,
			String columnaMovilidadFlexionLateral_Descripcion, String columnaMovilidadRotacion,
			String columnaMovilidadRotacion_Descripcion, String columnaPalpacionDolor,
			String columnaPalpacionDolor_Descripcion, String columnaPalpacionEspasmo,
			String columnaPalpacionEspasmo_Descripcion, String columnaTrofismoMuscular,
			String columnaTrofismoMuscular_Descripcion, String dominancia, String estadoGeneral,
			String extremidadInferior, String extremidadInferior_Descripcion, String extremidadInferior_Juanetes,
			String extremidadInferior_Observaciones, String extremidadInferior_Varices, String extremidadSuperior,
			String extremidadSuperior_Descripcion, String extremidadSuperior_FinkelsteinDerecho,
			String extremidadSuperior_FinkelsteinIzquierdo, String extremidadSuperior_PhalenDerecho,
			String extremidadSuperior_PhalenIzquierdo, String extremidadSuperior_TinelDerecho,
			String extremidadSuperior_TinelIzquierdo, String fondoOjoDerecho, String fondoOjoIzquierdo,
			String fondoOjos_Descripcion, String genitalesExternos, String genitalesExternos_Descripcion,
			String genitalesExternos_Hernias, String neurologico, String neurologico_Cordinacion_MarchaEnLinea,
			String neurologico_Cordinacion_Observaciones, String neurologico_Cordinacion_Romberg,
			String neurologico_EsferaMental, String neurologico_ParesCraneanos, String neurologico_Reflejos,
			String neurologico_Sensibilidad, String oidos, String oidos_Descripcion, String ojos,
			String ojos_Descripcion, String piel, String piel_Descripcion, String pruebaVertibular,
			String pruebaVertibular_descripcion, String psicologico, String psicometrico,
			String psicometricosObservaciones, String rayosX, String rayosX2, String rayosXObservaciones,
			String rayosXObservaciones2, String reflejos_Osteotendinosos_1, String reflejos_Osteotendinosos_2,
			String reflejos_Osteotendinosos_3, String reflejos_Osteotendinosos_4, String reflejos_Osteotendinosos_5,
			String reflejos_Osteotendinosos_6, String reflejos_Osteotendinosos_7, String reflejos_Osteotendinosos_8,
			String rsCs, String rsCs_Descripcion, String rsRs, String senos, String shober, String shower_Descripcion,
			String torax, String wells, String wells_Descripcion, int fC, int fk_DocumentoMD, int fk_IDT_DocumentoID,
			int fR, int fuerza_1, int fuerza_2, int fuerza_3, int fuerza_4, int fuerza_5, int fuerza_6, int fuerza_7,
			int fuerza_8, int perimetroAbdominal, int peso, int t, int tAD, int talla, int tAS,
			Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Abdomen = abdomen;
		Abdomen_Descripcion = abdomen_Descripcion;
		Abdomen_Hernias = abdomen_Hernias;
		BA_Calor_Cadera_D = bA_Calor_Cadera_D;
		BA_Calor_Cadera_I = bA_Calor_Cadera_I;
		BA_Calor_Codos_D = bA_Calor_Codos_D;
		BA_Calor_Codos_I = bA_Calor_Codos_I;
		BA_Calor_Dedos_Mano_D = bA_Calor_Dedos_Mano_D;
		BA_Calor_Dedos_Mano_I = bA_Calor_Dedos_Mano_I;
		BA_Calor_Dedos_Pie_D = bA_Calor_Dedos_Pie_D;
		BA_Calor_Dedos_Pie_I = bA_Calor_Dedos_Pie_I;
		BA_Calor_Hombros_D = bA_Calor_Hombros_D;
		BA_Calor_Hombros_I = bA_Calor_Hombros_I;
		BA_Calor_Munecas_D = bA_Calor_Munecas_D;
		BA_Calor_Munecas_I = bA_Calor_Munecas_I;
		BA_Calor_Rodilla_D = bA_Calor_Rodilla_D;
		BA_Calor_Rodilla_I = bA_Calor_Rodilla_I;
		BA_Calor_Tobillos_D = bA_Calor_Tobillos_D;
		BA_Calor_Tobillos_I = bA_Calor_Tobillos_I;
		BA_Deformidad_Cadera_D = bA_Deformidad_Cadera_D;
		BA_Deformidad_Cadera_I = bA_Deformidad_Cadera_I;
		BA_Deformidad_Codos_D = bA_Deformidad_Codos_D;
		BA_Deformidad_Codos_I = bA_Deformidad_Codos_I;
		BA_Deformidad_Dedos_Mano_D = bA_Deformidad_Dedos_Mano_D;
		BA_Deformidad_Dedos_Mano_I = bA_Deformidad_Dedos_Mano_I;
		BA_Deformidad_Dedos_Pie_D = bA_Deformidad_Dedos_Pie_D;
		BA_Deformidad_Dedos_Pie_I = bA_Deformidad_Dedos_Pie_I;
		BA_Deformidad_Hombros_D = bA_Deformidad_Hombros_D;
		BA_Deformidad_Hombros_I = bA_Deformidad_Hombros_I;
		BA_Deformidad_Munecas_D = bA_Deformidad_Munecas_D;
		BA_Deformidad_Munecas_I = bA_Deformidad_Munecas_I;
		BA_Deformidad_Rodilla_D = bA_Deformidad_Rodilla_D;
		BA_Deformidad_Rodilla_I = bA_Deformidad_Rodilla_I;
		BA_Deformidad_Tobillos_D = bA_Deformidad_Tobillos_D;
		BA_Deformidad_Tobillos_I = bA_Deformidad_Tobillos_I;
		BA_Dolor_Cadera_D = bA_Dolor_Cadera_D;
		BA_Dolor_Cadera_I = bA_Dolor_Cadera_I;
		BA_Dolor_Codos_D = bA_Dolor_Codos_D;
		BA_Dolor_Codos_I = bA_Dolor_Codos_I;
		BA_Dolor_Dedos_Mano_D = bA_Dolor_Dedos_Mano_D;
		BA_Dolor_Dedos_Mano_I = bA_Dolor_Dedos_Mano_I;
		BA_Dolor_Dedos_Pie_D = bA_Dolor_Dedos_Pie_D;
		BA_Dolor_Dedos_Pie_I = bA_Dolor_Dedos_Pie_I;
		BA_Dolor_Hombros_D = bA_Dolor_Hombros_D;
		BA_Dolor_Hombros_I = bA_Dolor_Hombros_I;
		BA_Dolor_Munecas_D = bA_Dolor_Munecas_D;
		BA_Dolor_Munecas_I = bA_Dolor_Munecas_I;
		BA_Dolor_Rodilla_D = bA_Dolor_Rodilla_D;
		BA_Dolor_Rodilla_I = bA_Dolor_Rodilla_I;
		BA_Dolor_Tobillos_D = bA_Dolor_Tobillos_D;
		BA_Dolor_Tobillos_I = bA_Dolor_Tobillos_I;
		BA_Edema_Cadera_D = bA_Edema_Cadera_D;
		BA_Edema_Cadera_I = bA_Edema_Cadera_I;
		BA_Edema_Codos_D = bA_Edema_Codos_D;
		BA_Edema_Codos_I = bA_Edema_Codos_I;
		BA_Edema_Dedos_Mano_D = bA_Edema_Dedos_Mano_D;
		BA_Edema_Dedos_Mano_I = bA_Edema_Dedos_Mano_I;
		BA_Edema_Dedos_Pie_D = bA_Edema_Dedos_Pie_D;
		BA_Edema_Dedos_Pie_I = bA_Edema_Dedos_Pie_I;
		BA_Edema_Hombros_D = bA_Edema_Hombros_D;
		BA_Edema_Hombros_I = bA_Edema_Hombros_I;
		BA_Edema_Munecas_D = bA_Edema_Munecas_D;
		BA_Edema_Munecas_I = bA_Edema_Munecas_I;
		BA_Edema_Rodilla_D = bA_Edema_Rodilla_D;
		BA_Edema_Rodilla_I = bA_Edema_Rodilla_I;
		BA_Edema_Tobillos_D = bA_Edema_Tobillos_D;
		BA_Edema_Tobillos_I = bA_Edema_Tobillos_I;
		BA_Explicacion = bA_Explicacion;
		BA_Limitacion_Arcos_Cadera_D = bA_Limitacion_Arcos_Cadera_D;
		BA_Limitacion_Arcos_Cadera_I = bA_Limitacion_Arcos_Cadera_I;
		BA_Limitacion_Arcos_Codos_D = bA_Limitacion_Arcos_Codos_D;
		BA_Limitacion_Arcos_Codos_I = bA_Limitacion_Arcos_Codos_I;
		BA_Limitacion_Arcos_Dedos_Mano_D = bA_Limitacion_Arcos_Dedos_Mano_D;
		BA_Limitacion_Arcos_Dedos_Mano_I = bA_Limitacion_Arcos_Dedos_Mano_I;
		BA_Limitacion_Arcos_Dedos_Pie_D = bA_Limitacion_Arcos_Dedos_Pie_D;
		BA_Limitacion_Arcos_Dedos_Pie_I = bA_Limitacion_Arcos_Dedos_Pie_I;
		BA_Limitacion_Arcos_Hombros_D = bA_Limitacion_Arcos_Hombros_D;
		BA_Limitacion_Arcos_Hombros_I = bA_Limitacion_Arcos_Hombros_I;
		BA_Limitacion_Arcos_Munecas_D = bA_Limitacion_Arcos_Munecas_D;
		BA_Limitacion_Arcos_Munecas_I = bA_Limitacion_Arcos_Munecas_I;
		BA_Limitacion_Arcos_Rodilla_D = bA_Limitacion_Arcos_Rodilla_D;
		BA_Limitacion_Arcos_Rodilla_I = bA_Limitacion_Arcos_Rodilla_I;
		BA_Limitacion_Arcos_Tobillos_D = bA_Limitacion_Arcos_Tobillos_D;
		BA_Limitacion_Arcos_Tobillos_I = bA_Limitacion_Arcos_Tobillos_I;
		BA_Rubor_Cadera_D = bA_Rubor_Cadera_D;
		BA_Rubor_Cadera_I = bA_Rubor_Cadera_I;
		BA_Rubor_Codos_D = bA_Rubor_Codos_D;
		BA_Rubor_Codos_I = bA_Rubor_Codos_I;
		BA_Rubor_Dedos_Mano_D = bA_Rubor_Dedos_Mano_D;
		BA_Rubor_Dedos_Mano_I = bA_Rubor_Dedos_Mano_I;
		BA_Rubor_Dedos_Pie_D = bA_Rubor_Dedos_Pie_D;
		BA_Rubor_Dedos_Pie_I = bA_Rubor_Dedos_Pie_I;
		BA_Rubor_Hombros_D = bA_Rubor_Hombros_D;
		BA_Rubor_Hombros_I = bA_Rubor_Hombros_I;
		BA_Rubor_Munecas_D = bA_Rubor_Munecas_D;
		BA_Rubor_Munecas_I = bA_Rubor_Munecas_I;
		BA_Rubor_Rodilla_D = bA_Rubor_Rodilla_D;
		BA_Rubor_Rodilla_I = bA_Rubor_Rodilla_I;
		BA_Rubor_Tobillos_D = bA_Rubor_Tobillos_D;
		BA_Rubor_Tobillos_I = bA_Rubor_Tobillos_I;
		BA_Sensibilidad_Cadera_D = bA_Sensibilidad_Cadera_D;
		BA_Sensibilidad_Cadera_I = bA_Sensibilidad_Cadera_I;
		BA_Sensibilidad_Codos_D = bA_Sensibilidad_Codos_D;
		BA_Sensibilidad_Codos_I = bA_Sensibilidad_Codos_I;
		BA_Sensibilidad_Dedos_Mano_D = bA_Sensibilidad_Dedos_Mano_D;
		BA_Sensibilidad_Dedos_Mano_I = bA_Sensibilidad_Dedos_Mano_I;
		BA_Sensibilidad_Dedos_Pie_D = bA_Sensibilidad_Dedos_Pie_D;
		BA_Sensibilidad_Dedos_Pie_I = bA_Sensibilidad_Dedos_Pie_I;
		BA_Sensibilidad_Hombros_D = bA_Sensibilidad_Hombros_D;
		BA_Sensibilidad_Hombros_I = bA_Sensibilidad_Hombros_I;
		BA_Sensibilidad_Munecas_D = bA_Sensibilidad_Munecas_D;
		BA_Sensibilidad_Munecas_I = bA_Sensibilidad_Munecas_I;
		BA_Sensibilidad_Rodilla_D = bA_Sensibilidad_Rodilla_D;
		BA_Sensibilidad_Rodilla_I = bA_Sensibilidad_Rodilla_I;
		BA_Sensibilidad_Tobillos_D = bA_Sensibilidad_Tobillos_D;
		BA_Sensibilidad_Tobillos_I = bA_Sensibilidad_Tobillos_I;
		BM_Antebrazo = bM_Antebrazo;
		BM_Antebrazo_Observaciones = bM_Antebrazo_Observaciones;
		BM_Brazo = bM_Brazo;
		BM_Brazo_Observaciones = bM_Brazo_Observaciones;
		BM_Cadera_Gluteo = bM_Cadera_Gluteo;
		BM_Cadera_Gluteo_Observaciones = bM_Cadera_Gluteo_Observaciones;
		BM_Cintura_Escapular = bM_Cintura_Escapular;
		BM_Cintura_Escapular_Observaciones = bM_Cintura_Escapular_Observaciones;
		BM_Explicacion = bM_Explicacion;
		BM_Muslos = bM_Muslos;
		BM_Muslos_Observaciones = bM_Muslos_Observaciones;
		BM_Pectoral = bM_Pectoral;
		BM_Pectoral_Observaciones = bM_Pectoral_Observaciones;
		BM_Piernas = bM_Piernas;
		BM_Piernas_Observaciones = bM_Piernas_Observaciones;
		CabezaCuello = cabezaCuello;
		CabezaCuello_Descripcion = cabezaCuello_Descripcion;
		Columna = columna;
		ColumnaInspeccionCurvatura = columnaInspeccionCurvatura;
		ColumnaInspeccionCurvatura_Descripcion = columnaInspeccionCurvatura_Descripcion;
		ColumnaInspeccionSimetria = columnaInspeccionSimetria;
		ColumnaInspeccionSimetria_Descripcion = columnaInspeccionSimetria_Descripcion;
		ColumnaMarchaPuntas = columnaMarchaPuntas;
		ColumnaMarchaPuntas_Descripcion = columnaMarchaPuntas_Descripcion;
		ColumnaMarchaTalones = columnaMarchaTalones;
		ColumnaMarchaTalones_Descripcion = columnaMarchaTalones_Descripcion;
		ColumnaMovilidadExtension = columnaMovilidadExtension;
		ColumnaMovilidadExtension_Descripcion = columnaMovilidadExtension_Descripcion;
		ColumnaMovilidadFlexion = columnaMovilidadFlexion;
		ColumnaMovilidadFlexion_Descripcion = columnaMovilidadFlexion_Descripcion;
		ColumnaMovilidadFlexionLateral = columnaMovilidadFlexionLateral;
		ColumnaMovilidadFlexionLateral_Descripcion = columnaMovilidadFlexionLateral_Descripcion;
		ColumnaMovilidadRotacion = columnaMovilidadRotacion;
		ColumnaMovilidadRotacion_Descripcion = columnaMovilidadRotacion_Descripcion;
		ColumnaPalpacionDolor = columnaPalpacionDolor;
		ColumnaPalpacionDolor_Descripcion = columnaPalpacionDolor_Descripcion;
		ColumnaPalpacionEspasmo = columnaPalpacionEspasmo;
		ColumnaPalpacionEspasmo_Descripcion = columnaPalpacionEspasmo_Descripcion;
		ColumnaTrofismoMuscular = columnaTrofismoMuscular;
		ColumnaTrofismoMuscular_Descripcion = columnaTrofismoMuscular_Descripcion;
		Dominancia = dominancia;
		EstadoGeneral = estadoGeneral;
		ExtremidadInferior = extremidadInferior;
		ExtremidadInferior_Descripcion = extremidadInferior_Descripcion;
		ExtremidadInferior_Juanetes = extremidadInferior_Juanetes;
		ExtremidadInferior_Observaciones = extremidadInferior_Observaciones;
		ExtremidadInferior_Varices = extremidadInferior_Varices;
		ExtremidadSuperior = extremidadSuperior;
		ExtremidadSuperior_Descripcion = extremidadSuperior_Descripcion;
		ExtremidadSuperior_FinkelsteinDerecho = extremidadSuperior_FinkelsteinDerecho;
		ExtremidadSuperior_FinkelsteinIzquierdo = extremidadSuperior_FinkelsteinIzquierdo;
		ExtremidadSuperior_PhalenDerecho = extremidadSuperior_PhalenDerecho;
		ExtremidadSuperior_PhalenIzquierdo = extremidadSuperior_PhalenIzquierdo;
		ExtremidadSuperior_TinelDerecho = extremidadSuperior_TinelDerecho;
		ExtremidadSuperior_TinelIzquierdo = extremidadSuperior_TinelIzquierdo;
		FondoOjoDerecho = fondoOjoDerecho;
		FondoOjoIzquierdo = fondoOjoIzquierdo;
		FondoOjos_Descripcion = fondoOjos_Descripcion;
		GenitalesExternos = genitalesExternos;
		GenitalesExternos_Descripcion = genitalesExternos_Descripcion;
		GenitalesExternos_Hernias = genitalesExternos_Hernias;
		Neurologico = neurologico;
		Neurologico_Cordinacion_MarchaEnLinea = neurologico_Cordinacion_MarchaEnLinea;
		Neurologico_Cordinacion_Observaciones = neurologico_Cordinacion_Observaciones;
		Neurologico_Cordinacion_Romberg = neurologico_Cordinacion_Romberg;
		Neurologico_EsferaMental = neurologico_EsferaMental;
		Neurologico_ParesCraneanos = neurologico_ParesCraneanos;
		Neurologico_Reflejos = neurologico_Reflejos;
		Neurologico_Sensibilidad = neurologico_Sensibilidad;
		Oidos = oidos;
		Oidos_Descripcion = oidos_Descripcion;
		Ojos = ojos;
		Ojos_Descripcion = ojos_Descripcion;
		Piel = piel;
		Piel_Descripcion = piel_Descripcion;
		PruebaVertibular = pruebaVertibular;
		PruebaVertibular_descripcion = pruebaVertibular_descripcion;
		Psicologico = psicologico;
		Psicometrico = psicometrico;
		PsicometricosObservaciones = psicometricosObservaciones;
		RayosX = rayosX;
		RayosX2 = rayosX2;
		RayosXObservaciones = rayosXObservaciones;
		RayosXObservaciones2 = rayosXObservaciones2;
		Reflejos_Osteotendinosos_1 = reflejos_Osteotendinosos_1;
		Reflejos_Osteotendinosos_2 = reflejos_Osteotendinosos_2;
		Reflejos_Osteotendinosos_3 = reflejos_Osteotendinosos_3;
		Reflejos_Osteotendinosos_4 = reflejos_Osteotendinosos_4;
		Reflejos_Osteotendinosos_5 = reflejos_Osteotendinosos_5;
		Reflejos_Osteotendinosos_6 = reflejos_Osteotendinosos_6;
		Reflejos_Osteotendinosos_7 = reflejos_Osteotendinosos_7;
		Reflejos_Osteotendinosos_8 = reflejos_Osteotendinosos_8;
		RsCs = rsCs;
		RsCs_Descripcion = rsCs_Descripcion;
		RsRs = rsRs;
		Senos = senos;
		Shober = shober;
		Shower_Descripcion = shower_Descripcion;
		Torax = torax;
		Wells = wells;
		Wells_Descripcion = wells_Descripcion;
		FC = fC;
		this.fk_DocumentoMD = fk_DocumentoMD;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		FR = fR;
		Fuerza_1 = fuerza_1;
		Fuerza_2 = fuerza_2;
		Fuerza_3 = fuerza_3;
		Fuerza_4 = fuerza_4;
		Fuerza_5 = fuerza_5;
		Fuerza_6 = fuerza_6;
		Fuerza_7 = fuerza_7;
		Fuerza_8 = fuerza_8;
		PerimetroAbdominal = perimetroAbdominal;
		Peso = peso;
		T = t;
		TAD = tAD;
		Talla = talla;
		TAS = tAS;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the abdomen
	 */
	public String getAbdomen() {
		return Abdomen;
	}

	/**
	 * @param abdomen
	 *            the abdomen to set
	 */
	public void setAbdomen(String abdomen) {
		Abdomen = abdomen;
	}

	/**
	 * @return the abdomen_Descripcion
	 */
	public String getAbdomen_Descripcion() {
		return Abdomen_Descripcion;
	}

	/**
	 * @param abdomen_Descripcion
	 *            the abdomen_Descripcion to set
	 */
	public void setAbdomen_Descripcion(String abdomen_Descripcion) {
		Abdomen_Descripcion = abdomen_Descripcion;
	}

	/**
	 * @return the abdomen_Hernias
	 */
	public String getAbdomen_Hernias() {
		return Abdomen_Hernias;
	}

	/**
	 * @param abdomen_Hernias
	 *            the abdomen_Hernias to set
	 */
	public void setAbdomen_Hernias(String abdomen_Hernias) {
		Abdomen_Hernias = abdomen_Hernias;
	}

	/**
	 * @return the bA_Calor_Cadera_D
	 */
	public String getBA_Calor_Cadera_D() {
		return BA_Calor_Cadera_D;
	}

	/**
	 * @param bA_Calor_Cadera_D
	 *            the bA_Calor_Cadera_D to set
	 */
	public void setBA_Calor_Cadera_D(String bA_Calor_Cadera_D) {
		BA_Calor_Cadera_D = bA_Calor_Cadera_D;
	}

	/**
	 * @return the bA_Calor_Cadera_I
	 */
	public String getBA_Calor_Cadera_I() {
		return BA_Calor_Cadera_I;
	}

	/**
	 * @param bA_Calor_Cadera_I
	 *            the bA_Calor_Cadera_I to set
	 */
	public void setBA_Calor_Cadera_I(String bA_Calor_Cadera_I) {
		BA_Calor_Cadera_I = bA_Calor_Cadera_I;
	}

	/**
	 * @return the bA_Calor_Codos_D
	 */
	public String getBA_Calor_Codos_D() {
		return BA_Calor_Codos_D;
	}

	/**
	 * @param bA_Calor_Codos_D
	 *            the bA_Calor_Codos_D to set
	 */
	public void setBA_Calor_Codos_D(String bA_Calor_Codos_D) {
		BA_Calor_Codos_D = bA_Calor_Codos_D;
	}

	/**
	 * @return the bA_Calor_Codos_I
	 */
	public String getBA_Calor_Codos_I() {
		return BA_Calor_Codos_I;
	}

	/**
	 * @param bA_Calor_Codos_I
	 *            the bA_Calor_Codos_I to set
	 */
	public void setBA_Calor_Codos_I(String bA_Calor_Codos_I) {
		BA_Calor_Codos_I = bA_Calor_Codos_I;
	}

	/**
	 * @return the bA_Calor_Dedos_Mano_D
	 */
	public String getBA_Calor_Dedos_Mano_D() {
		return BA_Calor_Dedos_Mano_D;
	}

	/**
	 * @param bA_Calor_Dedos_Mano_D
	 *            the bA_Calor_Dedos_Mano_D to set
	 */
	public void setBA_Calor_Dedos_Mano_D(String bA_Calor_Dedos_Mano_D) {
		BA_Calor_Dedos_Mano_D = bA_Calor_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Calor_Dedos_Mano_I
	 */
	public String getBA_Calor_Dedos_Mano_I() {
		return BA_Calor_Dedos_Mano_I;
	}

	/**
	 * @param bA_Calor_Dedos_Mano_I
	 *            the bA_Calor_Dedos_Mano_I to set
	 */
	public void setBA_Calor_Dedos_Mano_I(String bA_Calor_Dedos_Mano_I) {
		BA_Calor_Dedos_Mano_I = bA_Calor_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Calor_Dedos_Pie_D
	 */
	public String getBA_Calor_Dedos_Pie_D() {
		return BA_Calor_Dedos_Pie_D;
	}

	/**
	 * @param bA_Calor_Dedos_Pie_D
	 *            the bA_Calor_Dedos_Pie_D to set
	 */
	public void setBA_Calor_Dedos_Pie_D(String bA_Calor_Dedos_Pie_D) {
		BA_Calor_Dedos_Pie_D = bA_Calor_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Calor_Dedos_Pie_I
	 */
	public String getBA_Calor_Dedos_Pie_I() {
		return BA_Calor_Dedos_Pie_I;
	}

	/**
	 * @param bA_Calor_Dedos_Pie_I
	 *            the bA_Calor_Dedos_Pie_I to set
	 */
	public void setBA_Calor_Dedos_Pie_I(String bA_Calor_Dedos_Pie_I) {
		BA_Calor_Dedos_Pie_I = bA_Calor_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Calor_Hombros_D
	 */
	public String getBA_Calor_Hombros_D() {
		return BA_Calor_Hombros_D;
	}

	/**
	 * @param bA_Calor_Hombros_D
	 *            the bA_Calor_Hombros_D to set
	 */
	public void setBA_Calor_Hombros_D(String bA_Calor_Hombros_D) {
		BA_Calor_Hombros_D = bA_Calor_Hombros_D;
	}

	/**
	 * @return the bA_Calor_Hombros_I
	 */
	public String getBA_Calor_Hombros_I() {
		return BA_Calor_Hombros_I;
	}

	/**
	 * @param bA_Calor_Hombros_I
	 *            the bA_Calor_Hombros_I to set
	 */
	public void setBA_Calor_Hombros_I(String bA_Calor_Hombros_I) {
		BA_Calor_Hombros_I = bA_Calor_Hombros_I;
	}

	/**
	 * @return the bA_Calor_Munecas_D
	 */
	public String getBA_Calor_Munecas_D() {
		return BA_Calor_Munecas_D;
	}

	/**
	 * @param bA_Calor_Munecas_D
	 *            the bA_Calor_Munecas_D to set
	 */
	public void setBA_Calor_Munecas_D(String bA_Calor_Munecas_D) {
		BA_Calor_Munecas_D = bA_Calor_Munecas_D;
	}

	/**
	 * @return the bA_Calor_Munecas_I
	 */
	public String getBA_Calor_Munecas_I() {
		return BA_Calor_Munecas_I;
	}

	/**
	 * @param bA_Calor_Munecas_I
	 *            the bA_Calor_Munecas_I to set
	 */
	public void setBA_Calor_Munecas_I(String bA_Calor_Munecas_I) {
		BA_Calor_Munecas_I = bA_Calor_Munecas_I;
	}

	/**
	 * @return the bA_Calor_Rodilla_D
	 */
	public String getBA_Calor_Rodilla_D() {
		return BA_Calor_Rodilla_D;
	}

	/**
	 * @param bA_Calor_Rodilla_D
	 *            the bA_Calor_Rodilla_D to set
	 */
	public void setBA_Calor_Rodilla_D(String bA_Calor_Rodilla_D) {
		BA_Calor_Rodilla_D = bA_Calor_Rodilla_D;
	}

	/**
	 * @return the bA_Calor_Rodilla_I
	 */
	public String getBA_Calor_Rodilla_I() {
		return BA_Calor_Rodilla_I;
	}

	/**
	 * @param bA_Calor_Rodilla_I
	 *            the bA_Calor_Rodilla_I to set
	 */
	public void setBA_Calor_Rodilla_I(String bA_Calor_Rodilla_I) {
		BA_Calor_Rodilla_I = bA_Calor_Rodilla_I;
	}

	/**
	 * @return the bA_Calor_Tobillos_D
	 */
	public String getBA_Calor_Tobillos_D() {
		return BA_Calor_Tobillos_D;
	}

	/**
	 * @param bA_Calor_Tobillos_D
	 *            the bA_Calor_Tobillos_D to set
	 */
	public void setBA_Calor_Tobillos_D(String bA_Calor_Tobillos_D) {
		BA_Calor_Tobillos_D = bA_Calor_Tobillos_D;
	}

	/**
	 * @return the bA_Calor_Tobillos_I
	 */
	public String getBA_Calor_Tobillos_I() {
		return BA_Calor_Tobillos_I;
	}

	/**
	 * @param bA_Calor_Tobillos_I
	 *            the bA_Calor_Tobillos_I to set
	 */
	public void setBA_Calor_Tobillos_I(String bA_Calor_Tobillos_I) {
		BA_Calor_Tobillos_I = bA_Calor_Tobillos_I;
	}

	/**
	 * @return the bA_Deformidad_Cadera_D
	 */
	public String getBA_Deformidad_Cadera_D() {
		return BA_Deformidad_Cadera_D;
	}

	/**
	 * @param bA_Deformidad_Cadera_D
	 *            the bA_Deformidad_Cadera_D to set
	 */
	public void setBA_Deformidad_Cadera_D(String bA_Deformidad_Cadera_D) {
		BA_Deformidad_Cadera_D = bA_Deformidad_Cadera_D;
	}

	/**
	 * @return the bA_Deformidad_Cadera_I
	 */
	public String getBA_Deformidad_Cadera_I() {
		return BA_Deformidad_Cadera_I;
	}

	/**
	 * @param bA_Deformidad_Cadera_I
	 *            the bA_Deformidad_Cadera_I to set
	 */
	public void setBA_Deformidad_Cadera_I(String bA_Deformidad_Cadera_I) {
		BA_Deformidad_Cadera_I = bA_Deformidad_Cadera_I;
	}

	/**
	 * @return the bA_Deformidad_Codos_D
	 */
	public String getBA_Deformidad_Codos_D() {
		return BA_Deformidad_Codos_D;
	}

	/**
	 * @param bA_Deformidad_Codos_D
	 *            the bA_Deformidad_Codos_D to set
	 */
	public void setBA_Deformidad_Codos_D(String bA_Deformidad_Codos_D) {
		BA_Deformidad_Codos_D = bA_Deformidad_Codos_D;
	}

	/**
	 * @return the bA_Deformidad_Codos_I
	 */
	public String getBA_Deformidad_Codos_I() {
		return BA_Deformidad_Codos_I;
	}

	/**
	 * @param bA_Deformidad_Codos_I
	 *            the bA_Deformidad_Codos_I to set
	 */
	public void setBA_Deformidad_Codos_I(String bA_Deformidad_Codos_I) {
		BA_Deformidad_Codos_I = bA_Deformidad_Codos_I;
	}

	/**
	 * @return the bA_Deformidad_Dedos_Mano_D
	 */
	public String getBA_Deformidad_Dedos_Mano_D() {
		return BA_Deformidad_Dedos_Mano_D;
	}

	/**
	 * @param bA_Deformidad_Dedos_Mano_D
	 *            the bA_Deformidad_Dedos_Mano_D to set
	 */
	public void setBA_Deformidad_Dedos_Mano_D(String bA_Deformidad_Dedos_Mano_D) {
		BA_Deformidad_Dedos_Mano_D = bA_Deformidad_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Deformidad_Dedos_Mano_I
	 */
	public String getBA_Deformidad_Dedos_Mano_I() {
		return BA_Deformidad_Dedos_Mano_I;
	}

	/**
	 * @param bA_Deformidad_Dedos_Mano_I
	 *            the bA_Deformidad_Dedos_Mano_I to set
	 */
	public void setBA_Deformidad_Dedos_Mano_I(String bA_Deformidad_Dedos_Mano_I) {
		BA_Deformidad_Dedos_Mano_I = bA_Deformidad_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Deformidad_Dedos_Pie_D
	 */
	public String getBA_Deformidad_Dedos_Pie_D() {
		return BA_Deformidad_Dedos_Pie_D;
	}

	/**
	 * @param bA_Deformidad_Dedos_Pie_D
	 *            the bA_Deformidad_Dedos_Pie_D to set
	 */
	public void setBA_Deformidad_Dedos_Pie_D(String bA_Deformidad_Dedos_Pie_D) {
		BA_Deformidad_Dedos_Pie_D = bA_Deformidad_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Deformidad_Dedos_Pie_I
	 */
	public String getBA_Deformidad_Dedos_Pie_I() {
		return BA_Deformidad_Dedos_Pie_I;
	}

	/**
	 * @param bA_Deformidad_Dedos_Pie_I
	 *            the bA_Deformidad_Dedos_Pie_I to set
	 */
	public void setBA_Deformidad_Dedos_Pie_I(String bA_Deformidad_Dedos_Pie_I) {
		BA_Deformidad_Dedos_Pie_I = bA_Deformidad_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Deformidad_Hombros_D
	 */
	public String getBA_Deformidad_Hombros_D() {
		return BA_Deformidad_Hombros_D;
	}

	/**
	 * @param bA_Deformidad_Hombros_D
	 *            the bA_Deformidad_Hombros_D to set
	 */
	public void setBA_Deformidad_Hombros_D(String bA_Deformidad_Hombros_D) {
		BA_Deformidad_Hombros_D = bA_Deformidad_Hombros_D;
	}

	/**
	 * @return the bA_Deformidad_Hombros_I
	 */
	public String getBA_Deformidad_Hombros_I() {
		return BA_Deformidad_Hombros_I;
	}

	/**
	 * @param bA_Deformidad_Hombros_I
	 *            the bA_Deformidad_Hombros_I to set
	 */
	public void setBA_Deformidad_Hombros_I(String bA_Deformidad_Hombros_I) {
		BA_Deformidad_Hombros_I = bA_Deformidad_Hombros_I;
	}

	/**
	 * @return the bA_Deformidad_Munecas_D
	 */
	public String getBA_Deformidad_Munecas_D() {
		return BA_Deformidad_Munecas_D;
	}

	/**
	 * @param bA_Deformidad_Munecas_D
	 *            the bA_Deformidad_Munecas_D to set
	 */
	public void setBA_Deformidad_Munecas_D(String bA_Deformidad_Munecas_D) {
		BA_Deformidad_Munecas_D = bA_Deformidad_Munecas_D;
	}

	/**
	 * @return the bA_Deformidad_Munecas_I
	 */
	public String getBA_Deformidad_Munecas_I() {
		return BA_Deformidad_Munecas_I;
	}

	/**
	 * @param bA_Deformidad_Munecas_I
	 *            the bA_Deformidad_Munecas_I to set
	 */
	public void setBA_Deformidad_Munecas_I(String bA_Deformidad_Munecas_I) {
		BA_Deformidad_Munecas_I = bA_Deformidad_Munecas_I;
	}

	/**
	 * @return the bA_Deformidad_Rodilla_D
	 */
	public String getBA_Deformidad_Rodilla_D() {
		return BA_Deformidad_Rodilla_D;
	}

	/**
	 * @param bA_Deformidad_Rodilla_D
	 *            the bA_Deformidad_Rodilla_D to set
	 */
	public void setBA_Deformidad_Rodilla_D(String bA_Deformidad_Rodilla_D) {
		BA_Deformidad_Rodilla_D = bA_Deformidad_Rodilla_D;
	}

	/**
	 * @return the bA_Deformidad_Rodilla_I
	 */
	public String getBA_Deformidad_Rodilla_I() {
		return BA_Deformidad_Rodilla_I;
	}

	/**
	 * @param bA_Deformidad_Rodilla_I
	 *            the bA_Deformidad_Rodilla_I to set
	 */
	public void setBA_Deformidad_Rodilla_I(String bA_Deformidad_Rodilla_I) {
		BA_Deformidad_Rodilla_I = bA_Deformidad_Rodilla_I;
	}

	/**
	 * @return the bA_Deformidad_Tobillos_D
	 */
	public String getBA_Deformidad_Tobillos_D() {
		return BA_Deformidad_Tobillos_D;
	}

	/**
	 * @param bA_Deformidad_Tobillos_D
	 *            the bA_Deformidad_Tobillos_D to set
	 */
	public void setBA_Deformidad_Tobillos_D(String bA_Deformidad_Tobillos_D) {
		BA_Deformidad_Tobillos_D = bA_Deformidad_Tobillos_D;
	}

	/**
	 * @return the bA_Deformidad_Tobillos_I
	 */
	public String getBA_Deformidad_Tobillos_I() {
		return BA_Deformidad_Tobillos_I;
	}

	/**
	 * @param bA_Deformidad_Tobillos_I
	 *            the bA_Deformidad_Tobillos_I to set
	 */
	public void setBA_Deformidad_Tobillos_I(String bA_Deformidad_Tobillos_I) {
		BA_Deformidad_Tobillos_I = bA_Deformidad_Tobillos_I;
	}

	/**
	 * @return the bA_Dolor_Cadera_D
	 */
	public String getBA_Dolor_Cadera_D() {
		return BA_Dolor_Cadera_D;
	}

	/**
	 * @param bA_Dolor_Cadera_D
	 *            the bA_Dolor_Cadera_D to set
	 */
	public void setBA_Dolor_Cadera_D(String bA_Dolor_Cadera_D) {
		BA_Dolor_Cadera_D = bA_Dolor_Cadera_D;
	}

	/**
	 * @return the bA_Dolor_Cadera_I
	 */
	public String getBA_Dolor_Cadera_I() {
		return BA_Dolor_Cadera_I;
	}

	/**
	 * @param bA_Dolor_Cadera_I
	 *            the bA_Dolor_Cadera_I to set
	 */
	public void setBA_Dolor_Cadera_I(String bA_Dolor_Cadera_I) {
		BA_Dolor_Cadera_I = bA_Dolor_Cadera_I;
	}

	/**
	 * @return the bA_Dolor_Codos_D
	 */
	public String getBA_Dolor_Codos_D() {
		return BA_Dolor_Codos_D;
	}

	/**
	 * @param bA_Dolor_Codos_D
	 *            the bA_Dolor_Codos_D to set
	 */
	public void setBA_Dolor_Codos_D(String bA_Dolor_Codos_D) {
		BA_Dolor_Codos_D = bA_Dolor_Codos_D;
	}

	/**
	 * @return the bA_Dolor_Codos_I
	 */
	public String getBA_Dolor_Codos_I() {
		return BA_Dolor_Codos_I;
	}

	/**
	 * @param bA_Dolor_Codos_I
	 *            the bA_Dolor_Codos_I to set
	 */
	public void setBA_Dolor_Codos_I(String bA_Dolor_Codos_I) {
		BA_Dolor_Codos_I = bA_Dolor_Codos_I;
	}

	/**
	 * @return the bA_Dolor_Dedos_Mano_D
	 */
	public String getBA_Dolor_Dedos_Mano_D() {
		return BA_Dolor_Dedos_Mano_D;
	}

	/**
	 * @param bA_Dolor_Dedos_Mano_D
	 *            the bA_Dolor_Dedos_Mano_D to set
	 */
	public void setBA_Dolor_Dedos_Mano_D(String bA_Dolor_Dedos_Mano_D) {
		BA_Dolor_Dedos_Mano_D = bA_Dolor_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Dolor_Dedos_Mano_I
	 */
	public String getBA_Dolor_Dedos_Mano_I() {
		return BA_Dolor_Dedos_Mano_I;
	}

	/**
	 * @param bA_Dolor_Dedos_Mano_I
	 *            the bA_Dolor_Dedos_Mano_I to set
	 */
	public void setBA_Dolor_Dedos_Mano_I(String bA_Dolor_Dedos_Mano_I) {
		BA_Dolor_Dedos_Mano_I = bA_Dolor_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Dolor_Dedos_Pie_D
	 */
	public String getBA_Dolor_Dedos_Pie_D() {
		return BA_Dolor_Dedos_Pie_D;
	}

	/**
	 * @param bA_Dolor_Dedos_Pie_D
	 *            the bA_Dolor_Dedos_Pie_D to set
	 */
	public void setBA_Dolor_Dedos_Pie_D(String bA_Dolor_Dedos_Pie_D) {
		BA_Dolor_Dedos_Pie_D = bA_Dolor_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Dolor_Dedos_Pie_I
	 */
	public String getBA_Dolor_Dedos_Pie_I() {
		return BA_Dolor_Dedos_Pie_I;
	}

	/**
	 * @param bA_Dolor_Dedos_Pie_I
	 *            the bA_Dolor_Dedos_Pie_I to set
	 */
	public void setBA_Dolor_Dedos_Pie_I(String bA_Dolor_Dedos_Pie_I) {
		BA_Dolor_Dedos_Pie_I = bA_Dolor_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Dolor_Hombros_D
	 */
	public String getBA_Dolor_Hombros_D() {
		return BA_Dolor_Hombros_D;
	}

	/**
	 * @param bA_Dolor_Hombros_D
	 *            the bA_Dolor_Hombros_D to set
	 */
	public void setBA_Dolor_Hombros_D(String bA_Dolor_Hombros_D) {
		BA_Dolor_Hombros_D = bA_Dolor_Hombros_D;
	}

	/**
	 * @return the bA_Dolor_Hombros_I
	 */
	public String getBA_Dolor_Hombros_I() {
		return BA_Dolor_Hombros_I;
	}

	/**
	 * @param bA_Dolor_Hombros_I
	 *            the bA_Dolor_Hombros_I to set
	 */
	public void setBA_Dolor_Hombros_I(String bA_Dolor_Hombros_I) {
		BA_Dolor_Hombros_I = bA_Dolor_Hombros_I;
	}

	/**
	 * @return the bA_Dolor_Munecas_D
	 */
	public String getBA_Dolor_Munecas_D() {
		return BA_Dolor_Munecas_D;
	}

	/**
	 * @param bA_Dolor_Munecas_D
	 *            the bA_Dolor_Munecas_D to set
	 */
	public void setBA_Dolor_Munecas_D(String bA_Dolor_Munecas_D) {
		BA_Dolor_Munecas_D = bA_Dolor_Munecas_D;
	}

	/**
	 * @return the bA_Dolor_Munecas_I
	 */
	public String getBA_Dolor_Munecas_I() {
		return BA_Dolor_Munecas_I;
	}

	/**
	 * @param bA_Dolor_Munecas_I
	 *            the bA_Dolor_Munecas_I to set
	 */
	public void setBA_Dolor_Munecas_I(String bA_Dolor_Munecas_I) {
		BA_Dolor_Munecas_I = bA_Dolor_Munecas_I;
	}

	/**
	 * @return the bA_Dolor_Rodilla_D
	 */
	public String getBA_Dolor_Rodilla_D() {
		return BA_Dolor_Rodilla_D;
	}

	/**
	 * @param bA_Dolor_Rodilla_D
	 *            the bA_Dolor_Rodilla_D to set
	 */
	public void setBA_Dolor_Rodilla_D(String bA_Dolor_Rodilla_D) {
		BA_Dolor_Rodilla_D = bA_Dolor_Rodilla_D;
	}

	/**
	 * @return the bA_Dolor_Rodilla_I
	 */
	public String getBA_Dolor_Rodilla_I() {
		return BA_Dolor_Rodilla_I;
	}

	/**
	 * @param bA_Dolor_Rodilla_I
	 *            the bA_Dolor_Rodilla_I to set
	 */
	public void setBA_Dolor_Rodilla_I(String bA_Dolor_Rodilla_I) {
		BA_Dolor_Rodilla_I = bA_Dolor_Rodilla_I;
	}

	/**
	 * @return the bA_Dolor_Tobillos_D
	 */
	public String getBA_Dolor_Tobillos_D() {
		return BA_Dolor_Tobillos_D;
	}

	/**
	 * @param bA_Dolor_Tobillos_D
	 *            the bA_Dolor_Tobillos_D to set
	 */
	public void setBA_Dolor_Tobillos_D(String bA_Dolor_Tobillos_D) {
		BA_Dolor_Tobillos_D = bA_Dolor_Tobillos_D;
	}

	/**
	 * @return the bA_Dolor_Tobillos_I
	 */
	public String getBA_Dolor_Tobillos_I() {
		return BA_Dolor_Tobillos_I;
	}

	/**
	 * @param bA_Dolor_Tobillos_I
	 *            the bA_Dolor_Tobillos_I to set
	 */
	public void setBA_Dolor_Tobillos_I(String bA_Dolor_Tobillos_I) {
		BA_Dolor_Tobillos_I = bA_Dolor_Tobillos_I;
	}

	/**
	 * @return the bA_Edema_Cadera_D
	 */
	public String getBA_Edema_Cadera_D() {
		return BA_Edema_Cadera_D;
	}

	/**
	 * @param bA_Edema_Cadera_D
	 *            the bA_Edema_Cadera_D to set
	 */
	public void setBA_Edema_Cadera_D(String bA_Edema_Cadera_D) {
		BA_Edema_Cadera_D = bA_Edema_Cadera_D;
	}

	/**
	 * @return the bA_Edema_Cadera_I
	 */
	public String getBA_Edema_Cadera_I() {
		return BA_Edema_Cadera_I;
	}

	/**
	 * @param bA_Edema_Cadera_I
	 *            the bA_Edema_Cadera_I to set
	 */
	public void setBA_Edema_Cadera_I(String bA_Edema_Cadera_I) {
		BA_Edema_Cadera_I = bA_Edema_Cadera_I;
	}

	/**
	 * @return the bA_Edema_Codos_D
	 */
	public String getBA_Edema_Codos_D() {
		return BA_Edema_Codos_D;
	}

	/**
	 * @param bA_Edema_Codos_D
	 *            the bA_Edema_Codos_D to set
	 */
	public void setBA_Edema_Codos_D(String bA_Edema_Codos_D) {
		BA_Edema_Codos_D = bA_Edema_Codos_D;
	}

	/**
	 * @return the bA_Edema_Codos_I
	 */
	public String getBA_Edema_Codos_I() {
		return BA_Edema_Codos_I;
	}

	/**
	 * @param bA_Edema_Codos_I
	 *            the bA_Edema_Codos_I to set
	 */
	public void setBA_Edema_Codos_I(String bA_Edema_Codos_I) {
		BA_Edema_Codos_I = bA_Edema_Codos_I;
	}

	/**
	 * @return the bA_Edema_Dedos_Mano_D
	 */
	public String getBA_Edema_Dedos_Mano_D() {
		return BA_Edema_Dedos_Mano_D;
	}

	/**
	 * @param bA_Edema_Dedos_Mano_D
	 *            the bA_Edema_Dedos_Mano_D to set
	 */
	public void setBA_Edema_Dedos_Mano_D(String bA_Edema_Dedos_Mano_D) {
		BA_Edema_Dedos_Mano_D = bA_Edema_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Edema_Dedos_Mano_I
	 */
	public String getBA_Edema_Dedos_Mano_I() {
		return BA_Edema_Dedos_Mano_I;
	}

	/**
	 * @param bA_Edema_Dedos_Mano_I
	 *            the bA_Edema_Dedos_Mano_I to set
	 */
	public void setBA_Edema_Dedos_Mano_I(String bA_Edema_Dedos_Mano_I) {
		BA_Edema_Dedos_Mano_I = bA_Edema_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Edema_Dedos_Pie_D
	 */
	public String getBA_Edema_Dedos_Pie_D() {
		return BA_Edema_Dedos_Pie_D;
	}

	/**
	 * @param bA_Edema_Dedos_Pie_D
	 *            the bA_Edema_Dedos_Pie_D to set
	 */
	public void setBA_Edema_Dedos_Pie_D(String bA_Edema_Dedos_Pie_D) {
		BA_Edema_Dedos_Pie_D = bA_Edema_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Edema_Dedos_Pie_I
	 */
	public String getBA_Edema_Dedos_Pie_I() {
		return BA_Edema_Dedos_Pie_I;
	}

	/**
	 * @param bA_Edema_Dedos_Pie_I
	 *            the bA_Edema_Dedos_Pie_I to set
	 */
	public void setBA_Edema_Dedos_Pie_I(String bA_Edema_Dedos_Pie_I) {
		BA_Edema_Dedos_Pie_I = bA_Edema_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Edema_Hombros_D
	 */
	public String getBA_Edema_Hombros_D() {
		return BA_Edema_Hombros_D;
	}

	/**
	 * @param bA_Edema_Hombros_D
	 *            the bA_Edema_Hombros_D to set
	 */
	public void setBA_Edema_Hombros_D(String bA_Edema_Hombros_D) {
		BA_Edema_Hombros_D = bA_Edema_Hombros_D;
	}

	/**
	 * @return the bA_Edema_Hombros_I
	 */
	public String getBA_Edema_Hombros_I() {
		return BA_Edema_Hombros_I;
	}

	/**
	 * @param bA_Edema_Hombros_I
	 *            the bA_Edema_Hombros_I to set
	 */
	public void setBA_Edema_Hombros_I(String bA_Edema_Hombros_I) {
		BA_Edema_Hombros_I = bA_Edema_Hombros_I;
	}

	/**
	 * @return the bA_Edema_Munecas_D
	 */
	public String getBA_Edema_Munecas_D() {
		return BA_Edema_Munecas_D;
	}

	/**
	 * @param bA_Edema_Munecas_D
	 *            the bA_Edema_Munecas_D to set
	 */
	public void setBA_Edema_Munecas_D(String bA_Edema_Munecas_D) {
		BA_Edema_Munecas_D = bA_Edema_Munecas_D;
	}

	/**
	 * @return the bA_Edema_Munecas_I
	 */
	public String getBA_Edema_Munecas_I() {
		return BA_Edema_Munecas_I;
	}

	/**
	 * @param bA_Edema_Munecas_I
	 *            the bA_Edema_Munecas_I to set
	 */
	public void setBA_Edema_Munecas_I(String bA_Edema_Munecas_I) {
		BA_Edema_Munecas_I = bA_Edema_Munecas_I;
	}

	/**
	 * @return the bA_Edema_Rodilla_D
	 */
	public String getBA_Edema_Rodilla_D() {
		return BA_Edema_Rodilla_D;
	}

	/**
	 * @param bA_Edema_Rodilla_D
	 *            the bA_Edema_Rodilla_D to set
	 */
	public void setBA_Edema_Rodilla_D(String bA_Edema_Rodilla_D) {
		BA_Edema_Rodilla_D = bA_Edema_Rodilla_D;
	}

	/**
	 * @return the bA_Edema_Rodilla_I
	 */
	public String getBA_Edema_Rodilla_I() {
		return BA_Edema_Rodilla_I;
	}

	/**
	 * @param bA_Edema_Rodilla_I
	 *            the bA_Edema_Rodilla_I to set
	 */
	public void setBA_Edema_Rodilla_I(String bA_Edema_Rodilla_I) {
		BA_Edema_Rodilla_I = bA_Edema_Rodilla_I;
	}

	/**
	 * @return the bA_Edema_Tobillos_D
	 */
	public String getBA_Edema_Tobillos_D() {
		return BA_Edema_Tobillos_D;
	}

	/**
	 * @param bA_Edema_Tobillos_D
	 *            the bA_Edema_Tobillos_D to set
	 */
	public void setBA_Edema_Tobillos_D(String bA_Edema_Tobillos_D) {
		BA_Edema_Tobillos_D = bA_Edema_Tobillos_D;
	}

	/**
	 * @return the bA_Edema_Tobillos_I
	 */
	public String getBA_Edema_Tobillos_I() {
		return BA_Edema_Tobillos_I;
	}

	/**
	 * @param bA_Edema_Tobillos_I
	 *            the bA_Edema_Tobillos_I to set
	 */
	public void setBA_Edema_Tobillos_I(String bA_Edema_Tobillos_I) {
		BA_Edema_Tobillos_I = bA_Edema_Tobillos_I;
	}

	/**
	 * @return the bA_Explicacion
	 */
	public String getBA_Explicacion() {
		return BA_Explicacion;
	}

	/**
	 * @param bA_Explicacion
	 *            the bA_Explicacion to set
	 */
	public void setBA_Explicacion(String bA_Explicacion) {
		BA_Explicacion = bA_Explicacion;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Cadera_D
	 */
	public String getBA_Limitacion_Arcos_Cadera_D() {
		return BA_Limitacion_Arcos_Cadera_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Cadera_D
	 *            the bA_Limitacion_Arcos_Cadera_D to set
	 */
	public void setBA_Limitacion_Arcos_Cadera_D(String bA_Limitacion_Arcos_Cadera_D) {
		BA_Limitacion_Arcos_Cadera_D = bA_Limitacion_Arcos_Cadera_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Cadera_I
	 */
	public String getBA_Limitacion_Arcos_Cadera_I() {
		return BA_Limitacion_Arcos_Cadera_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Cadera_I
	 *            the bA_Limitacion_Arcos_Cadera_I to set
	 */
	public void setBA_Limitacion_Arcos_Cadera_I(String bA_Limitacion_Arcos_Cadera_I) {
		BA_Limitacion_Arcos_Cadera_I = bA_Limitacion_Arcos_Cadera_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Codos_D
	 */
	public String getBA_Limitacion_Arcos_Codos_D() {
		return BA_Limitacion_Arcos_Codos_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Codos_D
	 *            the bA_Limitacion_Arcos_Codos_D to set
	 */
	public void setBA_Limitacion_Arcos_Codos_D(String bA_Limitacion_Arcos_Codos_D) {
		BA_Limitacion_Arcos_Codos_D = bA_Limitacion_Arcos_Codos_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Codos_I
	 */
	public String getBA_Limitacion_Arcos_Codos_I() {
		return BA_Limitacion_Arcos_Codos_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Codos_I
	 *            the bA_Limitacion_Arcos_Codos_I to set
	 */
	public void setBA_Limitacion_Arcos_Codos_I(String bA_Limitacion_Arcos_Codos_I) {
		BA_Limitacion_Arcos_Codos_I = bA_Limitacion_Arcos_Codos_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Dedos_Mano_D
	 */
	public String getBA_Limitacion_Arcos_Dedos_Mano_D() {
		return BA_Limitacion_Arcos_Dedos_Mano_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Dedos_Mano_D
	 *            the bA_Limitacion_Arcos_Dedos_Mano_D to set
	 */
	public void setBA_Limitacion_Arcos_Dedos_Mano_D(String bA_Limitacion_Arcos_Dedos_Mano_D) {
		BA_Limitacion_Arcos_Dedos_Mano_D = bA_Limitacion_Arcos_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Dedos_Mano_I
	 */
	public String getBA_Limitacion_Arcos_Dedos_Mano_I() {
		return BA_Limitacion_Arcos_Dedos_Mano_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Dedos_Mano_I
	 *            the bA_Limitacion_Arcos_Dedos_Mano_I to set
	 */
	public void setBA_Limitacion_Arcos_Dedos_Mano_I(String bA_Limitacion_Arcos_Dedos_Mano_I) {
		BA_Limitacion_Arcos_Dedos_Mano_I = bA_Limitacion_Arcos_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Dedos_Pie_D
	 */
	public String getBA_Limitacion_Arcos_Dedos_Pie_D() {
		return BA_Limitacion_Arcos_Dedos_Pie_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Dedos_Pie_D
	 *            the bA_Limitacion_Arcos_Dedos_Pie_D to set
	 */
	public void setBA_Limitacion_Arcos_Dedos_Pie_D(String bA_Limitacion_Arcos_Dedos_Pie_D) {
		BA_Limitacion_Arcos_Dedos_Pie_D = bA_Limitacion_Arcos_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Dedos_Pie_I
	 */
	public String getBA_Limitacion_Arcos_Dedos_Pie_I() {
		return BA_Limitacion_Arcos_Dedos_Pie_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Dedos_Pie_I
	 *            the bA_Limitacion_Arcos_Dedos_Pie_I to set
	 */
	public void setBA_Limitacion_Arcos_Dedos_Pie_I(String bA_Limitacion_Arcos_Dedos_Pie_I) {
		BA_Limitacion_Arcos_Dedos_Pie_I = bA_Limitacion_Arcos_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Hombros_D
	 */
	public String getBA_Limitacion_Arcos_Hombros_D() {
		return BA_Limitacion_Arcos_Hombros_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Hombros_D
	 *            the bA_Limitacion_Arcos_Hombros_D to set
	 */
	public void setBA_Limitacion_Arcos_Hombros_D(String bA_Limitacion_Arcos_Hombros_D) {
		BA_Limitacion_Arcos_Hombros_D = bA_Limitacion_Arcos_Hombros_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Hombros_I
	 */
	public String getBA_Limitacion_Arcos_Hombros_I() {
		return BA_Limitacion_Arcos_Hombros_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Hombros_I
	 *            the bA_Limitacion_Arcos_Hombros_I to set
	 */
	public void setBA_Limitacion_Arcos_Hombros_I(String bA_Limitacion_Arcos_Hombros_I) {
		BA_Limitacion_Arcos_Hombros_I = bA_Limitacion_Arcos_Hombros_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Munecas_D
	 */
	public String getBA_Limitacion_Arcos_Munecas_D() {
		return BA_Limitacion_Arcos_Munecas_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Munecas_D
	 *            the bA_Limitacion_Arcos_Munecas_D to set
	 */
	public void setBA_Limitacion_Arcos_Munecas_D(String bA_Limitacion_Arcos_Munecas_D) {
		BA_Limitacion_Arcos_Munecas_D = bA_Limitacion_Arcos_Munecas_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Munecas_I
	 */
	public String getBA_Limitacion_Arcos_Munecas_I() {
		return BA_Limitacion_Arcos_Munecas_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Munecas_I
	 *            the bA_Limitacion_Arcos_Munecas_I to set
	 */
	public void setBA_Limitacion_Arcos_Munecas_I(String bA_Limitacion_Arcos_Munecas_I) {
		BA_Limitacion_Arcos_Munecas_I = bA_Limitacion_Arcos_Munecas_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Rodilla_D
	 */
	public String getBA_Limitacion_Arcos_Rodilla_D() {
		return BA_Limitacion_Arcos_Rodilla_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Rodilla_D
	 *            the bA_Limitacion_Arcos_Rodilla_D to set
	 */
	public void setBA_Limitacion_Arcos_Rodilla_D(String bA_Limitacion_Arcos_Rodilla_D) {
		BA_Limitacion_Arcos_Rodilla_D = bA_Limitacion_Arcos_Rodilla_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Rodilla_I
	 */
	public String getBA_Limitacion_Arcos_Rodilla_I() {
		return BA_Limitacion_Arcos_Rodilla_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Rodilla_I
	 *            the bA_Limitacion_Arcos_Rodilla_I to set
	 */
	public void setBA_Limitacion_Arcos_Rodilla_I(String bA_Limitacion_Arcos_Rodilla_I) {
		BA_Limitacion_Arcos_Rodilla_I = bA_Limitacion_Arcos_Rodilla_I;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Tobillos_D
	 */
	public String getBA_Limitacion_Arcos_Tobillos_D() {
		return BA_Limitacion_Arcos_Tobillos_D;
	}

	/**
	 * @param bA_Limitacion_Arcos_Tobillos_D
	 *            the bA_Limitacion_Arcos_Tobillos_D to set
	 */
	public void setBA_Limitacion_Arcos_Tobillos_D(String bA_Limitacion_Arcos_Tobillos_D) {
		BA_Limitacion_Arcos_Tobillos_D = bA_Limitacion_Arcos_Tobillos_D;
	}

	/**
	 * @return the bA_Limitacion_Arcos_Tobillos_I
	 */
	public String getBA_Limitacion_Arcos_Tobillos_I() {
		return BA_Limitacion_Arcos_Tobillos_I;
	}

	/**
	 * @param bA_Limitacion_Arcos_Tobillos_I
	 *            the bA_Limitacion_Arcos_Tobillos_I to set
	 */
	public void setBA_Limitacion_Arcos_Tobillos_I(String bA_Limitacion_Arcos_Tobillos_I) {
		BA_Limitacion_Arcos_Tobillos_I = bA_Limitacion_Arcos_Tobillos_I;
	}

	/**
	 * @return the bA_Rubor_Cadera_D
	 */
	public String getBA_Rubor_Cadera_D() {
		return BA_Rubor_Cadera_D;
	}

	/**
	 * @param bA_Rubor_Cadera_D
	 *            the bA_Rubor_Cadera_D to set
	 */
	public void setBA_Rubor_Cadera_D(String bA_Rubor_Cadera_D) {
		BA_Rubor_Cadera_D = bA_Rubor_Cadera_D;
	}

	/**
	 * @return the bA_Rubor_Cadera_I
	 */
	public String getBA_Rubor_Cadera_I() {
		return BA_Rubor_Cadera_I;
	}

	/**
	 * @param bA_Rubor_Cadera_I
	 *            the bA_Rubor_Cadera_I to set
	 */
	public void setBA_Rubor_Cadera_I(String bA_Rubor_Cadera_I) {
		BA_Rubor_Cadera_I = bA_Rubor_Cadera_I;
	}

	/**
	 * @return the bA_Rubor_Codos_D
	 */
	public String getBA_Rubor_Codos_D() {
		return BA_Rubor_Codos_D;
	}

	/**
	 * @param bA_Rubor_Codos_D
	 *            the bA_Rubor_Codos_D to set
	 */
	public void setBA_Rubor_Codos_D(String bA_Rubor_Codos_D) {
		BA_Rubor_Codos_D = bA_Rubor_Codos_D;
	}

	/**
	 * @return the bA_Rubor_Codos_I
	 */
	public String getBA_Rubor_Codos_I() {
		return BA_Rubor_Codos_I;
	}

	/**
	 * @param bA_Rubor_Codos_I
	 *            the bA_Rubor_Codos_I to set
	 */
	public void setBA_Rubor_Codos_I(String bA_Rubor_Codos_I) {
		BA_Rubor_Codos_I = bA_Rubor_Codos_I;
	}

	/**
	 * @return the bA_Rubor_Dedos_Mano_D
	 */
	public String getBA_Rubor_Dedos_Mano_D() {
		return BA_Rubor_Dedos_Mano_D;
	}

	/**
	 * @param bA_Rubor_Dedos_Mano_D
	 *            the bA_Rubor_Dedos_Mano_D to set
	 */
	public void setBA_Rubor_Dedos_Mano_D(String bA_Rubor_Dedos_Mano_D) {
		BA_Rubor_Dedos_Mano_D = bA_Rubor_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Rubor_Dedos_Mano_I
	 */
	public String getBA_Rubor_Dedos_Mano_I() {
		return BA_Rubor_Dedos_Mano_I;
	}

	/**
	 * @param bA_Rubor_Dedos_Mano_I
	 *            the bA_Rubor_Dedos_Mano_I to set
	 */
	public void setBA_Rubor_Dedos_Mano_I(String bA_Rubor_Dedos_Mano_I) {
		BA_Rubor_Dedos_Mano_I = bA_Rubor_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Rubor_Dedos_Pie_D
	 */
	public String getBA_Rubor_Dedos_Pie_D() {
		return BA_Rubor_Dedos_Pie_D;
	}

	/**
	 * @param bA_Rubor_Dedos_Pie_D
	 *            the bA_Rubor_Dedos_Pie_D to set
	 */
	public void setBA_Rubor_Dedos_Pie_D(String bA_Rubor_Dedos_Pie_D) {
		BA_Rubor_Dedos_Pie_D = bA_Rubor_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Rubor_Dedos_Pie_I
	 */
	public String getBA_Rubor_Dedos_Pie_I() {
		return BA_Rubor_Dedos_Pie_I;
	}

	/**
	 * @param bA_Rubor_Dedos_Pie_I
	 *            the bA_Rubor_Dedos_Pie_I to set
	 */
	public void setBA_Rubor_Dedos_Pie_I(String bA_Rubor_Dedos_Pie_I) {
		BA_Rubor_Dedos_Pie_I = bA_Rubor_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Rubor_Hombros_D
	 */
	public String getBA_Rubor_Hombros_D() {
		return BA_Rubor_Hombros_D;
	}

	/**
	 * @param bA_Rubor_Hombros_D
	 *            the bA_Rubor_Hombros_D to set
	 */
	public void setBA_Rubor_Hombros_D(String bA_Rubor_Hombros_D) {
		BA_Rubor_Hombros_D = bA_Rubor_Hombros_D;
	}

	/**
	 * @return the bA_Rubor_Hombros_I
	 */
	public String getBA_Rubor_Hombros_I() {
		return BA_Rubor_Hombros_I;
	}

	/**
	 * @param bA_Rubor_Hombros_I
	 *            the bA_Rubor_Hombros_I to set
	 */
	public void setBA_Rubor_Hombros_I(String bA_Rubor_Hombros_I) {
		BA_Rubor_Hombros_I = bA_Rubor_Hombros_I;
	}

	/**
	 * @return the bA_Rubor_Munecas_D
	 */
	public String getBA_Rubor_Munecas_D() {
		return BA_Rubor_Munecas_D;
	}

	/**
	 * @param bA_Rubor_Munecas_D
	 *            the bA_Rubor_Munecas_D to set
	 */
	public void setBA_Rubor_Munecas_D(String bA_Rubor_Munecas_D) {
		BA_Rubor_Munecas_D = bA_Rubor_Munecas_D;
	}

	/**
	 * @return the bA_Rubor_Munecas_I
	 */
	public String getBA_Rubor_Munecas_I() {
		return BA_Rubor_Munecas_I;
	}

	/**
	 * @param bA_Rubor_Munecas_I
	 *            the bA_Rubor_Munecas_I to set
	 */
	public void setBA_Rubor_Munecas_I(String bA_Rubor_Munecas_I) {
		BA_Rubor_Munecas_I = bA_Rubor_Munecas_I;
	}

	/**
	 * @return the bA_Rubor_Rodilla_D
	 */
	public String getBA_Rubor_Rodilla_D() {
		return BA_Rubor_Rodilla_D;
	}

	/**
	 * @param bA_Rubor_Rodilla_D
	 *            the bA_Rubor_Rodilla_D to set
	 */
	public void setBA_Rubor_Rodilla_D(String bA_Rubor_Rodilla_D) {
		BA_Rubor_Rodilla_D = bA_Rubor_Rodilla_D;
	}

	/**
	 * @return the bA_Rubor_Rodilla_I
	 */
	public String getBA_Rubor_Rodilla_I() {
		return BA_Rubor_Rodilla_I;
	}

	/**
	 * @param bA_Rubor_Rodilla_I
	 *            the bA_Rubor_Rodilla_I to set
	 */
	public void setBA_Rubor_Rodilla_I(String bA_Rubor_Rodilla_I) {
		BA_Rubor_Rodilla_I = bA_Rubor_Rodilla_I;
	}

	/**
	 * @return the bA_Rubor_Tobillos_D
	 */
	public String getBA_Rubor_Tobillos_D() {
		return BA_Rubor_Tobillos_D;
	}

	/**
	 * @param bA_Rubor_Tobillos_D
	 *            the bA_Rubor_Tobillos_D to set
	 */
	public void setBA_Rubor_Tobillos_D(String bA_Rubor_Tobillos_D) {
		BA_Rubor_Tobillos_D = bA_Rubor_Tobillos_D;
	}

	/**
	 * @return the bA_Rubor_Tobillos_I
	 */
	public String getBA_Rubor_Tobillos_I() {
		return BA_Rubor_Tobillos_I;
	}

	/**
	 * @param bA_Rubor_Tobillos_I
	 *            the bA_Rubor_Tobillos_I to set
	 */
	public void setBA_Rubor_Tobillos_I(String bA_Rubor_Tobillos_I) {
		BA_Rubor_Tobillos_I = bA_Rubor_Tobillos_I;
	}

	/**
	 * @return the bA_Sensibilidad_Cadera_D
	 */
	public String getBA_Sensibilidad_Cadera_D() {
		return BA_Sensibilidad_Cadera_D;
	}

	/**
	 * @param bA_Sensibilidad_Cadera_D
	 *            the bA_Sensibilidad_Cadera_D to set
	 */
	public void setBA_Sensibilidad_Cadera_D(String bA_Sensibilidad_Cadera_D) {
		BA_Sensibilidad_Cadera_D = bA_Sensibilidad_Cadera_D;
	}

	/**
	 * @return the bA_Sensibilidad_Cadera_I
	 */
	public String getBA_Sensibilidad_Cadera_I() {
		return BA_Sensibilidad_Cadera_I;
	}

	/**
	 * @param bA_Sensibilidad_Cadera_I
	 *            the bA_Sensibilidad_Cadera_I to set
	 */
	public void setBA_Sensibilidad_Cadera_I(String bA_Sensibilidad_Cadera_I) {
		BA_Sensibilidad_Cadera_I = bA_Sensibilidad_Cadera_I;
	}

	/**
	 * @return the bA_Sensibilidad_Codos_D
	 */
	public String getBA_Sensibilidad_Codos_D() {
		return BA_Sensibilidad_Codos_D;
	}

	/**
	 * @param bA_Sensibilidad_Codos_D
	 *            the bA_Sensibilidad_Codos_D to set
	 */
	public void setBA_Sensibilidad_Codos_D(String bA_Sensibilidad_Codos_D) {
		BA_Sensibilidad_Codos_D = bA_Sensibilidad_Codos_D;
	}

	/**
	 * @return the bA_Sensibilidad_Codos_I
	 */
	public String getBA_Sensibilidad_Codos_I() {
		return BA_Sensibilidad_Codos_I;
	}

	/**
	 * @param bA_Sensibilidad_Codos_I
	 *            the bA_Sensibilidad_Codos_I to set
	 */
	public void setBA_Sensibilidad_Codos_I(String bA_Sensibilidad_Codos_I) {
		BA_Sensibilidad_Codos_I = bA_Sensibilidad_Codos_I;
	}

	/**
	 * @return the bA_Sensibilidad_Dedos_Mano_D
	 */
	public String getBA_Sensibilidad_Dedos_Mano_D() {
		return BA_Sensibilidad_Dedos_Mano_D;
	}

	/**
	 * @param bA_Sensibilidad_Dedos_Mano_D
	 *            the bA_Sensibilidad_Dedos_Mano_D to set
	 */
	public void setBA_Sensibilidad_Dedos_Mano_D(String bA_Sensibilidad_Dedos_Mano_D) {
		BA_Sensibilidad_Dedos_Mano_D = bA_Sensibilidad_Dedos_Mano_D;
	}

	/**
	 * @return the bA_Sensibilidad_Dedos_Mano_I
	 */
	public String getBA_Sensibilidad_Dedos_Mano_I() {
		return BA_Sensibilidad_Dedos_Mano_I;
	}

	/**
	 * @param bA_Sensibilidad_Dedos_Mano_I
	 *            the bA_Sensibilidad_Dedos_Mano_I to set
	 */
	public void setBA_Sensibilidad_Dedos_Mano_I(String bA_Sensibilidad_Dedos_Mano_I) {
		BA_Sensibilidad_Dedos_Mano_I = bA_Sensibilidad_Dedos_Mano_I;
	}

	/**
	 * @return the bA_Sensibilidad_Dedos_Pie_D
	 */
	public String getBA_Sensibilidad_Dedos_Pie_D() {
		return BA_Sensibilidad_Dedos_Pie_D;
	}

	/**
	 * @param bA_Sensibilidad_Dedos_Pie_D
	 *            the bA_Sensibilidad_Dedos_Pie_D to set
	 */
	public void setBA_Sensibilidad_Dedos_Pie_D(String bA_Sensibilidad_Dedos_Pie_D) {
		BA_Sensibilidad_Dedos_Pie_D = bA_Sensibilidad_Dedos_Pie_D;
	}

	/**
	 * @return the bA_Sensibilidad_Dedos_Pie_I
	 */
	public String getBA_Sensibilidad_Dedos_Pie_I() {
		return BA_Sensibilidad_Dedos_Pie_I;
	}

	/**
	 * @param bA_Sensibilidad_Dedos_Pie_I
	 *            the bA_Sensibilidad_Dedos_Pie_I to set
	 */
	public void setBA_Sensibilidad_Dedos_Pie_I(String bA_Sensibilidad_Dedos_Pie_I) {
		BA_Sensibilidad_Dedos_Pie_I = bA_Sensibilidad_Dedos_Pie_I;
	}

	/**
	 * @return the bA_Sensibilidad_Hombros_D
	 */
	public String getBA_Sensibilidad_Hombros_D() {
		return BA_Sensibilidad_Hombros_D;
	}

	/**
	 * @param bA_Sensibilidad_Hombros_D
	 *            the bA_Sensibilidad_Hombros_D to set
	 */
	public void setBA_Sensibilidad_Hombros_D(String bA_Sensibilidad_Hombros_D) {
		BA_Sensibilidad_Hombros_D = bA_Sensibilidad_Hombros_D;
	}

	/**
	 * @return the bA_Sensibilidad_Hombros_I
	 */
	public String getBA_Sensibilidad_Hombros_I() {
		return BA_Sensibilidad_Hombros_I;
	}

	/**
	 * @param bA_Sensibilidad_Hombros_I
	 *            the bA_Sensibilidad_Hombros_I to set
	 */
	public void setBA_Sensibilidad_Hombros_I(String bA_Sensibilidad_Hombros_I) {
		BA_Sensibilidad_Hombros_I = bA_Sensibilidad_Hombros_I;
	}

	/**
	 * @return the bA_Sensibilidad_Munecas_D
	 */
	public String getBA_Sensibilidad_Munecas_D() {
		return BA_Sensibilidad_Munecas_D;
	}

	/**
	 * @param bA_Sensibilidad_Munecas_D
	 *            the bA_Sensibilidad_Munecas_D to set
	 */
	public void setBA_Sensibilidad_Munecas_D(String bA_Sensibilidad_Munecas_D) {
		BA_Sensibilidad_Munecas_D = bA_Sensibilidad_Munecas_D;
	}

	/**
	 * @return the bA_Sensibilidad_Munecas_I
	 */
	public String getBA_Sensibilidad_Munecas_I() {
		return BA_Sensibilidad_Munecas_I;
	}

	/**
	 * @param bA_Sensibilidad_Munecas_I
	 *            the bA_Sensibilidad_Munecas_I to set
	 */
	public void setBA_Sensibilidad_Munecas_I(String bA_Sensibilidad_Munecas_I) {
		BA_Sensibilidad_Munecas_I = bA_Sensibilidad_Munecas_I;
	}

	/**
	 * @return the bA_Sensibilidad_Rodilla_D
	 */
	public String getBA_Sensibilidad_Rodilla_D() {
		return BA_Sensibilidad_Rodilla_D;
	}

	/**
	 * @param bA_Sensibilidad_Rodilla_D
	 *            the bA_Sensibilidad_Rodilla_D to set
	 */
	public void setBA_Sensibilidad_Rodilla_D(String bA_Sensibilidad_Rodilla_D) {
		BA_Sensibilidad_Rodilla_D = bA_Sensibilidad_Rodilla_D;
	}

	/**
	 * @return the bA_Sensibilidad_Rodilla_I
	 */
	public String getBA_Sensibilidad_Rodilla_I() {
		return BA_Sensibilidad_Rodilla_I;
	}

	/**
	 * @param bA_Sensibilidad_Rodilla_I
	 *            the bA_Sensibilidad_Rodilla_I to set
	 */
	public void setBA_Sensibilidad_Rodilla_I(String bA_Sensibilidad_Rodilla_I) {
		BA_Sensibilidad_Rodilla_I = bA_Sensibilidad_Rodilla_I;
	}

	/**
	 * @return the bA_Sensibilidad_Tobillos_D
	 */
	public String getBA_Sensibilidad_Tobillos_D() {
		return BA_Sensibilidad_Tobillos_D;
	}

	/**
	 * @param bA_Sensibilidad_Tobillos_D
	 *            the bA_Sensibilidad_Tobillos_D to set
	 */
	public void setBA_Sensibilidad_Tobillos_D(String bA_Sensibilidad_Tobillos_D) {
		BA_Sensibilidad_Tobillos_D = bA_Sensibilidad_Tobillos_D;
	}

	/**
	 * @return the bA_Sensibilidad_Tobillos_I
	 */
	public String getBA_Sensibilidad_Tobillos_I() {
		return BA_Sensibilidad_Tobillos_I;
	}

	/**
	 * @param bA_Sensibilidad_Tobillos_I
	 *            the bA_Sensibilidad_Tobillos_I to set
	 */
	public void setBA_Sensibilidad_Tobillos_I(String bA_Sensibilidad_Tobillos_I) {
		BA_Sensibilidad_Tobillos_I = bA_Sensibilidad_Tobillos_I;
	}

	/**
	 * @return the bM_Antebrazo
	 */
	public String getBM_Antebrazo() {
		return BM_Antebrazo;
	}

	/**
	 * @param bM_Antebrazo
	 *            the bM_Antebrazo to set
	 */
	public void setBM_Antebrazo(String bM_Antebrazo) {
		BM_Antebrazo = bM_Antebrazo;
	}

	/**
	 * @return the bM_Antebrazo_Observaciones
	 */
	public String getBM_Antebrazo_Observaciones() {
		return BM_Antebrazo_Observaciones;
	}

	/**
	 * @param bM_Antebrazo_Observaciones
	 *            the bM_Antebrazo_Observaciones to set
	 */
	public void setBM_Antebrazo_Observaciones(String bM_Antebrazo_Observaciones) {
		BM_Antebrazo_Observaciones = bM_Antebrazo_Observaciones;
	}

	/**
	 * @return the bM_Brazo
	 */
	public String getBM_Brazo() {
		return BM_Brazo;
	}

	/**
	 * @param bM_Brazo
	 *            the bM_Brazo to set
	 */
	public void setBM_Brazo(String bM_Brazo) {
		BM_Brazo = bM_Brazo;
	}

	/**
	 * @return the bM_Brazo_Observaciones
	 */
	public String getBM_Brazo_Observaciones() {
		return BM_Brazo_Observaciones;
	}

	/**
	 * @param bM_Brazo_Observaciones
	 *            the bM_Brazo_Observaciones to set
	 */
	public void setBM_Brazo_Observaciones(String bM_Brazo_Observaciones) {
		BM_Brazo_Observaciones = bM_Brazo_Observaciones;
	}

	/**
	 * @return the bM_Cadera_Gluteo
	 */
	public String getBM_Cadera_Gluteo() {
		return BM_Cadera_Gluteo;
	}

	/**
	 * @param bM_Cadera_Gluteo
	 *            the bM_Cadera_Gluteo to set
	 */
	public void setBM_Cadera_Gluteo(String bM_Cadera_Gluteo) {
		BM_Cadera_Gluteo = bM_Cadera_Gluteo;
	}

	/**
	 * @return the bM_Cadera_Gluteo_Observaciones
	 */
	public String getBM_Cadera_Gluteo_Observaciones() {
		return BM_Cadera_Gluteo_Observaciones;
	}

	/**
	 * @param bM_Cadera_Gluteo_Observaciones
	 *            the bM_Cadera_Gluteo_Observaciones to set
	 */
	public void setBM_Cadera_Gluteo_Observaciones(String bM_Cadera_Gluteo_Observaciones) {
		BM_Cadera_Gluteo_Observaciones = bM_Cadera_Gluteo_Observaciones;
	}

	/**
	 * @return the bM_Cintura_Escapular
	 */
	public String getBM_Cintura_Escapular() {
		return BM_Cintura_Escapular;
	}

	/**
	 * @param bM_Cintura_Escapular
	 *            the bM_Cintura_Escapular to set
	 */
	public void setBM_Cintura_Escapular(String bM_Cintura_Escapular) {
		BM_Cintura_Escapular = bM_Cintura_Escapular;
	}

	/**
	 * @return the bM_Cintura_Escapular_Observaciones
	 */
	public String getBM_Cintura_Escapular_Observaciones() {
		return BM_Cintura_Escapular_Observaciones;
	}

	/**
	 * @param bM_Cintura_Escapular_Observaciones
	 *            the bM_Cintura_Escapular_Observaciones to set
	 */
	public void setBM_Cintura_Escapular_Observaciones(String bM_Cintura_Escapular_Observaciones) {
		BM_Cintura_Escapular_Observaciones = bM_Cintura_Escapular_Observaciones;
	}

	/**
	 * @return the bM_Explicacion
	 */
	public String getBM_Explicacion() {
		return BM_Explicacion;
	}

	/**
	 * @param bM_Explicacion
	 *            the bM_Explicacion to set
	 */
	public void setBM_Explicacion(String bM_Explicacion) {
		BM_Explicacion = bM_Explicacion;
	}

	/**
	 * @return the bM_Muslos
	 */
	public String getBM_Muslos() {
		return BM_Muslos;
	}

	/**
	 * @param bM_Muslos
	 *            the bM_Muslos to set
	 */
	public void setBM_Muslos(String bM_Muslos) {
		BM_Muslos = bM_Muslos;
	}

	/**
	 * @return the bM_Muslos_Observaciones
	 */
	public String getBM_Muslos_Observaciones() {
		return BM_Muslos_Observaciones;
	}

	/**
	 * @param bM_Muslos_Observaciones
	 *            the bM_Muslos_Observaciones to set
	 */
	public void setBM_Muslos_Observaciones(String bM_Muslos_Observaciones) {
		BM_Muslos_Observaciones = bM_Muslos_Observaciones;
	}

	/**
	 * @return the bM_Pectoral
	 */
	public String getBM_Pectoral() {
		return BM_Pectoral;
	}

	/**
	 * @param bM_Pectoral
	 *            the bM_Pectoral to set
	 */
	public void setBM_Pectoral(String bM_Pectoral) {
		BM_Pectoral = bM_Pectoral;
	}

	/**
	 * @return the bM_Pectoral_Observaciones
	 */
	public String getBM_Pectoral_Observaciones() {
		return BM_Pectoral_Observaciones;
	}

	/**
	 * @param bM_Pectoral_Observaciones
	 *            the bM_Pectoral_Observaciones to set
	 */
	public void setBM_Pectoral_Observaciones(String bM_Pectoral_Observaciones) {
		BM_Pectoral_Observaciones = bM_Pectoral_Observaciones;
	}

	/**
	 * @return the bM_Piernas
	 */
	public String getBM_Piernas() {
		return BM_Piernas;
	}

	/**
	 * @param bM_Piernas
	 *            the bM_Piernas to set
	 */
	public void setBM_Piernas(String bM_Piernas) {
		BM_Piernas = bM_Piernas;
	}

	/**
	 * @return the bM_Piernas_Observaciones
	 */
	public String getBM_Piernas_Observaciones() {
		return BM_Piernas_Observaciones;
	}

	/**
	 * @param bM_Piernas_Observaciones
	 *            the bM_Piernas_Observaciones to set
	 */
	public void setBM_Piernas_Observaciones(String bM_Piernas_Observaciones) {
		BM_Piernas_Observaciones = bM_Piernas_Observaciones;
	}

	/**
	 * @return the cabezaCuello
	 */
	public String getCabezaCuello() {
		return CabezaCuello;
	}

	/**
	 * @param cabezaCuello
	 *            the cabezaCuello to set
	 */
	public void setCabezaCuello(String cabezaCuello) {
		CabezaCuello = cabezaCuello;
	}

	/**
	 * @return the cabezaCuello_Descripcion
	 */
	public String getCabezaCuello_Descripcion() {
		return CabezaCuello_Descripcion;
	}

	/**
	 * @param cabezaCuello_Descripcion
	 *            the cabezaCuello_Descripcion to set
	 */
	public void setCabezaCuello_Descripcion(String cabezaCuello_Descripcion) {
		CabezaCuello_Descripcion = cabezaCuello_Descripcion;
	}

	/**
	 * @return the columna
	 */
	public String getColumna() {
		return Columna;
	}

	/**
	 * @param columna
	 *            the columna to set
	 */
	public void setColumna(String columna) {
		Columna = columna;
	}

	/**
	 * @return the columnaInspeccionCurvatura
	 */
	public String getColumnaInspeccionCurvatura() {
		return ColumnaInspeccionCurvatura;
	}

	/**
	 * @param columnaInspeccionCurvatura
	 *            the columnaInspeccionCurvatura to set
	 */
	public void setColumnaInspeccionCurvatura(String columnaInspeccionCurvatura) {
		ColumnaInspeccionCurvatura = columnaInspeccionCurvatura;
	}

	/**
	 * @return the columnaInspeccionCurvatura_Descripcion
	 */
	public String getColumnaInspeccionCurvatura_Descripcion() {
		return ColumnaInspeccionCurvatura_Descripcion;
	}

	/**
	 * @param columnaInspeccionCurvatura_Descripcion
	 *            the columnaInspeccionCurvatura_Descripcion to set
	 */
	public void setColumnaInspeccionCurvatura_Descripcion(String columnaInspeccionCurvatura_Descripcion) {
		ColumnaInspeccionCurvatura_Descripcion = columnaInspeccionCurvatura_Descripcion;
	}

	/**
	 * @return the columnaInspeccionSimetria
	 */
	public String getColumnaInspeccionSimetria() {
		return ColumnaInspeccionSimetria;
	}

	/**
	 * @param columnaInspeccionSimetria
	 *            the columnaInspeccionSimetria to set
	 */
	public void setColumnaInspeccionSimetria(String columnaInspeccionSimetria) {
		ColumnaInspeccionSimetria = columnaInspeccionSimetria;
	}

	/**
	 * @return the columnaInspeccionSimetria_Descripcion
	 */
	public String getColumnaInspeccionSimetria_Descripcion() {
		return ColumnaInspeccionSimetria_Descripcion;
	}

	/**
	 * @param columnaInspeccionSimetria_Descripcion
	 *            the columnaInspeccionSimetria_Descripcion to set
	 */
	public void setColumnaInspeccionSimetria_Descripcion(String columnaInspeccionSimetria_Descripcion) {
		ColumnaInspeccionSimetria_Descripcion = columnaInspeccionSimetria_Descripcion;
	}

	/**
	 * @return the columnaMarchaPuntas
	 */
	public String getColumnaMarchaPuntas() {
		return ColumnaMarchaPuntas;
	}

	/**
	 * @param columnaMarchaPuntas
	 *            the columnaMarchaPuntas to set
	 */
	public void setColumnaMarchaPuntas(String columnaMarchaPuntas) {
		ColumnaMarchaPuntas = columnaMarchaPuntas;
	}

	/**
	 * @return the columnaMarchaPuntas_Descripcion
	 */
	public String getColumnaMarchaPuntas_Descripcion() {
		return ColumnaMarchaPuntas_Descripcion;
	}

	/**
	 * @param columnaMarchaPuntas_Descripcion
	 *            the columnaMarchaPuntas_Descripcion to set
	 */
	public void setColumnaMarchaPuntas_Descripcion(String columnaMarchaPuntas_Descripcion) {
		ColumnaMarchaPuntas_Descripcion = columnaMarchaPuntas_Descripcion;
	}

	/**
	 * @return the columnaMarchaTalones
	 */
	public String getColumnaMarchaTalones() {
		return ColumnaMarchaTalones;
	}

	/**
	 * @param columnaMarchaTalones
	 *            the columnaMarchaTalones to set
	 */
	public void setColumnaMarchaTalones(String columnaMarchaTalones) {
		ColumnaMarchaTalones = columnaMarchaTalones;
	}

	/**
	 * @return the columnaMarchaTalones_Descripcion
	 */
	public String getColumnaMarchaTalones_Descripcion() {
		return ColumnaMarchaTalones_Descripcion;
	}

	/**
	 * @param columnaMarchaTalones_Descripcion
	 *            the columnaMarchaTalones_Descripcion to set
	 */
	public void setColumnaMarchaTalones_Descripcion(String columnaMarchaTalones_Descripcion) {
		ColumnaMarchaTalones_Descripcion = columnaMarchaTalones_Descripcion;
	}

	/**
	 * @return the columnaMovilidadExtension
	 */
	public String getColumnaMovilidadExtension() {
		return ColumnaMovilidadExtension;
	}

	/**
	 * @param columnaMovilidadExtension
	 *            the columnaMovilidadExtension to set
	 */
	public void setColumnaMovilidadExtension(String columnaMovilidadExtension) {
		ColumnaMovilidadExtension = columnaMovilidadExtension;
	}

	/**
	 * @return the columnaMovilidadExtension_Descripcion
	 */
	public String getColumnaMovilidadExtension_Descripcion() {
		return ColumnaMovilidadExtension_Descripcion;
	}

	/**
	 * @param columnaMovilidadExtension_Descripcion
	 *            the columnaMovilidadExtension_Descripcion to set
	 */
	public void setColumnaMovilidadExtension_Descripcion(String columnaMovilidadExtension_Descripcion) {
		ColumnaMovilidadExtension_Descripcion = columnaMovilidadExtension_Descripcion;
	}

	/**
	 * @return the columnaMovilidadFlexion
	 */
	public String getColumnaMovilidadFlexion() {
		return ColumnaMovilidadFlexion;
	}

	/**
	 * @param columnaMovilidadFlexion
	 *            the columnaMovilidadFlexion to set
	 */
	public void setColumnaMovilidadFlexion(String columnaMovilidadFlexion) {
		ColumnaMovilidadFlexion = columnaMovilidadFlexion;
	}

	/**
	 * @return the columnaMovilidadFlexion_Descripcion
	 */
	public String getColumnaMovilidadFlexion_Descripcion() {
		return ColumnaMovilidadFlexion_Descripcion;
	}

	/**
	 * @param columnaMovilidadFlexion_Descripcion
	 *            the columnaMovilidadFlexion_Descripcion to set
	 */
	public void setColumnaMovilidadFlexion_Descripcion(String columnaMovilidadFlexion_Descripcion) {
		ColumnaMovilidadFlexion_Descripcion = columnaMovilidadFlexion_Descripcion;
	}

	/**
	 * @return the columnaMovilidadFlexionLateral
	 */
	public String getColumnaMovilidadFlexionLateral() {
		return ColumnaMovilidadFlexionLateral;
	}

	/**
	 * @param columnaMovilidadFlexionLateral
	 *            the columnaMovilidadFlexionLateral to set
	 */
	public void setColumnaMovilidadFlexionLateral(String columnaMovilidadFlexionLateral) {
		ColumnaMovilidadFlexionLateral = columnaMovilidadFlexionLateral;
	}

	/**
	 * @return the columnaMovilidadFlexionLateral_Descripcion
	 */
	public String getColumnaMovilidadFlexionLateral_Descripcion() {
		return ColumnaMovilidadFlexionLateral_Descripcion;
	}

	/**
	 * @param columnaMovilidadFlexionLateral_Descripcion
	 *            the columnaMovilidadFlexionLateral_Descripcion to set
	 */
	public void setColumnaMovilidadFlexionLateral_Descripcion(String columnaMovilidadFlexionLateral_Descripcion) {
		ColumnaMovilidadFlexionLateral_Descripcion = columnaMovilidadFlexionLateral_Descripcion;
	}

	/**
	 * @return the columnaMovilidadRotacion
	 */
	public String getColumnaMovilidadRotacion() {
		return ColumnaMovilidadRotacion;
	}

	/**
	 * @param columnaMovilidadRotacion
	 *            the columnaMovilidadRotacion to set
	 */
	public void setColumnaMovilidadRotacion(String columnaMovilidadRotacion) {
		ColumnaMovilidadRotacion = columnaMovilidadRotacion;
	}

	/**
	 * @return the columnaMovilidadRotacion_Descripcion
	 */
	public String getColumnaMovilidadRotacion_Descripcion() {
		return ColumnaMovilidadRotacion_Descripcion;
	}

	/**
	 * @param columnaMovilidadRotacion_Descripcion
	 *            the columnaMovilidadRotacion_Descripcion to set
	 */
	public void setColumnaMovilidadRotacion_Descripcion(String columnaMovilidadRotacion_Descripcion) {
		ColumnaMovilidadRotacion_Descripcion = columnaMovilidadRotacion_Descripcion;
	}

	/**
	 * @return the columnaPalpacionDolor
	 */
	public String getColumnaPalpacionDolor() {
		return ColumnaPalpacionDolor;
	}

	/**
	 * @param columnaPalpacionDolor
	 *            the columnaPalpacionDolor to set
	 */
	public void setColumnaPalpacionDolor(String columnaPalpacionDolor) {
		ColumnaPalpacionDolor = columnaPalpacionDolor;
	}

	/**
	 * @return the columnaPalpacionDolor_Descripcion
	 */
	public String getColumnaPalpacionDolor_Descripcion() {
		return ColumnaPalpacionDolor_Descripcion;
	}

	/**
	 * @param columnaPalpacionDolor_Descripcion
	 *            the columnaPalpacionDolor_Descripcion to set
	 */
	public void setColumnaPalpacionDolor_Descripcion(String columnaPalpacionDolor_Descripcion) {
		ColumnaPalpacionDolor_Descripcion = columnaPalpacionDolor_Descripcion;
	}

	/**
	 * @return the columnaPalpacionEspasmo
	 */
	public String getColumnaPalpacionEspasmo() {
		return ColumnaPalpacionEspasmo;
	}

	/**
	 * @param columnaPalpacionEspasmo
	 *            the columnaPalpacionEspasmo to set
	 */
	public void setColumnaPalpacionEspasmo(String columnaPalpacionEspasmo) {
		ColumnaPalpacionEspasmo = columnaPalpacionEspasmo;
	}

	/**
	 * @return the columnaPalpacionEspasmo_Descripcion
	 */
	public String getColumnaPalpacionEspasmo_Descripcion() {
		return ColumnaPalpacionEspasmo_Descripcion;
	}

	/**
	 * @param columnaPalpacionEspasmo_Descripcion
	 *            the columnaPalpacionEspasmo_Descripcion to set
	 */
	public void setColumnaPalpacionEspasmo_Descripcion(String columnaPalpacionEspasmo_Descripcion) {
		ColumnaPalpacionEspasmo_Descripcion = columnaPalpacionEspasmo_Descripcion;
	}

	/**
	 * @return the columnaTrofismoMuscular
	 */
	public String getColumnaTrofismoMuscular() {
		return ColumnaTrofismoMuscular;
	}

	/**
	 * @param columnaTrofismoMuscular
	 *            the columnaTrofismoMuscular to set
	 */
	public void setColumnaTrofismoMuscular(String columnaTrofismoMuscular) {
		ColumnaTrofismoMuscular = columnaTrofismoMuscular;
	}

	/**
	 * @return the columnaTrofismoMuscular_Descripcion
	 */
	public String getColumnaTrofismoMuscular_Descripcion() {
		return ColumnaTrofismoMuscular_Descripcion;
	}

	/**
	 * @param columnaTrofismoMuscular_Descripcion
	 *            the columnaTrofismoMuscular_Descripcion to set
	 */
	public void setColumnaTrofismoMuscular_Descripcion(String columnaTrofismoMuscular_Descripcion) {
		ColumnaTrofismoMuscular_Descripcion = columnaTrofismoMuscular_Descripcion;
	}

	/**
	 * @return the dominancia
	 */
	public String getDominancia() {
		return Dominancia;
	}

	/**
	 * @param dominancia
	 *            the dominancia to set
	 */
	public void setDominancia(String dominancia) {
		Dominancia = dominancia;
	}

	/**
	 * @return the estadoGeneral
	 */
	public String getEstadoGeneral() {
		return EstadoGeneral;
	}

	/**
	 * @param estadoGeneral
	 *            the estadoGeneral to set
	 */
	public void setEstadoGeneral(String estadoGeneral) {
		EstadoGeneral = estadoGeneral;
	}

	/**
	 * @return the extremidadInferior
	 */
	public String getExtremidadInferior() {
		return ExtremidadInferior;
	}

	/**
	 * @param extremidadInferior
	 *            the extremidadInferior to set
	 */
	public void setExtremidadInferior(String extremidadInferior) {
		ExtremidadInferior = extremidadInferior;
	}

	/**
	 * @return the extremidadInferior_Descripcion
	 */
	public String getExtremidadInferior_Descripcion() {
		return ExtremidadInferior_Descripcion;
	}

	/**
	 * @param extremidadInferior_Descripcion
	 *            the extremidadInferior_Descripcion to set
	 */
	public void setExtremidadInferior_Descripcion(String extremidadInferior_Descripcion) {
		ExtremidadInferior_Descripcion = extremidadInferior_Descripcion;
	}

	/**
	 * @return the extremidadInferior_Juanetes
	 */
	public String getExtremidadInferior_Juanetes() {
		return ExtremidadInferior_Juanetes;
	}

	/**
	 * @param extremidadInferior_Juanetes
	 *            the extremidadInferior_Juanetes to set
	 */
	public void setExtremidadInferior_Juanetes(String extremidadInferior_Juanetes) {
		ExtremidadInferior_Juanetes = extremidadInferior_Juanetes;
	}

	/**
	 * @return the extremidadInferior_Observaciones
	 */
	public String getExtremidadInferior_Observaciones() {
		return ExtremidadInferior_Observaciones;
	}

	/**
	 * @param extremidadInferior_Observaciones
	 *            the extremidadInferior_Observaciones to set
	 */
	public void setExtremidadInferior_Observaciones(String extremidadInferior_Observaciones) {
		ExtremidadInferior_Observaciones = extremidadInferior_Observaciones;
	}

	/**
	 * @return the extremidadInferior_Varices
	 */
	public String getExtremidadInferior_Varices() {
		return ExtremidadInferior_Varices;
	}

	/**
	 * @param extremidadInferior_Varices
	 *            the extremidadInferior_Varices to set
	 */
	public void setExtremidadInferior_Varices(String extremidadInferior_Varices) {
		ExtremidadInferior_Varices = extremidadInferior_Varices;
	}

	/**
	 * @return the extremidadSuperior
	 */
	public String getExtremidadSuperior() {
		return ExtremidadSuperior;
	}

	/**
	 * @param extremidadSuperior
	 *            the extremidadSuperior to set
	 */
	public void setExtremidadSuperior(String extremidadSuperior) {
		ExtremidadSuperior = extremidadSuperior;
	}

	/**
	 * @return the extremidadSuperior_Descripcion
	 */
	public String getExtremidadSuperior_Descripcion() {
		return ExtremidadSuperior_Descripcion;
	}

	/**
	 * @param extremidadSuperior_Descripcion
	 *            the extremidadSuperior_Descripcion to set
	 */
	public void setExtremidadSuperior_Descripcion(String extremidadSuperior_Descripcion) {
		ExtremidadSuperior_Descripcion = extremidadSuperior_Descripcion;
	}

	/**
	 * @return the extremidadSuperior_FinkelsteinDerecho
	 */
	public String getExtremidadSuperior_FinkelsteinDerecho() {
		return ExtremidadSuperior_FinkelsteinDerecho;
	}

	/**
	 * @param extremidadSuperior_FinkelsteinDerecho
	 *            the extremidadSuperior_FinkelsteinDerecho to set
	 */
	public void setExtremidadSuperior_FinkelsteinDerecho(String extremidadSuperior_FinkelsteinDerecho) {
		ExtremidadSuperior_FinkelsteinDerecho = extremidadSuperior_FinkelsteinDerecho;
	}

	/**
	 * @return the extremidadSuperior_FinkelsteinIzquierdo
	 */
	public String getExtremidadSuperior_FinkelsteinIzquierdo() {
		return ExtremidadSuperior_FinkelsteinIzquierdo;
	}

	/**
	 * @param extremidadSuperior_FinkelsteinIzquierdo
	 *            the extremidadSuperior_FinkelsteinIzquierdo to set
	 */
	public void setExtremidadSuperior_FinkelsteinIzquierdo(String extremidadSuperior_FinkelsteinIzquierdo) {
		ExtremidadSuperior_FinkelsteinIzquierdo = extremidadSuperior_FinkelsteinIzquierdo;
	}

	/**
	 * @return the extremidadSuperior_PhalenDerecho
	 */
	public String getExtremidadSuperior_PhalenDerecho() {
		return ExtremidadSuperior_PhalenDerecho;
	}

	/**
	 * @param extremidadSuperior_PhalenDerecho
	 *            the extremidadSuperior_PhalenDerecho to set
	 */
	public void setExtremidadSuperior_PhalenDerecho(String extremidadSuperior_PhalenDerecho) {
		ExtremidadSuperior_PhalenDerecho = extremidadSuperior_PhalenDerecho;
	}

	/**
	 * @return the extremidadSuperior_PhalenIzquierdo
	 */
	public String getExtremidadSuperior_PhalenIzquierdo() {
		return ExtremidadSuperior_PhalenIzquierdo;
	}

	/**
	 * @param extremidadSuperior_PhalenIzquierdo
	 *            the extremidadSuperior_PhalenIzquierdo to set
	 */
	public void setExtremidadSuperior_PhalenIzquierdo(String extremidadSuperior_PhalenIzquierdo) {
		ExtremidadSuperior_PhalenIzquierdo = extremidadSuperior_PhalenIzquierdo;
	}

	/**
	 * @return the extremidadSuperior_TinelDerecho
	 */
	public String getExtremidadSuperior_TinelDerecho() {
		return ExtremidadSuperior_TinelDerecho;
	}

	/**
	 * @param extremidadSuperior_TinelDerecho
	 *            the extremidadSuperior_TinelDerecho to set
	 */
	public void setExtremidadSuperior_TinelDerecho(String extremidadSuperior_TinelDerecho) {
		ExtremidadSuperior_TinelDerecho = extremidadSuperior_TinelDerecho;
	}

	/**
	 * @return the extremidadSuperior_TinelIzquierdo
	 */
	public String getExtremidadSuperior_TinelIzquierdo() {
		return ExtremidadSuperior_TinelIzquierdo;
	}

	/**
	 * @param extremidadSuperior_TinelIzquierdo
	 *            the extremidadSuperior_TinelIzquierdo to set
	 */
	public void setExtremidadSuperior_TinelIzquierdo(String extremidadSuperior_TinelIzquierdo) {
		ExtremidadSuperior_TinelIzquierdo = extremidadSuperior_TinelIzquierdo;
	}

	/**
	 * @return the fondoOjoDerecho
	 */
	public String getFondoOjoDerecho() {
		return FondoOjoDerecho;
	}

	/**
	 * @param fondoOjoDerecho
	 *            the fondoOjoDerecho to set
	 */
	public void setFondoOjoDerecho(String fondoOjoDerecho) {
		FondoOjoDerecho = fondoOjoDerecho;
	}

	/**
	 * @return the fondoOjoIzquierdo
	 */
	public String getFondoOjoIzquierdo() {
		return FondoOjoIzquierdo;
	}

	/**
	 * @param fondoOjoIzquierdo
	 *            the fondoOjoIzquierdo to set
	 */
	public void setFondoOjoIzquierdo(String fondoOjoIzquierdo) {
		FondoOjoIzquierdo = fondoOjoIzquierdo;
	}

	/**
	 * @return the fondoOjos_Descripcion
	 */
	public String getFondoOjos_Descripcion() {
		return FondoOjos_Descripcion;
	}

	/**
	 * @param fondoOjos_Descripcion
	 *            the fondoOjos_Descripcion to set
	 */
	public void setFondoOjos_Descripcion(String fondoOjos_Descripcion) {
		FondoOjos_Descripcion = fondoOjos_Descripcion;
	}

	/**
	 * @return the genitalesExternos
	 */
	public String getGenitalesExternos() {
		return GenitalesExternos;
	}

	/**
	 * @param genitalesExternos
	 *            the genitalesExternos to set
	 */
	public void setGenitalesExternos(String genitalesExternos) {
		GenitalesExternos = genitalesExternos;
	}

	/**
	 * @return the genitalesExternos_Descripcion
	 */
	public String getGenitalesExternos_Descripcion() {
		return GenitalesExternos_Descripcion;
	}

	/**
	 * @param genitalesExternos_Descripcion
	 *            the genitalesExternos_Descripcion to set
	 */
	public void setGenitalesExternos_Descripcion(String genitalesExternos_Descripcion) {
		GenitalesExternos_Descripcion = genitalesExternos_Descripcion;
	}

	/**
	 * @return the genitalesExternos_Hernias
	 */
	public String getGenitalesExternos_Hernias() {
		return GenitalesExternos_Hernias;
	}

	/**
	 * @param genitalesExternos_Hernias
	 *            the genitalesExternos_Hernias to set
	 */
	public void setGenitalesExternos_Hernias(String genitalesExternos_Hernias) {
		GenitalesExternos_Hernias = genitalesExternos_Hernias;
	}

	/**
	 * @return the neurologico
	 */
	public String getNeurologico() {
		return Neurologico;
	}

	/**
	 * @param neurologico
	 *            the neurologico to set
	 */
	public void setNeurologico(String neurologico) {
		Neurologico = neurologico;
	}

	/**
	 * @return the neurologico_Cordinacion_MarchaEnLinea
	 */
	public String getNeurologico_Cordinacion_MarchaEnLinea() {
		return Neurologico_Cordinacion_MarchaEnLinea;
	}

	/**
	 * @param neurologico_Cordinacion_MarchaEnLinea
	 *            the neurologico_Cordinacion_MarchaEnLinea to set
	 */
	public void setNeurologico_Cordinacion_MarchaEnLinea(String neurologico_Cordinacion_MarchaEnLinea) {
		Neurologico_Cordinacion_MarchaEnLinea = neurologico_Cordinacion_MarchaEnLinea;
	}

	/**
	 * @return the neurologico_Cordinacion_Observaciones
	 */
	public String getNeurologico_Cordinacion_Observaciones() {
		return Neurologico_Cordinacion_Observaciones;
	}

	/**
	 * @param neurologico_Cordinacion_Observaciones
	 *            the neurologico_Cordinacion_Observaciones to set
	 */
	public void setNeurologico_Cordinacion_Observaciones(String neurologico_Cordinacion_Observaciones) {
		Neurologico_Cordinacion_Observaciones = neurologico_Cordinacion_Observaciones;
	}

	/**
	 * @return the neurologico_Cordinacion_Romberg
	 */
	public String getNeurologico_Cordinacion_Romberg() {
		return Neurologico_Cordinacion_Romberg;
	}

	/**
	 * @param neurologico_Cordinacion_Romberg
	 *            the neurologico_Cordinacion_Romberg to set
	 */
	public void setNeurologico_Cordinacion_Romberg(String neurologico_Cordinacion_Romberg) {
		Neurologico_Cordinacion_Romberg = neurologico_Cordinacion_Romberg;
	}

	/**
	 * @return the neurologico_EsferaMental
	 */
	public String getNeurologico_EsferaMental() {
		return Neurologico_EsferaMental;
	}

	/**
	 * @param neurologico_EsferaMental
	 *            the neurologico_EsferaMental to set
	 */
	public void setNeurologico_EsferaMental(String neurologico_EsferaMental) {
		Neurologico_EsferaMental = neurologico_EsferaMental;
	}

	/**
	 * @return the neurologico_ParesCraneanos
	 */
	public String getNeurologico_ParesCraneanos() {
		return Neurologico_ParesCraneanos;
	}

	/**
	 * @param neurologico_ParesCraneanos
	 *            the neurologico_ParesCraneanos to set
	 */
	public void setNeurologico_ParesCraneanos(String neurologico_ParesCraneanos) {
		Neurologico_ParesCraneanos = neurologico_ParesCraneanos;
	}

	/**
	 * @return the neurologico_Reflejos
	 */
	public String getNeurologico_Reflejos() {
		return Neurologico_Reflejos;
	}

	/**
	 * @param neurologico_Reflejos
	 *            the neurologico_Reflejos to set
	 */
	public void setNeurologico_Reflejos(String neurologico_Reflejos) {
		Neurologico_Reflejos = neurologico_Reflejos;
	}

	/**
	 * @return the neurologico_Sensibilidad
	 */
	public String getNeurologico_Sensibilidad() {
		return Neurologico_Sensibilidad;
	}

	/**
	 * @param neurologico_Sensibilidad
	 *            the neurologico_Sensibilidad to set
	 */
	public void setNeurologico_Sensibilidad(String neurologico_Sensibilidad) {
		Neurologico_Sensibilidad = neurologico_Sensibilidad;
	}

	/**
	 * @return the oidos
	 */
	public String getOidos() {
		return Oidos;
	}

	/**
	 * @param oidos
	 *            the oidos to set
	 */
	public void setOidos(String oidos) {
		Oidos = oidos;
	}

	/**
	 * @return the oidos_Descripcion
	 */
	public String getOidos_Descripcion() {
		return Oidos_Descripcion;
	}

	/**
	 * @param oidos_Descripcion
	 *            the oidos_Descripcion to set
	 */
	public void setOidos_Descripcion(String oidos_Descripcion) {
		Oidos_Descripcion = oidos_Descripcion;
	}

	/**
	 * @return the ojos
	 */
	public String getOjos() {
		return Ojos;
	}

	/**
	 * @param ojos
	 *            the ojos to set
	 */
	public void setOjos(String ojos) {
		Ojos = ojos;
	}

	/**
	 * @return the ojos_Descripcion
	 */
	public String getOjos_Descripcion() {
		return Ojos_Descripcion;
	}

	/**
	 * @param ojos_Descripcion
	 *            the ojos_Descripcion to set
	 */
	public void setOjos_Descripcion(String ojos_Descripcion) {
		Ojos_Descripcion = ojos_Descripcion;
	}

	/**
	 * @return the piel
	 */
	public String getPiel() {
		return Piel;
	}

	/**
	 * @param piel
	 *            the piel to set
	 */
	public void setPiel(String piel) {
		Piel = piel;
	}

	/**
	 * @return the piel_Descripcion
	 */
	public String getPiel_Descripcion() {
		return Piel_Descripcion;
	}

	/**
	 * @param piel_Descripcion
	 *            the piel_Descripcion to set
	 */
	public void setPiel_Descripcion(String piel_Descripcion) {
		Piel_Descripcion = piel_Descripcion;
	}

	/**
	 * @return the pruebaVertibular
	 */
	public String getPruebaVertibular() {
		return PruebaVertibular;
	}

	/**
	 * @param pruebaVertibular
	 *            the pruebaVertibular to set
	 */
	public void setPruebaVertibular(String pruebaVertibular) {
		PruebaVertibular = pruebaVertibular;
	}

	/**
	 * @return the pruebaVertibular_descripcion
	 */
	public String getPruebaVertibular_descripcion() {
		return PruebaVertibular_descripcion;
	}

	/**
	 * @param pruebaVertibular_descripcion
	 *            the pruebaVertibular_descripcion to set
	 */
	public void setPruebaVertibular_descripcion(String pruebaVertibular_descripcion) {
		PruebaVertibular_descripcion = pruebaVertibular_descripcion;
	}

	/**
	 * @return the psicologico
	 */
	public String getPsicologico() {
		return Psicologico;
	}

	/**
	 * @param psicologico
	 *            the psicologico to set
	 */
	public void setPsicologico(String psicologico) {
		Psicologico = psicologico;
	}

	/**
	 * @return the psicometrico
	 */
	public String getPsicometrico() {
		return Psicometrico;
	}

	/**
	 * @param psicometrico
	 *            the psicometrico to set
	 */
	public void setPsicometrico(String psicometrico) {
		Psicometrico = psicometrico;
	}

	/**
	 * @return the psicometricosObservaciones
	 */
	public String getPsicometricosObservaciones() {
		return PsicometricosObservaciones;
	}

	/**
	 * @param psicometricosObservaciones
	 *            the psicometricosObservaciones to set
	 */
	public void setPsicometricosObservaciones(String psicometricosObservaciones) {
		PsicometricosObservaciones = psicometricosObservaciones;
	}

	/**
	 * @return the rayosX
	 */
	public String getRayosX() {
		return RayosX;
	}

	/**
	 * @param rayosX
	 *            the rayosX to set
	 */
	public void setRayosX(String rayosX) {
		RayosX = rayosX;
	}

	/**
	 * @return the rayosX2
	 */
	public String getRayosX2() {
		return RayosX2;
	}

	/**
	 * @param rayosX2
	 *            the rayosX2 to set
	 */
	public void setRayosX2(String rayosX2) {
		RayosX2 = rayosX2;
	}

	/**
	 * @return the rayosXObservaciones
	 */
	public String getRayosXObservaciones() {
		return RayosXObservaciones;
	}

	/**
	 * @param rayosXObservaciones
	 *            the rayosXObservaciones to set
	 */
	public void setRayosXObservaciones(String rayosXObservaciones) {
		RayosXObservaciones = rayosXObservaciones;
	}

	/**
	 * @return the rayosXObservaciones2
	 */
	public String getRayosXObservaciones2() {
		return RayosXObservaciones2;
	}

	/**
	 * @param rayosXObservaciones2
	 *            the rayosXObservaciones2 to set
	 */
	public void setRayosXObservaciones2(String rayosXObservaciones2) {
		RayosXObservaciones2 = rayosXObservaciones2;
	}

	/**
	 * @return the reflejos_Osteotendinosos_1
	 */
	public String getReflejos_Osteotendinosos_1() {
		return Reflejos_Osteotendinosos_1;
	}

	/**
	 * @param reflejos_Osteotendinosos_1
	 *            the reflejos_Osteotendinosos_1 to set
	 */
	public void setReflejos_Osteotendinosos_1(String reflejos_Osteotendinosos_1) {
		Reflejos_Osteotendinosos_1 = reflejos_Osteotendinosos_1;
	}

	/**
	 * @return the reflejos_Osteotendinosos_2
	 */
	public String getReflejos_Osteotendinosos_2() {
		return Reflejos_Osteotendinosos_2;
	}

	/**
	 * @param reflejos_Osteotendinosos_2
	 *            the reflejos_Osteotendinosos_2 to set
	 */
	public void setReflejos_Osteotendinosos_2(String reflejos_Osteotendinosos_2) {
		Reflejos_Osteotendinosos_2 = reflejos_Osteotendinosos_2;
	}

	/**
	 * @return the reflejos_Osteotendinosos_3
	 */
	public String getReflejos_Osteotendinosos_3() {
		return Reflejos_Osteotendinosos_3;
	}

	/**
	 * @param reflejos_Osteotendinosos_3
	 *            the reflejos_Osteotendinosos_3 to set
	 */
	public void setReflejos_Osteotendinosos_3(String reflejos_Osteotendinosos_3) {
		Reflejos_Osteotendinosos_3 = reflejos_Osteotendinosos_3;
	}

	/**
	 * @return the reflejos_Osteotendinosos_4
	 */
	public String getReflejos_Osteotendinosos_4() {
		return Reflejos_Osteotendinosos_4;
	}

	/**
	 * @param reflejos_Osteotendinosos_4
	 *            the reflejos_Osteotendinosos_4 to set
	 */
	public void setReflejos_Osteotendinosos_4(String reflejos_Osteotendinosos_4) {
		Reflejos_Osteotendinosos_4 = reflejos_Osteotendinosos_4;
	}

	/**
	 * @return the reflejos_Osteotendinosos_5
	 */
	public String getReflejos_Osteotendinosos_5() {
		return Reflejos_Osteotendinosos_5;
	}

	/**
	 * @param reflejos_Osteotendinosos_5
	 *            the reflejos_Osteotendinosos_5 to set
	 */
	public void setReflejos_Osteotendinosos_5(String reflejos_Osteotendinosos_5) {
		Reflejos_Osteotendinosos_5 = reflejos_Osteotendinosos_5;
	}

	/**
	 * @return the reflejos_Osteotendinosos_6
	 */
	public String getReflejos_Osteotendinosos_6() {
		return Reflejos_Osteotendinosos_6;
	}

	/**
	 * @param reflejos_Osteotendinosos_6
	 *            the reflejos_Osteotendinosos_6 to set
	 */
	public void setReflejos_Osteotendinosos_6(String reflejos_Osteotendinosos_6) {
		Reflejos_Osteotendinosos_6 = reflejos_Osteotendinosos_6;
	}

	/**
	 * @return the reflejos_Osteotendinosos_7
	 */
	public String getReflejos_Osteotendinosos_7() {
		return Reflejos_Osteotendinosos_7;
	}

	/**
	 * @param reflejos_Osteotendinosos_7
	 *            the reflejos_Osteotendinosos_7 to set
	 */
	public void setReflejos_Osteotendinosos_7(String reflejos_Osteotendinosos_7) {
		Reflejos_Osteotendinosos_7 = reflejos_Osteotendinosos_7;
	}

	/**
	 * @return the reflejos_Osteotendinosos_8
	 */
	public String getReflejos_Osteotendinosos_8() {
		return Reflejos_Osteotendinosos_8;
	}

	/**
	 * @param reflejos_Osteotendinosos_8
	 *            the reflejos_Osteotendinosos_8 to set
	 */
	public void setReflejos_Osteotendinosos_8(String reflejos_Osteotendinosos_8) {
		Reflejos_Osteotendinosos_8 = reflejos_Osteotendinosos_8;
	}

	/**
	 * @return the rsCs
	 */
	public String getRsCs() {
		return RsCs;
	}

	/**
	 * @param rsCs
	 *            the rsCs to set
	 */
	public void setRsCs(String rsCs) {
		RsCs = rsCs;
	}

	/**
	 * @return the rsCs_Descripcion
	 */
	public String getRsCs_Descripcion() {
		return RsCs_Descripcion;
	}

	/**
	 * @param rsCs_Descripcion
	 *            the rsCs_Descripcion to set
	 */
	public void setRsCs_Descripcion(String rsCs_Descripcion) {
		RsCs_Descripcion = rsCs_Descripcion;
	}

	/**
	 * @return the rsRs
	 */
	public String getRsRs() {
		return RsRs;
	}

	/**
	 * @param rsRs
	 *            the rsRs to set
	 */
	public void setRsRs(String rsRs) {
		RsRs = rsRs;
	}

	/**
	 * @return the senos
	 */
	public String getSenos() {
		return Senos;
	}

	/**
	 * @param senos
	 *            the senos to set
	 */
	public void setSenos(String senos) {
		Senos = senos;
	}

	/**
	 * @return the shober
	 */
	public String getShober() {
		return Shober;
	}

	/**
	 * @param shober
	 *            the shober to set
	 */
	public void setShober(String shober) {
		Shober = shober;
	}

	/**
	 * @return the shower_Descripcion
	 */
	public String getShower_Descripcion() {
		return Shower_Descripcion;
	}

	/**
	 * @param shower_Descripcion
	 *            the shower_Descripcion to set
	 */
	public void setShower_Descripcion(String shower_Descripcion) {
		Shower_Descripcion = shower_Descripcion;
	}

	/**
	 * @return the torax
	 */
	public String getTorax() {
		return Torax;
	}

	/**
	 * @param torax
	 *            the torax to set
	 */
	public void setTorax(String torax) {
		Torax = torax;
	}

	/**
	 * @return the wells
	 */
	public String getWells() {
		return Wells;
	}

	/**
	 * @param wells
	 *            the wells to set
	 */
	public void setWells(String wells) {
		Wells = wells;
	}

	/**
	 * @return the wells_Descripcion
	 */
	public String getWells_Descripcion() {
		return Wells_Descripcion;
	}

	/**
	 * @param wells_Descripcion
	 *            the wells_Descripcion to set
	 */
	public void setWells_Descripcion(String wells_Descripcion) {
		Wells_Descripcion = wells_Descripcion;
	}

	/**
	 * @return the fC
	 */
	public int getFC() {
		return FC;
	}

	/**
	 * @param fC
	 *            the fC to set
	 */
	public void setFC(int fC) {
		FC = fC;
	}

	/**
	 * @return the fk_DocumentoMD
	 */
	public int getFk_DocumentoMD() {
		return fk_DocumentoMD;
	}

	/**
	 * @param fk_DocumentoMD
	 *            the fk_DocumentoMD to set
	 */
	public void setFk_DocumentoMD(int fk_DocumentoMD) {
		this.fk_DocumentoMD = fk_DocumentoMD;
	}

	/**
	 * @return the fk_IDT_DocumentoID
	 */
	public int getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}

	/**
	 * @param fk_IDT_DocumentoID
	 *            the fk_IDT_DocumentoID to set
	 */
	public void setFk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}

	/**
	 * @return the fR
	 */
	public int getFR() {
		return FR;
	}

	/**
	 * @param fR
	 *            the fR to set
	 */
	public void setFR(int fR) {
		FR = fR;
	}

	/**
	 * @return the fuerza_1
	 */
	public int getFuerza_1() {
		return Fuerza_1;
	}

	/**
	 * @param fuerza_1
	 *            the fuerza_1 to set
	 */
	public void setFuerza_1(int fuerza_1) {
		Fuerza_1 = fuerza_1;
	}

	/**
	 * @return the fuerza_2
	 */
	public int getFuerza_2() {
		return Fuerza_2;
	}

	/**
	 * @param fuerza_2
	 *            the fuerza_2 to set
	 */
	public void setFuerza_2(int fuerza_2) {
		Fuerza_2 = fuerza_2;
	}

	/**
	 * @return the fuerza_3
	 */
	public int getFuerza_3() {
		return Fuerza_3;
	}

	/**
	 * @param fuerza_3
	 *            the fuerza_3 to set
	 */
	public void setFuerza_3(int fuerza_3) {
		Fuerza_3 = fuerza_3;
	}

	/**
	 * @return the fuerza_4
	 */
	public int getFuerza_4() {
		return Fuerza_4;
	}

	/**
	 * @param fuerza_4
	 *            the fuerza_4 to set
	 */
	public void setFuerza_4(int fuerza_4) {
		Fuerza_4 = fuerza_4;
	}

	/**
	 * @return the fuerza_5
	 */
	public int getFuerza_5() {
		return Fuerza_5;
	}

	/**
	 * @param fuerza_5
	 *            the fuerza_5 to set
	 */
	public void setFuerza_5(int fuerza_5) {
		Fuerza_5 = fuerza_5;
	}

	/**
	 * @return the fuerza_6
	 */
	public int getFuerza_6() {
		return Fuerza_6;
	}

	/**
	 * @param fuerza_6
	 *            the fuerza_6 to set
	 */
	public void setFuerza_6(int fuerza_6) {
		Fuerza_6 = fuerza_6;
	}

	/**
	 * @return the fuerza_7
	 */
	public int getFuerza_7() {
		return Fuerza_7;
	}

	/**
	 * @param fuerza_7
	 *            the fuerza_7 to set
	 */
	public void setFuerza_7(int fuerza_7) {
		Fuerza_7 = fuerza_7;
	}

	/**
	 * @return the fuerza_8
	 */
	public int getFuerza_8() {
		return Fuerza_8;
	}

	/**
	 * @param fuerza_8
	 *            the fuerza_8 to set
	 */
	public void setFuerza_8(int fuerza_8) {
		Fuerza_8 = fuerza_8;
	}

	/**
	 * @return the perimetroAbdominal
	 */
	public int getPerimetroAbdominal() {
		return PerimetroAbdominal;
	}

	/**
	 * @param perimetroAbdominal
	 *            the perimetroAbdominal to set
	 */
	public void setPerimetroAbdominal(int perimetroAbdominal) {
		PerimetroAbdominal = perimetroAbdominal;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return Peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(int peso) {
		Peso = peso;
	}

	/**
	 * @return the t
	 */
	public int getT() {
		return T;
	}

	/**
	 * @param t
	 *            the t to set
	 */
	public void setT(int t) {
		T = t;
	}

	/**
	 * @return the tAD
	 */
	public int getTAD() {
		return TAD;
	}

	/**
	 * @param tAD
	 *            the tAD to set
	 */
	public void setTAD(int tAD) {
		TAD = tAD;
	}

	/**
	 * @return the talla
	 */
	public int getTalla() {
		return Talla;
	}

	/**
	 * @param talla
	 *            the talla to set
	 */
	public void setTalla(int talla) {
		Talla = talla;
	}

	/**
	 * @return the tAS
	 */
	public int getTAS() {
		return TAS;
	}

	/**
	 * @param tAS
	 *            the tAS to set
	 */
	public void setTAS(int tAS) {
		TAS = tAS;
	}

	/**
	 * @return the fechaDeDiligenciamiento
	 */
	public Date getFechaDeDiligenciamiento() {
		return FechaDeDiligenciamiento;
	}

	/**
	 * @param fechaDeDiligenciamiento
	 *            the fechaDeDiligenciamiento to set
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
	 * @param fechaDeModificacion
	 *            the fechaDeModificacion to set
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}

}
