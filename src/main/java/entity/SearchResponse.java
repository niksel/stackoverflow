package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {

	@JsonProperty("items")
	List<Item> items;
	
	@JsonProperty("has_more")
	Boolean hasMore;
	
	@JsonProperty("quota_max")
	Integer quotaMax;
	
	@JsonProperty("quota_remaining")
	Integer quotaRemaining;

	@Override
	public String toString() {
		return "SearchResponse [items=" + items + ", hasMore=" + hasMore + ", quotaMax=" + quotaMax
				+ ", quotaRemaining=" + quotaRemaining + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Boolean getHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public Integer getQuotaMax() {
		return quotaMax;
	}

	public void setQuotaMax(Integer quotaMax) {
		this.quotaMax = quotaMax;
	}

	public Integer getQuotaRemaining() {
		return quotaRemaining;
	}

	public void setQuotaRemaining(Integer quotaRemaining) {
		this.quotaRemaining = quotaRemaining;
	}

	
	
}
