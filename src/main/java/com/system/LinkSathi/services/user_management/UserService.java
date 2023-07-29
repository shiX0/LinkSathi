package com.system.LinkSathi.services.user_management;

import com.system.LinkSathi.dto.AuthenticationResponse;
import com.system.LinkSathi.dto.LoginDto;
import com.system.LinkSathi.entity.user_management.User;
import com.system.LinkSathi.pojo.user_management.UserPojo;

import java.io.IOException;
import java.util.List;

public interface UserService {

    UserPojo save(UserPojo userPojo) throws IOException;

    List<User> fetchAll();

    User fetchById(Integer id);

    void deleteById(Integer id);

    void sendEmail();

    AuthenticationResponse authenticate(LoginDto loginDto);
}
