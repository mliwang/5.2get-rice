package cn.itcast.rice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Provincereceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		//��������sendbrodcast��ʱһ����getresult����
		String content=getResultData();
		Toast.makeText(context, "ʡ���յ�"+content, 1).show();
		//�ڽ������п����޸Ļ���ֹ����㲥
		abortBroadcast();
		setResultData("ϰ����ÿλũ����500�����");
		
	}

}
