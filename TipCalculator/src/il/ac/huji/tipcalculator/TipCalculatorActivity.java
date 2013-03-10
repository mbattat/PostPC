package il.ac.huji.tipcalculator;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	protected static final double TIP = 0.12;
	protected static final String VIEW_FORMAT = "#.##";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		
		final EditText edtBillAmount = (EditText) findViewById(R.id.edtBillAmount);
		final CheckBox chkRound = (CheckBox) findViewById(R.id.chkRound);
		final Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
		
		btnCalculate.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						
						TextView txtTipResult = (TextView) findViewById(R.id.txtTipResult);
						boolean roundTip = chkRound.isChecked();
						String amount = edtBillAmount.getText().toString();
						double amountToDouble, resault;
						
						try {
							amountToDouble = Double.valueOf(amount);
						}
						catch (NumberFormatException nfe) {
							//Value is not valid.
							amountToDouble = -1;
						}
						
						if (amountToDouble < 0) {
							txtTipResult.setText(R.string.inputError);
							return;
						}
						
						resault = amountToDouble * TIP;
						
						if (roundTip) {
							resault = (Math.floor(resault + 0.5));
						}
						
						DecimalFormat df = new DecimalFormat(VIEW_FORMAT);
						txtTipResult.setText(getString(R.string.dollar) + df.format(resault));
					}
				});
	}

}
