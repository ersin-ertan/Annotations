package annotations;

/*
 * A form of meta-data providing data about the program that is not in the program itself,  no direct effect on the opration of the code
 * uses: information for the compiler - detect errors or suppress warnings
 * compile time and deployment time processing - tools can process annotation info to generate code ,xml files and on 
 * runtime processing - some annotations are available to be examined at runtime 
 * can be used in conjunction with pluggable type systems to write code with stronger type checking 
 */

public class Anotations_Basics {
	
	//@AnAnnotation
	
	/*@Author(
	 * name = "roger parsons"
	 * age = "2"
	 * )
	 * 
	 * or
	 * 
	 * @Without("aName")
	 * 
	 * @We
	 * @Can
	 * @Stack("Annotation")
	 * 
	 * as of java se 8
	 * @Repeating(name = "if the")
	 * @Repeating(name = "same type")
	 * */
	
	/*Can be applied to declaration of classes, fields, methods, and other program elements
	 * 
	 * new @Interned MyObject(); // class instance creation
	 * 
	 * myString = (@NonNull String)str; // type cast
	 * 
	 * class UnmodifiableList<T> implemments
	 * 		@Readonly List<@Readonly T> {...} // implements clause
	 * 
	 * void monitorTemp() throws
	 * 		@Critical TempException {...} // thrown exception declaration
	 * 
	 * 
	 * */

}
