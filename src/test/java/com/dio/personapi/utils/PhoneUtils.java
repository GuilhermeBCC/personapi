package com.dio.personapi.utils;

import com.dio.personapi.dto.request.PhoneDTO;
import com.dio.personapi.entity.Phone;
import com.dio.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE = "83 9999 9999";
    private static final PhoneType TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE)
                .type(TYPE)
                .build();
    }
    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE)
                .type(TYPE)
                .build();
    }
}
