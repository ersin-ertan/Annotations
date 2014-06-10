package annotations;

import java.util.ArrayList;

// Before the Java SE 8 release, annotations could only be applied to declarations

public class Annotations_PredefinedTypes extends ArrayList {

	// Javadoc comment follows
    /**
     * @deprecated
     * explanation of why it was deprecated
     */
    @Deprecated
    static void deprecatedMethod() { }
    
 // ----------------------------------------------------------------------------------------------------
    
    // use a deprecated method and tell 
    // compiler not to generate a warning
    @SuppressWarnings({ "deprecation", "static-access" })
     void useDeprecatedMethod() {
         // deprecation warning
         // - suppressed
         this.deprecatedMethod();
     }
    
    // ----------------------------------------------------------------------------------------------------
    
    // mark method as a superclass method
    // that has been overridden
    @Override 
    public int size() {return 0;}
    
 // ----------------------------------------------------------------------------------------------------
    
    // meta annotations
    /*
    @Retention annotation specifies how the marked annotation is stored:
    	RetentionPolicy.SOURCE – The marked annotation is retained only in the source level and is ignored by the compiler.
    	RetentionPolicy.CLASS – The marked annotation is retained by the compiler at compile time, but is ignored by the Java Virtual Machine (JVM).
    	RetentionPolicy.RUNTIME – The marked annotation is retained by the JVM so it can be used by the runtime environment.
    */
    
    /* @Documented annotation indicates that whenever the specified annotation is used those elements should be documented using the Javadoc tool. (By default, 
     * annotations are not included in Javadoc.) For more information, see the Javadoc tools page.*/
    
    /*
     *  @Target annotation marks another annotation to restrict what kind of Java elements the annotation can be applied to. A target annotation specifies one of the following element types as its value:

			ElementType.ANNOTATION_TYPE can be applied to an annotation type.
			ElementType.CONSTRUCTOR can be applied to a constructor.
			ElementType.FIELD can be applied to a field or property.
			ElementType.LOCAL_VARIABLE can be applied to a local variable.
			ElementType.METHOD can be applied to a method-level annotation.
			ElementType.PACKAGE can be applied to a package declaration.
			ElementType.PARAMETER can be applied to the parameters of a method.
			ElementType.TYPE can be applied to any element of a class.
     * */
    
    /*
     *  @Inherited annotation indicates that the annotation type can be inherited from the super class. (This is not true by default.) When the user queries the annotation type and the class has no annotation for this type,
     *   the class' superclass is queried for the annotation type. This annotation applies only to class declarations.
     * */

    /*
     * @Repeatable annotation, introduced in Java SE 8, indicates that the marked annotation can be applied more than once to the same declaration or type use.
     * */
    
}
