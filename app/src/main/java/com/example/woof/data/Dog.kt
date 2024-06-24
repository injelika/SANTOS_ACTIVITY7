/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.calico, R.string.sonny_angel_1, 2, R.string.SA_description_1),
    Dog(R.drawable.silver_tabby, R.string.sonny_angel_2, 16, R.string.SA_description_2),
    Dog(R.drawable.tuxedo, R.string.sonny_angel_3, 2, R.string.SA_description_3),
    Dog(R.drawable.siamese, R.string.sonny_angel_4, 8, R.string.SA_description_4),
    Dog(R.drawable.white, R.string.sonny_angel_5, 8, R.string.SA_description_5),
    Dog(R.drawable.brown_and_black, R.string.sonny_angel_6, 14, R.string.SA_description_6),
    Dog(R.drawable.bluish_gray, R.string.sonny_angel_7, 2, R.string.SA_description_7),
    Dog(R.drawable.red_tabby, R.string.sonny_angel_8, 7, R.string.SA_description_8),
    Dog(R.drawable.black, R.string.sonny_angel_9, 4, R.string.SA_description_9)
)
