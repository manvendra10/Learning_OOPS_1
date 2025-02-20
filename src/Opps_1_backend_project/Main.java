package Opps_1_backend_project;

// we can start filling the data by objects.
// objects of a class store the data and memory is allocated to the objects of a class.
public class Main {
    public static void main(String[] args) {
        // type_of_the_object object_name = new class_name();
        // new keyword allocates the memory to that object
        Student s1 = new Student();
        s1.name = "manvendra";
        s1.age = 24;
        s1.psp = 100;
        s1.changeBatch();
        s1.joinClass();
        s1.printDetails();

        Student s2 = new Student();
        s2.name = "Bhavik";
        s2.age = 25;
        s2.psp = 98;
        s2.printDetails();

    }
}
/*
How to use Debugger in IntellijIdea -> " How to debug a java code ??? "
1. select the line and put a breakpoints
2. next to run button -> there is bug button (shift+f9) -> click on this bug button
3. step over --->
execute things line by line
don't go inside the function
4. step into --->
if we want to go into inside the function then select step into
5. console will show the printf things and debugger screen will show the values
6. if we have 2 breakpoints at two lines. we want to jump to 2nd breakpoint directly from the 1st breakpoint
-> here, we will execute all the lines b/w 1st breakpoint and 2nd breakpoint
In order to jump to 2nd breakpoint directly from the 1st breakpoint, we use ->
"Resume Program button/f9(Left panel button) { Green Colour Button }
 */

/*
1. git status
2. To convert into a git repository -> git init
3. after git init -> execute
git status  { it shows all the folder and files which are tracked by git currently }
 .gitignore
.idea/file1
.pom.xml
.src/

In .gitigonore folder ->
anything you mention here { git will ignore it }
It will not show in the staging section
I want to add all files of .idea folder here -> since i don't want .idea folder files to be tracked by git
so -> I will write
.idea/   -> in the .gitignore folder
after this, all the files of .idea/ folder, will not be tracked by the git

4. now, we execute again -> git status
.gitignore
.pom.xml
.src/

since, .idea/ folder, will not be tracked by the git -> so it is removed from the git status

5.
git add .
{ with this all the files of the working section will go into staging section }

6.
git commit -m "introduction to oops-1"

7.
If I want to send this to remote then command is -> git push

But, have we connected this to remote -> No -> How to do that ?
-> go to github.com -> then create a new repository -> give its name and make it public
-> then, since we have some code/ this intellij code to be pushed to remote/Github, so we execute these commands -->


 */