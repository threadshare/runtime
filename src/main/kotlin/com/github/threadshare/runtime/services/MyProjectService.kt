package com.github.threadshare.runtime.services

import com.intellij.openapi.project.Project
import com.github.threadshare.runtime.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
