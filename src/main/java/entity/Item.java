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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerCount == null) ? 0 : answerCount.hashCode());
		result = prime * result + ((contentLicense == null) ? 0 : contentLicense.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((isAnswered == null) ? 0 : isAnswered.hashCode());
		result = prime * result + ((lastActivityDate == null) ? 0 : lastActivityDate.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((viewCount == null) ? 0 : viewCount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (answerCount == null) {
			if (other.answerCount != null)
				return false;
		} else if (!answerCount.equals(other.answerCount))
			return false;
		if (contentLicense == null) {
			if (other.contentLicense != null)
				return false;
		} else if (!contentLicense.equals(other.contentLicense))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (isAnswered == null) {
			if (other.isAnswered != null)
				return false;
		} else if (!isAnswered.equals(other.isAnswered))
			return false;
		if (lastActivityDate == null) {
			if (other.lastActivityDate != null)
				return false;
		} else if (!lastActivityDate.equals(other.lastActivityDate))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (viewCount == null) {
			if (other.viewCount != null)
				return false;
		} else if (!viewCount.equals(other.viewCount))
			return false;
		return true;
	}

	
}
