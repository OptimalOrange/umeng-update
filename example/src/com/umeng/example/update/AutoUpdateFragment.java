package com.umeng.example.update;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umeng.example.R;
import com.umeng.update.UmengUpdateAgent;

public class AutoUpdateFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.umeng_example_auto_update,
				container, false);
        UmengUpdateAgent.setDefault();
        //请在调用update,forceUpdate函数之前设置推广id，silentUpdate不支持此功能
        UmengUpdateAgent.setSlotId("54357");
		UmengUpdateAgent.update(getActivity());
		return root;
	}
}
