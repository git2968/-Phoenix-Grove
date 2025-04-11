package xyz.d4c.lease.common.exception;

import lombok.Data;
import lombok.ToString;
import xyz.d4c.lease.common.result.ResultCodeEnum;

@Data
public class LeaseException extends RuntimeException{
    private Integer code;
    public LeaseException(){}
    public LeaseException(String message,Integer code){
        super(message);
        this.code = code;
    }

    public LeaseException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "LeaseException{" +
                "code=" + code +
                ",message="+this.getMessage()+
                '}';
    }
}
