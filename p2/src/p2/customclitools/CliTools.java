package p2.customclitools;

import java.util.Random;

public class CliTools {

    String arg;
    String argOption;
    String colorChars;
    String hashChars;
    String[] commandList;

    public CliTools(String[] args) throws Exception {

        if (args.length == 0 || args.length > 2) {
            throw new Exception("Command Not Fount");
        }

        this.arg = args[0];
        this.argOption = (args.length == 2) ? args[1] : "";
        this.colorChars = "0123456789ABCDEF";
        this.hashChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        this.commandList = new String[]{
                "-createHash",
                "-createColor"
        };
    }

    public void run() {
        switch (this.arg) {
            case "-createHash":
                this.createHash();
                break;
            case "-createColor":
                this.createColor();
                break;
            default:
                this.commandList(this.arg);
                break;
        }
    }

    public void createHash() {

        String[] splitHashChars = this.hashChars.split("");
        int hashCharsLength = splitHashChars.length;

        String hash = "";
        int hashLength = 24;

        if (this.argOption.length() > 0) {
            try {
                hashLength = Integer.parseInt(this.argOption);
            } catch(Exception e) {
                System.out.println("Option is not numeric");
                return;
            }
        }


        for (int index = 0; index < hashLength; index++){
            Random random = new Random();
            hash = hash + splitHashChars[random.nextInt(0, hashCharsLength)];
        }

        System.out.println("Created hash: " + hash);
    }

    public void createColor() {
        String[] splitColorChars = this.colorChars.split("");
        int colorCharsLength = splitColorChars.length;
        String color = "";

        Random random = new Random();

        for (int index = 0; index < 6; index++){
            color = color + splitColorChars[random.nextInt(0, colorCharsLength)];
        }

        System.out.println("Created color: #" + color);
    }

    public void commandList(String arg) {
        System.out.println(String.format("'%s' command not found. Command list for usable:", arg));

        for (String command : this.commandList) {
            System.out.println(command);
        }
    }
}
