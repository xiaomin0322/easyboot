package com.zf.easyboot.modules.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 促销规则表
 * </p>
 *
 * @author Cenyol
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PeRule implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 老系统id
     */
    private Long oldId;

    /**
     * 英文名称
     */
    private String nameEn;

    /**
     * 中文名称
     */
    private String nameCn;

    /**
     * 优先级 数字越小，优先级越高，最大是0；不能是负数
     */
    private Integer priority;

    /**
     * 启用状态 0:未启动 1:启动
     */
    private Boolean enable;

    /**
     * 有效起始
     */
    private LocalDateTime expityStart;

    /**
     * 有效期止
     */
    private LocalDateTime expityEnd;

    /**
     * 显示标记 0:否,1:是
     */
    private Integer displayVisible;

    /**
     * 显示的描述英文
     */
    private String displayTextEn;

    /**
     * 显示的描述中文
     */
    private String displayTextCn;

    /**
     * 不满足使用条件提示语英文
     */
    private String displayCueWordsEn;

    /**
     * 不满足使用条件提示语中文
     */
    private String displayCueWordsCn;

    /**
     * 显示的图片
     */
    private String displayImgPath;

    /**
     * 是否启用优惠券方式 0:否,1:是
     */
    private Boolean couponUseCoupon;

    /**
     * 是否是固定码（心意券之类） 0:否,1:是
     */
    private String couponFixcode;

    /**
     * 是否启用数量限制 0:否,1:是
     */
    private Boolean couponQuantityLimited;

    /**
     * 前缀或固定码
     */
    private String couponPrefix;

    /**
     * 门店可用 0:否,1:是
     */
    private Boolean couponStoreAvailable;

    /**
     * 在线订单可用 0:否,1:是
     */
    private Boolean couponOnlineAvailable;

    /**
     * 新会员类型 0:否,1:是
     */
    private Boolean couponNewCustomer;

    /**
     * 会员资讯类型 0:否,1:是
     */
    @TableField("coupon_member_Info")
    private Boolean couponMemberInfo;

    /**
     * 用户领取的张数限制（0表示不限制）
     */
    private Integer couponAllocateLimit;

    /**
     * 顺延天数（领取券时，给优惠券的有限期顺延，0表示不顺延）
     */
    private Integer couponExtendDay;

    /**
     * 优惠券创建时间
     */
    private LocalDateTime couponCreatedTime;

    private Boolean deleteFlag;

    /**
     * 0:PE规则 1:用户积分订单支付规则
     */
    private Integer classify;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;

    /**
     * 有效期后延的天数
     */
    private Integer couponDelayDay;

    /**
     * 需求部门
     */
    private String department;

    /**
     * 最大赠送数量
     */
    private Integer giveMaxNum;


}
