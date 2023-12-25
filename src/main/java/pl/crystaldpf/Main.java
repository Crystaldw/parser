package pl.crystaldpf;

import org.jsoup.*;

//Видео с обучением
//https://www.youtube.com/watch?v=wSucpFh7ouk


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            var document = Jsoup.connect("https://crystal-dpf.pl").get();
            var titleElements = document.select("a"); // Заголовки вывести "h1" или "h3"....
            for (var element: titleElements){
                System.out.println(element.text());
                System.out.println(element.attr("href"));
//                System.out.println(element.attr("class"));
            }
                    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}