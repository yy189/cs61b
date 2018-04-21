* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

Tools -> Build System -> New Build System...

* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

{

"shell_cmd": "javac -encoding utf-8 $file_name && java $file_base_name",

"file_regex": "^ *\\[javac\\] (.+):([0-9]+):() (.*)$",

"selector": "source.java",

"encoding": "utf-8"

}

* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

Save as: run.sublime-build
Where: User

* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

Tools -> Build System -> run

* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

cmd + B to compile and run
