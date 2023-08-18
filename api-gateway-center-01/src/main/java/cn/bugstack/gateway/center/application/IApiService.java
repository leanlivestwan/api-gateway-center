package cn.bugstack.gateway.center.application;

import cn.bugstack.gateway.center.domain.model.ApiData;

import java.util.List;

public interface IApiService {

    List<ApiData> queryHttpStatementList();
}
