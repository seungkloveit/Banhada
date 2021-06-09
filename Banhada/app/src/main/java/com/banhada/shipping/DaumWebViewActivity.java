package com.banhada.shipping;
import android.content.Intent;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.banhada.R;

public class DaumWebViewActivity extends AppCompatActivity {
    private WebView webView_address;
    private TextView tv_address;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_address);
        tv_address = (TextView) findViewById(R.id.tv_address);
        // WebView 초기화
        init_webView();
        // 핸들러를 통한 JavaScript 이벤트 반응
        handler = new Handler();
    }

    public void init_webView() {
        // WebView 설정
        webView_address = (WebView) findViewById(R.id.webView_address);
        // JavaScript 허용
        webView_address.getSettings().setJavaScriptEnabled(true);
        // JavaScript의 window.open 허용
        webView_address.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        // JavaScript이벤트에 대응할 함수를 정의 한 클래스를 붙여줌
        webView_address.addJavascriptInterface(new AndroidBridge(), "TestApp");
        // web client 를 chrome 으로 설정
        webView_address.setWebChromeClient(new WebChromeClient());
        // webview url load. php 파일 주소
        webView_address.loadUrl("http://192.168.25.60:80/daum_address.php");
    }

    private class AndroidBridge {
        @JavascriptInterface
        public void setAddress(final String arg1, final String arg2, final String arg3) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tv_address.setText(String.format("(%s) %s %s", arg1, arg2, arg3));
                    // WebView를 초기화 하지않으면 재사용할 수 없음
                    init_webView();
                }
            });
        }
    }
}
