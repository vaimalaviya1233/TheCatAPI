package com.vaibhav.restkotlin

import android.widget.ImageView

interface ImageLoader {
	fun loadImage(imageUrl: String, imageView: ImageView)
}