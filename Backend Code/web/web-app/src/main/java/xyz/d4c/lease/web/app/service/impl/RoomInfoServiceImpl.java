package xyz.d4c.lease.web.app.service.impl;

import xyz.d4c.lease.common.context.LoginUserContext;
import xyz.d4c.lease.model.entity.*;
import xyz.d4c.lease.model.enums.ItemType;
import xyz.d4c.lease.model.enums.LeaseStatus;
import xyz.d4c.lease.web.app.mapper.*;
import xyz.d4c.lease.web.app.service.ApartmentInfoService;
import xyz.d4c.lease.web.app.service.BrowsingHistoryService;
import xyz.d4c.lease.web.app.service.RoomInfoService;
import xyz.d4c.lease.web.app.vo.apartment.ApartmentItemVo;
import xyz.d4c.lease.web.app.vo.attr.AttrValueVo;
import xyz.d4c.lease.web.app.vo.fee.FeeValueVo;
import xyz.d4c.lease.web.app.vo.graph.GraphVo;
import xyz.d4c.lease.web.app.vo.room.RoomDetailVo;
import xyz.d4c.lease.web.app.vo.room.RoomItemVo;
import xyz.d4c.lease.web.app.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liubo
 * @description 针对表【room_info(房间信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
@Slf4j
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo>
        implements RoomInfoService {
    @Autowired
    private RoomInfoMapper roomInfoMapper;

    @Autowired
    private ApartmentInfoService apartmentInfoService;

    @Autowired
    private GraphInfoMapper graphInfoMapper;

    @Autowired
    private AttrValueMapper attrValueMapper;

    @Autowired
    private FacilityInfoMapper facilityInfoMapper;

    @Autowired
    private LeaseTermMapper leaseTermMapper;

    @Autowired
    private PaymentTypeMapper paymentTypeMapper;

    @Autowired
    private FeeValueMapper feeValueMapper;

    @Autowired
    private LabelInfoMapper labelInfoMapper;

    @Autowired
    private BrowsingHistoryService browsingHistoryService;


    @Override
    public IPage<RoomItemVo> pageRoomItemByQuery(Page<RoomItemVo> roomItemVoPage, RoomQueryVo queryVo) {
        return roomInfoMapper.pageRoomItemByQuery(roomItemVoPage, queryVo);
    }

    @Override
    public RoomDetailVo getRoomDetailById(Long id) {
        //1.查询RoomInfo
        RoomInfo roomInfo = roomInfoMapper.selectById(id);
        if (roomInfo == null) {
            return null;
        }

        //2.查询所属公寓信息
        ApartmentItemVo apartmentItemVo = apartmentInfoService.selectApartmentItemVoById(roomInfo.getApartmentId());

        //3.查询graphInfoList
        List<GraphVo> graphVoList = graphInfoMapper.selectListByItemTypeAndId(ItemType.ROOM, id);

        //4.查询attrValueList
        List<AttrValueVo> attrvalueVoList = attrValueMapper.selectListByRoomId(id);

        //5.查询facilityInfoList
        List<FacilityInfo> facilityInfoList = facilityInfoMapper.selectListByRoomId(id);

        //6.查询labelInfoList
        List<LabelInfo> labelInfoList = labelInfoMapper.selectListByRoomId(id);

        //7.查询paymentTypeList
        List<PaymentType> paymentTypeList = paymentTypeMapper.selectListByRoomId(id);

        //8.查询leaseTermList
        List<LeaseTerm> leaseTermList = leaseTermMapper.selectListByRoomId(id);

        //9.查询费用项目信息
        List<FeeValueVo> feeValueVoList = feeValueMapper.selectListByApartmentId(roomInfo.getApartmentId());

        RoomDetailVo appRoomDetailVo = new RoomDetailVo();
        BeanUtils.copyProperties(roomInfo, appRoomDetailVo);

        appRoomDetailVo.setApartmentItemVo(apartmentItemVo);
        appRoomDetailVo.setGraphVoList(graphVoList);
        appRoomDetailVo.setAttrValueVoList(attrvalueVoList);
        appRoomDetailVo.setFacilityInfoList(facilityInfoList);
        appRoomDetailVo.setLabelInfoList(labelInfoList);
        appRoomDetailVo.setPaymentTypeList(paymentTypeList);
        appRoomDetailVo.setFeeValueVoList(feeValueVoList);
        appRoomDetailVo.setLeaseTermList(leaseTermList);
        browsingHistoryService.saveHistory(LoginUserContext.getLoginUser().getUserId(), id);

        return appRoomDetailVo;
    }

    @Override
    public IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id) {
        return roomInfoMapper.pageItemByApartmentId(page, id);
    }
}




