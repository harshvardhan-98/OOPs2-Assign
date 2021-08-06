package oops2assign

class person(val name: String, val age: Int) extends Ordered[person] {

  def compare(that: person): Int = {

    if (that.name == this.name) this.age.compare(that.age)

    else this.name.compare(that.name)
  }

}

object person {

  def main(args: Array[String]): Unit = {

    val personOne = new person("TestAgain", 24)
    val personTwo = new person("Test", 25)
    println(personOne<personTwo)
    println(personOne>personTwo)

    println()
    val p1=new person(name = "T1", age=10)
    val p2=new person(name = "T2", age=20)
    println(p1<p2)

    //println()
    val a=new person(name = "Test", age=100)
    val b=new person(name = "T2", age=20)
    println(a<b)
  }
}


