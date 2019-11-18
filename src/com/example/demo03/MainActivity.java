package com.example.demo03;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //WebView实例化
        WebView wv=new WebView(getApplicationContext());
        
        //配置url
        wv.loadUrl("file:///android_asset/demo_02_test.html");
        
        //设置wv,让他允许使用js
        wv.getSettings().setJavaScriptEnabled(true);
        
        //查看控制台日志输出
        wv.setWebChromeClient(new WebChromeClient(){
        	@Override
        	@Deprecated
        	public void onConsoleMessage(String message, int lineNumber,
        			String sourceID) {
        		// TODO Auto-generated method stub
        		super.onConsoleMessage(message, lineNumber, sourceID);
        		
        		Log.e("test","内容为"+message+"行号为"+lineNumber);
        	}
        });
        
        //设置wv为视图内容
        setContentView(wv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
