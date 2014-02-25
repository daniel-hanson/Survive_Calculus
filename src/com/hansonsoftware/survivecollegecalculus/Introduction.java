package com.hansonsoftware.survivecollegecalculus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;

public class Introduction extends Activity {
    ListView list;
    String[] web = {
        "Domains",
        "Product Rule",
        "Quotient Rule"
    };
    Integer[] imageId = {
        R.drawable.image_domains,
        R.drawable.image_productrule,
        R.drawable.image_quotientrule,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        MainCustomList adapter = new
                MainCustomList(Introduction.this, web, imageId);
        list=(ListView)findViewById(R.id.listview);
                list.setAdapter(adapter);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    	switch(position){
                    	case 0:
                    		Intent newDomainsActivity = new Intent(Introduction.this, Domains.class);
                    		startActivity(newDomainsActivity);
                    	break;
                    	case 1:
                    		Intent newProductRuleActivity = new Intent(Introduction.this, ProductRule.class);
                    		startActivity(newProductRuleActivity);
                    	break;
                    	case 2:
                    		Intent newQuotientRuleActivity = new Intent(Introduction.this, QuotientRule.class);
                    		startActivity(newQuotientRuleActivity);
                    	break;
                    	}
                    }
                });
    }
}