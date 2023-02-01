package testNG01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test02 {
  @Test(groups = "A")
  public void f() {
	  Reporter.log("Im test f", true);
  }
  
  @Test
  public void g() throws InterruptedException {
	  
	  Reporter.log("Im test g", true);
  }
  
  @Test(groups = "B")
  public void h() {
	  Reporter.log("Im test h", true);
  }
  
  @Test
  public void i() {
	  Reporter.log("Im test i", true);
  }
  
  @Test(groups = "B")
  public void j() {
	  Reporter.log("Im test j", true);
  }
}
