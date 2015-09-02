/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.calculate.commandFactory;

import com.pagodalabs.calculate.commands.AddCommand;
import com.pagodalabs.calculate.commands.Command;
import com.pagodalabs.calculate.commands.DivCommand;
import com.pagodalabs.calculate.commands.MaxCommand;
import com.pagodalabs.calculate.commands.MinCommand;
import com.pagodalabs.calculate.commands.MulCommand;
import com.pagodalabs.calculate.commands.PowerCommand;
import com.pagodalabs.calculate.commands.SubCommand;
import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class CommandFactory {
    
    private static HashMap<String, Command> buttons = initialize();
    
    private static HashMap<String, Command> initialize(){
        HashMap<String, Command> buttons = new HashMap<String, Command>();
        buttons.put("+", new AddCommand());
        buttons.put("-", new SubCommand());
        buttons.put("*", new MulCommand());
        buttons.put("/", new DivCommand());
        buttons.put("^", new PowerCommand());
        buttons.put("max", new MaxCommand());
        buttons.put("min", new MinCommand());
        
        return buttons;
    }
    
    public static Command getCommand(String key)
    {
        return (Command) buttons.get(key);
    }
    
    
    
}
