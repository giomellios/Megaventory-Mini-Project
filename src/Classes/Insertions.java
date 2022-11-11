package Classes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

public class Insertions<T> implements toJSONinterface<T> {

	private String mvRecordAction="Insert";
	public String getMvRecordAction() {
		return mvRecordAction;
	}
	public void setMvRecordAction(String mvRecordAction) {
		this.mvRecordAction = mvRecordAction;
	}

	public String toJSON(Object t) {
		JSONObject o1=new JSONObject(t);
		JSONObject o2=new JSONObject();
		o2.put("APIKEY", "34165ac011f2d997@m137176");
		o2.put("mvRecordAction",this.getMvRecordAction());
		
		o2.put(t.getClass().getSimpleName(), o1);
		
		return o2.toString();
	}
	
	public void Request(String address,String content) throws IOException, InterruptedException { //exceptions for response
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(address))
				.header("Content-Type","application/json")
				.header("Accept", "application/json")
				.method("POST", HttpRequest.BodyPublishers.ofString(content))
				.build();
		HttpResponse<String> response=HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}
}
