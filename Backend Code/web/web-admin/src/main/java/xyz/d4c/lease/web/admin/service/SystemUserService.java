package xyz.d4c.lease.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.d4c.lease.model.entity.SystemUser;
import xyz.d4c.lease.model.enums.BaseStatus;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserItemVo;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liubo
* @description 针对表【system_user(员工信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface SystemUserService extends IService<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUserItemVo getSystemUserById(Long id);

    void updateStatusByUserId(Long id, BaseStatus status);

    boolean  saveOrUpdateWithCheck(SystemUser systemUser);
}
