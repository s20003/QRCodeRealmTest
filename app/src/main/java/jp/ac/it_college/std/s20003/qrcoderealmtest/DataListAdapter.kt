package jp.ac.it_college.std.s20003.qrcoderealmtest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.realm.kotlin.query.RealmResults
import jp.ac.it_college.std.s20003.qrcoderealmtest.databinding.ItemDataBinding

class DataListAdapter(private val data: RealmResults<Data>):
    RecyclerView.Adapter<DataListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemDataBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemDataBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name.text = (data[position].name)
        // holder.binding.usage.text = (data[position].usage)
        holder.binding.count.text = data[position].count.toString()
    }

    override fun getItemCount(): Int = data.size

}