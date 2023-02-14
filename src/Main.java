public class Main {
    public static void main (String [] args){
        ContactsManager myContactsManager = new ContactsManager();

        Contact friendJames = new Contact();
        friendJames.name = "James";
        friendJames.phoneNumber = "0414131331";
        myContactsManager.addContact(friendJames);
        Contact friendCezanne = new Contact();
        friendCezanne.name = "Cezanne";
        friendCezanne.phoneNumber = "13423841";
        myContactsManager.addContact(friendCezanne);

        Contact result = myContactsManager.searchContact("James");
        System.out.println(result.phoneNumber);
    }
}
