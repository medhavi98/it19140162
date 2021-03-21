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
 * Use the {@link OrdersFragment} factory method to
 * create an instance of this fragment.
 */
public class OrdersFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_orders, container, false);

        if (container != null) {
            container.removeAllViews();
        }

        Button goToCartbtn;

        goToCartbtn = v.findViewById(R.id.gotocartbtn);

        goToCartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.myOrderRe, new Fragment_Cart()).commit();
            }
        });

        // Inflate the layout for this fragment
        return v;
    }
}