# the fibonacci exercise

the fibonacci sequence is a well-defined series of numbers
starting from 0, such that any given _F<sub>n</sub>_ is equal
to the sum of the previous two numbers in the sequence.

that is:

_F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub>_

where:

_F<sub>0</sub>_ = 0, and

_F<sub>1</sub>_ = 1, and

the sequence proceeds:

* _F<sub>2</sub>_ = ( 0 + 1 ) = 1
* _F<sub>3</sub>_ = ( 1 + 1 ) = 2
* _F<sub>4</sub>_ = ( 2 + 1 ) = 3
* _F<sub>5</sub>_ = ( 3 + 2 ) = 5
* _F<sub>6</sub>_ = ( 5 + 3 ) = 8
* ... etc.

you can find more information on the Fibonacci sequence
on [Wikipedia](https://en.wikipedia.org/wiki/Fibonacci_number)

generating the Fibonacci sequences exercises a few of
the tools programmers use regularly, and so it's a useful
exercise in this series.

in this exercise, we'll use command line arguments
as well, a useful tool to have in the belt.

## the exercise

write a program that given some integer _n_
on the command line, generates the _n<sup>th</sup>_
number in the Fibonacci sequence:

`clojure3 fibonacci.py 3` should print `2`, for instance.
`clojure3 fibonacci.py 40` should print `102334155`.

include both 0 and 1 as options, though their numbers
fixed, not calculated.

we've provided a basic framework inside which you can
write the meat of the solution; all you have to do is
finish the exercise.

### solving iteratively

it's possible to solve this problem using a looping structure to
construct a list of values to be added. this is a fine solution,
but isn't the only possible solution.

### solving recursively

somewhat trickier is using recursion to solve the problem. recall
that recursion is when a function is defined in terms of itself.
a recursive function tends to define a base case, and to proceed
by successively reducing its values to the base case. the
Fibonacci sequence lends itself particularly well to recursion,
since:

_F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub>_

is a recursive definition.

### comparing the two

you might learn something from comparing the time it takes
each implementation to complete. for that reason, we recommend
you build both.

## in clojure

if you've installed a recent version of clojure, you have at your
disposal the `clj` command. in addition to launching a clojure
REPL, it will allow you to run your solution simply from a `.clj`
file.

## setting up

for installation instructions on your platform, check out
[https://clojure.org/guides/getting_started](https://clojure.org/guides/getting_started).

### cloning this repo

if you have `git` installed (and you should), you can clone
this repo with:

`git clone git@github.com:cribsheets/fibonacci-clojure`

a new directory called `fibonacci-clojure/` will appear in your
current directory.

### forking this repo

if you want to issue a pull request with your solution, you
should fork this repository (either on GitHub or using the
`hub` tool), and issue your pull requests to the `solutions`
branch, with the new file `fibonacci-username.clj` added.

## running the program

when you're working on your solution, or when it's complete,
you can run the program using the clojure interpreter:

`clj fibonacci.clj <n>`

replace the `<n>` with the Fibonacci number you want the
program to compute.

if you've completed the exercise, you should see the appropriate
entry in the Fibonacci sequence displayed.

## a basic solution

you can view two very basic solution to this problem in the
`solutions` branch, as `fibonacci-iterative.clj` and
`fibonacci-recursive.clj`. they are by no means
intended to be the optimal or most clever solutions, but they
satisfy the rules of the exercise.

to see the solutions branch:

`git checkout solutions`

to return to the master branch:

`git checkout master`

(or just look it up on GitHub.)

## can you do better?

if you have a solution you'd like to share, rename
your file `fibonacci-username.clj` (where 'username' is
your github username) and and issue a pull request to
merge into the `solutions` branch.

if you have a particularly clever solution, let us know!
we'll add it below.

## clever solutions


