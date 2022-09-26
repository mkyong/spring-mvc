package com.mkyong.user.service;

import com.mkyong.user.model.User;
import com.mkyong.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void saveOrUpdate(User user) {

        if (findById(user.getId())==null) {
            userDao.save(user);
        } else {
            userDao.update(user);
        }

    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

}
