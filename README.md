# jenkins-pipeline-shared-library-template

1. Przejdź do 'Zarządzaj Jenkinsem' -> 'Skonfiguruj system' -> 'Global Pipeline Libraries' Następnie 'Dodaj':
- Name: `jenkins-pipeline-shared-library-template`
- Default version: `main`
- SCM Git: `https://github.com/r3dl0ck/jenkins-pipeline-shared-library-template`

2. Utwórz zadania `template-pipeline` typu Pipeline w Jenkins.
Przejdź do 'Pipeline Script' -> Dodaj skrypt i Zapisz.
```
@Library("jenkins-pipeline-shared-library-template@main") _

continuousDeliveryPipeline {
    repoUrl = "https://github.com/r3dl0ck/hello-maven-example.git"
    branch = "main"
}
```

