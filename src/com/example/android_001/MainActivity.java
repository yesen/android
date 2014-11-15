package com.example.android_001;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{

	private TextView textView;
    private WifiManager wifiManager;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.text02);
		wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
		if(wifiManager.isWifiEnabled())
		{
			textView.setText("wifi已打开");
		}else
		{
			textView.setText("wifi已关闭");
		}
	}

	public void changeWifi(View view)
	{
		
		if(wifiManager.isWifiEnabled())
		{
			wifiManager.setWifiEnabled(false);
			textView.setText("wifi已关闭");
		}else
		{
			wifiManager.setWifiEnabled(true);
			textView.setText("wifi已打开");
		}
		
	}
}
