
## Detect Arbitrage

You're given a two-dimensional array (a matrix) of equal height and width that
represents the exchange rates of arbitrary currencies. The length of the array
is the number of currencies, and every currency can be converted to every
other currency. Each currency is represented by a row in the array, where
values in that row are the floating-point exchange rates between the row's
currency and all other currencies, as in the example below.

In the matrix above, you can see that row 0 represents USD, which
means that row 0 contains the exchange rates for
1 USD to all other currencies. Since row
1 represents CAD, index 1 in the USD row contains
the exchange for 1 USD to CAD. The currency labels are listed
above to help you visualize the problem, but they won't actually be included
in any inputs and aren't relevant to solving this problem.

Write a function that returns a boolean representing whether an arbitrage
opportunity exists with the given exchange rates. An arbitrage occurs if you
can start with C units of one currency and execute a series of
exchanges that lead you to having more than C units of the same
currency you started with.

Note: currency exchange rates won't represent real-world exchange rates, and
there might be multiple ways to generate an arbitrage.

The optimal solution to this problem seems very difficult. Would I be expected
to come up with this in a 45-minute interview?

Realistically, no. Since the optimal solution to this problem is admittedly
very hard (harder than most other solutions on AlgoExpert), in a real coding
interview, you would likely be given a lot of guidance and hints by your
interviewer.

For example, it's possible that they would first see you struggle with the
problem for about 5 minutes and then point you in the direction of using
negative logarithms, telling you why exactly that would be useful.

### Sample Input
```
0:USD 1:CAD  2:GBP 
0:USD [  1.0, 1.27, 0.718] 
1:CAD [ 0.74,  1.0,  0.56] 
2:GBP [ 1.39, 1.77,   1.0]
```

### Sample Output
```
exchangeRates = [
  [   1.0, 0.8631, 0.5903],
  [1.1586,    1.0, 0.6849],
  [1.6939,   1.46,    1.0],
]
```
