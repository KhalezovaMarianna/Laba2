package bsu.rfe.java.group1.lab1.Khalezova.var9A;
public class Formula {
    private Double sum;
    // Формула №1 для рассчѐта
    public Double calculate1(Double x, Double y, Double z) {
        return (Math.sin(Math.sin(y)+Math.exp(Math.cos(y))+z*z))*Math.pow(Math.sin(3.14*y*y)+Math.log(x*x),1/4);
    }
    // Формула №2 для рассчѐта
    public Double calculate2(Double x, Double y, Double z) {
        return Math.atan(Math.pow(z,1/x))/(y*y+z*Math.sin(Math.log(x)));
    }
    //Получение доступа к приватному полю sum
    public Double Get() {
        return sum;
    }
    public void Set(Double x) {
        sum = x;
    }
    //Прибавление результата к сумме
    public void Sum(Double result) {
        sum += result;
    }
    //Конструктор по умолчанию
    public Formula() {
        sum = 0.0;
    }
}
