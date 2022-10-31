package jp.ac.it_college.std.s20003.qrcoderealmtest

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataListAdapter: RecyclerView.Adapter<DataListAdapter.DataViewHolder>() {
    private val dataList = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateDataList(dataList: List<String>) {
        this.dataList.clear()
        this.dataList.addAll(dataList)
        notifyDataSetChanged()
    }

    class DataViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(data: String) {
            val textView = itemView.findViewById<TextView>(R.id.data_text_view)
            textView.text = data
        }
    }
}