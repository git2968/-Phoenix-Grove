package xyz.d4c.lease.web.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.d4c.lease.model.entity.FeeKey;
import xyz.d4c.lease.web.admin.mapper.FeeKeyMapper;
import xyz.d4c.lease.web.admin.service.FeeKeyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.d4c.lease.web.admin.vo.fee.FeeKeyVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey>
    implements FeeKeyService{
    @Autowired
    private FeeKeyMapper feeKeyMapper;

    @Override
    public List<FeeKeyVo> listFeeInfo() {
        return feeKeyMapper.listFeeInfo();
    }
}




