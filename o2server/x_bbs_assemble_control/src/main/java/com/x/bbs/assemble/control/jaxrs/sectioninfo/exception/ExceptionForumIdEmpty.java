package com.x.bbs.assemble.control.jaxrs.sectioninfo.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionForumIdEmpty extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionForumIdEmpty() {
		super("论坛分区id为空， 无法进行查询." );
	}
}
