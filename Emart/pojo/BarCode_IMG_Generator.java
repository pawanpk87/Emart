/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.pojo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;


public class BarCode_IMG_Generator {
    /*
                           
              what will be the name of image name    for which (String / p_ID ) we have to 
              after generating bar code              genarate barcode
                                    ^                      ^
                                    |                      |
    */
    public static void createImage(String image_name,String myString)
    {
        try{
          
            Code128Bean code128=new Code128Bean();
            /*
                ^
                |
                there are many patterns to generate bar code but for computer's the most easy to 
                read barcode is that Code128  128 means ascll no yes this class makes use of 
                Ascll value.
                
                we also have Code39 this class use only 39 ascll value.
            */
            
            code128.setHeight(15f);
            /*
                ^
                |
                setting the height of the image.
            */
            
            
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            BitmapCanvasProvider canvas=new BitmapCanvasProvider(baos,"image/x-png", 300,BufferedImage.TYPE_BYTE_BINARY,false,0);
            
            /*
            
            1: It's is buffer of Ram which is used to store a barcode inside buffer then we will
               take from buffer and put it into Disk.                                                                          
                                                                         
            2: Pattern of image  which is type of MIME -> Multi purpose Internet mail Extention.
            
            3: Resolution in px.
            
            4: Pattern of Image which will be balckandwhite will not based on rgb.
            
            5: anti-aliasing means if we pass true that means after streaching the image , image will not be 
               break , and in false case imgae will be break , and we don't want to image should be zoom
               that's why we pass false.
            
            6: Orintation 0-> ----(Horizontal)  1-> | (vertical)

            */       

            code128.generateBarcode(canvas, myString);
            
            /*
                ^
                |
                this is method of Code128Bean class which is used to generat bar code.
            
                1. Object of BitmapCanvasProvider which has Details of
                   how to generate barcode. It's like pojo class
            
                2. for which (String / p_ID ) we have to genarate barcode.
            
            */
            canvas.finish();
            
            String userdir=System.getProperty("user.dir");
            /*
                                                 ^
                                                 |
                                                 which will return user's current application path. 
            */
            System.out.println("user dir is:"+userdir);
            FileOutputStream fos=new FileOutputStream(userdir+"\\Barcode\\"+image_name);
            
            /*
               which will create a file Barcode 
            */
            
            fos.write(baos.toByteArray());
            
            /*
              which will save barcode image to Barcode file
            */
            fos.flush();
            fos.close();   
        }
        catch(Exception ex)
        {
            System.out.println("Exception in barcode generation !!");
            ex.printStackTrace();
        }
    }
}
