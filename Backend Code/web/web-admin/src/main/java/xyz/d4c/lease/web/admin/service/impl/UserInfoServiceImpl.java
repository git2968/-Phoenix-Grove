package xyz.d4c.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.d4c.lease.model.entity.UserInfo;
import xyz.d4c.lease.web.admin.service.UserInfoService;
import xyz.d4c.lease.web.admin.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;
import xyz.d4c.lease.web.admin.vo.user.UserInfoQueryVo;

/**
* @author liubo
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

    @Override
    public IPage<UserInfo> selectPage(IPage<UserInfo> page, UserInfoQueryVo queryVo) {
        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(queryVo.getPhone() != null, UserInfo::getPhone, queryVo.getPhone());
        queryWrapper.eq(queryVo.getStatus() != null, UserInfo::getStatus, queryVo.getStatus());
        IPage<UserInfo> list = baseMapper.selectPage(page, queryWrapper);
        return list;
    }
}




