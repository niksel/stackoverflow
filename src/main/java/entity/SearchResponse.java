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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hasMore == null) ? 0 : hasMore.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((quotaMax == null) ? 0 : quotaMax.hashCode());
		result = prime * result + ((quotaRemaining == null) ? 0 : quotaRemaining.hashCode());
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
		SearchResponse other = (SearchResponse) obj;
		if (hasMore == null) {
			if (other.hasMore != null)
				return false;
		} else if (!hasMore.equals(other.hasMore))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (quotaMax == null) {
			if (other.quotaMax != null)
				return false;
		} else if (!quotaMax.equals(other.quotaMax))
			return false;
		if (quotaRemaining == null) {
			if (other.quotaRemaining != null)
				return false;
		} else if (!quotaRemaining.equals(other.quotaRemaining))
			return false;
		return true;
	}

	
}
