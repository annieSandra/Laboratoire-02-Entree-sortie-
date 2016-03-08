/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.PrintStream;

/**
 *
 * @author annie
 */
public interface ISerializer {
   public void serialize(IData data, PrintStream pos);
   
}
