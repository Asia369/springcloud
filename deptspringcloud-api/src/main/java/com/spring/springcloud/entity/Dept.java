package com.spring.springcloud.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data // 生成get set
@Accessors(chain=true) // 链表访问
public class Dept implements Serializable {

	private static final long serialVersionUID = 8992920893227646845L;
	
	// 主键
	private Long did;
	// 名称
	private String dname;
	// 数据库 
	private String db_source;
}
