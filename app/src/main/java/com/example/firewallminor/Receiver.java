package com.example.firewallminor;

import static android.app.Activity.RESULT_OK;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver{
    private static final String TAG = "NetGuard.Receiver";

    @Override
    public void onReceive(final Context context, Intent intent) {
        Log.i(TAG, "Received " + intent);
        Util.logExtras(TAG, intent);

        // Start service
        //Toast.makeText(context, "Service Running", Toast.LENGTH_SHORT).show();

        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){

           /* Intent intent1 = new Intent(context, ActivityMain.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);*/



            //ActivityMain activityMain = new ActivityMain();

            context.getSharedPreferences("reboot", Context.MODE_PRIVATE).edit().putInt("reboot", 1).apply();
            //activityMain.restart = 1;

            Log.d("reboot", String.valueOf(context.getSharedPreferences("reboot", Context.MODE_PRIVATE).getInt("reboot", 0)));

            Intent intent1 = new Intent(context, ActivityMain.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);

            //activityMain.onActivityResult(1, RESULT_OK, null);

            //BlackHoleService.start(context);


            //BlackHoleService blackHoleService = new BlackHoleService();

            /*IntentFilter ifConnectivity = new IntentFilter();
            ifConnectivity.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
            blackHoleService.registerReceiver(blackHoleService.connectivityChangedReceiver,ifConnectivity);*/



            //if (VpnService.prepare(context) == null)

                //BlackHoleService.start(context);
        }

            //BlackHoleService blackHoleService = new BlackHoleService();


                //blackHoleService.vpnStop(vpn);
                //vpn = blackHoleService.vpnStart();


    }

}