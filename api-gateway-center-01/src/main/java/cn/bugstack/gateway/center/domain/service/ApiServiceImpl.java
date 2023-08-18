package cn.bugstack.gateway.center.domain.service;

import cn.bugstack.gateway.center.application.IApiService;
import cn.bugstack.gateway.center.domain.model.ApiData;
import cn.bugstack.gateway.center.domain.repository.IApiRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ApiServiceImpl implements IApiService {
    @Resource
    private IApiRepository apiRepository;
    @Override
    public List<ApiData> queryHttpStatementList() {
        return apiRepository.queryHttpStatementList();
    }
}
