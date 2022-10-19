pipeline {
    agent {label 'GIT_SSH'}
    triggers{
        pollSCM('30 17 * * *')
    }
    stages {
        stage ('Clone') {
            steps {
                git url: 'git@github.com:kishorebittu3003/spring-petclinic.git',
                    branch: ' newrelease'
            }
        }
        stage('build_the_package'){
            steps{
                sh 'mvn package'
            }

        }
          stage('archive_the_artifacts'){
            steps{
                archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
            }
        }
       
        stage('j-unittesting'){
            steps{
                 junit testResults : '**/surefire-reports/*.xml'
                
            }
                
        }

}
}