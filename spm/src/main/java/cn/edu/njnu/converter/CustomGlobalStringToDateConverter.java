package cn.edu.njnu.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * S - source源
 * T - target目标
 */
public class CustomGlobalStringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
