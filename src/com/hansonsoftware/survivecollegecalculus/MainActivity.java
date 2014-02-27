package com.hansonsoftware.survivecollegecalculus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
    ListView list;
    String[] web = {
        "Introduction",
        "Limits",
        "Derivatives",
        "Integrals",
        "About"
    } ;
    Integer[] imageId = {
        R.drawable.image_introduction,
        R.drawable.image_limits,
        R.drawable.image_derivatives,
        R.drawable.image_integrals,
        R.drawable.image_about
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainCustomList adapter = new MainCustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        		switch(position){
                	case 0:
                		Intent newIntroductionActivity = new Intent(MainActivity.this, Introduction.class);
                    	startActivity(newIntroductionActivity);
                    break;
                    case 1:
                    	Intent newLimitsActivity = new Intent(MainActivity.this, Limits.class);
                    	startActivity(newLimitsActivity);
                    break;
                    case 2:
                    	Intent newDerivativesActivity = new Intent(MainActivity.this, Derivatives.class);
                    	startActivity(newDerivativesActivity);
                    break;
                    case 3:
                    	Intent newIntegralsActivity = new Intent(MainActivity.this, Integrals.class);
                    	startActivity(newIntegralsActivity);
                    break;
                    case 4:
                    	Intent newAboutActivity = new Intent(MainActivity.this, About.class);
                    	startActivity(newAboutActivity);
                    break;
        		}
        	}
        });
    }
}
