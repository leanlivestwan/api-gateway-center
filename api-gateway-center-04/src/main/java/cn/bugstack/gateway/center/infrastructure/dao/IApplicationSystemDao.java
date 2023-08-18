package cn.bugstack.gateway.center.infrastructure.dao;

import cn.bugstack.gateway.center.infrastructure.po.ApplicationSystem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IApplicationSystemDao {
    void insert(ApplicationSystem applicationSystem);
}
