package model;
// Type your code

import java.time.*;

public class Blog
{
	String title;
	String description;
	LocalDate postedOn;
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String blogDetail) {
		this.description = blogDetail;
	}
	public final LocalDate getPostedOn() {
		return postedOn;
	}
	public final void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
	public Blog(String title, String blogDetail, LocalDate postedOn)
	{
		this.setTitle(title);
		this.setDescription(blogDetail);
		this.setPostedOn(postedOn);
	}
	
}