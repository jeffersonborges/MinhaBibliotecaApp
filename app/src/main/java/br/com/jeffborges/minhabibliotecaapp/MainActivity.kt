package br.com.jeffborges.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.jeffborges.minhabiblioteca.Calculadora
import br.com.jeffborges.minhabiblioteca.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calc = Calculadora()
        val resultado = calc.somar(1,2)

        var custonToast = CustomToast()
        custonToast.showToast(this,"dois")
    }
}
