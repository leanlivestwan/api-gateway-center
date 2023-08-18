package cn.bugstack.gateway.center.domain.register.repository;

import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceVO;
import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationSystemVO;

public interface IRegisterManageRepository {
    void registerApplication(ApplicationSystemVO applicationSystemVO);

    void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO);

    void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceVO);
}
