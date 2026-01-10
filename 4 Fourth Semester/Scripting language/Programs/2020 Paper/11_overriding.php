<?php
class animal{
	public function sound(){
		echo "From animal: generic sound";
	}
}
class dog extends animal{
	function sound(){
		echo "Dog Bark <br>";
		// echo"Calling the parent classs";
		parent::sound();
	}
}

$obj= new dog();
$obj->sound();
?>