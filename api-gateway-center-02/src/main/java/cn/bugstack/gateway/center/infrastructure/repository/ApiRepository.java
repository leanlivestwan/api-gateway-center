package cn.bugstack.gateway.center.infrastructure.repository;

import cn.bugstack.gateway.center.domain.model.ApiData;
import cn.bugstack.gateway.center.domain.repository.IApiRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 仓储实现
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class ApiRepository implements IApiRepository {

    @Override
    public List<ApiData> queryHttpStatementList() {
       return null;
    }

}
