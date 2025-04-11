package xyz.d4c.lease.web.app.vo.apartment;


import xyz.d4c.lease.model.entity.ApartmentInfo;
import xyz.d4c.lease.model.entity.GraphInfo;
import xyz.d4c.lease.model.entity.LabelInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import xyz.d4c.lease.web.app.vo.graph.GraphVo;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "App端公寓信息")
public class ApartmentItemVo extends ApartmentInfo {

    private List<LabelInfo> labelInfoList;

    private List<GraphVo> graphVoList;

    private BigDecimal minRent;
}
