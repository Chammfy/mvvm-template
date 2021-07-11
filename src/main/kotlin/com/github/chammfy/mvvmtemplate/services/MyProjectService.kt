package com.github.chammfy.mvvmtemplate.services

import com.github.chammfy.mvvmtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
