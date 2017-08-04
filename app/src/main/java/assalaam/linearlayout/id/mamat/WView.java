package assalaam.linearlayout.id.mamat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wview);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://www.google.com");

    }
}
