package xyz.d4c.lease.web.app.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.d4c.lease.model.entity.ViewAppointment;
import xyz.d4c.lease.web.app.mapper.ViewAppointmentMapper;
import xyz.d4c.lease.web.app.service.ViewAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.d4c.lease.web.app.vo.apartment.ApartmentItemVo;
import xyz.d4c.lease.web.app.vo.appointment.AppointmentDetailVo;
import xyz.d4c.lease.web.app.vo.appointment.AppointmentItemVo;

import java.util.List;

/**
 * @author liubo
 * @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment>
        implements ViewAppointmentService {
    @Autowired
    private ViewAppointmentMapper viewAppointmentMapper;

    @Autowired
    private ApartmentInfoServiceImpl apartmentInfoService;


    @Override
    public List<AppointmentItemVo> listAppointmentItemByUserId(Long userId) {
        return viewAppointmentMapper.listAppointmentItemByUserId(userId);
    }

    @Override
    public AppointmentDetailVo getAppointmentDetailVoById(Long id) {
        ViewAppointment viewAppointment = viewAppointmentMapper.selectById(id);
        if (viewAppointment == null) {
            return null;
        }

        ApartmentItemVo apartmentItemVo = apartmentInfoService.selectApartmentItemVoById(viewAppointment.getApartmentId());

        AppointmentDetailVo agreementDetailVo = new AppointmentDetailVo();
        BeanUtils.copyProperties(viewAppointment, agreementDetailVo);

        agreementDetailVo.setApartmentItemVo(apartmentItemVo);

        return agreementDetailVo;
    }
}




