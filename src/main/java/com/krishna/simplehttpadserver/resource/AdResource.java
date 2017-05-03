package com.krishna.simplehttpadserver.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krishna.simplehttpadserver.model.Ad;
import com.krishna.simplehttpadserver.service.AdService;

@Path("/ad")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AdResource {
	
	AdService adService = new AdService();
	
	@GET
	public List<Ad> fetchAllAds(){
		return adService.fetchAllAds();	
	}

	@POST
	public Ad createAd(Ad ad){
		return adService.createAd(ad);	
	}
	
	@GET
	@Path("/{partner_id}")
	public Ad fetchAd(@PathParam("partner_id") String id){
		return adService.fetchAd(id);
	}

}
