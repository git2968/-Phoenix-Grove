package xyz.d4c.lease.web.app.controller.appointment;


import org.springframework.beans.factory.annotation.Autowired;
import xyz.d4c.lease.common.context.LoginUserContext;
import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.model.entity.ViewAppointment;
import xyz.d4c.lease.web.app.service.ViewAppointmentService;
import xyz.d4c.lease.web.app.vo.appointment.AppointmentDetailVo;
import xyz.d4c.lease.web.app.vo.appointment.AppointmentItemVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "看房预约信息")
@RestController
@RequestMapping("/app/appointment")
public class ViewAppointmentController {
    @Autowired
    private ViewAppointmentService service;

    @Operation(summary = "保存或更新看房预约")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody ViewAppointment viewAppointment) {
        viewAppointment.setUserId(LoginUserContext.getLoginUser().getUserId());
        service.saveOrUpdate(viewAppointment);
        return Result.ok();
    }

    @Operation(summary = "查询个人预约看房列表")
    @GetMapping("listItem")
    public Result<List<AppointmentItemVo>> listItem() {
        List<AppointmentItemVo> list = service.listAppointmentItemByUserId(LoginUserContext.getLoginUser().getUserId());
        return Result.ok(list);
    }


    @GetMapping("getDetailById")
    @Operation(summary = "根据ID查询预约详情信息")
    public Result<AppointmentDetailVo> getDetailById(Long id) {
        AppointmentDetailVo detail = service.getAppointmentDetailVoById(id);
        return Result.ok(detail);
    }

}

