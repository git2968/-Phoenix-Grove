package xyz.d4c.lease.web.app.vo.attr;

import xyz.d4c.lease.model.entity.AttrKey;
import xyz.d4c.lease.model.entity.AttrValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;


@Data
public class AttrKeyVo extends AttrKey {

    @Schema(description = "属性value列表")
    private List<AttrValue> attrValueList;
}
