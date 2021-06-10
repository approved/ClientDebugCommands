<h1 align="center">
    Client Debug Commands
</h1>
<p align="center">
    <a href="LICENSE">
        <img alt="GitHub" src="https://img.shields.io/github/license/approved/ClientDebugCommands?style=for-the-badge">
    </a>
    <br>
    <b>
    This mod was designed out of necessity for more accessibility. It allows the user to use chat commands to access the F3 hotkey functionalities.
    </b>
</p>

<p align="center">
    <img src="/assets/gifs/cdbg-preview.gif">
</p>

---

## Commands

<table>
    <tbody>
        <tr>
            <th align="left">Name</th>
            <th align="left">Command</th>
            <th align="left">Hotkey</th>
            <th align="left">Description</th>
        </tr>
        <tr>
            <td align="left">Reload Chunks</td>
            <td align="left">rechunk</td>
            <td align="left">F3 + A</td>
            <td align="left">Reloads all chunks</td>
        </tr>
        <tr>
            <td align="left">Toggle Hitboxes</td>
            <td align="left">hitbox</td>
            <td align="left">F3 + B</td>
            <td align="left">Toggles tde hitbox visibility of visible entities.<br>
            Shows Eye Height and Facing Direction of visible entities.</td>
        </tr>
        <tr>
            <td align="left">Copy Teleport Position</td>
            <td align="left">copytp</td>
            <td align="left">F3 + C</td>
            <td align="left">Copy tde player's coordinates and rotation as an execute teleport command. <br>
            <pre>/execute in {world} run tp @s {x} {y} {z} {yaw} {pitch}</pre></td>
        </tr>
        <tr>
            <td align="left">Clear Chat</td>
            <td align="left">clear</td>
            <td align="left">F3 + D</td>
            <td align="left">Clears all current chat messages.</td>
        </tr>
        <tr>
            <td align="left">Cycle Render Distance</td>
            <td align="left">cyrender</td>
            <td align="left">F3 + F</td>
            <td align="left">Increases tde Render Distance by 1 each time it is called.</td>
        </tr>
        <tr>
            <td align="left">Toggle Chunk Boundaries</td>
            <td align="left">chunkbounds</td>
            <td align="left">F3 + G</td>
            <td align="left">Toggles tde visibility of chunk borders.</td>
        </tr>
        <tr>
            <td align="left">Toggle Advanced Tooltips</td>
            <td align="left">advtooltip</td>
            <td align="left">F3 + H</td>
            <td align="left">Toggles tde visibility of Item IDs, Durability, Armor Color Codes, Map Scale, and Firework Rocket information.</td>
        </tr>
        <tr>
            <td align="left">[Server] Copy Look At Data</td>
            <td align="left">scopylookat</td>
            <td align="left">F3 + I</td>
            <td align="left">Copies tde server-side data of tde entity or block tdat tde player is currently looking at.</td>
        </tr>
        <tr>
            <td align="left">[Client] Copy Look At Data</td>
            <td align="left">copylookat</td>
            <td align="left">F3 + Shift + I</td>
            <td align="left">Copies tde client-side data of tde entity or block tdat tde player is currently looking at.</td>
        </tr>
        <tr>
            <td align="left">Toggle Debug Profiling</td>
            <td align="left">profile</td>
            <td align="left">F3 + L</td>
            <td align="left">Logs performance metrics.<br>
            Performance Metric struct can be seen here: <a href="https://minecraft.fandom.com/wiki/Performance_Metrics">Performance Metrics</a></td>
        </tr>
        <tr>
            <td align="left">Toggle Spectator</td>
            <td align="left">spectator</td>
            <td align="left">F3 + N</td>
            <td align="left">Toggles between Spectator mode and previous gamemode if allowed. Will default to Creative mode if no previous mode is found.</td>
        </tr>
        <tr>
            <td align="left">Toggle Pause Witdout Focus</td>
            <td align="left">unfocus</td>
            <td align="left">F3 + P</td>
            <td align="left">Toggle automatic pause when Minecraft loses focus.</td>
        </tr>
        <tr>
            <td align="left">Show All F3 + Key-binds</td>
            <td align="left">help</td>
            <td align="left">F3 + Q</td>
            <td align="left">Shows Help for all F3 + Key-binds.</td>
        </tr>
        <tr>
            <td align="left">Reload Resource Packs</td>
            <td align="left">reres</td>
            <td align="left">F3 + T</td>
            <td align="left">Reloads all resource packs.</td>
        </tr>
    </tbody>
</table>
