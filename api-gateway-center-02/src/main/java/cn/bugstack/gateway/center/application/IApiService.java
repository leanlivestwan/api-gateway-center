package cn.bugstack.gateway.center.application;

import cn.bugstack.gateway.center.domain.model.ApiData;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description API 服务
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IApiService {

    List<ApiData> queryHttpStatementList();

}
