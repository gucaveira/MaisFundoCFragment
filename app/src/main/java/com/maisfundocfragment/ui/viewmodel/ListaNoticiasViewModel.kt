package com.maisfundocfragment.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.maisfundocfragment.model.Noticia
import com.maisfundocfragment.repository.NoticiaRepository
import com.maisfundocfragment.repository.Resource

class ListaNoticiasViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

    fun buscaTodos() : LiveData<Resource<List<Noticia>?>> {
        return repository.buscaTodos()
    }

}