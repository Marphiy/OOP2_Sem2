package HomeWork;

final class Render {
    public void render(Object object){

        // final String ANSI_RESET = "\u001B[0m";
        // final String ANSI_BLACK = "\u001B[30m";
        // final String ANSI_RED = "\u001B[31m";
        // final String ANSI_GREEN = "\u001B[32m";
        // final String ANSI_YELLOW = "\u001B[33m";
        // final String ANSI_BLUE = "\u001B[34m";
        // final String ANSI_PURPLE = "\u001B[35m";
        // final String ANSI_CYAN = "\u001B[36m";
        // final String ANSI_WHITE = "\u001B[37m";

        String str = "";
        int data = 0;
        if (object instanceof HasHealthPoint){
            data = ((HasHealthPoint)(object)).getCurrentHealthPoint();
            str = String.format("Уровень жизни %s: %d", ((Base)(object)).getName(), data);
            printColourByData(data, str);
        }
        if (object instanceof Tiredness){
            data = ((Tiredness)(object)).getCurrentTiredness();
            str = String.format("Уровень усталости %s: %d", ((Base)(object)).getName(),
            data);
            printColourByData(data, str);
            
        }
    }

    private void printColourByData(int data, String str){

        if (data >= 0 && data < 25) str = String.format("\u001B[31m%s\u001B[0m", str);
        else if (data >= 25 && data < 50) str = String.format("\u001B[34m%s\u001B[0m", str);
        else if (data >= 50 && data < 100) str = String.format("\u001B[32m%s\u001B[0m", str);
        System.out.println(str);
    }
}
