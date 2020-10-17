package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner {
	
	@JsonProperty("reputation")
	Integer reputation;
	
	@JsonProperty("user_id")
	Long userId;
	
	@JsonProperty("user_type")
	String userType;
	
	@JsonProperty("profile_image")
	String profileImage;
	
	@JsonProperty("display_name")
	String displayName;
	
	@JsonProperty("link")
	String link;

	@Override
	public String toString() {
		return "Owner [reputation=" + reputation + ", userId=" + userId + ", userType=" + userType + ", profileImage="
				+ profileImage + ", displayName=" + displayName + ", link=" + link + "]";
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

		

}
