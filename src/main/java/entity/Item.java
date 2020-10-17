package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

	@JsonProperty("tags")
	List<String> tags;
	
	@JsonProperty("owner")
	Owner owner;
	
	@JsonProperty("is_answered")
	Boolean isAnswered;
	
	@JsonProperty("view_count")
	Integer viewCount;
	
	@JsonProperty("answer_count")
	Integer answerCount;
	
	@JsonProperty("score")
	Integer score;
	
	@JsonProperty("last_activity_date")
	Long lastActivityDate;
	
	@JsonProperty("creation_date")
	Long creationDate;
	
	@JsonProperty("question_id")
	Long questionId;
	
	@JsonProperty("content_license")
	String contentLicense;
	
	@JsonProperty("link")
	String link;
	
	@JsonProperty("title")
	String title;

	@Override
	public String toString() {
		return "Item [tags=" + tags + ", owner=" + owner + ", isAnswered=" + isAnswered + ", viewCount=" + viewCount
				+ ", answerCount=" + answerCount + ", score=" + score + ", lastActivityDate=" + lastActivityDate
				+ ", creationDate=" + creationDate + ", questionId=" + questionId + ", contentLicense=" + contentLicense
				+ ", link=" + link + ", title=" + title + "]";
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Boolean getIsAnswered() {
		return isAnswered;
	}

	public void setIsAnswered(Boolean isAnswered) {
		this.isAnswered = isAnswered;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Integer getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Long getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(Long lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public Long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Long creationDate) {
		this.creationDate = creationDate;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getContentLicense() {
		return contentLicense;
	}

	public void setContentLicense(String contentLicense) {
		this.contentLicense = contentLicense;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
}
