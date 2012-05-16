/*
 * Project: Cockpit Valuation Server
 * $Header: $
 * Author:  Christian Zirpins
 * Last Change: 
 *    by:   $Author: $
 *    date: $Date:   $
 * Copyright (c): KIT, 2011
 */

package edu.kit.cockpit.valuationserver.rest.clients;

public class ServiceConstants {

	// Service URLs
	public static final String HOSTNAME = "aifb-ksri-eorg-cockpit.aifb.kit.edu";
	public static final String PORT = "80";
	public static final String URL_PREFIX = "valuation-server";
	public static final String URL_BASE = "http://" + HOSTNAME + ":" + PORT
			+ "/" + URL_PREFIX + "/";
	
	public static final String EVALUATION_URL_PREFIX = "evaluations/";
	public static final String VOTE_BASE_URL_PREFIX = "votes/";
	public static final String SINGLE_VOTE_URL_PREFIX = "single/";
	public static final String AGGREGATED_VOTE_URL_PREFIX = "aggregated/";
	public static final String CONFIGURATION_URL_PREFIX = "config/";
	public static final String MODEL_URL_PREFIX = "models/";

	// Service mime types
	public static final String EVALUATIONS_MIME_TYPE = "cockpit/evaluations+xml";
	public static final String EVALUATION_MIME_TYPE = "cockpit/evaluation+xml";
	public static final String SINGLE_VOTES_MIME_TYPE = "cockpit/single-votes+xml";
	public static final String SINGLE_VOTE_MIME_TYPE = "cockpit/single-vote+xml";
	public static final String SIMPLE_AGGREGATED_VOTES_MIME_TYPE = "cockpit/simple-aggregated-votes+xml";
	public static final String SIMPLE_AGGREGATED_VOTE_MIME_TYPE = "cockpit/simple-aggregated-vote+xml";
	public static final String CONFIGURATION_MIME_TYPE = "cockpit/configuration+xml";
	public static final String MODELS_MIME_TYPE = "cockpit/sfms+xml";
	public static final String MODEL_MIME_TYPE = "cockpit/sfm+xml";

	// Persistency
	public static final String MODEL_LOCATION_FILESYSTEM = "/tmp/servicefeaturemodels/";
}
