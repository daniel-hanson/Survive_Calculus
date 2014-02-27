package com.hansonsoftware.survivecollegecalculus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;

public class Integrals extends Activity {
    ListView list;
    String[] web = {
        "Definition of Integrals",
        "Trigonometric Integrals",
        "Definite Integrals",
        "Substitution Rule"
    };
    Integer[] imageId = {
        R.drawable.image_integralsign,
        R.drawable.image_trigonometricintegral,
        R.drawable.image_definiteintegral,
        R.drawable.image_substitution
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrals);
        MainCustomList adapter = new
        MainCustomList(Integrals.this, web, imageId);
        list=(ListView)findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        		switch(position){
                	case 0:
                    	Intent newIntegralDefinitionActivity = new Intent(Integrals.this, IntegralDefinition.class);
                    	startActivity(newIntegralDefinitionActivity);
                    break;
                   	case 1:
                    	Intent newIntegralTrigActivity = new Intent(Integrals.this, IntegralTrig.class);
                    	startActivity(newIntegralTrigActivity);
                    break;
                    case 2:
                    	Intent newDefiniteIntegralsActivity = new Intent(Integrals.this, DefiniteIntegrals.class);
                    	startActivity(newDefiniteIntegralsActivity);
                    break;
                    case 3:
                    	Intent newSubstitutionActivity = new Intent(Integrals.this, Substitution.class);
                    	startActivity(newSubstitutionActivity);
                    break;
        		}
        	}
        });
    }
}