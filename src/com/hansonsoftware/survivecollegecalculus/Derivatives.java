package com.hansonsoftware.survivecollegecalculus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;

public class Derivatives extends Activity {
    ListView list;
    String[] web = {
        "Definition of Derivatives",
        "Derivatives of Powers",
        "Trigonometric Differentiation",
        "The Chain Rule"
    };
    Integer[] imageId = {
        R.drawable.image_derivatives,
        R.drawable.image_power,
        R.drawable.image_trigonometry,
        R.drawable.image_chainrule
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derivatives);
        MainCustomList adapter = new
        MainCustomList(Derivatives.this, web, imageId);
        list=(ListView)findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        		switch(position){
                	case 0:
                    	Intent newDerivativeDefinitionActivity = new Intent(Derivatives.this, DerivativeDefinition.class);
                    	startActivity(newDerivativeDefinitionActivity);
                    break;
                    case 1:
                    	Intent newPowerRuleActivity = new Intent(Derivatives.this, PowerRule.class);
                    	startActivity(newPowerRuleActivity);
                    break;
                    case 2:
                    	Intent newDerivativeTrigActivity = new Intent(Derivatives.this, DerivativeTrig.class);
                    	startActivity(newDerivativeTrigActivity);
                    break;
                    case 3:
                    	Intent newChainRuleActivity = new Intent(Derivatives.this, ChainRule.class);
                    	startActivity(newChainRuleActivity);
                    break;
        		}
        	}
        });
    }
}
