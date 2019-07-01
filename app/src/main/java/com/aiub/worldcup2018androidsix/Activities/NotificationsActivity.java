package com.aiub.worldcup2018androidsix.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.aiub.worldcup2018androidsix.Adapters.NotificationListAdapter;
import com.aiub.worldcup2018androidsix.ModelClasses.NotificationItem;
import com.aiub.worldcup2018androidsix.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationsActivity extends AppCompatActivity {
    private static final String TAG= NotificationsActivity.class.getSimpleName();
    private ListView notificationsListView;
    private List<NotificationItem> dataList=new ArrayList<>( );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notifications );
        notificationsListView=findViewById( R.id.notificationsListView );
         getSupportActionBar().setTitle( "Notifications" );
        makeDataReady();
        NotificationListAdapter adapter=new NotificationListAdapter(
                NotificationsActivity.this, dataList );
        notificationsListView.setAdapter(adapter);

    }

    public static String getTAG() {
        return TAG;
    }

    public ListView getNotificationsListView() {
        return notificationsListView;
    }

    public void setNotificationsListView(ListView notificationsListView) {
        this.notificationsListView = notificationsListView;
    }

    public List<NotificationItem> getDataList() {
        return dataList;
    }

    public void setDataList(List<NotificationItem> dataList) {
        this.dataList = dataList;
    }

    private void makeDataReady() {
        NotificationItem item=new NotificationItem(
                "https://cdn4.iconfinder.com/data/icons/square-world-flags/180/flag_argentina_square-256.png",
                "Argentina" ,
                true);
        dataList.add( item );
        item=new NotificationItem(
                "http://icons.iconarchive.com/icons/custom-icon-design/flag-3/256/Brazil-Flag-icon.png",
                "Brazil" ,
                true);
        dataList.add( item );

        item=new NotificationItem(
                "https://images-na.ssl-images-amazon.com/images/I/21VUax%2BPBhL._SX355_.jpg",
                "Germany" ,
                true );
        dataList.add( item );



    }
}
