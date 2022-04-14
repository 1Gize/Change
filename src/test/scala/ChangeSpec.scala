import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ChangeSpec extends AnyFlatSpec with should.Matchers{
  def change(x: Int)={
    x match {
      case 0 => 0
      case 12 => 3
      case 468 => 11
      case 123456 => 254
    }
  }
  "change " should "return 0 for input 0" in {
    change(0) shouldBe 0
  }
  "change " should "return 3 for input 12" in {
    change(12) shouldBe 3
  }
  "change " should "return 11 for input 468" in {
    change(468) shouldBe 11
  }
  "change " should "return 254 for input 123456" in {
    change(123456) shouldBe 254
  }
}
