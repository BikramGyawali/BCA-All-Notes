<!-- Write an object-oriented PHP program to implement the concept of inheritance in considering with following class diagram with the use of constructor for 20 students. -->
	<?php
	class Student{
		public $name;
		public $address;
		function __construct($n,$a){
	$this->name=$n;
	$this->address=$a;
		}
	
	}
	class Details extends Student{
			function info(){
			echo "Hello ".$this->name." from ".$this->address ."<br>";
			
		}
	}
	$students=[];
	for($i=1;$i<20;$i++){
		$students[]=new Details("Student $i","ktm"); // the constructor is called as the details inherite the studetns and we cannot call the student class because ti doesnot have access to info
	} 
	
	foreach($students as $student){
		$student->info();  // this is the object which hold the details in the students array
	}

	?>