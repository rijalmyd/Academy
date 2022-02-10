package com.rijaldev.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.rijaldev.academy.data.CourseEntity
import com.rijaldev.academy.utils.DataDummy

class BookmarkViewModel: ViewModel() {
    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourse()
}