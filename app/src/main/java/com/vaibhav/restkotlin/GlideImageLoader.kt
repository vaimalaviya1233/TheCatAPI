package com.vaibhav.restkotlin

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlin.reflect.KProperty

class GlideImageLoader(private val context: Context) {
	fun loadImage(
		imageUrl: String,
		imageView: ImageView,
	) {
		Glide.with(context)
			.load(imageUrl)
			.centerCrop()
			.into(imageView)
	}
	
	private operator fun Any.getValue(mainActivity: MainActivity, property: KProperty<*>) {
	
	}
	
}