package cn.bugstack.gateway.center.test;

import cn.bugstack.gateway.center.application.IApiService;
import cn.bugstack.gateway.center.domain.model.ApiData;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 单元测试
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Resource
    private IApiService apiService;

    @Test
    public void test() {
        List<ApiData> apiDataList = apiService.queryHttpStatementList();
        logger.info("测试结果：{}", JSON.toJSONString(apiDataList));
    }

}
