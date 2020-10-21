node {
    stage "Checkout"
    checkout scm 
    stage "Build"
    withMaven(
            maven: 'M3', 
            mavenSettingsConfig: 'maven') {
      sh "mvn -f static-code-analysis-example/pom.xml clean package checkstyle:checkstyle findbugs:findbugs cobertura:cobertura pmd:pmd -DskipDockerBuild=true"

    }

    step([$class: 'hudson.plugins.checkstyle.CheckStylePublisher', pattern: '**/target/checkstyle-result.xml', unstableTotalAll:'0',unhealthy:'100', healthy:'100'])
    step([$class: 'PmdPublisher', pattern: '**/target/pmd.xml'])
    step([$class: 'FindBugsPublisher', pattern: '**/findbugsXml.xml'])
}
