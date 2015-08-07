package imooc.com.commonadapter.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import imooc.com.commonadapter.Bean.Bean;
import imooc.com.commonadapter.R;
import imooc.com.commonadapter.Utils.CommonAdapter;
import imooc.com.commonadapter.Utils.ViewHolder;

/**
 * Created by Huhu on 8/7/15.
 */

public class MyAdapter extends CommonAdapter<Bean> {
    public MyAdapter(Context context, List<Bean> datas) {
        super(context, datas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.get(mContext, convertView, parent, R.layout.item_listview, position);
        Bean bean = mDatas.get(position);

        ((TextView) holder.getView(R.id.tv)).setText(bean.getWord());
        ((ImageView) holder.getView(R.id.iv)).setImageResource(bean.getImageId());
        return holder.getmConvertView();
    }
}
