package com.rijaldev.academy.ui.bookmark

import com.rijaldev.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
