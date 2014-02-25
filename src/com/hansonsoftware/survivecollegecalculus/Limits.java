package com.hansonsoftware.survivecollegecalculus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;

public class Limits extends Activity {
    ListView list;
    String[] web = {
    	"Definition of Limits",
        "Limit Laws",
        "Limits at Infinity"
    };
    Integer[] imageId = {
        R.drawable.image_limitdefinition,
        R.drawable.image_laws,
        R.drawable.image_infinity
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limits);
        MainCustomList adapter = new
                MainCustomList(Limits.this, web, imageId);
        list=(ListView)findViewById(R.id.listview);
                list.setAdapter(adapter);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    	switch(position){
                    	case 0:
                    		Intent newLimitDefinitionActivity = new Intent(Limits.this, LimitDefinition.class);
                    		startActivity(newLimitDefinitionActivity);
                    	break;
                    	case 1:
                    		Intent newLimitLawsActivity = new Intent(Limits.this, LimitLaws.class);
                    		startActivity(newLimitLawsActivity);
                    	break;
                    	case 2:
                    		Intent newInfinityActivity = new Intent(Limits.this, Infinity.class);
                    		startActivity(newInfinityActivity);
                    	break;
                    	}
                    }
                });
    }
}