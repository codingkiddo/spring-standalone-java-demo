package com.spring.scopedproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonScopedBean {
	@Autowired
    private PrototypeScopedBean prototypeScopedBean;
   
    public String getState(){
        return this.prototypeScopedBean.getState();
    }
}
