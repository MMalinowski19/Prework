public class ContactsManager {
   //Fields - Pola
    Contact [] myFriends;
    int friendsCount;
    //Konstruktor
    ContactsManager(){
        this.friendsCount =0;
        this.myFriends = new Contact[500];
    }
    //Metody
    void addContact(Contact contact){
        myFriends[friendsCount]=contact;
        friendsCount++;
    }
    Contact searchContact(String searchName){
        for (int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
