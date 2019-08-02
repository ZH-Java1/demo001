package com.sms.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Page {
	private Integer total;//查询总记录数
	private List<Wares> rows;//分页显示的数量pagesize
}
