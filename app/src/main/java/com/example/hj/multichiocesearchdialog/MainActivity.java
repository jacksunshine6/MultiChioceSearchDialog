package com.example.hj.multichiocesearchdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hanjie.multichiocedialog.EventBusTools;
import com.hanjie.multichiocedialog.MultiChioceDialog;
import com.hanjie.multichiocedialog.PinyinUtils;
import com.hanjie.multichiocedialog.SortModel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView showText;
    private MultiChioceDialog multiChioceDialog;
    private boolean[] checkItem;
    private boolean isFirst=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        showText=findViewById(R.id.showText);
    }
    public void multi(View v){
        multiChioceDialog=new MultiChioceDialog(MainActivity.this);
        ArrayList<SortModel> list=new PinyinUtils().getSortedListByAlpha(getList());
        if(isFirst){
            checkItem=new boolean[list.size()];
            for(int i=0;i<checkItem.length;i++){
                checkItem[i]=false;
            }
            isFirst=false;
        }
        multiChioceDialog.setTitleStr("多选测试");
        multiChioceDialog.setDataList(list);
        multiChioceDialog.setCheckedItem(checkItem);
        multiChioceDialog.setMultiChioce(true);
        multiChioceDialog.show();
    }
    public void single(View v){
        multiChioceDialog=new MultiChioceDialog(MainActivity.this);
        ArrayList<SortModel> list=new PinyinUtils().getSortedListByAlpha(getList());
        multiChioceDialog.setTitleStr("单选测试");
        multiChioceDialog.setDataList(list);
        multiChioceDialog.setCheckedItem(checkItem);
        multiChioceDialog.setMultiChioce(false);
        multiChioceDialog.show();
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveEvent(EventBusTools event){
        if(event.getMsg().equals("single")){
            showText.setText(event.getName());
            showText.setTag(event.getCode());
        }else if(event.getMsg().equals("multi")){
            showText.setText(event.getName());
            showText.setTag(event.getCode());
            checkItem=event.getChecked_item();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    private ArrayList<SortModel> getList(){
        SortModel sortModel=null;
        ArrayList<SortModel> list=new ArrayList<SortModel>();
        sortModel=new SortModel();
        sortModel.setName("韩杰");
        sortModel.setCode("韩杰");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵高");
        sortModel.setCode("赵高");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("王五");
        sortModel.setCode("王五");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("里斯");
        sortModel.setCode("里斯");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("刘子");
        sortModel.setCode("刘子");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("尔雅");
        sortModel.setCode("尔雅");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("刘三");
        sortModel.setCode("刘三");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("刘强");
        sortModel.setCode("刘强");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("郝梦龄");
        sortModel.setCode("郝梦龄");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("汉三军");
        sortModel.setCode("汉三军");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("唐国强");
        sortModel.setCode("唐国强");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("唐三藏");
        sortModel.setCode("唐三藏");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("王军");
        sortModel.setCode("王军");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("网上三");
        sortModel.setCode("网上三");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("简化军");
        sortModel.setCode("简化军");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("成龙");
        sortModel.setCode("成龙");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("陈三强");
        sortModel.setCode("陈三强");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("丁龙");
        sortModel.setCode("丁龙");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙1");
        sortModel.setCode("赵子龙1");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙2");
        sortModel.setCode("赵子龙2");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙3");
        sortModel.setCode("赵子龙3");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙4");
        sortModel.setCode("赵子龙4");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙5");
        sortModel.setCode("赵子龙5");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙6");
        sortModel.setCode("赵子龙6");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙7");
        sortModel.setCode("赵子龙7");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙8");
        sortModel.setCode("赵子龙8");
        list.add(sortModel);
        sortModel=new SortModel();
        sortModel.setName("赵子龙9");
        sortModel.setCode("赵子龙9");
        list.add(sortModel);
        return  list;
    }
}