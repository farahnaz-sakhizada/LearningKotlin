interface Phone{
    fun makeCall()
    fun sendMessage()
    var name: String?
}
interface Smartphone{
    fun showUserLocation()
    fun takePicture()
}
//a class can inherite from various interfaces
class Android(override var name:String?) : Phone, Smartphone{

    override fun makeCall() {
        println("make call with Android "+ this.name)
    }

    override fun sendMessage() {
        println("send message with Android")
    }

    override fun showUserLocation() {
        println("show user location with Android")
    }

    override fun takePicture() {
        println("take pictures with Android")
    }
}

fun main(){
    val androidPhone= Android("Xioami 11T pro")
    androidPhone.takePicture()
    androidPhone.makeCall()
}