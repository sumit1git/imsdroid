package org.doubango.imsdroid.Screens;

import java.util.UUID;

import android.app.Activity;

public abstract class Screen extends Activity implements IScreen{
	public static enum SCREEN_TYPE {
		ABOUT, EAB, HISTORY, HOME
	}
	
	public static final String SCREEN_ID_HOME = HomeScreen.class.getCanonicalName();
	
	protected String id;
	protected final SCREEN_TYPE type;
	
	protected Screen(SCREEN_TYPE type){
		this.type = type;
	}
	
	public String getId(){
		if(this.id == null){
			this.id = UUID.randomUUID().toString();
		}
		return this.id;
	}
}