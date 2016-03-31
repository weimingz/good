package student.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class User {
   private  int  id;
   private  String  name;
   private  String  pwd;
   private  Date   date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
   
}
