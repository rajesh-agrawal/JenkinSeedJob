## Jenkins Seed Jobs
##  Generated after lot of brainstroming and experimentation

Hi, I am not a native Jenkins expert and Jenkin pipelines seem to be easy at the start but when you want to implement DevOps in the most right manner, there are some challenges
- How to create a SEED job which creates all the pipelines and with minimum Jenkins knowledge ?
- All information about the jenkin job such as name,description,type and pipeline details should restored without any human intervention


## Creating Seed Jobs
- Seed jobs can be created in seperate github repository which internally creates jobs from your code repositories
- If you refer to the seed job, we are trying to create a pipeline job named 
- Backend_Job using the github repo JenkinSeedJob.git and script JenkinFileBackend
- Similarly you can also add multiple entries for all the jenkin pipelines that you want the seed job to create.

``` 
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
```

## Creating Individual Jenkin Jobs
The individual jenkin jobs can be written in simple pipeline format in their respective code repositories. 

``` 
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo hi'
            }
        }
    }
}
```
