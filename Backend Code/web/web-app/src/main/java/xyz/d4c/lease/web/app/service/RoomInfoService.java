package xyz.d4c.lease.web.app.service;

import xyz.d4c.lease.model.entity.RoomInfo;
import xyz.d4c.lease.web.app.vo.room.RoomDetailVo;
import xyz.d4c.lease.web.app.vo.room.RoomItemVo;
import xyz.d4c.lease.web.app.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface RoomInfoService extends IService<RoomInfo> {


    IPage<RoomItemVo> pageRoomItemByQuery(Page<RoomItemVo> roomItemVoPage, RoomQueryVo queryVo);

    RoomDetailVo getRoomDetailById(Long id);

    IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id);
}
