package br.com.wagnerrodrigues.ondeeh.injection.module

import android.app.Application
import android.content.Context
import br.com.wagnerrodrigues.ondeeh.base.BaseView
import dagger.Module
import dagger.Provides

@Module
object ContextModule {

    @Provides
    @JvmStatic
    fun providesContext(baseView: BaseView): Context {
        return baseView.getContext()
    }

    @Provides
    @JvmStatic
    fun providesApplication(context: Context): Application {
        return context.applicationContext as Application
    }

}