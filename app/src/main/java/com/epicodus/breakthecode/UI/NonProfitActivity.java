package com.epicodus.breakthecode.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.breakthecode.Models.Partner;
import com.epicodus.breakthecode.Models.PartnerLib;
import com.epicodus.breakthecode.R;

public class NonProfitActivity extends AppCompatActivity {

    private TextView mNameLabel;
    private TextView mDescriptionLabel;
    private ImageView mPartnerImage;
    private Button mNextButton;

    private PartnerLib mPartnerLib;
    private Partner mCurrentPartner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.descriptionLabel);
        mPartnerImage = (ImageView) findViewById(R.id.partnerImage);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mPartnerLib = new PartnerLib();
        mCurrentPartner = mPartnerLib.getPartners().get(0);

        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentPartner = mPartnerLib.nextPartner(mCurrentPartner);
                setLayoutContent();

            }
        });
    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentPartner.getName());
        mDescriptionLabel.setText(mCurrentPartner.getDescription());
        mPartnerImage.setImageResource(mCurrentPartner.getImage());

    }
}
