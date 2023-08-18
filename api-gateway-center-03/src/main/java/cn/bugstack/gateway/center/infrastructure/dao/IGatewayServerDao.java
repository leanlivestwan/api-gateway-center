package cn.bugstack.gateway.center.infrastructure.dao;

import cn.bugstack.gateway.center.infrastructure.po.GatewayServer;
//import org.mapstruct.Mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface IGatewayServerDao {
    List<GatewayServer> queryGatewayServerList();
}
