package dev.fuzzit.examples;

public class ParseComplex {
    public static boolean parse(String data){
        if (data.length() > 6) {
            return false;
        }
//        if (data.charAt(0) == 'F' && data.charAt(1) == 'U' && data.charAt(2) == 'Z' &&
//                data.charAt(3) == 'Z' && data.charAt(4) == 'I') {
//            // This is a bug when data.length() == 5 and should throw an unhandled out of bound exception
//            //System.out.println(data.charAt(5));
//            return true;
//        }
        return false;
    }
}