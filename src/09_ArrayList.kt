//ArrayList is more flexible than Array, because:
//no size is need while initializing, adding new element with add(), the arrayList updates itself dynamically after a change
fun main(){
    var friends= ArrayList<String>()
    friends.add("Mat")
    friends.add("Zuzu")

    for (person in friends){
        println("index of friend is ${friends.indexOf(person)}, friends name is $person")
    }
    // ArrayList in Kotlin: 2 types (mutable and immutable)
    // a mutable list can be shuffled with .shuffle() methode
    var kotlinArrayList= listOf<String>("Iman","Mina","Sara")
    var mutableList= mutableListOf<String>("Iman")
    mutableList.add("Ali")
    for (name in kotlinArrayList) println(name)
    println(kotlinArrayList)
    println(mutableList)
}