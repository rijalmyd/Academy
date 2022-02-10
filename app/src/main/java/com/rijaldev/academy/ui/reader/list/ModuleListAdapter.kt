package com.rijaldev.academy.ui.reader.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rijaldev.academy.data.ModuleEntity
import com.rijaldev.academy.databinding.FragmentModuleListBinding
import com.rijaldev.academy.databinding.ItemsModuleListBinding
import com.rijaldev.academy.databinding.ItemsModuleListCustomBinding

class ModuleListAdapter internal constructor(private val listener: MyAdapterClickListener): RecyclerView.Adapter<ModuleListAdapter.ModulViewholder>() {

    private val listModules = ArrayList<ModuleEntity>()

    internal fun setModules(modules: List<ModuleEntity>?) {
        if (modules == null) return
        this.listModules.clear()
        this.listModules.addAll(modules)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ModuleListAdapter.ModulViewholder {
        val itemsModuleListCustomBinding = ItemsModuleListCustomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModulViewholder(itemsModuleListCustomBinding)
    }

    override fun onBindViewHolder(holder: ModuleListAdapter.ModulViewholder, position: Int) {
        val module = listModules[position]
        holder.bind(module)
        holder.itemView.setOnClickListener {
            listener.onItemClicked(holder.adapterPosition, listModules[holder.adapterPosition].moduleId)
        }
    }

    override fun getItemCount(): Int = listModules.size

    inner class ModulViewholder(private val binding: ItemsModuleListCustomBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(module: ModuleEntity) {
            binding.textModuleTitle.text = module.title
        }
    }

    internal interface MyAdapterClickListener {
        fun onItemClicked(position: Int, moduleId: String)
    }
}