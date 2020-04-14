package com.gilxyj.errorview09.config;


import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;


import java.util.Map;

/**
 * @program: errorview09
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-30 23:40
 **/
@Component
public class ErrorAttributesExtends extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest request, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(request, includeStackTrace);
        if(((Integer) errorAttributes.get("status"))==500){
            errorAttributes.put("message","服务器内部错误！");
        }
        return errorAttributes;
    }
}
