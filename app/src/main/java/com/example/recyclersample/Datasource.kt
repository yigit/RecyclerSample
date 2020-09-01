package com.example.recyclersample

import android.content.Context

class Datasource(private val context: Context) {
    fun loadFlowers(): MutableList<String> {
        return mutableListOf(
            context.getString(R.string.flower1),
            context.getString(R.string.flower2),
            context.getString(R.string.flower3),
            context.getString(R.string.flower4),
            context.getString(R.string.flower5),
            context.getString(R.string.flower6),
            context.getString(R.string.flower7),
            context.getString(R.string.flower8),
            context.getString(R.string.flower9),
            context.getString(R.string.flower10),
            context.getString(R.string.flower11),
            context.getString(R.string.flower12),
            context.getString(R.string.flower13)
        )
    }
}