<h1>Java Basic Lab Programs</h1>
<p>The repository consists of java programs that cover basic java concepts such as <i>if-else statements,Classes and Objects, switch, loops, Inheritances, Interfaces, packages, Multi Threading, Exception Handling, File Handling, Baic Swing application.</i></p>
<h2>How to use?</h2>
<ul>
  <li>
    Clone this repository to your prferred directory
  </li>
  <code> git clone https://www.github.com/Chethan-L701/javalab.git </code>
  <li>
    goto the the cloned directory.
  </li>
  <code> cd ./javalab </code>
  <li>
    Make sure you have maven installed.</br>
    if it is not install you can install it by running:
  </li>
  in ubuntu/debian:
  <code> sudo apt-get install maven </code></br>
  in arch/arch-based distros:
  <code> sudo pacman -Sy maven </code></br>
  and select openjdk-17.
  <li>
    We would need jdk and jvm version 17(lts) or higher.You can check your jdk and jvm version with:</br>
  </li>
  <code> javac --version </code></br>
  <code> java --version </code></br>
  You can install the latest version using their website or your package manager.
  <li>
     This repository is cofigured to use jdk-17 as both source and target version.</br>
     You can change this in the pom.xml file to any other versions you would want.</br>
     <b>Warning: changing to older version may break the code since some of the feature used in this repo may not be available in the version you would want to change.</b>
  </li>
  <li>
    if both maven and jdk is set then we can follow on to the next step,that is building the project.</br>
    you can build the project by using this command.</br>
    <code> mvn package </code></br>
    this command will compile all the programs and creates a jar file and stores it in the <i>target</i> folder.
    if this is your first using mvn after fresh install this may take some time since maven may try to install some files.
  </li>
  <li>
    After the build is completed successfully you should see a message similar to this:</br>
    <img src="https://github.com/Chethan-L701/javalab/assets/63370113/d7fb270e-cf12-4c84-a84b-137eaf9ab00e">
  </li>
  <li>
    Now execute the program using command:</br>
    <code> java -cp target/javalab-1.0.jar learn.App </code></br>
    this will give you a console menu through which you can execute any of the given programs.
  </li>
  <li>
    The source code for all the programs is present in src/main/java/learn/programs.
  </li>
</ul>
