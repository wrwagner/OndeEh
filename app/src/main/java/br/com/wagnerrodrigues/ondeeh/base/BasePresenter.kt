package br.com.wagnerrodrigues.ondeeh.base

import br.com.wagnerrodrigues.ondeeh.injection.component.DaggerPresenterInjector
import br.com.wagnerrodrigues.ondeeh.injection.component.PresenterInjector
import br.com.wagnerrodrigues.ondeeh.injection.module.ContextModule
import br.com.wagnerrodrigues.ondeeh.injection.module.NetworkModule
import br.com.wagnerrodrigues.ondeeh.ui.pesquisa.PesquisaPresenter

abstract class BasePresenter <out V: BaseView> (protected val view: V) {

    private val injector: PresenterInjector = DaggerPresenterInjector
            .builder()
            .baseView(view)
            .contextModule(ContextModule)
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    open fun onViewCreaed() {

    }

    open fun onViewDestroyed() {

    }

    private fun inject(){
        when(this) {
            is PesquisaPresenter -> injector.inject(this)
        }
    }
}