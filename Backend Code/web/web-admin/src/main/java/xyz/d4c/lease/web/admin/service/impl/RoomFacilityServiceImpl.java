package xyz.d4c.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.d4c.lease.model.entity.RoomFacility;
import xyz.d4c.lease.web.admin.service.RoomFacilityService;
import xyz.d4c.lease.web.admin.mapper.RoomFacilityMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【room_facility(房间&配套关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class RoomFacilityServiceImpl extends ServiceImpl<RoomFacilityMapper, RoomFacility>
    implements RoomFacilityService{

}




