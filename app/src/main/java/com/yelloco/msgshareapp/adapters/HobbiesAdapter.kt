package com.yelloco.msgshareapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yelloco.msgshareapp.R
import com.yelloco.msgshareapp.models.Hobby
import com.yelloco.msgshareapp.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var hobby: Hobby? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                context.showToast(hobby!!.title + " Clicked !")
            }

            itemView.list_item_imv.setOnClickListener {
                val message: String = "My hobby is " + hobby!!.title

                var intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_TEXT, message)

                context.startActivity(Intent.createChooser(intent, "Please select app: "))
            }
        }
        fun setData(hobby: Hobby, position: Int)
        {
            itemView.list_item_title_tv.text = hobby.title
            this.hobby = hobby
            this.currentPosition = position
        }
    }
}