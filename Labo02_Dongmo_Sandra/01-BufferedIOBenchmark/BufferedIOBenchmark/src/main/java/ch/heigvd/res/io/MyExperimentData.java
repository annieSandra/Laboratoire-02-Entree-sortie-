/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.util.HashMap;

/**
 *
 * @author annie
 */
public class MyExperimentData implements IData{
   
   public MyExperimentData(String operation,BufferedIOBenchmark.IOStrategy ioStrategy,
           int blockSize,long fileSizeInBytes, long durationInMs){
      
      values.put("operation", operation);
      values.put("strategy", ioStrategy);
      values.put("blockSize", blockSize);
      values.put("fileSizeInBytes", fileSizeInBytes);
      values.put("durationInMs", durationInMs);
   
   }
   
   public Object getValues(String i){
      return values.get(i);
   }
   
   private HashMap<String,Object> values = new HashMap<String,Object>();
 
}