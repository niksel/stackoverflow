package client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Item;
import entity.Owner;
import entity.SearchResponse;

public class RestClient {

	public static final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	public static void main(String[] args) throws IOException {

		String choice = "";
		do {
		System.out.println("Please enter your search query: ");
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		String input = obj.readLine();
		input = input.replaceAll(" ", "%20");
		try {
			
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet getRequest = new HttpGet(String.format("https://api.stackexchange.com/2.2/search?order=desc&sort=activity&intitle=%s&site=stackoverflow", input));
			 
			// Add additional header to getRequest which accepts application/xml data
			getRequest.addHeader("accept", "application/json");
 
			// Execute your request and catch response
			HttpResponse response = httpClient.execute(getRequest);
 
			// Check for HTTP response code: 200 = success
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
 
			// Get-Capture Complete application/xml body response
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			String output;
 
			// Simply iterate through XML response and show on console.
			while ((output = br.readLine()) != null) {
				SearchResponse searchResponse = objectMapper.readValue(output, SearchResponse.class);
				System.out.println(String.format("Here are the top 5 results for your search %s", input));
				List<Item> items = searchResponse.getItems();
				for(int count = 0; count < 5; count++) {
					Item item = items.get(count);
					Owner owner = item.getOwner();
					System.out.println("Title: " + item.getTitle());
					System.out.println("URL: " + item.getLink());
					System.out.println("Author Display Name: " + owner.getDisplayName());
				}
			}
 
		} catch (ClientProtocolException e) {
			e.printStackTrace();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Do you want to continue? Please enter Yes or No");
		choice = obj.readLine();
		}while(choice.equalsIgnoreCase("Yes"));

	}

}
