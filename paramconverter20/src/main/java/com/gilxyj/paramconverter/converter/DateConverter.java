package com.gilxyj.paramconverter.converter;


import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: paramconverter
 * @description:
 * @author: GilbertXiao
 * @create: 2019-08-19 21:44
 **/
@Component
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            if(StringUtils.isNoneBlank(source)){
                date = simpleDateFormat.parse(source);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
