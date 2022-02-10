package com.rijaldev.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.rijaldev.academy.data.CourseEntity
import com.rijaldev.academy.utils.DataDummy

class AcademyViewModel: ViewModel() {
    fun getCourses(): List<CourseEntity>  = DataDummy.generateDummyCourse()
}