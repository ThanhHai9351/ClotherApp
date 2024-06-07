package com.example.clotherapp.UI.FavouriteFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clotherapp.ADAPTER.FavouriteAdapter;
import com.example.clotherapp.ADAPTER.ProductAdapter;
import com.example.clotherapp.DAO.DAOFavourite;
import com.example.clotherapp.DAO.DAOProduct;
import com.example.clotherapp.MODEL.Favourite;
import com.example.clotherapp.MODEL.Product;
import com.example.clotherapp.R;
import com.example.clotherapp.UI.Detail;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavouriteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavouriteFragment extends Fragment {

    ListView lvFavourite;
    FavouriteAdapter adapter;
    ArrayList<Favourite> arrayList;

    TextView count;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FavouriteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FavouriteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FavouriteFragment newInstance(String param1, String param2) {
        FavouriteFragment fragment = new FavouriteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);
        controls(view);
        return view;
    }

    public void controls(View view) {
        lvFavourite = view.findViewById(R.id.lv_favourite);
        count = view.findViewById(R.id.tw_count_favourite);

        arrayList = new ArrayList<>();

        DAOFavourite dao = new DAOFavourite(getContext());
        dao.getFavouriteFromData(new DAOFavourite.DataCallback() {
            @Override
            public void onSuccess(ArrayList<Favourite> favourites) {
                arrayList = favourites;
                adapter = new FavouriteAdapter(getContext(),R.layout.item_favourite_product,arrayList);
                lvFavourite.setAdapter(adapter);

                int size = arrayList.size();
                count.setText("Số lượng sản phẩm: "+String.valueOf(size));
            }

            @Override
            public void onError(String error) {

            }
        });

    }
}