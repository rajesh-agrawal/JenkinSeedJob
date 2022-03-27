pipelineJob('Backend_Job') {

  definition {
    cpsScm {
      lightweight(true)
      scm {

        git {
          remote {
            name('master')
            url('https://github.com/rajesh-agrawal/JenkinSeedJob.git')
          }
          branch('master')
          extensions {

          }
        }

      }
      scriptPath('pipeline/JenkinFileBackend')

    }
  }
}
pipelineJob('Frontend_Job') {

  definition {
    cpsScm {
      lightweight(true)
      scm {

        git {
          remote {
            name('master')
            url('https://github.com/rajesh-agrawal/JenkinSeedJob.git')
          }
          branch('master')
          extensions {

          }
        }

      }
      scriptPath('pipeline/JenkinFileFrontend')

    }
  }
}
