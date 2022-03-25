pipelineJob('Backend_Job') {
   
  definition {
    cps {
            script(readFileFromWorkspace('pipeline/JenkinFileBackend'))
            sandbox()
        }
    }
}
pipelineJob('Frontend_Job') {
   
  definition {
    cps {
            script(readFileFromWorkspace('pipeline/JenkinFileFrontEnd'))
            sandbox()
        }
    }
}
