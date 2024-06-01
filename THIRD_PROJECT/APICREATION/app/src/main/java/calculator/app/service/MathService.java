package calculator.app.service;

import calculator.app.service.DTO.MathRequestDTO;
import calculator.app.service.DTO.MathResponse;
import org.springframework.stereotype.Service; //inactivate spring boot service

@Service

public class MathService {
    //logic to add two numbers
    public MathResponse add(MathRequestDTO mathRequestDTO)
    {
       //get the numbers from the DTO

       int number1 = mathRequestDTO.getNumber1();
       int number2 = mathRequestDTO.getNumber2();

        //System.out.println("Number1: = " + number1 +"number2: = " + number2 );
        System.out.println("Number1: = " + number1);
        System.out.println("Number2: = " + number2);

        //do the summation
        int sum = number1 + number2 ;

        System.out.println("Number1: = " + number1 +" number2: = " + number2 + " = " +sum );

        //Generate Response

        MathResponse mathResponse = new MathResponse();
        mathResponse.setNumber1(number1);
        mathResponse.setNumber2(number2);
        mathResponse.setResult(sum);

        return mathResponse;
    }
    public MathResponse multiply(MathRequestDTO mathRequestDTO)
    {
        //get the numbers from the DTO

        int number1 = mathRequestDTO.getNumber1();
        int number2 = mathRequestDTO.getNumber2();

        //System.out.println("Number1: = " + number1 +"number2: = " + number2 );
        System.out.println("Number1: = " + number1);
        System.out.println("Number2: = " + number2);

        //do the summation
        int product = number1 * number2 ;

        System.out.printf("\nThe product of %d * %d  = %d",number1, number2, product);

        //Generate Response

        MathResponse mathResponse = new MathResponse();
        mathResponse.setNumber1(number1);
        mathResponse.setNumber2(number2);
        mathResponse.setResult(product);

        return mathResponse;
    }


}
