pipeline {
agent any
stages{
stage('clone and clean repo'){
steps {
    
    
    bat "mvn clean -f timesheet"
}

}
stage('Test'){

steps{ bat "mvn test -f timesheet"
    
}}
stage('Deploy'){
steps {

bat "mvn package -f timesheet"
bat "mvn deploy -f timesheet"
bat "mvn sonar:sonar -f timesheet"
}

}
}
}
