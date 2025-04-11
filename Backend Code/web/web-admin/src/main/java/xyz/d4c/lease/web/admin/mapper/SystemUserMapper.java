package xyz.d4c.lease.web.admin.mapper;

import xyz.d4c.lease.model.entity.SystemUser;
import xyz.d4c.lease.model.enums.BaseStatus;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserItemVo;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* @author liubo
* @description 针对表【system_user(员工信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.atguigu.lease.model.SystemUser
*/
public interface SystemUserMapper extends BaseMapper<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUserItemVo getSystemUserById(Long id);

    void updateStatusByUserId(Long id, BaseStatus status);
}




