package cn.itcast.rice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Cityreceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//��������sendbrodcast��ʱһ����getresult����
				String content=getResultData();
				Toast.makeText(context, "�г��յ�"+content, 1).show();
				
		
	}

}
