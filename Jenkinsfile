node {
    ansiColor('xterm') {
    // some block
    }
    
    timestamps {
    // some block
    }   
    
    stage('1 - Get Code'){
        git credentialsId: 'github_jenkins', url: 'https://github.com/tuantrankhac/maven-selenium-java-jenkins'
    }
    
    stage('2 - Compiler'){
        bat label: 'Compiler source code', script: 'mvn clean'
    }
    
    stage('3 - Run Test'){
        bat label: 'Run E2E test', script: 'mvn test'
    }
    
    stage('4 - Public Report'){
        publishHTML([
            allowMissing: false,
            alwaysLinkToLastBuild: false, 
            keepAll: false, 
            reportDir: 'C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\PIPELINE_GITHUB\\target\\surefire-reports\\html',
            reportFiles: 'index.html', 
            reportName: 'HTML Report',
            reportTitles: '', 
            useWrapperFileDirectly: true])
    }
    
}
