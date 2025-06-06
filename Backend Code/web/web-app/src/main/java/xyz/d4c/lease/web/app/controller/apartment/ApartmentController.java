package xyz.d4c.lease.web.app.controller.apartment;

import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.web.app.service.ApartmentInfoService;
import xyz.d4c.lease.web.app.vo.apartment.ApartmentDetailVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "公寓信息")
@RequestMapping("/app/apartment")
public class ApartmentController {
    @Autowired
    private ApartmentInfoService service;

    @Operation(summary = "根据id获取公寓信息")
    @GetMapping("getDetailById")
    public Result<ApartmentDetailVo> getDetailById(@RequestParam Long id) {
        ApartmentDetailVo apartmentDetailVo = service.getApartmentDetailById(id);
        return Result.ok(apartmentDetailVo);
    }


}
