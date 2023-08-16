package com.example.linksathi.Services;

import com.example.linksathi.Entity.User;
import com.example.linksathi.Pojo.UserPojo;

public interface UserServices {
    UserPojo save (UserPojo userPojo);
    User findByEmail(String email);

    User findBYId(Integer id);


}
