package cn.itcast.rice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Provincereceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		//发数据用sendbrodcast发时一般用getresult接受
		String content=getResultData();
		Toast.makeText(context, "省长收到"+content, 1).show();
		//在接受者中可以修改或终止有序广播
		abortBroadcast();
		setResultData("习大大给每位农民发了500斤大米");
		
	}

}
