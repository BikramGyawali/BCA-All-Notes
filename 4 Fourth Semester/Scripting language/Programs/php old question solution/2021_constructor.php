<?php
class exam {
  private $name;
  function __construct($name){
	$this->name=$name;
  }
 function showname(){
	 echo "Hello ". $this->name;
 }
}
$obj= new exam("Bikram");
$obj->showname();
?>