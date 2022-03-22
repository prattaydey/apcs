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
