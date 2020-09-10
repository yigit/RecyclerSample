/*
 * Copyright 2020 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.recyclersample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val newFlowerActivityRequestCode = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flowerList = resources.getStringArray(R.array.flower_array).toMutableList()
        val flowerAdapter = FlowerAdapter()

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = flowerAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        flowerAdapter.submitList(flowerList)

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            val intent = Intent(this@MainActivity, AddFlowerActivity(flowerList)::class.java)
            startActivityForResult(intent, newFlowerActivityRequestCode)
        }
    }
}