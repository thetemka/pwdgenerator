/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwdgenerator;

import static java.lang.System.in;
import java.util.*;
import java.math.*;

public class PwdGenerator {
    public static void main(String[] args) {
        System.out.println("Маска(1) или условие(2)?");
        Scanner in = new Scanner(System.in);
        PwdGenerator pwdgen = new PwdGenerator();
        if(in.nextInt()==1){
            pwdgen.MaskPwd();
        }
        if(in.nextInt()==2){
            pwdgen.RandPwd();
        }
        
    }
    
    public String Letters = "abcdefghijklmnopqrstuvxyz";
    public String Numbers = "0123456789";
    public String Symbols = "!@#$%^&*()}{:[]";
    public String Pwd = "";
    public int i = 0;
    public int a = 0;
    public String PwdMask = "ULDS";
    public void MaskPwd() {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите маску пароля: ");
        String PwdUserMask = in.nextLine();
        
        System.out.println("Вы ввели маску: " + PwdUserMask + " Длинной " + PwdUserMask.length() + " символов.");
        for (i = 0; i < PwdUserMask.length(); i++) {

            if (PwdUserMask.charAt(i) == PwdMask.charAt(0)) {
                a = (int) (Math.random() * (Letters.length() - 0));
                Pwd += Letters.toUpperCase().charAt(a);
                    //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
                //System.out.println("Символ пароля: "+Pwd);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(1)) {
                a = (int) (Math.random() * (Letters.length() - 0));
                Pwd += Letters.charAt(a);
                    //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
                //System.out.println("Символ пароля: "+Pwd);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(2)) {
                a = (int) (Math.random() * (Numbers.length() - 0));
                Pwd += Numbers.charAt(a);
                    //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
                //System.out.println("Символ пароля: "+Pwd);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(3)) {
                a = (int) (Math.random() * (Symbols.length() - 0));
                Pwd += Symbols.charAt(a);

            }
        }
        //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
        System.out.println("Ваш пароль: " + Pwd);
        System.exit(0);
    }
    
    public void RandPwd() {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Какие символы хотим в пароле?");
        String PwdUserMask = in.nextLine();
        
        System.out.println("Вы ввели маску: " + PwdUserMask + " Длинной " + PwdUserMask.length() + " символов.");
        for (i = 0; i < PwdUserMask.length(); i++) {

            if (PwdUserMask.charAt(i) == PwdMask.charAt(0)) {
                a = (int) (Math.random() * (Letters.length() - 0));
                Pwd += Letters.toUpperCase().charAt(a);
                    //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
                //System.out.println("Символ пароля: "+Pwd);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(1)) {
                a = (int) (Math.random() * (Letters.length() - 0));
                Pwd += Letters.charAt(a);
                    //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
                //System.out.println("Символ пароля: "+Pwd);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(2)) {
                a = (int) (Math.random() * (Numbers.length() - 0));
                Pwd += Numbers.charAt(a);
                    //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
                //System.out.println("Символ пароля: "+Pwd);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(3)) {
                a = (int) (Math.random() * (Symbols.length() - 0));
                Pwd += Symbols.charAt(a);

            }
        }
        //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
        System.out.println("Ваш пароль: " + Pwd);
        System.exit(0);
    }

}