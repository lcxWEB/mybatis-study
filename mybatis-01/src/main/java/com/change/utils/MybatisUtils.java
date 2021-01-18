package com.change.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: lichunxia
 * @create: 2021-01-04 22:00
 */
public class MybatisUtils {
    //          加载 Mysql 驱动
    //         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    //         // 数据库连接地址
    //         String dbConnStr = "jdbc:mysql://localhost:3306/ormtest?user=root&password=root";
    //         // 创建数据库连接
    //         Connection conn = DriverManager.getConnection(dbConnStr);
    //         // 简历陈述对象
    //         Statement stmt = conn.createStatement();
    //
    //         // 创建 SQL 查询
    //         String sql = "select * from t_user limit 20000";
    //
    //         // 执行查询
    //         ResultSet rs = stmt.executeQuery(sql);
    //
    //         // 创建助手类, 这里采用全新设计的工厂类!
    //         AbstractEntityHelper helper = EntityHelperFactory.getEntityHelper(UserEntity.class);
    //         // 读懂上面这一行,
    //         // 恭喜你已经迈入架构师行列...
    //         // 参考阅读:
    //         // https://github.com/jhunters/jprotobuf
    //
    //         // 获取开始时间
    //         long t0 = System.currentTimeMillis();
    //
    //         while (rs.next()) {
    //             // 创建新的实体对象
    //             UserEntity ue = (UserEntity) helper.create(rs);
    //         }
    //
    //         // 获取结束时间
    //         long t1 = System.currentTimeMillis();
    //
    //         // 关闭数据库连接
    //         stmt.close();
    //         conn.close();
    //
    //         // 打印赋值时间消耗
    //         System.out.println("赋值花费时间 = " + (t1 - t0) + "ms");

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            // 每个基于 MyBatis 的应用都是以一个 SqlSessionFactory 的实例为核心的。
            // SqlSessionFactory 的实例可以通过 SqlSessionFactoryBuilder 获得。
            // 而 SqlSessionFactoryBuilder 则可以从 XML 配置文件或一个预先配置的 Configuration 实例来构建出 SqlSessionFactory 实例。
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // connection
        return sqlSession;
    }


}
