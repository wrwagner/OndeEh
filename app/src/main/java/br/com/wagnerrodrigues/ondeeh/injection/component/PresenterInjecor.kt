package br.com.wagnerrodrigues.ondeeh.injection.component

import br.com.wagnerrodrigues.ondeeh.base.BaseView
import br.com.wagnerrodrigues.ondeeh.injection.module.ContextModule
import br.com.wagnerrodrigues.ondeeh.injection.module.NetworkModule
import br.com.wagnerrodrigues.ondeeh.ui.pesquisa.PesquisaPresenter
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface PresenterInjector {

    fun inject(pesquisaPresenter: PesquisaPresenter)

    @Component.Builder
    interface Builder {

        fun build(): PresenterInjector

        fun networkModule(networkModule: NetworkModule): Builder
        fun contextModule(contextModule: ContextModule): Builder

        @BindsInstance
        fun baseView(baseView: BaseView): Builder
    }
}



