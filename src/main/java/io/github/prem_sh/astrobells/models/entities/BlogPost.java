package io.github.prem_sh.astrobells.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog_post")
public class BlogPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "blog_id")
	private Long blogId;
	
	@Column(name = "title", nullable = false, unique = true)
	private String title;
	
	@Column(name = "content", nullable = false)
	private String content;

	public Long getBlogId() {
		return blogId;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
