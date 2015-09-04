package com.example.viewer3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {
	/** Called when the activity is first created. */

	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.startActivity( new Intent(this, Obj3DView.class));
	}
}
