package il.ac.huji.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;

public class TipCalculatorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		
		final EditText edtBillAmount = (EditText) findViewById(R.id.edtBillAmount);
		final CheckBox chkRound = (CheckBox) findViewById(R.id.chkRound);
		final Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
	}
	
	/** Called when the user clicks the Calculate button 
	 *  Calculates tip of 12%.
	 * */
	public void calculateTip(View view) {
	    
	}

}
