package testNG01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First01 {
  @Test
  public void a() {
	  Reporter.log("Im test a", true);
  }
  
  @Test
  public void b() throws InterruptedException {
	  
	  Reporter.log("Im test b", true);
  }
  
  @Test
  public void c() {
	  Reporter.log("Im test c", true);
  }
  
  @Test
  public void d() {
	  Reporter.log("Im test d", true);
  }
  
  @Test
  public void e() {
	  Reporter.log("Im test e", true);
  }
}
