package HomeWork;

final class Render {
    public void render(Object object) {

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
        // if (object instanceof HasHealthPoint) {
        //     data = ((HasHealthPoint) (object)).getCurrentHealthPoint();
        //     str = String.format("Уровень жизни %s: %d", ((Base) (object)).getName(), data);
        //     printColourByData(data, str, 0);
        // }

        //Для каста Object к HasHealthPoin достаточно указать переменную hhp в instanceof!!!

        if (object instanceof HasHealthPoint hhp) {
            data = hhp.getCurrentHealthPoint() * 100 / hhp.getMaxHealthPoint();
            str = String.format("Уровень жизни %s: %d%s", hhp.getName(), data, "%");
            printColourByData(data, str, 0);
        }
        if (object instanceof Tiredness tdns) {
            data = tdns.getCurrentTiredness() * 100 / tdns.getMaxTiredness();
            str = String.format("Уровень усталости %s: %d%s", tdns.getName(),
                    data, "%");
            printColourByData(data, str, 1);

        }
    }

    private void printColourByData(int data, String str, int dir) {
        String col1;
        String col2;
        String col3;

        if (dir == 0) {
            col1 = "\u001B[31m";
            col2 = "\u001B[34m";
            col3 = "\u001B[32m";
        } else {
            col1 = "\u001B[32m";
            col2 = "\u001B[34m";
            col3 = "\u001B[31m";
        }
        if (data >= 0 && data < 25)
            str = String.format("%s%s\u001B[0m", col1, str);
        else if (data >= 25 && data < 50)
            str = String.format("%s%s\u001B[0m", col2, str);
        else if (data >= 50 && data < 100)
            str = String.format("%s%s\u001B[0m", col3, str);
        System.out.println(str);
    }
}
