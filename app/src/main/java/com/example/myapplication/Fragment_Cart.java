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
 * Use the {@link Fragment_Cart} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Cart extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (container != null) {
            container.removeAllViews();
        }

        View v1 = inflater.inflate(R.layout.fragment__cart, container, false);

        Button gotoCheckout;
        gotoCheckout = v1.findViewById(R.id.checkOutBtn);

        gotoCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.cartFrame, new checkOutFragment()).commit();
            }
        });
        // Inflate the layout for this fragment
        return v1;
    }
}