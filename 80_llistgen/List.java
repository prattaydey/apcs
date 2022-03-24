// Team McDonalds$24MScam: Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW80 -- Generic Lists
// 2022-03-24
// time spent: 1.0 hr
// KtS consumed: 2

/*
DISCOS:
- Find and replace is a very helpful tool but you have to be careful not to replace the wrong occurences
- When calling a generic class, you have to include the specific type for that Object

QCCs:
- IS there an easier way to implement a generic class without having to include type in every occurence.

/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0:
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
 **/

public interface List<Type>
{
  //add node to list, containing input String as its data
  public boolean add( Type x );

  //insert at specified index
  public void add( int index, Type newVal );

  //remove node from list, return its data
  public Type remove( int index );

  //return data in element at position i
  public Type get( int i );

  //overwrite data in element at position i
  public Type set( int i, Type x );

  //return length of list
  public int size();

}//end interface
