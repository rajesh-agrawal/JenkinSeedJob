pipelineJob('Backend_Job') {
   
  definition {
     cpsScm {
            scm {
                git('https://github.com/rajesh-agrawal/JenkinSeedJob.git')
            }
            scriptPath('pipeline/JenkinFileBackend')
            
        }
    }
}
pipelineJob('Frontend_Job') {
   
  definition {
     cpsScm {
            scm {
                git('https://github.com/rajesh-agrawal/JenkinSeedJob.git')
            }
            scriptPath('pipeline/JenkinFileFrontend')
            
        }
    }
}
