//like a dictionary: word -> meaning
//= key-value pair

fun main(){
    var myHashMap= HashMap<String, Int>()
    myHashMap.put("mohammad",22)
    myHashMap.put("Iman",22)
    myHashMap.put("Reza", 25)

    var myHashMap2= HashMap<Any, Int>()
    myHashMap2.put(true, 50)
    myHashMap.put("mohammad",22)
    myHashMap.put("Iman",22)
    myHashMap.put("Reza", 25)

    var myHashMap3= HashMap<Any,Any>()

// HashMap in kotlin
    var kotlinHashMaps= hashMapOf<Int,String>()
    kotlinHashMaps.put(1,"Apfel")
    kotlinHashMaps.put(2,"Banane")
    println(kotlinHashMaps)


}