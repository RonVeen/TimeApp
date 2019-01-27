pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''mvn clean install -DskipTests
'''
      }
    }
    stage('Run') {
      steps {
        echo 'Build Done'
      }
    }
  }
}