package cn.bugstack.gateway.center.application;

import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceVO;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationSystemVO;

public interface IRegisterManageService {
    void registerApplication(ApplicationSystemVO applicationSystemVO);

    void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO);

    void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceVO);
}
