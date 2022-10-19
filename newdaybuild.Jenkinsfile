pipeline{
    agent {label 'GIT_SSH'}
   triggers{
        pollSCM('45 17 * * *')
    }
    stages{
        stage('clonning'){
            steps{
                git url :'git@github.com:kishorebittu3003/spring-petclinic.git',
                branch: 'newdaybuild'
            }
        }
        stage('building_steps'){
            steps{
               sh 'git checkout krishdevops'
             sh 'git checkout newrelease'
             sh 'git merge krishdevops --no-ff'
             sh 'git checkout newrelease'
             sh 'git push -u origin newrelease'
             sh 'ls'
             sh 'git log --oneline --graph --decorate'
            }
        }

    }
}
