import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students==NULL)
		throw new IllegalArgumentException();
		return this.students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		if(this.students==NULL)
		throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		this.students[i]=new Student(students[i]);
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
		throw new IllegalArgumentException();
		else
		return this.students[index];
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0||index>=students.length||students==NULL)
		throw new IllegalArgumentException();
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(this.students==NULL)
		throw new IllegalArgumentException();

		Student students[]=
				new Student[this.students.length+1];
		students[0]=new Student(student);
		for(int i=1;i<students.length;i++)
		students[i]=new Student(this.students[i-1]);
	this.students=students;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students==NULL)
		throw new IllegalArgumentException();

		students=Arrays.copyOf(students,student.length+1);
		students[student.length-1]=new Student(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	if(index<0||index>students.length||students==NULL)
	throw new IllegalArgumentException();
	
	Student students[]=
				new Student[this.students.length+1];

	for(int i=0;i<index;i++)
	students[i]=new Student(this.students[i]);
	
	students[i]=new Student(student);
	
	for(int i=index+1;i<students.length;i++)
	students[i]=new Student(this.students[i-1]);
	this.students=students;

	}

	@Override
	public void remove(int index) {
		// Add your implementation here

		if(index<0||index>students.length||students==NULL)
	throw new IllegalArgumentException();
	
	Student students[]=
				new Student[this.students.length-1];

	for(int i=0;i<index;i++)
	students[i]=new Student(this.students[i]);
	
	for(int i=index+1;i<students.length;i++)
	students[i-1]=new Student(this.students[i]);

	this.students=students;	
	}

	@Override
	public void remove(Student student) {
	
	if(this.students==NULL)
	throw new IllegalArgumentException();

		int i,len=this.students.length;
		for(i=0;i<len;i++)
		if(this.students[i].equals(student))
		{
			remove(i);
			break;
		}
		if(len==this.students.length)
		throw new IllegalArgumentException("Student not exist");
		
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	if(this.students==NULL)
	throw new IllegalArgumentException();
	Student students[]=
				new Student[index+1];
	
	for(int i=0;i<index+1;i++)
	students[i]=new Student(this.students[i]);
	this.students=students;

	
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here

		if(this.students==NULL)
	throw new IllegalArgumentException();

		for(int i=0;i<this.students.length;i++)
		if(this.students[i].equals(student))
		{
			removeFromIndex(i);
			break;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(this.students==NULL)
	throw new IllegalArgumentException();
	Student students[]=
				new Student[this.students.length-index];
		for(int i=index;i<this.students.length;i++)
		{
			students[i-index]=new Student(this.students[i]);
		}

		this.students=students;
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here

	if(this.students==NULL)
		throw new IllegalArgumentException();
	
	for(int i=0;i<this.students.length;i++)
	{
		if(this.students[i]==student)
		{
			removeToIndex(i);
			break;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		//based on avg marks
		Student temp;
		for(int i=0;i<this.students.length;i++)
		for(j=i+1;j<this.students.length;j++)
		{
			if(this.student[i].avgMark>				this.student.[j].avgMark)
			{
				temp=students[i];
				students[i]=students[j];
				student[j]=temp;
			}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==NULL)
		throw new IllegalArgumentException();
		int count=0;
		for(int i=0;i<this.students.length;i++)
		{
			if(this.student[i].birthDate.compareTo(date)<=0)
			count++;
			
		}
		Student students[]=
				new Student[count];
			for(int j=0,i=0;i<this.students.length;i++)
		{
			if(student[i].birthDate.compareTo(date)<=0)
				students[j++]=
					new Student(this.students[i]);
			
		}

		

		return students;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here

		if(firstDate==NULL||lastDate==NULL)
		throw new IllegalArgumentException();
		int count=0;
		for(int i=0;i<this.students.length;i++)
		{
			if(this.student[i].birthDate.compareTo(firstDate)>=0	&&this.student[i].birthDate.compareTo(lastDate)<=0)
			count++;

		}
		Student students[]=
				new Student[count];
		for(int j=0,i=0;i<this.students.length;i++)
		{
	if(this.student[i].birthDate.compareTo(firstDate)>=0	&&this.student[i].birthDate.compareTo(lastDate)<=0)
		students[j++]=new Student(this.students[i]);
			
		}

		
		return students;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==NULL)
		throw new IllegalArgumentException();
		int count=0;
		for(int i=0;i<this.students.length;i++)
		{
			 Calendar cal = Calendar.getInstance();
    			cal.setTime(this.student[i].birthDate);
			 int year = cal.get(Calendar.YEAR);
    			int month = cal.get(Calendar.MONTH);
    			int day = cal.get(Calendar.DAY_OF_MONTH);
			Calendar cal1 = Calendar.getInstance();
    			cal1.setTime(date);
			int arr[100],x=0;
			 int year1 = cal.get(Calendar.YEAR);
    			int month1 = cal.get(Calendar.MONTH);
    			int day1 = cal.get(Calendar.DAY_OF_MONTH);
			if(year1==year)
			{
				if(month1==month)
				{
					if(day1<=day)
					arr[x++]=i;
				}
				else if(month1<month)
				{
					if((day1+30)%30<day)
					arr[x++]=i;
				}
			}
			
		}
		Student students[]=
				new Student[count];
			for(int j=0,p=0,i=0;i<this.students.length;i++)
		{
			if(i==arr[p])
				{
					students[j++]=
					new Student(this.students[i]);
					p++;
				}
		}

		
			return students;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
    	 Calendar cal = Calendar.getInstance();
    			cal.setTime(this.student[indexOfStudent].birthDate);
			 int year = cal.get(Calendar.YEAR);
       int year1=Calendar.getInstance().setTime(Date()).get(Calender.YEAR);
       
		return year1-year;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
    if(this.students==NULL)
	throw new IllegalArgumentException();
  for(int i=0;i<this.students.length;i++)
    if(this.students[i].equals(student))
    return this.students[i+1];
		return null;
	}
}
