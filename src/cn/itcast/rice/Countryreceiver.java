package cn.itcast.rice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Countryreceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//发数据用sendbrodcast发时一般用getresult接受
				String content=getResultData();
				Toast.makeText(context, "县长收到"+content, 1).show();
				
		
	}

}
