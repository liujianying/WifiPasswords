package com.gmail.ndrdevelop.wifipasswords.dialogs;


import com.gmail.ndrdevelop.wifipasswords.pojo.WifiEntry;

import java.util.ArrayList;

public interface InputDialogListener {

    public void onSubmitAddDialog(String title, String password);

    public void onSubmitTagDialog(String tag, ArrayList<WifiEntry> listWifi, ArrayList<Integer> positions);
}
