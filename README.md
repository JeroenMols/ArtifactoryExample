# ArtifactoryExample
This repository demonstrates how you easily generate Maven artifacts from an Android library and upload them to your own private repository (based on Artifactory). The precise details of how everything works can be found:

- For AwesomeLibrary and AwesomeApplication: [this blogpost](https://jeroenmols.github.io/blog/2015/08/06/artifactory/).
- For AwesomeAdvancedLibrary and AwesomeAdvancedApplication: [this blogpost](https://jeroenmols.github.io/blog/2015/08/13/artifactory2/).

## Usage
Make sure you have your own private Artifactory repository running on your local machine. You can set up one by following the instructions in [this blogpost](https://jeroenmols.github.io/blog/2015/08/06/artifactory/).

Clone the entire repository to your local machine:

```git
git clone git@github.com:JeroenMols/ArtifactoryExample.git
```

Open the `AwesomeLibrary` or `AwesomeAdvancedLibrary` project, compile a release version and upload the artifacts to your Artifactory repository:

```groovy
gradle assembleRelease artifactoryPublish
```

Open the `AwesomeApplication` or `AwesomeAdvancedApplication` project in Android Studio and run it on a connected device. Gradle will now download the dependency you just created from the Artifactory repository and build your project.

That's it, your done!

## Questions
@molsjeroen
