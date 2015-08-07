package imooc.com.commonadapter.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import imooc.com.commonadapter.Adapters.MyAdapter;
import imooc.com.commonadapter.Bean.Bean;
import imooc.com.commonadapter.R;


public class MainActivity extends Activity {

    public ListView list;
    public ArrayList<Bean> item;
    public Bean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.list);
        //初始化数据
        initDatas();
        MyAdapter adapter = new MyAdapter(this, item);
        list.setAdapter(adapter);
    }

    void initDatas() {
        item = new ArrayList<>();
        bean = new Bean("first", R.mipmap.ic_launcher);
        item.add(bean);
        bean = new Bean("second", R.mipmap.ic_launcher);
        item.add(bean);
        bean = new Bean("third", R.mipmap.ic_launcher);
        item.add(bean);
        bean = new Bean("forth", R.mipmap.ic_launcher);
        item.add(bean);
    }


}
