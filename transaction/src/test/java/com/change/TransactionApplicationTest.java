package com.change;

import com.change.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: lichunxia
 * @create: 2021-01-27 20:08
 */
@SpringBootTest
public class TransactionApplicationTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoad() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }


    /**
     * 有事务的service，容器里保存的是代理对象
     *
     * @throws SQLException
     */
    @Test
    public void hello() throws SQLException {
        helloService.select();
        // class com.change.service.HelloService$$EnhancerBySpringCGLIB$$3fa57c32
        System.out.println(helloService.getClass());
    }

}
