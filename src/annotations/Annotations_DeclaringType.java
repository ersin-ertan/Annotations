package annotations;

import java.lang.annotation.*;

// may replace comments in code

public class Annotations_DeclaringType {
	
	// instead of 
	public class Generation3List {

		   // Author: John Doe
		   // Date: 3/17/2002
		   // Current revision: 6
		   // Last modified: 4/12/2004
		   // By: Jane Doe
		   // Reviewers: Alice, Bill, Cindy
		}
	
	// type defined as
	@Documented // now this annotation will appear in the javadoc-gen documentation
	@interface ClassPreamble { 
		   String author();
		   String date();
		   int currentRevision() default 1;
		   String lastModified() default "N/A";
		   String lastModifiedBy() default "N/A";
		   // Note use of array
		   String[] reviewers();
		}
	
	
	
	// in use 
	@ClassPreamble (
			   author = "John Doe",
			   date = "3/17/2002",
			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   // Note array notation
			   reviewers = {"Alice", "Bob", "Cindy"}
			)
	public class theClass{}
	
	

}
