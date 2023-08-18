package cn.bugstack.gateway.center.domain.repository;

import cn.bugstack.gateway.center.domain.model.ApiData;

import java.util.List;

public interface IApiRepository {
    List<ApiData> queryHttpStatementList();
}
