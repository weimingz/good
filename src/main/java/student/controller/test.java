package student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import student.bean.User;
@Service
public class test {
 
	@Autowired
    private User user;
     
    public User getUser() {
		return user;
	}
   
	public void setUser(User user) {
		this.user = user;
	}

	@RequestMapping(value="/test",method=RequestMethod.GET)
    public String test(){
        user.setName("test");
        System.out.println(user.getName());
        return "success";
    }
}
