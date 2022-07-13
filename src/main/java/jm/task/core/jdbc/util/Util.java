package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * Объект который обеспечивает соединение с БД реализуем в виде СИНГЛТОНА.
 * Идея в том, что зачем создавать каждый раз новое соединение если можем создать его
 * один раз, и далее обращаться к нему со всех мест программы.
 *
 */

public class Util {

    private static Util instance;

    private Util(){};

    public static Util getInstance(){
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection(){
        String url =  "jdbc:mysql://localhost:3306/my_db?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                "&useLegacyDatetimeCode=false&serverTimezone=UTC";;
        String username = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, username, password);
        }catch (SQLException e){
           throw new RuntimeException("Ошибка соединения с БД",e);
        }
    }
}
