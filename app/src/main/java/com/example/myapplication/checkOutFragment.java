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
 * Use the {@link checkOutFragment#} factory method to
 * create an instance of this fragment.
 */
public class checkOutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (container != null) {
            container.removeAllViews();
        }

        View v2 = inflater.inflate(R.layout.fragment_check_out, container, false);

        Button gotoBillingDetails;
        gotoBillingDetails = v2.findViewById(R.id.BillingBtn);

        gotoBillingDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.checkoutFrame, new BillingFragment()).commit();
            }
        });
        // Inflate the layout for this fragment
        return v2;
    }
}