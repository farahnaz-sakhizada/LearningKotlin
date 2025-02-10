// enum classes allows you to use their value throughout the whole project without creating any object from them

enum class UserState{
    IsActive,
    IsDeleted,
    IsBlocked,
    IsLoggedIn
}
enum class WeekDays{
    Mon,
    Tue,
    Wed,
    Thu,
    Fri,
    Sat,
    Sun
}
class TestUser(var userId: Int, var userState: UserState){
    var joinedDay:WeekDays= WeekDays.Mon
    override fun toString(): String {
        return ("User Id: $userId \nUser State: $userState \nUser Joined at: $joinedDay")
    }
}

fun main(){
    var myUser= TestUser(0,UserState.IsActive)
    myUser.joinedDay=WeekDays.Fri
    println(myUser)

}