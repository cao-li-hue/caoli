package com.scs.web.blog.dao;

import com.scs.web.blog.entity.User;

import java.sql.SQLException;
import java.util.List;
public interface UserDao {

    int[] batchInsert(List<User> userList) throws SQLException;

    /**
     * 根据手机号查找用户
     *
     * @param mobile
     * @return
     * @throws SQLException
     */
    User findUserByMobile(String mobile) throws SQLException;

}
