package xyz.d4c.lease.web.app.controller.room;


import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.web.app.service.RoomInfoService;
import xyz.d4c.lease.web.app.vo.room.RoomDetailVo;
import xyz.d4c.lease.web.app.vo.room.RoomItemVo;
import xyz.d4c.lease.web.app.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "房间信息")
@RestController
@RequestMapping("/app/room")
public class RoomController {
    @Autowired
    private RoomInfoService roomInfoService;

    @Operation(summary = "分页查询房间列表")
    @GetMapping("pageItem")
    public Result<IPage<RoomItemVo>> pageItem(@RequestParam long current, @RequestParam long size, RoomQueryVo queryVo) {
        Page<RoomItemVo> roomItemVoPage = new Page<>(current,size);
        IPage<RoomItemVo> list = roomInfoService.pageRoomItemByQuery(roomItemVoPage,queryVo);
        return Result.ok(list);
    }

    @Operation(summary = "根据id获取房间的详细信息")
    @GetMapping("getDetailById")
    public Result<RoomDetailVo> getDetailById(@RequestParam Long id) {
        RoomDetailVo roomInfo = roomInfoService.getRoomDetailById(id);
        return Result.ok(roomInfo);
    }

    @Operation(summary = "根据公寓id分页查询房间列表")
    @GetMapping("pageItemByApartmentId")
    public Result<IPage<RoomItemVo>> pageItemByApartmentId(@RequestParam long current, @RequestParam long size, @RequestParam Long id) {
        IPage<RoomItemVo> page = new Page<>(current, size);
        IPage<RoomItemVo> list = roomInfoService.pageItemByApartmentId(page, id);
        return Result.ok(list);
    }
}
