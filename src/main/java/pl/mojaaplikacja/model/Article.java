package pl.mojaaplikacja.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Article {

	private String title;
	private String content;
	private List<String> tags;
	
	public Article(String title, String content, String tags) {
		this.title = title;
		this.content = content;
		if (tags!=null && tags.length() > 0) {
			this.tags = Arrays.asList(tags.split(","));
		} else {
			this.tags = Collections.emptyList();
		}
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Article other = (Article) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
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
		return true;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", content=" + content + ", tags=" + tags + "]";
	}
	
	
	
}
