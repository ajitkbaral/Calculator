/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.calculate.commands;

/**
 *
 * @author Dell
 */
public class MaxCommand extends Command{
    @Override
    public double calculate(double x, double y) {
        double max = 0;
        
        if(x>y)
        {
            max = x;
        }
        else if(y>x)
        {
            max = y;
        }
        return max;
    }
    
}
