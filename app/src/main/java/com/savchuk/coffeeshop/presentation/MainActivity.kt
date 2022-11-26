package com.savchuk.coffeeshop.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import com.savchuk.coffeeshop.R
import com.savchuk.coffeeshop.data.Coffee
import com.savchuk.coffeeshop.databinding.ActivityMainBinding
import com.savchuk.coffeeshop.databinding.FragmentCartBinding
import com.savchuk.coffeeshop.databinding.FragmentLoginBinding
import com.savchuk.coffeeshop.presentation.screens.cart.CartFragment
import com.savchuk.coffeeshop.presentation.screens.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var database: FirebaseDatabase
    private lateinit var reference: DatabaseReference

    private lateinit var binding: ActivityMainBinding

    private val TAG = "TEST"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MainFragment.newInstance())
                .commit()
        }
    }


    fun doSomeLatter() {
        /*database = Firebase.database
    reference = database.getReference()

    *//*ref.push().setValue(Coffee(0, "", "americano", 25))
        ref.push().setValue(Coffee(1, "", "espresso", 20))
        ref.push().setValue(Coffee(2, "", "tea", 35))
        ref.push().setValue(Coffee(3, "", "milk", 40))
*//*
        //readData()
        //reference.child("coffee").child("coffeeId").setValue(Coffee(0, "", "americano", 25))
        //reference.child("coffee").child("coffeeId3").setValue(Coffee(1, "", "americano", 25))

        reference.child("coffee").get().addOnSuccessListener {
            Log.i("firebase", "Got value ${it.value}")
        }.addOnFailureListener{
            Log.e("firebase", "Error getting data", it)
        }
        */
    }

    private fun addCoffeeToList(coffee: Coffee) {

    }

    private fun readData() {
        reference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val coffee = snapshot.getValue<Coffee>()
                Log.d("TEXT", coffee.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Log.d("TEXT", error.toException().toString())
            }

        })
    }


}