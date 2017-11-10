package com.example.coffee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by carayung on 2017-11-09.
 */

public class QRDialog extends DialogFragment {

    public QRDialog() {

    }

    public static QRDialog newInstance(String title) {
        QRDialog frag = new QRDialog();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_barcode, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Fetch arguments from bundle and set title
        String title = getArguments().getString("title", "Enter Name");
        getDialog().setTitle(title);

        final LinearLayout linearLayout = view.findViewById(R.id.cup);
        final ImageView barcode = view.findViewById(R.id.barcode);

        barcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  barcode.setVisibility(View.INVISIBLE);
                  linearLayout.setVisibility(View.VISIBLE);
            }
        });

    }

}