package xyz.d4c.lease.web.admin.controller.system;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.common.result.ResultCodeEnum;
import xyz.d4c.lease.model.entity.SystemUser;
import xyz.d4c.lease.model.entity.UserInfo;
import xyz.d4c.lease.model.enums.BaseStatus;
import xyz.d4c.lease.web.admin.service.SystemUserService;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserItemVo;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;


@Tag(name = "后台用户信息管理")
@RestController
@RequestMapping("/admin/system/user")
public class    SystemUserController {
    @Autowired
    SystemUserService service;

    @Operation(summary = "根据条件分页查询后台用户列表")
    @GetMapping("page")
    public Result<IPage<SystemUserItemVo>> page(@RequestParam long current, @RequestParam long size, SystemUserQueryVo queryVo) {
        Page<SystemUser> page = new Page<>(current, size);
        IPage<SystemUserItemVo> list = service.pageSystemUserByQuery(page, queryVo);
        return Result.ok(list);
    }

    @Operation(summary = "根据ID查询后台用户信息")
    @GetMapping("getById")
    public Result<SystemUserItemVo> getById(@RequestParam Long id) {
        SystemUserItemVo systemUser = service.getSystemUserById(id);
        return Result.ok(systemUser);

    }

    @Operation(summary = "保存或更新后台用户信息")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody SystemUser systemUser) {
        boolean success = service.saveOrUpdateWithCheck(systemUser);
        return success ? Result.ok() : Result.fail(ResultCodeEnum.ADMIN_ACCOUNT_EXIST_ERROR.getCode(), ResultCodeEnum.ADMIN_ACCOUNT_EXIST_ERROR.getMessage());
    }

    @Operation(summary = "判断后台用户名是否可用")
    @GetMapping("isUserNameAvailable")
    public Result<Boolean> isUsernameExists(@RequestParam String username) {
        LambdaQueryWrapper<SystemUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SystemUser::getUsername, username);
        long count = service.count(queryWrapper);
        return Result.ok(count == 0);
    }

    @DeleteMapping("deleteById")
    @Operation(summary = "根据ID删除后台用户信息")
    public Result removeById(@RequestParam Long id) {
        service.removeById(id);
        return Result.ok();
    }

    @Operation(summary = "根据ID修改后台用户状态")
    @PostMapping("updateStatusByUserId")
    public Result updateStatusByUserId(@RequestParam Long id, @RequestParam BaseStatus status) {
        service.updateStatusByUserId(id, status);
        return Result.ok();
    }
}
