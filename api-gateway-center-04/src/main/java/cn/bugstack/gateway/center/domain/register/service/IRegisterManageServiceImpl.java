package cn.bugstack.gateway.center.domain.register.service;

import cn.bugstack.gateway.center.application.IRegisterManageService;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceVO;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationSystemVO;
import cn.bugstack.gateway.center.domain.register.repository.IRegisterManageRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class IRegisterManageServiceImpl implements IRegisterManageService {
    @Resource
    private IRegisterManageRepository registerManageRepository;
    @Override
    public void registerApplication(ApplicationSystemVO applicationSystemVO) {
        registerManageRepository.registerApplication(applicationSystemVO);
    }

    @Override
    public void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO) {
        registerManageRepository.registerApplicationInterface(applicationInterfaceVO);
    }

    @Override
    public void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceVO) {
        registerManageRepository.registerApplicationInterfaceMethod(applicationInterfaceVO);
    }
}
