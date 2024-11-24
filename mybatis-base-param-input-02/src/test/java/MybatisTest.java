import com.zazhi.mapper.EmployeeMapper;
import com.zazhi.pojo.Employee;
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
public class MybatisTest {

    @Test
    public void test_01() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sessionFactory.openSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.selectEmployee(1);
        System.out.println("employee = " + employee);
        session.commit(); //提交事务 [DQL不需要,其他需要]
        session.close(); //关闭会话
    }

}
