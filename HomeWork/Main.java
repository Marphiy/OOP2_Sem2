package HomeWork;

import java.util.ArrayList;
import java.util.List;

//Написать класс Reder, отвечающий за вывод на экран уровня жижни и усталости персонажа
//У класса есть один метод, принимающий тип Object и:
//Если object типа HasHealthPoint - выводит его уровень жизни
//Если object типа Tiredness - выводит уровень его усталости
//При этом текст значения должен иметь цвет в соответствии с правилом:
//ЖИЗНЬ: 0 - 24% - RED, 25 - 49% - BLEU, 50 - 100% - GREEN
//УСТАЛОСТЬ: 0 - 24% - GREEN, 25 - 49% - BLEU, 50 - 100% - RED
//Класс Building имеет только уровень жизни
//Класс Hero имеет уровень жизни и усталости

public class Main {
    public static void main(String[] args) {
        
        List<Object> lst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lst.add(new Building());
            lst.add(new Hero());
        }

        Render render = new Render();

        for(Object obj : lst){
            render.render(obj);
        }
    }

   

}


