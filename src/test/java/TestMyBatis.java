import com.alibaba.fastjson.JSON;
import com.whh.ssm.model.User;
import com.whh.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMyBatis {
private Logger logger=Logger.getLogger(TestMyBatis.class);
   @Resource
    private UserService userService;
    @Test
    public  void test1(){
            User user=userService.getUserById("1");
            logger.info(JSON.toJSONString(user));
        }
}

