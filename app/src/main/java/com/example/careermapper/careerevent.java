package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class careerevent extends AppCompatActivity {

    private ImageButton button_back;
    private Button button;

    private void createNotif() {
        String id = "my_channel_id_01";
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = manager.getNotificationChannel(id);
            if (channel == null) {
                channel = new NotificationChannel(id, "Channel Title", NotificationManager.IMPORTANCE_HIGH);
                channel.setDescription("[Channel Description]");
                channel.enableVibration(true);
                channel.setVibrationPattern(new long[]{100, 1000, 200, 340});
                channel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
                manager.createNotificationChannel(channel);


            }

        }
        Intent notificationIntent = new Intent(this, NotificationActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, id)
                .setSmallIcon(R.drawable.mapper)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.mapper))
                .setContentTitle("Career Mapper")
                .setContentText("Fusionex has a company open day soon!!!");


        NotificationManagerCompat m = NotificationManagerCompat.from(getApplicationContext());
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        m.notify(1, builder.build());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careerevent);


        button = findViewById(R.id.click);
        button.setOnClickListener(view -> {
            createNotif();

        });


        button_back = findViewById(R.id.btn_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(careerevent.this, Homepage.class));

                finish();
            }

        });

//        final long [] vibe = {0,500};
//        final Uri notificationsound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                NotificationCompat.Builder mbuilder = (NotificationCompat.Builder)
//                        new NotificationCompat.Builder(getApplicationContext())
//                                .setSmallIcon(R.drawable.mapper,10)
//                                .setSound(notificationsound)
//                                .setVibrate(vibe)
//                                .setContentTitle("Notification")
//                                .setContentText("This is a notification for you");
//
//                NotificationManager notificationManager = (NotificationManager)
//                        getSystemService(NOTIFICATION_SERVICE);
//                notificationManager.notify(1,mbuilder.build());
//            }
//        });
    }
}