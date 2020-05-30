object Salary{
    def wage(hours:Int):Int=hours*150;
     def OT(hours:Int):Int=hours*75;
      def income(hour1:Int,hour2:Int):Int=wage(hour1)+OT(hour2);
       def tax(income:Int):Double=income*0.10;
        def takehome(hour1:Int,hour2:Int):Double=income(hour1,hour2)-tax(income(hour1,hour2));
        def main(args:Array[string]):Unit={
 printIn("Take home salary of anemployee: Rs."+takehome(40,20));
        }
       
    
}