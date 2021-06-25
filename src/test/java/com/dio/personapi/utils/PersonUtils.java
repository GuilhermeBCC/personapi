package com.dio.personapi.utils;

import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Guilherme";
    private static final String LAST_NAME = "Lima";
    private static final String CPF = "000.000.000-00";
    private static final long PERSON_ID = 1l;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2000,10,10);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}