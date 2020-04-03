package com.example.almacenamiento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnGuardar.setOnClickListener{
            GuardarAlumno()
        }
    }

    private fun GuardarAlumno() {
        val dbHelper = DBAlumnos(context)

        val db = dbHelper.writableDatabase
        db.execSQL("INSERT INTO Alumnos VALUES('${etControl.text}', '${etNombre.text}')")

        etControl.text.clear()
        etNombre.text.clear()

        Snackbar.make(requireView(), "Alumno guardado!",Snackbar.LENGTH_LONG)
    }
}
