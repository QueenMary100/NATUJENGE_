package calculator.app.web.rest;

import calculator.app.service.DTO.MathRequestDTO;
import calculator.app.service.DTO.MathResponse;
import calculator.app.service.MathService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/arithmetic")

public class MathController {

    MathService mathService = new MathService();

    @PostMapping("/add")
    public MathResponse addition(@RequestBody MathRequestDTO mathRequestDTO){

        System.out.println("Received DTO: " + mathRequestDTO);
        return mathService.add(mathRequestDTO);
    }
    @PostMapping("/multiply")
    public MathResponse multiplication(@RequestBody MathRequestDTO mathRequestDTO){

        System.out.println("Received DTO: " + mathRequestDTO);
        return mathService.multiply(mathRequestDTO);
    }

}
