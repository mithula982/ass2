object TicketPrice {
  def main(args:Array[String]): Unit ={
  def attendees(price:Int):Int=120+(15-price)*4;

  def cost(x:Int):Int=500+attendees(x);

  def profit(p:Int):Int=p*attendees(p)-cost(p);

  var x:Int=profit(15);
  var y:Int=profit(10);
  var z:Int=profit(20);

  println("Profit for price of Rs.15.00 per ticket: Rs."+x);
    println("Profit for price of Rs.10.00 per ticket: Rs."+y);
    println("Profit for price of Rs.20.00 per ticket: Rs."+z);

    if(x>=y)
      {
        if(x>z)
          {
            println("Best ticket price is Rs.15.00 for highest profit");
          }
        else
          {
            println("Best ticket price is Rs.20.00 for highest profit");
          }
      }
    else if(y>=z)
      {
        println("Best ticket price is Rs.10.00 for highest profit");
      }
   else
      {
        println("Best ticket price is Rs.20.00 for highest profit");
      }
  }
}
