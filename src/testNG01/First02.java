package testNG01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First02 {
  @Test
  public void f() {
	  Reporter.log("Im test f", true);
  }
  
  @Test
  public void g() throws InterruptedException {
	  
	  Reporter.log("Im test g", true);
  }
  
  @Test
  public void h() {
	  Reporter.log("Im test h", true);
  }
  
  @Test
  public void i() {
	  Reporter.log("Im test i", true);
  }
  
  @Test
  public void j() {
	  Reporter.log("Im test j", true);
  }
}
