                                     GridGardenNotes.md
This file contains all of the notes that I have taken during my walkthrough of the 28 levels of grid garden. Grid Garden is an activity that allows the user to learn simple css commands to better understand css styling and how the commands are used. Grid Garden starts off simple, and slow, but adds in challenges along the way. 

The CSS commands and tips I picked up along the way: 
"Grid Column start" creates a starting location for the grid.
"Grid Column end & span" work to limit how far the grid can go.
"Grid column span" cannot have a negative value, but "Gid column end" can have a negative value.
To shorten these commands, use "grid-column: #/#"
The commands also work with rows, instead of columns. 
"Grid-area" can define all 4 values combined from both rows and columns, shortening the code. 
Values for "grid-area" are separated by '/'s. 
"Grid-area"s can overlap each other without conflict.
"Order" can also be used to position objects. By default, all items in a grid have an "order" of 0.
"Order" can be a negative value.
Using "grid-template-column" (and rows) can define the parameters of each grid box.
The "repeat" function can be added to apply more than one change.
Using the "#fr" syntax allows columns and rows to be divided up into fractional components. 
"Grid-template" is shorthand that combines rows & columns to limit grids down to a simple area. This can be shown as "grid-template: #px #px / #px". 
