package testNG01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_A {
  @Test(dependsOnMethods="b")
  public void a() {
	  Reporter.log("Im test a", true);
  }
  
  @Test(timeOut = 200)
  public void b() throws InterruptedException {
	  Thread.sleep(500);
	  Reporter.log("Im test b", true);
  }
  
  @Test(invocationCount = 2)
  public void c() {
	  Reporter.log("Im test c", true);
  }
  
  @Test(enabled =false)
  public void d() {
	  Reporter.log("Im test d", true);
  }
  
  @Test
  public void e() {
	  Reporter.log("Im test e", true);
  }
}
