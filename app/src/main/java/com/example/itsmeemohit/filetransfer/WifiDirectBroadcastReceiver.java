package com.example.itsmeemohit.filetransfer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;

import static android.R.attr.action;

/**
 * Created by itsmeemohit on 05-08-2017.
 */

public class WifiDirectBroadcastReceiver extends BroadcastReceiver{

    WifiP2pManager mManager;
    WifiP2pManager.Channel mChannel;
    MyWiFiActivity mActivity;

    WifiDirectBroadcastReceiver(WifiP2pManager manager, WifiP2pManager.Channel channel,MyWiFiActivity activity)
    {
        this.mManager=manager;
        this.mChannel=channel;
        this.mActivity=activity;

    }
    @Override
    public void onReceive(Context context, Intent intent) {

        if(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action))
        {
            int state=intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE,-1)
                    if(state==WifiP2pManager.WIFI_P2P_STATE_ENABLED)
                    {
                        //wifi is enabled
                    }
                    else
                    {
                        //wifi is disabled
                    }

        }
        else if(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action))
        {

        }
        else if(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action))
        {

        }
        else if(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action))
        {

        }

    }
}
