package com.example.javaplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @ProjectName: TestPluginJava
 * @Package: com.example.javaplugin
 * @ClassName: JavPlugin
 * @Description: java类作用描述
 * @Author: tianfy
 * @CreateDate: 2023/6/28 22:24
 * @UpdateUser: 更新者：
 * @UpdateDate: 2023/6/28 22:24
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class JavPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println(project.getName() + " apply success");
    }
}
