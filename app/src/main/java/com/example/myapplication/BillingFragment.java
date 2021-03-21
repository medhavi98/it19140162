package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BillingFragment#} factory method to
 * create an instance of this fragment.
 */
public class BillingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        if (container != null) {
            container.removeAllViews();
        }

        View v3 = inflater.inflate(R.layout.fragment_billing, container, false);

        Button gotocheckoutagain;
        gotocheckoutagain = v3.findViewById(R.id.saveChanges);

        gotocheckoutagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.billingFrame, new checkOutFragment()).commit();
            }
        });
        // Inflate the layout for this fragment
        return v3;
    }

}