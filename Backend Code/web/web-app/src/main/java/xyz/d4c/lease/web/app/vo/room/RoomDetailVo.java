package xyz.d4c.lease.web.app.vo.room;

import xyz.d4c.lease.model.entity.*;
import xyz.d4c.lease.web.app.vo.apartment.ApartmentItemVo;
import xyz.d4c.lease.web.app.vo.attr.AttrValueVo;
import xyz.d4c.lease.web.app.vo.fee.FeeValueVo;
import xyz.d4c.lease.web.app.vo.graph.GraphVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "APP房间详情")
public class RoomDetailVo extends RoomInfo {

    @Schema(description = "所属公寓信息")
    private ApartmentItemVo apartmentItemVo;

    @Schema(description = "图片列表")
    private List<GraphVo> graphVoList;

    @Schema(description = "属性信息列表")
    private List<AttrValueVo> attrValueVoList;

    @Schema(description = "配套信息列表")
    private List<FacilityInfo> facilityInfoList;

    @Schema(description = "标签信息列表")
    private List<LabelInfo> labelInfoList;

    @Schema(description = "支付方式列表")
    private List<PaymentType> paymentTypeList;

    @Schema(description = "杂费列表")
    private List<FeeValueVo> feeValueVoList;

    @Schema(description = "租期列表")
    private List<LeaseTerm> leaseTermList;

    @Schema(description = "房间是否被删除")
    private Boolean isDelete;

    @Schema(description = "房间是否已入住")
    private Boolean isCheckIn;
}
