package base;


import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/***
 * 业务逻辑层基础测试类 通过继承此类，可以很方便的建立使用了Spring上下文的测试类
 * 
 * @author Kiseki
 * @since 2013/11/27
 */
@ActiveProfiles(profiles = { "dev" })
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)  
@Transactional
@ContextConfiguration(locations = { "classpath*:applicationContext*.xml" })
public class BaseServiceTest extends
		AbstractJUnit4SpringContextTests {

}
