package xyz.d4c.lease.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.d4c.lease.model.entity.LeaseAgreement;
import xyz.d4c.lease.web.admin.vo.agreement.AgreementQueryVo;
import xyz.d4c.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liubo
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {


    IPage<AgreementVo> pageAgreementByQuery(Page<AgreementVo> page, AgreementQueryVo queryVo);

    AgreementVo getAgreementById(Long id);
}
