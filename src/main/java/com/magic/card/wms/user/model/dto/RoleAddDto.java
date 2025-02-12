package com.magic.card.wms.user.model.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 新增权限 请求实体
 * @author zhouhao
 * @since 2019-06-18
 */
@Data
@ApiModel(description = "新增权限 请求实体")
public class RoleAddDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *	 权限类型
     */
	@ApiModelProperty("权限类型")
    private String roleType;
    /**
     * 	限编码
     */
	@ApiModelProperty("权限编码")
	@NotBlank(message="权限编码不能为空")
    private String roleCode;
    /**
     * 	权限名称
     */
	@ApiModelProperty("权限名称")
	@NotBlank(message="权限名称不能为空")
    private String roleName;
    /**
     *	 权限描述
     */
	@ApiModelProperty("权限描述")
    private String roleDesc;
	
	/**
	 *	 菜单主键list
	 */
	@ApiModelProperty("菜单ID列表list")
	private List<Long> menuKeyList;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoleAddDto [");
		if (roleType != null)
			builder.append("roleType=").append(roleType).append(", ");
		if (roleCode != null)
			builder.append("roleCode=").append(roleCode).append(", ");
		if (roleName != null)
			builder.append("roleName=").append(roleName).append(", ");
		if (roleDesc != null)
			builder.append("roleDesc=").append(roleDesc).append(", ");
		if (menuKeyList != null)
			builder.append("menuKeyList=").append(menuKeyList);
		builder.append("]");
		return builder.toString();
	}

}
