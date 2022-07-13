package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao dao = new UserDaoJDBCImpl();
        dao.createUsersTable();
        System.out.println("Create  table Users");
        dao.dropUsersTable();
        System.out.println("Drop table Users");

    }
}
