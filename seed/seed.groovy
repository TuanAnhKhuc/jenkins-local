folder('teamA')

pipelineJob('teamA/sample-pipeline') {
    definition {
        cps {
            script("""
                pipeline {
                  agent any
                  stages {
                    stage('Hello') {
                      steps {
                        echo "Hello from Team A pipeline!"
                      }
                    }
                  }
                }
            """)
            sandbox()
        }
    }
}
