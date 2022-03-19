fun main(){
    //Create a class called Human with these attributes: name, age, weight. It has
    //the following functions:
    //-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
    //and increments the human’s weight by the weight of the food eaten
    //(3 points)
    //-
    //-speak(speech: String) :Prints the string passed to it

    //birthday( ) :Increments the human’s age by 1(2
    //points)
    //Create an instance of this human class and invoke all its functions
    //2.Create a data class User with these fields: firstName, lastName, email,
    //phoneNumber, password. Create an instance of User  and print out any 2 attributes

var girl= Human("mary",21,56)
    println(girl.weight)
    girl.eat(2)
    println(girl.weight)
    girl.speak("english")
    girl.birthday(1)
    println(girl.age)
    var mary= student("maryann","gathanga","maryanngathanga@gmail.com",254356765,7895)
    println(mary.email)
    println(mary.lastname)

}

class Human(var name:String,var age:Int,var weight:Int) {


    fun eat(foodweight: Int):Int{
        weight=foodweight+weight
       println ("i am eating ${foodweight}kgs of food")
        return weight

    }

    fun speak (speech:String){
        println(speech)

}
    fun birthday(year:Int):Int{
        age =year + age
        return age

    }

    }
    data class  student(var firstname:String,var lastname:String ,var email:String,var phonenumber:Int,var password:Int)








