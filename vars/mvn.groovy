def call (){
pipeline{
    agent {label 'NEW_PYTHON'}
    
    
    stages{
        stage('clonning'){
            steps{
                git url : 'git@github.com:kishorebittu3003/spring-petclinic.git',
                branch : 'naveen'
            }
        }
        stage (mvn_build){
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
}