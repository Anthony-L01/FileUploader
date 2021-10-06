package com.lxc.Dao.impl;

import com.lxc.Utils.JdbcUtils;
import jdk.nashorn.internal.scripts.JD;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class BaseDao {
    private final QueryRunner queryRunner=new QueryRunner();

    public int update(String sql,Object...args) {
        Connection connection=null;
        try {
             connection= JdbcUtils.getConnection();
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JdbcUtils.close(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return -1;
    }
    public <T> T queryForOne(Class<T> type,String sql,Object...args) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JdbcUtils.close(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public Object queryForSingleValue(String sql,Object...args) throws SQLException {
        Connection connection = null;
        try {
            connection=JdbcUtils.getConnection();
            return queryRunner.query(connection,sql,new ScalarHandler<>(),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;
    }
}

