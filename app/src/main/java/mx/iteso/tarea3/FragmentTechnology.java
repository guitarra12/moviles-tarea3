package mx.iteso.tarea3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.iteso.tarea3.adapters.AdapterProduct;
import mx.iteso.tarea3.beans.ItemProduct;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTechnology extends Fragment {
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public FragmentTechnology() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.fragment_technology_recycler_view);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("MacBook Pro 17\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Zapopan, Jalisco");
        itemProduct.setPhone("33 12345678");
        itemProduct.setImage(0);
        itemProduct.setDescription("Llévate esta Max con un 30% de descuento para que puedas programar para XCode y Android sin tener que batallar tanto como tú en Windows");
        myDataSet.add(itemProduct);
        ItemProduct ip = new ItemProduct();
        ip.setTitle("AlienWare m17x de 17\"");
        ip.setStore("BestBuy");
        ip.setLocation("Guadalajara, Jalisco");
        ip.setPhone("33 87654321");
        ip.setImage(1);
        ip.setDescription("Llévate algo que sí valga la pena, no comidilla.");
        myDataSet.add(ip);
        mAdapter = new AdapterProduct(getActivity(),myDataSet);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
