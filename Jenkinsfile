pipeline {
agent any
stages{
stage('clone and clean repo'){
steps {
    bat "rmdir /S /Q timesheet"
    bat "git clone https://github.com/MohamedAmineNjah/timesheet.git"
    bat "mvn clean -f timesheet"
}

}

}
}
