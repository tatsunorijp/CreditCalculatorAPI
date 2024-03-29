package com.CreditCalculator.resources;

import com.CreditCalculator.controller.CalculatorController;
import com.CreditCalculator.models.CreditLimitModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@Api(value="API REST CREDIT CALCULATOR")
@RequestMapping(value="/api")
public class CreditCalculatorResource {

    @ApiOperation(value="Endpoint de teste")
    @GetMapping("/test")
    public String test() {
        return "test OK";
    }

    @ApiOperation(value="Solicita os parametros e retorna o limite calculado")
    @PostMapping("/creditLimit")
    public String creditLimit(@RequestBody @Valid CreditLimitModel creditLimit) {
        return "1200";
//        return Double.toString(CalculatorController.calculateCreditLimit(creditLimit));
    }

}
