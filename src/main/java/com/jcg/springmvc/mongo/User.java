package com.jcg.springmvc.mongo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id_str, full_text, source, in_reply_to_status_id_str, in_reply_to_user_id_str, in_reply_to_screen_name, lang;
	private Object entities, user;
	private boolean is_quote_status, favorited, retweeted;
	private int retweet_count, favorite_count;

	public User() {
		super();
	}

	public User(String id_str, String full_text, String source, String in_reply_to_status_id_str,
				String in_reply_to_user_id_str, String in_reply_to_screen_name, String lang, Object entities, Object user, boolean is_quote_status,
				boolean favorited, boolean retweeted, int retweet_count, int favorite_count) {
		super();
		this.id_str = id_str;
		this.full_text = full_text;
		this.source = source;
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
		this.in_reply_to_screen_name = in_reply_to_screen_name;
		this.lang = lang;
		this.entities = entities;
		this.user = user;
		this.is_quote_status = is_quote_status;
		this.favorited = favorited;
		this.retweeted = retweeted;
		this.retweet_count = retweet_count;
		this.favorite_count = favorite_count;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getFull_text() {
		return full_text;
	}

	public void setFull_text(String full_text) {
		this.full_text = full_text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}

	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}

	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}

	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}

	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}

	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Object getEntities() {
		return entities;
	}

	public void setEntities(Object entities) {
		this.entities = entities;
	}

	public Object getUser() {
		return user;
	}

	public void setUser(Object user) {
		this.user = user;
	}

	public boolean isIs_quote_status() {
		return is_quote_status;
	}

	public void setIs_quote_status(boolean is_quote_status) {
		this.is_quote_status = is_quote_status;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public boolean isRetweeted() {
		return retweeted;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}

	public int getRetweet_count() {
		return retweet_count;
	}

	public void setRetweet_count(int retweet_count) {
		this.retweet_count = retweet_count;
	}

	public int getFavorite_count() {
		return favorite_count;
	}

	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}

}
