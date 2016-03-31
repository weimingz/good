package student.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.bean.User;
import student.dao.UserMapper;
@Service
public class UserSeviceIMp {
 
   
    private User user;
    
 
    public UserSeviceIMp() {
        super();
    }
 
    public User getUser() {
        return user;
    }
    @Autowired
    public void setUser(User user) {
        this.user = user;
    }
     
}
