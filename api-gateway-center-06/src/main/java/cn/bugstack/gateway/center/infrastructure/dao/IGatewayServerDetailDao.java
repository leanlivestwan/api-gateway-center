package cn.bugstack.gateway.center.infrastructure.dao;

import cn.bugstack.gateway.center.infrastructure.po.GatewayServerDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IGatewayServerDetailDao {
    GatewayServerDetail queryGatewayServerDetail(GatewayServerDetail req);

    void insert(GatewayServerDetail gatewayServerDetail);

    boolean updateGatewayStatus(GatewayServerDetail gatewayServerDetail);
}
