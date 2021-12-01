package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Program: SmallAccount
 * @Description:工具类 DBUtil 获取数据库 Connection
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public class DBUtil {
    static final String database = "db/data.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:sqlite:%s", database);
        return DriverManager.getConnection(url);
    }
}
