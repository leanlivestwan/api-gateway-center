package cn.bugstack.gateway.center.domain.manage.model.aggregates;

//import cn.bugstack.gateway.center.domain.register.model.vo.ApplicationSystemVO;

import cn.bugstack.gateway.center.domain.manage.model.vo.ApplicationSystemVO;

import java.util.List;

public class ApplicationSystemRichInfo {
    /** 网关ID */
    private String gatewayId;
    /** 系统列表 */
    private List<ApplicationSystemVO> applicationSystemVOList;
    public ApplicationSystemRichInfo(String gatewayId, List<ApplicationSystemVO> applicationSystemVOList) {
        this.gatewayId = gatewayId;
        this.applicationSystemVOList = applicationSystemVOList;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public List<ApplicationSystemVO> getApplicationSystemVOList() {
        return applicationSystemVOList;
    }

    public void setApplicationSystemVOList(List<ApplicationSystemVO> applicationSystemVOList) {
        this.applicationSystemVOList = applicationSystemVOList;
    }
}
