package com.example.myapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparatorTest {

    private lateinit var resourceComparator : ResourceComparator

    @Before
    fun setup() {
        resourceComparator = ResourceComparator()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context,R.string.app_name,"My Application")
        assertThat(result).isTrue()
    }


    @Test
    fun stringResourceSameAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context,R.string.app_name,"Hello")
        assertThat(result).isFalse()
    }
}