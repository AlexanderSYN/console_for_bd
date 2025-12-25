<div style="align:center">
    <a href="COMMANDS_RU.md">RU</a> |
    EN
</div>

>[!TIP]
> All the commands that can be used in console are written here

# connect to db
>[!TIP] 
> to connect on localhost server you can to write so: jdbc:mysql://localhsot:3306/db_name
> to connect on your server mysql you need to write so: jdbc:mysql://your_ip_address_server_or_your_domen:your_port/db_name
> if it returns an error when connecting to the database via the host, then most likely you need to give access to your ip address.


## help in use console
``` help ```

info about program
```info```

db (find out data about the database)
```db```

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
