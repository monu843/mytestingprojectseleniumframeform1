package Testnglistenrers;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sun.net.httpserver.Authenticator.Result;

public class testlistenrs extends Apptest implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		
	}
	@Override
	public void onStart(ITestContext result) {
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
//		System.out.println("on test failure:"+result.getName());
		System.out.println("Failed test");
		try {
			testfaild();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on testskipped :"+result.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start :"+result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success :"+result.getName());
	}
}
