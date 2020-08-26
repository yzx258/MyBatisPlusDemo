package com.example.mp.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yucw
 * @date 2020/8/26 13:52
 */
@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserStatusEnums {

    Z(0,"无"),
    HOUSEHOLD_CAR(1 ,"家用车"),
    OPERATING_CAR(2 ,"营运车"),
    NET_ABOUT_CAR(3 ,"网约车"),
    ;

    private int code;
    private String name;

}
