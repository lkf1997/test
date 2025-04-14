package demo.utils.controller;

import demo.utils.entity.SysUser;
import demo.utils.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户管理(SysUser)表控制层
 *
 * @author MakeBy刘凯锋
 * @since 2025-04-09 15:51:44
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(@RequestParam("id") Long id) {
        return this.sysUserService.queryById(id);
    }

    @GetMapping("delete")
    public boolean delete(@RequestParam("id") Long id) {
        return this.sysUserService.deleteById(id);
    }

}
