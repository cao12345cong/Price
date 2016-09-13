package com.ssy.price.commons;

import com.ssy.price.R;
import com.ssy.price.view.Main;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class MessagePushService extends Service {

	// 获取消息线程
	private MessageThread messageThread = null;

	// 点击查看
	private Intent messageIntent = null;
	private PendingIntent messagePendingIntent = null;

	// 通知栏消息
	private int messageNotificationID = 1000;
	private Notification messageNotification = null;
	private NotificationManager messageNotificatioManager = null;

	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// 初始化
		messageNotification = new Notification();
		messageNotification.icon = R.drawable.logo;
		messageNotification.defaults = Notification.DEFAULT_SOUND;
		messageNotificatioManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

		messageIntent = new Intent(this, Main.class);

		messageNotification.flags = Notification.FLAG_AUTO_CANCEL;
		// 开启线程
		messageThread = new MessageThread();
		messageThread.isRunning = true;
		messageThread.start();

		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() {
		System.exit(0);
		super.onDestroy();
	}

	class MessageThread extends Thread {
		// 运行状态
		public boolean isRunning = true;
		public void run() {
			while (isRunning) {
				try {
					Thread.sleep(1000 * (1 * 10));
					stopService(new Intent(MessagePushService.this,
							MessagePushService.class));

					String title = "标题";
					String subtitle = "副标题信息";
					messagePendingIntent = PendingIntent.getActivity(
							MessagePushService.this, 0, messageIntent, 0);
					// 更新通知栏
					messageNotification.setLatestEventInfo(MessagePushService.this,
							title, subtitle, messagePendingIntent);
					messageNotificatioManager.notify(messageNotificationID,
							messageNotification);
					// 每次通知完，通知ID递增一下，避免消息覆盖掉
					messageNotificationID++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
