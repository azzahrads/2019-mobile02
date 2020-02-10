package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// TODO: tambahkan callback onStart() di sini
	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "On Start Application", Toast.LENGTH_LONG).show();
	}
	
	// TODO: tambahkan callback onStop() di sini
	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "On Stop Application", Toast.LENGTH_SHORT).show();
	}


	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy(
	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "On Restart Application", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(this, "On Resume Application", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "On Pause Application", Toast.LENGTH_SHORT).show();
	}
}
