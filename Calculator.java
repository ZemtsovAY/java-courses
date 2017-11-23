/**
 * Created by ZemtsovAY on 23.11.2017.
 * Класс реализует калькулятор
 */
public class Calculator {
    /**
        Результат вычисления
    */
    private double result;
    /*
        Суммируем аргументы
    */
    public void add(Double ... params){
        for (Double param : params) {
            result += param;
        }
    }
    /*Получить результат
    * */
    public double getResult(){
        return this.result;
    }
    /*Очистить результат вычисления
    * */
    public void cleanResult(){
        this.result = 0;
    }
}
