package cn.itcast.rice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Farmerreceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//��������sendbrodcast��ʱһ����getresult����
				String content=getResultData();
				Toast.makeText(context, "ũ���յ�"+content, 1).show();
				
		
	}

}
