class MyGenericClass<T>(typeName: T){
    init{
        println("the type value is $typeName")
    }
}
fun main(){
    MyGenericClass("Integer")
    MyGenericClass(2)
    MyGenericClass('M')
    MyGenericClass(true)
}