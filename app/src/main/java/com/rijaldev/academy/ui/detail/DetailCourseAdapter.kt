package com.rijaldev.academy.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rijaldev.academy.data.ModuleEntity
import com.rijaldev.academy.databinding.ItemsModuleListBinding

class DetailCourseAdapter: RecyclerView.Adapter<DetailCourseAdapter.ModuleViewHolder>() {

    private var listModules = ArrayList<ModuleEntity>()

    fun setModules(module: List<ModuleEntity>?) {
        if (module == null) return
        listModules.clear()
        listModules.addAll(module)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val itemsModuleListBinding = ItemsModuleListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(itemsModuleListBinding)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = listModules[position]
        holder.bind(module)
    }

    override fun getItemCount(): Int = listModules.size

    class ModuleViewHolder(private val binding: ItemsModuleListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(module: ModuleEntity) {
            binding.textModuleTitle.text = module.title
        }
    }
}