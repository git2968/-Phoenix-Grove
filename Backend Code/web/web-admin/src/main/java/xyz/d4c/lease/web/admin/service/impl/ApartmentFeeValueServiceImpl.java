package xyz.d4c.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.d4c.lease.model.entity.ApartmentFeeValue;
import xyz.d4c.lease.web.admin.service.ApartmentFeeValueService;
import xyz.d4c.lease.web.admin.mapper.ApartmentFeeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class ApartmentFeeValueServiceImpl extends ServiceImpl<ApartmentFeeValueMapper, ApartmentFeeValue>
    implements ApartmentFeeValueService{

}




