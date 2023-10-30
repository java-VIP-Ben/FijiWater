public class OurStory {
    public static void main(String[] args) {
        //class objectname = new constructor(parameters)
        Hero mainCharacter = new Hero("Power Sheller", "Manipulates the Matrix");
        System.out.println(mainCharacter);

        Hero bestFriend = new Hero("Nic Cage", "Steals the Declaration of Independence");
        System.out.println(bestFriend);

        Hero mainVillain = new Hero("Darth Steckler", "Schools 'em really good. Mwuahahahh");
        System.out.println(mainVillain);

        Hero butler = new Hero("Johnson '2Day");
        System.out.println(butler);

        Hero underdog = new Hero("Scotty Pippen");
        underdog.newPower("Michael Jordan");
        System.out.println(underdog);
    }
}
