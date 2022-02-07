package p2;

import p2.customclitools.CliTools;

public class Main {

    public static void main(String[] args) {
        try{
            CliTools cliTools = new CliTools(args);
            cliTools.run();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}