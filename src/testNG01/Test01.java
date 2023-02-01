package testNG01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test01 {
  @Test(groups = "A")
  public void a() {
	  Reporter.log("Im test a", true);
  }
  
  @Test
  public void b() throws InterruptedException {
	  
	  Reporter.log("Im test b", true);
  }
  
  @Test(groups = "B")
  public void c() {
	  Reporter.log("Im test c", true);
  }
  
  @Test
  public void d() {
	  Reporter.log("Im test d", true);
  }
  
  @Test(groups = "A")
  public void e() {
	  Reporter.log("Im test e", true);
  }
}
