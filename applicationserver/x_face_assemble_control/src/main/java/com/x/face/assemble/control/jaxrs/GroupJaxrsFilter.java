package com.x.face.assemble.control.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.project.jaxrs.ManagerUserJaxrsFilter;

@WebFilter(urlPatterns = "/jaxrs/group/*", asyncSupported = true)
public class GroupJaxrsFilter extends ManagerUserJaxrsFilter {

}
