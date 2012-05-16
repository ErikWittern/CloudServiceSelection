package edu.kit.cockpit.valuationserver.rest.clients;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import edu.kit.cockpit.valuationserver.rest.messages.Configuration;
import edu.kit.cockpit.valuationserver.rest.messages.Vote;
import edu.kit.cockpit.valuationserver.rest.messages.Votes;

public class VoteClient {
	
	final String urlClnt = ServiceConstants.URL_BASE + ServiceConstants.VOTE_BASE_URL_PREFIX + ServiceConstants.SINGLE_VOTE_URL_PREFIX;
	
	
	/**
	 * @param voteId
	 * @param voterId
	 * @return
	 */
	public Votes getSingleVotes(String voteId, String voterId) {

		System.out.println("Issuing GET '" + urlClnt + "' ("
				+ ServiceConstants.SINGLE_VOTES_MIME_TYPE + ") "
				+ "Query parameters: voteId='" + voteId + "', voterId='"
				+ voterId + "'");

		WebResource wrs = Client.create().resource(urlClnt);

		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("voteId", voteId);
		queryParams.add("voterId", voterId);

		ClientResponse response = wrs.queryParams(queryParams)
				.accept(ServiceConstants.SINGLE_VOTES_MIME_TYPE)
				.get(ClientResponse.class);

		System.out.println("GET single votes request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Votes.class);
	}

	/**
	 * @param evalUrl
	 * @param voteMsg
	 * @return
	 */
//	public Vote postSingleVote(String evalUrl, Vote voteMsg) {
//
//		System.out.println("Issuing POST '" + evalUrl + "' ("
//				+ ServiceConstants.SINGLE_VOTE_MIME_TYPE + ") ");
//
//		WebResource wrs = Client.create().resource(evalUrl);
//
//		ClientResponse response = wrs.type(ServiceConstants.SINGLE_VOTE_MIME_TYPE)
//				.accept(ServiceConstants.SINGLE_VOTE_MIME_TYPE)
//				.post(ClientResponse.class, voteMsg);
//
//		System.out.println("POST single vote request returned status '"
//				+ response.getClientResponseStatus() + "'");
//
//		if (!response.getClientResponseStatus()
//				.equals(ClientResponse.Status.OK))
//			return null;
//
//		return response.getEntity(Vote.class);
//	}

	
	/**
	 * @param url
	 * @return
	 */
	public Vote getSingleVote(String url) {

		System.out.println("Issuing GET '" + url + "' ("
				+ ServiceConstants.SINGLE_VOTE_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs.accept(
				ServiceConstants.SINGLE_VOTE_MIME_TYPE).get(
				ClientResponse.class);

		System.out.println("GET single vote request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Vote.class);
	}


	/**
	 * @param url
	 * @param newVote
	 * @return
	 */
	public Vote putSingleVote(String url, Vote newVote) {

		System.out.println("Issuing PUT '" + url + "' ("
				+ ServiceConstants.SINGLE_VOTE_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs
				.type(ServiceConstants.SINGLE_VOTE_MIME_TYPE)
				.accept(ServiceConstants.SINGLE_VOTE_MIME_TYPE)
				.put(ClientResponse.class, newVote);

		System.out.println("PUT single vote request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Vote.class);
	}

	
	/**
	 * @param url
	 * @return
	 */
	public Status deleteSingleVote(String url) {

		System.out.println("Issuing DELETE '" + url + "' (no mime type)");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs.delete(ClientResponse.class);

		System.out.println("DELETE single vote request returned status '"
				+ response.getClientResponseStatus() + "'");

		return response.getClientResponseStatus();
	}
	
	/**
	 * @param evaluationId
	 * @return
	 */
	public Votes postSimpleAggregatedVote(String evaluationId) {
							
		String urlClnt2 = ServiceConstants.URL_BASE + ServiceConstants.VOTE_BASE_URL_PREFIX + ServiceConstants.AGGREGATED_VOTE_URL_PREFIX;
		
		System.out.println("Issuing POST '" + urlClnt2 + "' ("
				+ ServiceConstants.SIMPLE_AGGREGATED_VOTES_MIME_TYPE + ") "
				+ "Query parameters: evaluationId='" + evaluationId + "'");

		WebResource wrs = Client.create().resource(urlClnt2);

		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("evaluationId", evaluationId);

		ClientResponse response = wrs.queryParams(queryParams)
				.accept(ServiceConstants.SIMPLE_AGGREGATED_VOTES_MIME_TYPE)
				.post(ClientResponse.class);

		System.out.println("POST simple aggregated votes request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Votes.class);
	}
	
	/**
	 * @param url
	 * @return
	 */
	public Configuration getVoteConfig(String url) {

		System.out.println("Issuing GET '" + url + "' ("
				+ ServiceConstants.CONFIGURATION_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs.accept(
				ServiceConstants.CONFIGURATION_MIME_TYPE).get(ClientResponse.class);

		System.out.println("GET single vote config request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Configuration.class);
	}
	
	/**
	 * @param url
	 * @return
	 */
	public Vote getSimpleAggregatedVote(String url) {

		System.out.println("Issuing GET '" + url + "' ("
				+ ServiceConstants.SIMPLE_AGGREGATED_VOTE_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs.accept(
				ServiceConstants.SIMPLE_AGGREGATED_VOTE_MIME_TYPE).get(
				ClientResponse.class);

		System.out.println("GET simple aggregated vote request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Vote.class);
	}
}
