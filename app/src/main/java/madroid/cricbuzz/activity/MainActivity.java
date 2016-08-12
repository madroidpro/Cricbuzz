package madroid.cricbuzz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;
import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection;
import madroid.cricbuzz.R;
import madroid.cricbuzz.model.Schedule;

/*
 Author  Madhusudhan,<madhusudhan.pro@gmail.com>
Functionality: parse json Data from Asset and display in grouping of League Type
*/


public class MainActivity extends AppCompatActivity {
 static String gname="";
    private SectionedRecyclerViewAdapter sectionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOrder();
    }


//Loading Json Asset
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("schedule.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    //Converting json to GSON because its considerably Faster and easy to manipulate
    public void listOrder(){
        try{
            Schedule gson = new GsonBuilder().create().fromJson(loadJSONFromAsset(),Schedule.class);
            List<matchItemList> matchItemListsgroups=new ArrayList<>();
                    int totalMatchesSize=gson.getList().size();
            //System.out.println(gson.getList().get(2).getCategory());
                    for(int i=0;i<totalMatchesSize;i++){
                        System.out.println(gson.getList().get(i).getCategory());
                        System.out.println(gson.getList().get(i).getList().size());
                        //System.out.println(gname);

                        //Setting the header Name
                        gname=gson.getList().get(i).getCategory();

                        final List<matchItem> matchItemitem = new ArrayList<>();
                        int matchListSize=gson.getList().get(i).getList().size();

                        //Iterating through individual match lists
                       for(int j =0;j<matchListSize;j++){
                               gson.getList().get(i).getList().get(j).getStartDate();
                               final String iteamA,iteamB,itime,imatchNumber,imatchDesc;
                               iteamA = gson.getList().get(i).getList().get(j).getTeamAName();
                               iteamB=gson.getList().get(i).getList().get(j).getTeamBName();
                               itime=gson.getList().get(i).getList().get(j).getStartDate();
                               imatchNumber=gson.getList().get(i).getList().get(j).getMatchDesc();
                               imatchDesc=gson.getList().get(i).getList().get(j).getSeriesDesc();

                           // Add data to child Class
                               matchItemitem.add(new matchItem(){{
                                   teamA=iteamA;
                                   teamB=iteamB;
                                   time=itime;
                                   matchNumber=imatchNumber;
                                   matchDesc=imatchDesc;
                               }});
                       }

                        //Setting child Item to Header Class
                        matchItemListsgroups.add(new matchItemList(){{
                               matchItemList=matchItemitem;
                               matchItemListName=gname;

                           }});

                }
            // Initiate Recycler class
                sectionAdapter = new SectionedRecyclerViewAdapter();
                int matchTotalSize=matchItemListsgroups.size();

            // Viewing Section Iterating to set the data to View
               for(int k=0;k<matchTotalSize;k++){

                    String matchTypeHeader=matchItemListsgroups.get(k).matchItemListName;
                    List<matchItem>itemList=matchItemListsgroups.get(k).matchItemList;
                    sectionAdapter.addSection(new MenuItemSection(matchTypeHeader,itemList));
                }
                RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.setAdapter(sectionAdapter);
        }catch (Exception e){
            Log.d("err",e+"");
        }
    }

    // List Item child Class
    class matchItem{
        public String teamA,teamB,time,matchNumber,matchDesc;
    }
    // List Item Header Class
    class matchItemList{
        public List<matchItem> matchItemList=new ArrayList<>();
        public String matchItemListName;

    }

    //Recycler view with head and child view
    class MenuItemSection extends StatelessSection {
        String headerText;
        List<matchItem> list;
        public MenuItemSection(String headerText, List<matchItem> list){
            super(R.layout.match_item_head_layout, R.layout.match_item_layout);
            this.headerText=headerText;
            this.list=list;
        }

        @Override
        public int getContentItemsTotal() {
            return list.size();
        }

        @Override
        public RecyclerView.ViewHolder getItemViewHolder(View view) {
            return new ItemViewHolder(view);
        }

        @Override
        public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
            final ItemViewHolder itemHolder = (ItemViewHolder) holder;

            itemHolder.leagueName.setText(list.get(position).matchDesc);
            itemHolder.matchNum.setText(list.get(position).matchNumber);
            itemHolder.teamA.setText(list.get(position).teamA);
            itemHolder.teamB.setText(list.get(position).teamB);
            long times = Long.parseLong(list.get(position).time);
            Date d = new Date(times);
            DateFormat formatter = new SimpleDateFormat("HH:mm");
            String dateFormatted = formatter.format(d);
            itemHolder.time.setText(dateFormatted+"");


        }

        @Override
        public RecyclerView.ViewHolder getHeaderViewHolder(View view) {
            return new HeaderViewHolder(view);

        }

        @Override
        public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder) {
            HeaderViewHolder headerHolder = (HeaderViewHolder) holder;
            headerHolder.subMenuHeaderText.setText(headerText);

        }
    }

    // Header ViewHolder
    class HeaderViewHolder extends RecyclerView.ViewHolder {

        private final TextView subMenuHeaderText;

        public HeaderViewHolder(View view) {
            super(view);
            subMenuHeaderText = (TextView) view.findViewById(R.id.leagueNameHead);
        }
    }
    // Child ViewHolder
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private final TextView leagueName,teamA,teamB,time,matchNum;

        public ItemViewHolder(View view) {
            super(view);
            leagueName = (TextView) view.findViewById(R.id.leagueName);
            teamA = (TextView) view.findViewById(R.id.teamA);
            teamB = (TextView) view.findViewById(R.id.teamB);
            time = (TextView) view.findViewById(R.id.time);
            matchNum = (TextView) view.findViewById(R.id.matchNum);
        }
    }

}
