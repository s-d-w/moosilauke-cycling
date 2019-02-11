###Moosilauke Cycling

##### An example application demonstrating a bunch of different concepts in software engineering. No real point other than to have some kind of a context to work with.

Concepts:
* design patterns: builder, template method, etc
* asynchronous processing with a worker model


### Setup
Install gradle with: brew install gradle

If you don't want to install gradle, you can use the included gradle wrapper.
Just type:

    ./gradlew 
Instead of gradle.

### Running
to create a jar, from the root of the directory type:
    
    gradle build
    or  ./gradlew build     if you're using the wrapper
    
to run the jar:

    java -jar build/libs/moosilauke-cycling.jar
    
to run tests:

    gradle test
    
to run from the command line instead of running a jar (you'll need to ignore gradle's output):

    gradle run     

