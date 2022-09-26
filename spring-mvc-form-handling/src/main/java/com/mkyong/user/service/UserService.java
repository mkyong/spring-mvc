package com.mkyong.user.service;

import com.mkyong.user.model.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    void saveOrUpdate(User user);

    void delete(int id);

}
