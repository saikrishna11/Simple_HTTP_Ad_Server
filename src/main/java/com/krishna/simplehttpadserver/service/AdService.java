package com.krishna.simplehttpadserver.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.krishna.simplehttpadserver.model.Ad;

public class AdService {

	private Map<String, Ad> ads = new HashMap<>();
		
	public List<Ad> fetchAllAds(){		
		return new ArrayList<Ad>(ads.values());
	}
	
	public Ad fetchAd(String partner_id){
		return ads.get(partner_id);
	}
	
	public Ad createAd(Ad ad){
		Ad new_ad;
		if(ads.containsKey(ad.getPartner_id())){
			new_ad =null;
		}else{
			ads.put(ad.getPartner_id(), ad);
			new_ad = ad;
		}		
		return new_ad;
	}
}
