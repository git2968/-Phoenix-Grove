package xyz.d4c.lease.web.app.mapper;

import xyz.d4c.lease.model.entity.ApartmentInfo;
import xyz.d4c.lease.web.app.vo.apartment.ApartmentItemVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigDecimal;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.atguigu.lease.model.entity.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {


    ApartmentInfo selectApartmentById(Long id);
}




