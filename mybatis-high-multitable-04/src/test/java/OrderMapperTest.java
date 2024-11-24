import com.zazhi.mapper.OrderMapper;
import com.zazhi.pojo.Customer;
import com.zazhi.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zazhi
 * @date 2024/11/24
 * @description:
 */
public class OrderMapperTest {

    @Test
    public void selectOrderWithCustomerTest() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sessionFactory.openSession();

        // 3.根据EmployeeMapper接口的Class对象获取Mapper接口类型的对象(动态代理技术)
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        // 4.调用Mapper接口的方法
        Order order = orderMapper.selectOrderWithCustomer(1);
        System.out.println(order);

        // 4.关闭SqlSession
        session.commit(); //提交事务 [DQL不需要,其他需要]
        session.close(); //关闭会话
    }

    @Test
    public void selectCustomerWithOrderListTest() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sessionFactory.openSession();

        // 3.根据EmployeeMapper接口的Class对象获取Mapper接口类型的对象(动态代理技术)
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        // 4.调用Mapper接口的方法
        Customer customer = orderMapper.selectCustomerWithOrderList(1);
        System.out.println(customer);

        // 4.关闭SqlSession
        session.commit(); //提交事务 [DQL不需要,其他需要]
        session.close(); //关闭会话
    }
}
