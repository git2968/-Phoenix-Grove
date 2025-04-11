package xyz.d4c.lease.web.app.controller.leasaterm;

import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.model.entity.LeaseAgreement;
import xyz.d4c.lease.model.entity.LeaseTerm;
import xyz.d4c.lease.web.app.service.LeaseAgreementService;
import xyz.d4c.lease.web.app.service.LeaseTermService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app/term/")
@Tag(name = "租期信息")
public class LeaseTermController {
    @Autowired
    private LeaseTermService service;



    @GetMapping("listByRoomId")
    @Operation(summary = "根据房间id获取可选获取租期列表")
    public Result<List<LeaseTerm>> list(@RequestParam Long id) {
        List<LeaseTerm> list = service.listByRoomId(id);
        return Result.ok(list);
    }
}
