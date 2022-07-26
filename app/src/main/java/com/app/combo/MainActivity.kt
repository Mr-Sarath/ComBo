package com.app.combo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.combo.databinding.ActivityMainBinding
import com.nvt.color.ColorPickerDialog

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        handleEvents()
    }

    private fun handleEvents() {
        binding?.btnFirst?.setOnClickListener {
            val colorPicker = ColorPickerDialog(
                this@MainActivity,
                Color.BLACK, // color init
                true, // true is show alpha
                object : ColorPickerDialog.OnColorPickerListener {
                    override fun onCancel(dialog: ColorPickerDialog?) {
                        // handle click button Cancel
                    }
                    override fun onOk(dialog: ColorPickerDialog?, colorPicker: Int) {
                        // handle click button OK
                        binding?.viewFirst?.setBackgroundColor(colorPicker)
                    }
                })
            colorPicker.show()
        }
        binding?.btnSecond?.setOnClickListener {
                val colorPicker = ColorPickerDialog(
                    this@MainActivity,
                    Color.BLACK, // color init
                    true, // true is show alpha
                    object : ColorPickerDialog.OnColorPickerListener {
                        override fun onCancel(dialog: ColorPickerDialog?) {
                            // handle click button Cancel
                        }
                        override fun onOk(dialog: ColorPickerDialog?, colorPicker: Int) {
                            // handle click button OK
                            binding?.viewSecond?.setBackgroundColor(colorPicker)
                        }
                    })
                colorPicker.show()
            }
        }

    }
