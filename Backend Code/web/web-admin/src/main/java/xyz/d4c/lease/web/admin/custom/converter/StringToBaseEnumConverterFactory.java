package xyz.d4c.lease.web.admin.custom.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;
import xyz.d4c.lease.model.enums.BaseEnum;

@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new Converter<String, T>() {
            @Override
            public T convert(String source) {
                for (T enumConstant : targetType.getEnumConstants()) {
                    if(enumConstant.getCode().equals(Integer.valueOf(source))){
                        return enumConstant;
                    }
                }
                throw new IllegalArgumentException("code非法");
            }
        };
    }
}
