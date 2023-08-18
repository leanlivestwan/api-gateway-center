package cn.bugstack.gateway.center.domain.manage.repository;

import cn.bugstack.gateway.center.domain.manage.model.vo.*;
//import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceMethodVO;
//import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationInterfaceVO;
//import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationSystemVO;

import java.util.List;

public interface IConfigManageRepository {
    List<GatewayServerVO> queryGatewayServerList();

    GatewayServerDetailVO queryGatewayServerDetail(String gatewayId, String gatewayAddress);

    boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress, Integer available);

    boolean updateGatewayStatus(String gatewayId, String gatewayAddress, Integer available);

    List<String> queryGatewayDistributionSystemIdList(String gatewayId);

    List<ApplicationSystemVO> queryApplicationSystemList(List<String> systemIdList);

    List<ApplicationInterfaceVO> queryApplicationInterfaceList(String systemId);

    List<ApplicationInterfaceMethodVO> queryApplicationInterfaceMethodList(String systemId, String interfaceId);
}
