object Change {
  val currency: List[Int] = List(500,100,25,10,5,1)
  def change(value: Int): Int={
    var coinsNumber = 0
    if(value != 0) {
      val biggestBill = currency.find(x => x <= value)
       coinsNumber = 1 + change((value - biggestBill.get))
    }else{
      0
    }
    coinsNumber
  }
}
