
## Reveal Minesweeper

Minesweeper
is a popular video game. From Wikipedia, "The game features a grid of
clickable squares, with hidden "mines" scattered throughout the board. The
objective is to clear the board without detonating any mines, with help from
clues about the number of neighboring mines in each field." Specifically,
when a player clicks on a square (also called a cell) that doesn't contain a
mine, the square reveals a number representing the number of immediately
adjacent mines (including diagonally adjacent mines).

You're given a two-dimensional array of strings that represents a
Minesweeper board for a game in progress. You're also given a row and a
column representing the indices of the next square that the player clicks on
the board. Write a function that returns an updated board after the click
(your function can mutate the input board).

The board will always contain only strings, and each string will be one of
the following:

If the player clicks on a mine, replace the "M" with
"X", indicating the game was lost.

If the player clicks on a cell adjacent to a mine, replace the
"H" with a string representing the number of adjacent mines.

If the player clicks on a cell with no adjacent mines, replace the
"H" with "0". Additionally, reveal all of the
adjacent hidden cells as if the player had clicked on those cells as well.

You can assume the given row and column will always represent a legal move.
The board can be of any size and have any number of mines in it.

### Sample Input
```
board = [
  ["M", "M"],
  ["H", "H"],
  ["H", "H"]
]   
row = 2
column = 0
```

### Sample Output
```
[
  ["M", "M"],
  ["2", "2"],
  ["0", "0"]
]
```
