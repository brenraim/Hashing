public abstract class Hasher
{
	//Editing of this variable prohibtied
	public int collisions = 0;

	/**
		Hashing a given object without using Object's built-in
		hashcode function.
		@param obj The object to be hashed
		@return int value generated by hashing the object 
	*/
	public abstract int hash(Object obj);
	
	/**
		Simple function to identify the coder.
		@return String that is your name.
	*/
	public abstract String getCoderName();
}