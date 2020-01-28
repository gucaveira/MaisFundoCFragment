package com.maisfundocfragment.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.maisfundocfragment.model.Noticia
import com.maisfundocfragment.repository.NoticiaRepository
import com.maisfundocfragment.repository.Resource

class FormularioNoticiaViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

    fun salva(noticia: Noticia): LiveData<Resource<Void?>> {
        return if (noticia.id > 0) {
            repository.edita(noticia)
        } else {
            repository.salva(noticia)
        }
    }

    fun buscaPorId(id: Long) = repository.buscaPorId(id)

}