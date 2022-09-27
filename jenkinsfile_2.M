node {
    (UBUNTU_2)
   stage('git_code_spring-petclinic')
   {
     git branch: 'jenkins_scm_3.0',
         credentialsId: 'UBUNTU_2',
         url: 'https://github.com/kishorebittu3003/spring-petclinic'
    }
}  
    
