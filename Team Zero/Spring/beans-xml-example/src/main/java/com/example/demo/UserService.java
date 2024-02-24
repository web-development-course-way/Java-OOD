package com.example.demo;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        System.out.println("Setting userDao in UserService");
        this.userDao = userDao;
    }

    public void saveUser(User user) {
        System.out.println("Saving user in UserService");
        userDao.save(user);
    }
}
