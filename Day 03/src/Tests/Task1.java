package Tests;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.next();
        System.out.println(helloName(name));
    }
    public static String helloName(String name){
        return ("Hello "+name+"!");
    }
    public String makeOutWord(String out, String word) {
        return (out.substring(0,2)+word+out.substring(2));
    }
    public String makeTags(String tag, String word) {
        return ("<"+tag+">"+word+"</"+tag+">");
    }
    public String makeAbba(String a, String b) {
        return(a+b+b+a);
    }
    public String extraEnd(String str) {
        String sub = str.substring(str.length()-2);
        return (sub+sub+sub);
    }
    public String firstTwo(String str) {
        if (str.length()<2){
            return str;
        } else {
            String sub = str.substring(0,2);
            return sub;
        }
    }
    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
    public String withouEnd2(String str) {
        if (str.length()>2){
            return str.substring(1,str.length()-1);
        } else {
            return "";
        }
    }

}
