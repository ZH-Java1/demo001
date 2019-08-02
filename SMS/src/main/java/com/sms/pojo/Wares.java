package com.sms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("sms_wares")
@JsonIgnoreProperties(ignoreUnknown = true)	//因为JSON转化会调用get/set方法。此注解可忽略未知属性
public class Wares{
	@TableId(type = IdType.AUTO)
	private Long id;
	private String wareName;
	private String wareHome;
	private Double warePrice;
}
