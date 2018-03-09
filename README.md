# lendIt

App that keeps track of what your friends borrow from you and helps chase them down if they forget to give it back.

## Classes
* Item
    * Attributes: String name, String pic, float lendDuration, String startDate, boolean overdue
* Person
    * Attributes: HashMap<Item, Person> lendingTo, HashMap<Item, Person> borrowingFrom