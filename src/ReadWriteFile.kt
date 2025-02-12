import java.io.FileReader
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths


fun main(){
    println("Enter your message here: ")
    var input= readLine().toString()
    writeToFile(input)
    //readFromFile()
    readCompact()
}
fun writeToFile(input: String){
    var writer= FileWriter("outputfile.txt",true)
    try{
        writer.write(input+"\n")
        println("successfully saved!")
        writer.close()
    }catch(ex: Exception){
        println("Exception: $ex" )
    }
}

fun readFromFile(){
    var reader= FileReader("outputfile.txt")
    var character: Int?= null
    do{
        try{
            character= reader.read()
            print(character.toChar())
        }catch(ex: Exception){
            println("Exception: $ex")
        }
    }while(character !=-1)

}

fun readCompact(){
    var stream= Files.newInputStream(Paths.get("outputfile.txt"))
    stream.buffered().reader().use{ reader -> println(reader.readText())}
}