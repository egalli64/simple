pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Simple'
      }
    }

    stage('Test') {
      steps {
        echo 'Test Simple'
      }
    }

    stage('Stage') {
      steps {
        echo 'Deploy Simple to Stage'
        input 'Deploy to production?'
      }
    }

    stage('Production') {
      steps {
        echo 'Deploy Simple to Production'
      }
    }

  }
}