package xyz.d4c.lease.web.admin.custom.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import xyz.d4c.lease.model.enums.ItemType;
@Component
public class StringToItemTypeConverter implements Converter<String, ItemType> {
    @Override
    public ItemType convert(String code) {

        /*if("1".equals(code)){
            return ItemType.APARTMENT;
        }else if("2".equals(code)){
            return ItemType.ROOM;
        }*/

        for (ItemType value : ItemType.values()) {
            if(value.getCode().equals(Integer.valueOf(code))){
                return value;
            }
        }
        throw new IllegalArgumentException("code非法");
    }
}
