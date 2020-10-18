package util;



import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import entity.Item;
import entity.Owner;
import entity.SearchResponse;

public class SearchAPITests {

	@Test
	public void testJsonToJavaConverter() throws JsonMappingException, JsonProcessingException {
		Owner owner = new Owner();
		owner.setReputation(1);
		owner.setDisplayName("Novice BL");
		owner.setLink("https://stackoverflow.com/users/12336779/novice-bl");
		owner.setUserId(12336779L);
		owner.setProfileImage("https://www.gravatar.com/avatar/b3ea28f626bb85704bc2f0d82b30c648?s=128&d=identicon&r=PG&f=1");
		owner.setUserType("registered");
		Item item = new Item();
		item.setTags(Arrays.asList(new String[] {"java", "eclipse"}));
		item.setOwner(owner);
		item.setIsAnswered(false);
		item.setViewCount(25);
		item.setAnswerCount(3);
		item.setScore(0);
		item.setLastActivityDate(1603016679L);
		item.setCreationDate(1603015774L);
		item.setQuestionId(64412077L);
		item.setContentLicense("CC BY-SA 4.0");
		item.setLink("https://stackoverflow.com/questions/64412077/why-we-can-not-make-two-successive-entries-of-string-in-java");
		item.setTitle("why we can not make two successive entries of string in java");
		SearchResponse searchResponse = new SearchResponse();
		searchResponse.setItems(Arrays.asList(new Item[] {item}));
		searchResponse.setHasMore(true);
		searchResponse.setQuotaMax(300);
		searchResponse.setQuotaRemaining(280);
		String input = "{\r\n" + 
				"	\"items\": [{\r\n" + 
				"		\"tags\": [\"java\", \"eclipse\"],\r\n" + 
				"		\"owner\": {\r\n" + 
				"			\"reputation\": 1,\r\n" + 
				"			\"user_id\": 12336779,\r\n" + 
				"			\"user_type\": \"registered\",\r\n" + 
				"			\"profile_image\": \"https://www.gravatar.com/avatar/b3ea28f626bb85704bc2f0d82b30c648?s=128&d=identicon&r=PG&f=1\",\r\n" + 
				"			\"display_name\": \"Novice BL\",\r\n" + 
				"			\"link\": \"https://stackoverflow.com/users/12336779/novice-bl\"\r\n" + 
				"		},\r\n" + 
				"		\"is_answered\": false,\r\n" + 
				"		\"view_count\": 25,\r\n" + 
				"		\"answer_count\": 3,\r\n" + 
				"		\"score\": 0,\r\n" + 
				"		\"last_activity_date\": 1603016679,\r\n" + 
				"		\"creation_date\": 1603015774,\r\n" + 
				"		\"question_id\": 64412077,\r\n" + 
				"		\"content_license\": \"CC BY-SA 4.0\",\r\n" + 
				"		\"link\": \"https://stackoverflow.com/questions/64412077/why-we-can-not-make-two-successive-entries-of-string-in-java\",\r\n" + 
				"		\"title\": \"why we can not make two successive entries of string in java\"\r\n" + 
				"	}],\r\n" + 
				"	\"has_more\": true,\r\n" + 
				"	\"quota_max\": 300,\r\n" + 
				"	\"quota_remaining\": 280\r\n" + 
				"}";
		assertEquals(searchResponse, JsonToJavaConverter.convertJsonToJavaObject(input));
	}
}
