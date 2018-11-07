package br.com.wagnerrodrigues.ondeeh.ui.pesquisa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.wagnerrodrigues.ondeeh.R
import br.com.wagnerrodrigues.ondeeh.base.BaseActivity
import br.com.wagnerrodrigues.ondeeh.model.Endereco
import kotlinx.android.synthetic.main.activity_pesquisa.*

class PesquisaActivity : BaseActivity<PesquisaPresenter>(), PesquisaView {
    override fun atualizaEndereco(endereco: Endereco) {
//        Toast.makeText(this,
//                endereco.logradouro,
//                Toast.LENGTH_LONG).show()

        tvLogradouro.setText(endereco.logradouro)
        tvComplemento.setText(endereco.complemento)
        tvBairro.setText(endereco.bairro)
        tvCidade.setText(endereco.localidade)
        tvEstado.setText(endereco.uf)
        tvCEP.setText(endereco.cep)
    }

    override fun showErro(erro: String) {
        Toast.makeText(this,
                erro,
                Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        Toast.makeText(this,
                "Carregando",
                Toast.LENGTH_LONG).show()
    }

    override fun hideLoading() {
        Toast.makeText(this,
                "Fui",
                Toast.LENGTH_LONG).show()
    }

    override fun instantieatePresenter(): PesquisaPresenter {
        return PesquisaPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

//        presenter.pesquisar("03978270")

        btnPesquisar.setOnClickListener {
            if(edtCEP.text.isNullOrEmpty()) {
                Toast.makeText(this, "Informe um CEP", Toast.LENGTH_LONG).show()
            } else {
                presenter.pesquisar(edtCEP.text!!.toString())
            }
        }

    }
}
