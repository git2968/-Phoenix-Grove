package xyz.d4c.lease.web.app.service;

import xyz.d4c.lease.model.entity.ViewAppointment;
import xyz.d4c.lease.web.app.vo.appointment.AppointmentDetailVo;
import xyz.d4c.lease.web.app.vo.appointment.AppointmentItemVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {

    List<AppointmentItemVo> listAppointmentItemByUserId(Long userId);

    AppointmentDetailVo getAppointmentDetailVoById(Long id);
}
