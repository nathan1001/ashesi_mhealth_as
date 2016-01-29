package com.ashesi.cs.mhealth;

import com.ashesi.cs.mhealth.data.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;

public class DialogDataSynch extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		 LayoutInflater inflater = getActivity().getLayoutInflater();
		 builder.setView(inflater.inflate(R.layout.dialog_synch_data, null));
		 
		return builder.create();
	}

}
