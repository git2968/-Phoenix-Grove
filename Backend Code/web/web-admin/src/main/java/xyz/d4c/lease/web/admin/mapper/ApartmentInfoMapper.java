package xyz.d4c.lease.web.admin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import xyz.d4c.lease.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import xyz.d4c.lease.web.admin.vo.apartment.ApartmentDetailVo;
import xyz.d4c.lease.web.admin.vo.apartment.ApartmentItemVo;
import xyz.d4c.lease.web.admin.vo.apartment.ApartmentQueryVo;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.atguigu.lease.model.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

   IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);


}




