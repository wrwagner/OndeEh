package br.com.wagnerrodrigues.ondeeh.ui.pesquisa

import br.com.wagnerrodrigues.ondeeh.base.BaseView
import br.com.wagnerrodrigues.ondeeh.model.Endereco

interface PesquisaView : BaseView {

    fun atualizaEndereco(endereco: Endereco)

    fun showErro(erro: String)

    fun showLoading()

    fun hideLoading()

}