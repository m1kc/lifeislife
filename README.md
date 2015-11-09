# Life is life

A game somewhat similar to Conway's Game of Life.

There are 3 types of chunks: empty, grass and rock. Also there are 2 types of animals: cows and wolves. The rules are:

* At the beginning of every turn, a chunk of grass may spawn at random location.
* If a cow moves to a chunk with grass, it eats it.
* If a wolf encounters a cow, it eats her.
* If an animal is too hungry (like 50 turns without food), it dies.
* If an animal is 80 turns old, it dies.
* If an animal is content and at least 20 turns old, it may spawn a copy of itself.

## Building and running

That's a NetBeans project, so the simplest way is to load it into NetBeans and use the usual buttons.

Alternatively, you can use Ant. Try `ant jar` and `ant run`.
