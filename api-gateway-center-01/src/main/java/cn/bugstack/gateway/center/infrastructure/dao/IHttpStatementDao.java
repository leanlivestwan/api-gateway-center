package cn.bugstack.gateway.center.infrastructure.dao;

import cn.bugstack.gateway.center.infrastructure.po.HttpStatement;
import org.apache.ibatis.annotations.Mapper;
//import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface IHttpStatementDao {
    List<HttpStatement> queryHttpStatementList();
}
