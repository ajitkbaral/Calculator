
package com.pagodalabs.calculate;

import com.pagodalabs.calculate.commandFactory.CommandFactory;
import com.pagodalabs.calculate.commands.Command;
import com.pagodalabs.calculate.util.Input;
import java.io.IOException;



public class Programs {

    
    public static void main(String[] args) {
        
        try{
        double x = Input.getInt();
        
        String sign = Input.getString();
        
        double y = Input.getInt();
        
        
        Command cmd = CommandFactory.getCommand(sign);
        double total = cmd.calculate(x, y);
        System.out.println("The Answer is : "+total);
        }catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }
    
}
