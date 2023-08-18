package cn.bugstack.gateway.center.infrastructure.repository;

import cn.bugstack.gateway.center.domain.model.ApiData;
import cn.bugstack.gateway.center.domain.repository.IApiRepository;
import cn.bugstack.gateway.center.infrastructure.dao.IHttpStatementDao;
import cn.bugstack.gateway.center.infrastructure.po.HttpStatement;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Component
public class ApiRepository implements IApiRepository {
    @Resource
    private IHttpStatementDao httpStatementDao;

    @Override
    public List<ApiData> queryHttpStatementList() {
        List<HttpStatement> httpStatements = httpStatementDao.queryHttpStatementList();
        List<ApiData> apiDataList = new ArrayList<>(httpStatements.size());
        for (HttpStatement httpStatement : httpStatements) {
            ApiData apiData = new ApiData();
            apiData.setApplication(httpStatement.getApplication());
            apiData.setInterfaceName(httpStatement.getInterfaceName());
            apiData.setMethodName(httpStatement.getMethodName());
            apiData.setParameterType(httpStatement.getParameterType());
            apiData.setUri(httpStatement.getUri());
            apiData.setHttpCommandType(httpStatement.getHttpCommandType());
            apiData.setAuth(httpStatement.getAuth());
            apiDataList.add(apiData);
        }
        return apiDataList;
    }
}
