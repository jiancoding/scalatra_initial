package Integration

class HttpExampleTest extends TestBase {

  behavior of "HttpExample"

  it should "return 200 ok when hitting city endpoint" in {
    val x = 1
   get("/city") {
     assert(status == 200)
     assert(body == "you got it")
   }
  }

  it should "do something" in {
    assert(1==1)
  }

  it should "do anything" in {
    assert(1==1)
  }
}
