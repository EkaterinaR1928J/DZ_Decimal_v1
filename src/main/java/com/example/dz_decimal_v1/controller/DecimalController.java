package com.example.dz_decimal_v1.controller;

import com.example.dz_decimal_v1.modal.Decimal;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ----- Создание RESTful сервиса, который инкапсулирует операции по работе с дробями -----


@RestController
@RequestMapping("/decimal")
public class DecimalController {
    //Задание 1. Проверка, является ли дробь правильной
    @GetMapping("/case1")
    public String caseDecimalIsCorrect(@PathParam("numerator1") int numerator1,
                                       @PathParam("denumerator1") int denumerator1) {
        return Decimal.decimalIsCorrect(numerator1, denumerator1);
    }

    //Задание 2. Сокращение дроби
    @GetMapping("/case2")
    public String caseDecimalReduction(@PathParam("numerator1") int numerator1,
                                       @PathParam("denumerator1") int denumerator1) {
        return Decimal.decimalReduction(numerator1, denumerator1);
    }

    //Задание 3. Сложение дробей
    @GetMapping("/case3")
    public String caseDecimalAddition(@PathParam("numerator1") int numerator1,
                                      @PathParam("denumerator1") int denumerator1,
                                      @PathParam("numerator2") int numerator2,
                                      @PathParam("denumerator2") int denumerator2) {
        return Decimal.decimalAddition(numerator1, denumerator1, numerator2, denumerator2);
    }

    //Задание 4. Вычитание дробей
    @GetMapping("/case4")
    public String caseDecimalSubtract(@PathParam("numerator1") int numerator1,
                                      @PathParam("denumerator1") int denumerator1,
                                      @PathParam("numerator2") int numerator2,
                                      @PathParam("denumerator2") int denumerator2) {
        return Decimal.decimalSubtract(numerator1, denumerator1, numerator2, denumerator2);
    }

    //Задание 5. Умножение дробей
    @GetMapping("/case5")
    public String caseDecimalMultiplication(@PathParam("numerator1") int numerator1,
                                            @PathParam("denumerator1") int denumerator1,
                                            @PathParam("numerator2") int numerator2,
                                            @PathParam("denumerator2") int denumerator2) {
        return Decimal.decimalMultiplication(numerator1, denumerator1, numerator2, denumerator2);
    }

    //Задание 6. Деление дробей
    @GetMapping("/case6")
    public String caseDecimalDivide(@PathParam("numerator1") int numerator1,
                                    @PathParam("denumerator1") int denumerator1,
                                    @PathParam("numerator2") int numerator2,
                                    @PathParam("denumerator2") int denumerator2) {
        return Decimal.decimalDivide(numerator1, denumerator1, numerator2, denumerator2);
    }
}
