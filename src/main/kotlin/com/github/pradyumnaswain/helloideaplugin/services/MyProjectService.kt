package com.github.pradyumnaswain.helloideaplugin.services

import com.github.pradyumnaswain.helloideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
