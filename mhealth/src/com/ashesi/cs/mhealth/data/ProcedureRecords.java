package com.ashesi.cs.mhealth.data;

import android.content.Context;

import com.ashesi.cs.mhealth.DataClass;

/**
 * Created by george.assan on 06/03/2016.
 */
public class ProcedureRecords extends DataClass{
    public static final String TABLE_NAME_PROCEDURE_RECORDS="procedure_records";
    public static final String PROCEDURE_ID="procedure_id";
    public static final String PROCEDURE_REC_ID="procedure_rec_id";
    public static final String PROCEDURE_REC_DATE="procedure_rec_date";
    public static final String PROCEDURE_CHARGE="charge";
    /**
     * Creates an object of DataClass and calls getWritableDatabase to force database creation if necessary
     *
     * @param context
     */
    public ProcedureRecords(Context context) {
        super(context);
    }



    public static String getCreateSQLString(){
        return "create table " + TABLE_NAME_PROCEDURE_RECORDS + " ("
                +PROCEDURE_REC_ID + " integer primary key, "
                +PROCEDURE_ID +" integer default 0, "
                +PROCEDURE_REC_DATE+" text default '1990-01-01', "
                +ClaimRecords.CLAIM_ID +" integer default 0, "
                +PROCEDURE_CHARGE +" real default 0"
                +" )";
    }
}