package com.betelgeuse.corp.projecktspiner.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.betelgeuse.corp.projecktspiner.AdditionalClases.AutoBrandClass;
import com.betelgeuse.corp.projecktspiner.R;

import java.util.ArrayList;

public class AutoBrandsSpinnerAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private ArrayList<AutoBrandClass> autoBrandsList;

    public AutoBrandsSpinnerAdapter(Context context, ArrayList<AutoBrandClass> autoBrandsList) {

        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.autoBrandsList = autoBrandsList;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return super.areAllItemsEnabled();
    }

    @Override
    public int getCount() {
        return autoBrandsList.size();
    }

    @Override
    public Object getItem(int position) {
        return autoBrandsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.spiner_item, parent, false);

        AutoBrandClass autoBrand = (AutoBrandClass) getItem(position);

        TextView tvBrandName = (TextView) view.findViewById(R.id.tvBrandName);
        tvBrandName.setText(autoBrand.getBrandName());

        ImageView ivBrandLogo = (ImageView) view.findViewById(R.id.ivBrandLogo);
        ivBrandLogo.setImageResource(autoBrand.getBrandLogo());

        return view;
    }

}
