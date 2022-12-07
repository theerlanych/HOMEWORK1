public class Main {

    public static void main(String[] args) {

        String [] commands = {"Сидеть", "Лежать", "Голос"};
        Shelter shelter = new Shelter("Ромашка", "Чуй 1");
        Dog dog = new Dog("Актош", "Бульдог", commands,
                ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();

    }
}