package pwdgenerator;

import static java.lang.System.in;
import java.util.*;
import java.math.*;

public class PwdGenerator {

    public static void main(String[] args) {
        System.out.println("Маска(1) или условие(2)?");
        Scanner in = new Scanner(System.in);
        int sc = in.nextInt();
        //System.out.println(sc);
        PwdGenerator pwdgen = new PwdGenerator();
        if (sc == 1) {
            pwdgen.MaskPwd();
        }
        if (sc == 2) {
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
    public String sysPwd = Letters + Letters.toUpperCase() + Numbers + Symbols;

    public void MaskPwd() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите маску пароля: ");
        String PwdUserMask = in.nextLine();

        System.out.println("Вы ввели маску: " + PwdUserMask + " Длинной " + PwdUserMask.length() + " символов.");
        for (i = 0; i < PwdUserMask.length(); i++) {

            if (PwdUserMask.charAt(i) == PwdMask.charAt(0)) {
                a = (int) (Math.random() * (Letters.length() - 0));
                Pwd += Letters.toUpperCase().charAt(a);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(1)) {
                a = (int) (Math.random() * (Letters.length() - 0));
                Pwd += Letters.charAt(a);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(2)) {
                a = (int) (Math.random() * (Numbers.length() - 0));
                Pwd += Numbers.charAt(a);
            }
            if (PwdUserMask.charAt(i) == PwdMask.charAt(3)) {
                a = (int) (Math.random() * (Symbols.length() - 0));
                Pwd += Symbols.charAt(a);
            }
        }
        System.out.println("Ваш пароль: " + Pwd);
        System.exit(0);
    }

    public void RandPwd() {

        final Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Какие символы хотим в пароле?");
        String PwdUserMask = in.nextLine();
        int minPwd = 3;
        int maxPwd = 15;
        int pwdLenght = 0;
        
        if (PwdUserMask.length()>minPwd){
            pwdLenght = PwdUserMask.length();
        }
        else {    
            pwdLenght = random.nextInt((maxPwd - minPwd) + 1) + minPwd;
        }
        System.out.println("Длина пароля: " + pwdLenght);

        for (i = 0; i < pwdLenght; i++) {
            a = random.nextInt(sysPwd.length());

            Pwd += sysPwd.charAt(a);

        }
        System.out.println("Рандомный пароль: "+Pwd);

        for (int l = 0; l < PwdUserMask.length(); l++) {
            int d = 0;
            System.out.println("Символ маски "+PwdUserMask.charAt(l));
            if (PwdUserMask.charAt(l) == PwdMask.charAt(0)) {
                a = random.nextInt(Letters.length());
                d = random.nextInt(pwdLenght);
                System.out.println("Заменяем символ " +d +"'"+Pwd.charAt(d)+"'" +" символом " +Letters.toUpperCase().charAt(a));
                Pwd = Pwd.replace(Pwd.charAt(d), Letters.toUpperCase().charAt(a));
            }
            if (PwdUserMask.charAt(l) == PwdMask.charAt(1)) {
                a = random.nextInt(Letters.length());
                d = random.nextInt(pwdLenght);
                System.out.println("Заменяем символ " +d +"'"+Pwd.charAt(d)+"'" +" символом " +Letters.charAt(a));
                Pwd = Pwd.replace(Pwd.charAt(d), Letters.charAt(a));
            }
            if (PwdUserMask.charAt(l) == PwdMask.charAt(2)) {
                a = random.nextInt(Numbers.length());
                d = random.nextInt(pwdLenght);
                System.out.println("Заменяем символ " +d +"'"+Pwd.charAt(d)+"'" +" символом " +Numbers.charAt(a));
                Pwd = Pwd.replace(Pwd.charAt(d), Numbers.charAt(a));
            }
            if (PwdUserMask.charAt(l) == PwdMask.charAt(3)) {
                a = random.nextInt(Symbols.length());
                d = random.nextInt(pwdLenght);
                System.out.println("Заменяем символ " +d +"'"+Pwd.charAt(d)+"'" +" символом " +Symbols.charAt(a));
                Pwd = Pwd.replace(Pwd.charAt(d), Symbols.charAt(a));

            }
        }

        System.out.println("Длина пароля: " + pwdLenght);
        //System.out.println("Символы совпали: " +PwdUserMask.charAt(i)+ " и " +PwdMask.charAt(a));
        System.out.println("Ваш пароль: " + Pwd);
        System.exit(0);
    }

}
