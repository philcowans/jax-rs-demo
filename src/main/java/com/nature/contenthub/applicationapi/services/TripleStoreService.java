package com.nature.contenthub.applicationapi.services;

import com.hp.hpl.jena.rdf.model.Model;

public class TripleStoreService {
    static Model model;

    public static Model getModel() {
	if(model == null) {
	    loadModel();
	}
	return model;
    }

    private static void loadModel() {
    }
}