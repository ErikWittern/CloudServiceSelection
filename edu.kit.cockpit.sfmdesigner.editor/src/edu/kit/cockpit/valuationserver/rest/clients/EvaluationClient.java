package edu.kit.cockpit.valuationserver.rest.clients;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluations;
import edu.kit.cockpit.valuationserver.rest.messages.Vote;

public class EvaluationClient {

	final String urlClnt = ServiceConstants.URL_BASE
			+ ServiceConstants.EVALUATION_URL_PREFIX;

	/**
	 * @param evaluationId
	 * @param serviceId
	 * @param stakeholderGroup
	 * @return
	 */
	public Evaluations getEvaluations(String evaluationId, String serviceId,
			String stakeholderGroup) {

		System.out.println("Issuing GET '" + urlClnt + "' ("
				+ ServiceConstants.EVALUATIONS_MIME_TYPE + ") "
				+ "Query parameters: evaluationId='" + evaluationId
				+ "', serviceId='" + serviceId + "', stakeholderGroup='"
				+ stakeholderGroup + "'");

		WebResource wrs = Client.create().resource(urlClnt);

		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("evaluationId", evaluationId);
		queryParams.add("serviceId", serviceId);
		queryParams.add("stakeholderGroup", stakeholderGroup);

		ClientResponse response = wrs.queryParams(queryParams)
				.accept(ServiceConstants.EVALUATIONS_MIME_TYPE)
				.get(ClientResponse.class);

		System.out.println("GET evaluations request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Evaluations.class);
	}

	
	/**
	 * postSimpleVote
	 * @param evaluationUrl
	 * @param voteMsg
	 */
	public Vote postSingleVote(String evalUrl, Vote voteMsg){
		
		System.out.println("Issuing POST '" + evalUrl + "' ("
				+ ServiceConstants.SINGLE_VOTE_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(evalUrl);

		ClientResponse response = wrs.type(ServiceConstants.SINGLE_VOTE_MIME_TYPE)
				.accept(ServiceConstants.SINGLE_VOTE_MIME_TYPE)
				.post(ClientResponse.class, voteMsg);

		System.out.println("POST single vote request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Vote.class);
	}
	
	/**
	 * @param evaluation
	 * @return
	 */
	public Evaluation postEvaluation(Evaluation evaluation) {

		System.out.println("Issuing POST '" + urlClnt + "' ("
				+ ServiceConstants.EVALUATION_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(urlClnt);

		ClientResponse response = wrs
				.type(ServiceConstants.EVALUATION_MIME_TYPE)
				.accept(ServiceConstants.EVALUATION_MIME_TYPE)
				.post(ClientResponse.class, evaluation);

		System.out.println("POST evaluations request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Evaluation.class);
	}

	/**
	 * @param url
	 * @return
	 */
	public Evaluation getEvaluation(String url) {

		System.out.println("Issuing GET '" + url + "' ("
				+ ServiceConstants.EVALUATION_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs.accept(
				ServiceConstants.EVALUATION_MIME_TYPE)
				.get(ClientResponse.class);

		System.out.println("GET evaluation request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Evaluation.class);
	}

	/**
	 * @param url
	 * @param newEval
	 * @return
	 */
	public Evaluation putEvaluation(String url, Evaluation newEval) {

		System.out.println("Issuing PUT '" + url + "' ("
				+ ServiceConstants.EVALUATION_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs
				.type(ServiceConstants.EVALUATION_MIME_TYPE)
				.accept(ServiceConstants.EVALUATION_MIME_TYPE)
				.put(ClientResponse.class, newEval);

		System.out.println("PUT evaluation request returned status '"
				+ response.getClientResponseStatus() + "'");

		if (!response.getClientResponseStatus()
				.equals(ClientResponse.Status.OK))
			return null;

		return response.getEntity(Evaluation.class);
	}

	/**
	 * @param url
	 * @return
	 */
	public Status deleteEvaluation(String url) {

		System.out.println("Issuing DELETE '" + url + "' ("
				+ ServiceConstants.EVALUATION_MIME_TYPE + ") ");

		WebResource wrs = Client.create().resource(url);

		ClientResponse response = wrs.accept(
				ServiceConstants.EVALUATION_MIME_TYPE).delete(
				ClientResponse.class);

		System.out.println("DELETE evaluation request returned status '"
				+ response.getClientResponseStatus() + "'");

		return response.getClientResponseStatus();
	}

}
