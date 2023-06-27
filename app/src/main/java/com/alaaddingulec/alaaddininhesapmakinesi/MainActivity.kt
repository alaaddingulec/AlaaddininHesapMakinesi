package com.alaaddingulec.alaaddininhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alaaddingulec.alaaddininhesapmakinesi.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

                    private lateinit var binding: ActivityMainBinding
                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        binding = ActivityMainBinding.inflate(layoutInflater)
                        setContentView(binding.root)

                        binding.button1.setOnClickListener {
                            if (binding.editTextNumberSigned1.text.isNotEmpty() && binding.editTextNumberSigned2.text.isNotEmpty()) {
                                val sayi1 = binding.editTextNumberSigned1.text.toString().toInt()
                                val sayi2 = binding.editTextNumberSigned2.text.toString().toInt()
                                val topsonuc:Double = (sayi1 + sayi2).toDouble()
                                binding.sonuctext.text = (topsonuc).toDouble().toString()
                                }
                            else{
                                binding.sonuctext.text= "Lütfen Sayıları Giriniz"
                            }
                            }
                        binding.button2.setOnClickListener {
                            if (binding.editTextNumberSigned1.text.isNotEmpty() && binding.editTextNumberSigned2.text.isNotEmpty()) {
                                val sayi1 = binding.editTextNumberSigned1.text.toString().toInt()
                                val sayi2 = binding.editTextNumberSigned2.text.toString().toInt()
                                val topsonuc:Double = (sayi1 - sayi2).toDouble()
                                binding.sonuctext.text = (topsonuc).toDouble().toString()
                            }
                            else{
                                binding.sonuctext.text= "Lütfen Sayıları Giriniz"
                            }
                        }
                        binding.button3.setOnClickListener {
                            if (binding.editTextNumberSigned1.text.isNotEmpty() && binding.editTextNumberSigned2.text.isNotEmpty()) {
                                val sayi1 = binding.editTextNumberSigned1.text.toString().toInt()
                                val sayi2 = binding.editTextNumberSigned2.text.toString().toInt()
                                val topsonuc:Double = (sayi1 * sayi2).toDouble()
                                binding.sonuctext.text = (topsonuc).toDouble().toString()
                            }
                            else{
                                binding.sonuctext.text= "Lütfen Sayıları Giriniz"
                            }
                        }
                        binding.button4.setOnClickListener {
                            if (binding.editTextNumberSigned1.text.isNotEmpty() && binding.editTextNumberSigned2.text.isNotEmpty()) {
                                val sayi1 = binding.editTextNumberSigned1.text.toString().toInt()
                                val sayi2 = binding.editTextNumberSigned2.text.toString().toInt()
                                val topsonuc:Double = (sayi1 / sayi2).toDouble()
                                binding.sonuctext.text = (topsonuc).toDouble().toString()
                            }
                            else{
                                binding.sonuctext.text= "Lütfen Sayıları Giriniz"
                            }
                        }

                    }
                }




