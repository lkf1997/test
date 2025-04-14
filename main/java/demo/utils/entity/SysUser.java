package demo.utils.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户管理(SysUser)实体类
 *
 * @author MakeBy刘凯锋
 * @since 2025-04-09 15:51:40
 */
@Data
public class SysUser implements Serializable {
    /**
     * 编号
     */
    private Long userId;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 登录名
     */
    private String userLoginName;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 组织编码: 关联组织管理表sys_org
     */
    private Long orgId;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 密码
     */
    private String userPwd;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 会话token
     */
    private String sessionToken;
    /**
     * 是否删除: 0否 1是
     */
    private Boolean delFlag;
    /**
     * 创建人员
     */
    private String createUser;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
