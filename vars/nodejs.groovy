def call(String Component) {
    pipeline {
        agent any

        stages {
            stage('compile') {
                steps {
                    sh 'echo Component = ${Component}'
                }
            }
//            stage('code Quality') {
//                steps {
//                    sh 'echo Code Quality'
//                }
//            }
//            stage('test case') {
//                steps {
//                    sh 'echo Test Cases'
//                }
//            }
        }
    }
}