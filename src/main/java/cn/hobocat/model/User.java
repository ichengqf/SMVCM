package cn.hobocat.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;
    private String user_name;
    private String user_name_display;
    private String user_id;
    private String password;
    private Date create_time;
    private Date update_time;
    private int delete_flg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_name_display() {
		return user_name_display;
	}
	public void setUser_name_display(String user_name_display) {
		this.user_name_display = user_name_display;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public int getDelete_flg() {
		return delete_flg;
	}
	public void setDelete_flg(int delete_flg) {
		this.delete_flg = delete_flg;
	}
    


}