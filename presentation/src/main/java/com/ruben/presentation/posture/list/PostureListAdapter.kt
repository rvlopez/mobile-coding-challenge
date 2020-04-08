package com.ruben.presentation.posture.list

import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.ruben.presentation.R
import com.ruben.presentation.extensions.inflate
import com.ruben.presentation.extensions.load
import com.ruben.presentation.posture.entity.PostureUI
import kotlinx.android.synthetic.main.item_posture.view.*

class PostureListAdapter(
    private val onItemClick: (PostureUI) -> Unit
) : RecyclerView.Adapter<PosturesViewHolder>() {

    private var postureList: MutableList<PostureUI> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosturesViewHolder =
        PosturesViewHolder(parent.inflate(R.layout.item_posture), onItemClick)

    override fun getItemCount(): Int = postureList.size

    override fun onBindViewHolder(holder: PosturesViewHolder, position: Int) =
        holder.bind(postureList[position])

    fun setPostures(postures: List<PostureUI>) {
        postureList.clear()
        postureList.addAll(postures)
        notifyDataSetChanged()
    }

}

class PosturesViewHolder(itemView: View, val onItemClick: (PostureUI) -> Unit) :
    RecyclerView.ViewHolder(itemView) {

    fun bind(posture: PostureUI) = with(itemView) {
        ViewCompat.setTransitionName(postureImv, posture.id)
        postureImv.load(posture.picture)
        descriptionTxv.text = posture.description
        setOnClickListener { onItemClick(posture) }
    }

}