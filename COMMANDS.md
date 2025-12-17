<div style="align:center">
    <a href="COMMANDS_RU.md">RU</a> |
    EN
</div>

>[!TIP]
> All the commands that can be used in console are written here

## help in use console
``` help ```

## to enable sql mode
``` sql ```
>[!TIP]
> in sql mode, you can not write a new line every time, but many at once. You should write it from the beginning ``` !one line ``` or ``` !morel ```, then you can write commands (max 100) to end the input, write ~ or done (if the limit has been exceeded, it ends the input command and executes

the command to clean the console
``` clear ```
``` cls ```

delete data for a quick login to your database
``` clear data ```

>[!TIP]
>the commands are stored in a json file

to create your team (for writing sql queries quickly)
```mkcommand (name command) (command)```

to delete a command from json
```rmc (your name command)```

to output all your commands from json
```all-commands```
```output-all-commands```

to run your command, you need to write like this
```run (your command)```

just exit
``` exit ```
``` ex ```
