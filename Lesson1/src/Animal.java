public class Animal {

    private String color;
    private int age;

    public void makeVoice(){
        System.out.println("Животное издает звук");
    }

    public void makeVoice(String voice){
        System.out.println("Животное издает звук");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Возраст не может быть отрицательным" +
                    "Ошибка");
        }else {
            this.age = age;
        }
    }
}
