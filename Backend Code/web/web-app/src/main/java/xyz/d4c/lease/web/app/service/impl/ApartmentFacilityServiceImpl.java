package xyz.d4c.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.d4c.lease.model.entity.ApartmentFacility;
import xyz.d4c.lease.web.app.service.ApartmentFacilityService;
import xyz.d4c.lease.web.app.mapper.ApartmentFacilityMapper;
import org.springframework.stereotype.Service;
import xyz.d4c.lease.model.entity.ApartmentFacility;

/**
* @author liubo
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility>
    implements ApartmentFacilityService{

}




