/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author annie
 */
public class FileRecorder implements IRecorder {
   public FileRecorder(String filename, ISerializer serializer ){
      
   this.serializer = serializer;
   this.fileName = filename;
      
   }
   public void init()throws IOException{
      
      FileOutputStream file = null ;
      try{
      file = new FileOutputStream(fileName);
      pos = new PrintStream(file);
      pos.println("operation,strategy,blockSize,fileSizeInBytes,durationInMs");
   }catch(IOException ex){
      if(file != null)
         file.close();
   } 
     
   }
   public void close(){
      pos.close();
   }
   public void record(IData data){
      
      serializer.serialize(data,pos);
      
   }
   ISerializer serializer = new CsvSerializer();
   String fileName;
   PrintStream pos;
}
