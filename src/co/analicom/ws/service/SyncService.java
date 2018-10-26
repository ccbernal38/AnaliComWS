package co.analicom.ws.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

import co.analicom.ws.controller.SincronizacionController;
 

@Path("/analicom")
public class SyncService {
 
	@GET
	  @Produces("application/json")
	  public Response syncCatalogo() throws JSONException {
		try {
			SincronizacionController controller = new SincronizacionController();
			controller.sincronizarCatalogos();
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mensaje", "Se ha actualizado correctamente el catalogo");
			String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n"+jsonObject;
			return Response.status(200).entity(jsonObject.toString()).build();
		}catch (Exception e) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mensaje", "Ocurrio un error");
			String result = "@Produces(\"application/json\") \n\n"+jsonObject;
			return Response.status(200).entity(jsonObject.toString()).build();
		}
		
	  }	
}
