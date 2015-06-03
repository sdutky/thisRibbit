package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
      //  Parse.enableLocalDatastore(this);
        Parse.initialize(this, "dhSq9Ih0DSplYR1TIUrWlhhoDz9WIolEZJEumwrH", "uW7kDoiBiEReEz3JVrVKM3Z3iluivgRGT8DiXLSS");


	}
}
