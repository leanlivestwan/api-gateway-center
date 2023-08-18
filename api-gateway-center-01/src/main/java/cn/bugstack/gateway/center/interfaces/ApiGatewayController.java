package cn.bugstack.gateway.center.interfaces;

import cn.bugstack.gateway.center.application.IApiService;
import cn.bugstack.gateway.center.domain.model.ApiData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiGatewayController {
    private Logger logger = LoggerFactory.getLogger(ApiGatewayController.class);
    @Resource
    private IApiService apiService;

    @GetMapping(value = "list", produces = "application/json;charset=utf-8")
    // 它的作用是指定返回值类型，不但可以设置返回值类型还可以设定返回值的字符编码
    public List<ApiData> getAnswerMap(){
        return apiService.queryHttpStatementList();
    }
}
