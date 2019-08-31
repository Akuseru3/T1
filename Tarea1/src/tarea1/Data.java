/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Akuseru
 */
public class Data{
    private String changeBinary(int number){
        String binaryNum = "";
        int flag = 0;
        if(number>0)
            binaryNum = Integer.toBinaryString(number);
        else{
            flag = 1;
            binaryNum = Integer.toBinaryString(abs(number));
        }
        int leftNumbers = 7-binaryNum.length();
        for(int i=0;i<leftNumbers;i++){
            binaryNum = "0"+binaryNum;
        }
        binaryNum = Integer.toString(flag)+binaryNum;
        return binaryNum;
    }
    
    
    public List<String[]> transformCode(List<String[]> content){
        List<String[]> processedContent = new ArrayList<String[]>();
        Random rand = new Random();
        int n = rand.nextInt((100-(processedContent.size()))+1);
        for(int i=0;i<content.size();i++){
            String[] line = new String[4];
            String[] array = content.get(i);
            line[0] = Integer.toString(n);
            n+=1;
            line[3] = "00000000"; 
            if(array[0].equals("MOV")){
                line[1] = "0011";
                //System.out.println(Arrays.toString(array));
                line[3] = changeBinary(Integer.parseInt(array[2]));
            }
            else if(array[0].equals("LOAD")){
                line[1] = "0001";
            }
            else if(array[0].equals("ADD")){
                line[1] = "0101";
            }
            else if(array[0].equals("SUB")){
                line[1] = "0100";
            }
            else{
                line[1] = "0010";
            }
            
            if(array[1].equals("AX")){
                line[2] = "0001";
            }
            else if(array[1].equals("BX")){
                line[2] = "0010";
            }
            else if(array[1].equals("CX")){
                line[2] = "0011";
            }
            else{
                line[2] = "0100";
            }
            processedContent.add(line);
        }    
        return processedContent;
    }
}
