package com.java.hib;

import java.util.List;

public class ShowProviderDetails {
	
	public static void main(String[] args) {
		ProviderDetailsDAO dao = new ProviderDetailsDAOImpl();
		List<ProviderDetails> providerList = dao.showProviderDetails();
		for(ProviderDetails providerDetails : providerList) {
			System.out.println(providerDetails);
		}
	}

}
