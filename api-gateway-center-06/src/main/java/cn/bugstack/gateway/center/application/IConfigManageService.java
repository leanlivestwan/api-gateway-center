package cn.bugstack.gateway.center.application;

import cn.bugstack.gateway.center.domain.manage.model.aggregates.ApplicationSystemRichInfo;
import cn.bugstack.gateway.center.domain.manage.model.vo.GatewayServerVO;

import java.util.List;

public interface IConfigManageService {
    List<GatewayServerVO> queryGatewayServerList();

    boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress);

    ApplicationSystemRichInfo queryApplicationSystemRichInfo(String gatewayId);

    String queryGatewayDistribution(String systemId);
}
