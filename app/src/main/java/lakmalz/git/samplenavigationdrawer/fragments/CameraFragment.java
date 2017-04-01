package lakmalz.git.samplenavigationdrawer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import lakmalz.git.samplenavigationdrawer.R;

/**
 * Created by Lakmal Weerasekara on 1/4/17.
 */

public class CameraFragment extends Fragment {

    public CameraFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    private void init() {

    }
}
