package cn.bugstack.gateway.center.infrastructure.dao;

import cn.bugstack.gateway.center.infrastructure.po.ApplicationInterface;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IApplicationInterfaceDao {
    void insert(ApplicationInterface applicationInterface);
}
