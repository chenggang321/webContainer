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
        
        //WebViewʵ����
        WebView wv=new WebView(getApplicationContext());
        
        //����url
        wv.loadUrl("file:///android_asset/demo_02_test.html");
        
        //����wv,��������ʹ��js
        wv.getSettings().setJavaScriptEnabled(true);
        
        //�鿴����̨��־���
        wv.setWebChromeClient(new WebChromeClient(){
        	@Override
        	@Deprecated
        	public void onConsoleMessage(String message, int lineNumber,
        			String sourceID) {
        		// TODO Auto-generated method stub
        		super.onConsoleMessage(message, lineNumber, sourceID);
        		
        		Log.e("test","����Ϊ"+message+"�к�Ϊ"+lineNumber);
        	}
        });
        
        //����wvΪ��ͼ����
        setContentView(wv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
