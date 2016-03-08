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
public class CsvSerializer implements ISerializer{
   
   
   public void serialize(IData data, PrintStream pos){
      String csv = data.getValues("operation")+separate+ data.getValues("strategy") + 
                     separate + data.getValues("blockSize") +separate + 
                     data.getValues("fileSizeInBytes") + separate + data.getValues("durationInMs");
      pos.println(csv);
   }
   private String separate = ",";
   
}
