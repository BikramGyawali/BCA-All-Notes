//namespace Program
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            Console.WriteLine("Hello, World!");
//        }
//    }
//}
//using System;

//namespace Program
//{
//    class program1
//    {
//        public static void Main(String[] args)
//        {
//            int cp, sp, p, l;
//            Console.WriteLine("Enter Cost Price");
//            cp = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter  Selling Price");
//            sp = Convert.ToInt32(Console.ReadLine());

//            if (sp > cp)
//            {
//                p = sp - cp;
//                Console.WriteLine("Gain amount " + p);
//            }
//            else
//            {
//                l = cp - sp;
//                Console.WriteLine("Loss amount " + l);
//            }
//            Console.ReadKey();
//        }
//    }
//}


//WAP for finding greatest numhber among 4 numbers

//using System;
//namespace Program
//{
//    class biggest
//    {
//        public static void Main(string[] args)
//        {
//            int a, b, c, d, temp;
//            Console.WriteLine("Enter the first Number");
//            a = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter the second Number");
//            b = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter the third Number");
//            c = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter the fourth Number");
//            d = Convert.ToInt32(Console.ReadLine());

//            if (a > b && a > c && a > d)
//            {
//                Console.WriteLine(a + " is greatest Number");
//            }
//            else if (b > a && b > c && b > d)
//            {
//                Console.WriteLine(b + " is greatest Number");
//            }
//            else if (c > a && c > b && c > d)
//            {
//                Console.WriteLine(c + " is greatest Number");
//            }
//            else
//            {
//                Console.WriteLine(d + " is greatest Number");
//            }
//        }
//    }
//}



//WAP for finding the sum of array

//using System;
//namespace program
//{
//    class sumOfArray
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, sum1 = 0, sum2 = 0;
//            int[] number = new int[100];
//            Console.WriteLine("Enter the size of the array");
//            n = Convert.ToInt32(Console.ReadLine());

//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine("Enter the value of " + (i + 1) +" element");
//                number[i] = Convert.ToInt32(Console.ReadLine());

//            }

//            //for sum long method 
//            for (i = 0; i < n; i++)
//                 sum1 += number[i];
//            Console.WriteLine("The sum of the array is " + sum1);

//            // short and inbulid method

//            sum2 = number.Sum();
//            Console.WriteLine("The sum of the arrray is " + sum2);
//        }
//    }
//}


//WAP to find the largest,smallest and the average of the array

//using System;
//namespace program
//{
//    class findAll
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, average, smallest, biggest, sum = 0;
//            int[] number = new int[100];
//            Console.WriteLine("Enter the size of the array");
//            n = Convert.ToInt32(Console.ReadLine());

//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine("Enter the " + (i + 1) + " element");
//                    number[i] = Convert.ToInt32(Console.ReadLine());
//            }
//            biggest = number[0]; smallest = number[0];

//            for (i = 0; i < n; i++)
//            {
//                if (number[i] > biggest)
//                    biggest = number[i];
//                if (number[i] < smallest)
//                    smallest = number[i];
//                sum += number[i];
//            }
//            average = sum / n;

//            //print 
//            Console.WriteLine("The biggest number of the array is " + biggest);
//            Console.WriteLine("The smalllest number of the array is " + smallest);
//            Console.WriteLine("The sum number of the array is " + sum);
//            Console.WriteLine("The average number of the array is " + average);

//            // print the bigesst,smallest,sum using the inbulit method
//            Console.WriteLine("The biggest number of the array is " + (number.Max()));
//            Console.WriteLine("The smallest number of the array is " + (number.Min()));
//            Console.WriteLine("The sum number of the array is " + (number.Sum()));
//        }
//    }
//}


//WAP to sort an array using both inbuilt method and  logic method

//using System;
//namespace program
//{
//    class sortArrray
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, j, temp;
//            int[] numbers = new int[100];
//            Console.WriteLine("Enter the size of array");
//            n = Convert.ToInt32(Console.ReadLine());

//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine("Enter the " + (i + 1) + "th element");
//                numbers[i] = Convert.ToInt32(Console.ReadLine());

//            }

//            for (i = 0; i < n; i++)
//            {
//                for (j = i+1; j < n; j++)
//                {
//                    if (numbers[j] < numbers[i])
//                    {
//                        temp = numbers[i];
//                        numbers[i] = numbers[j];
//                        numbers[j] = temp;
//                    }
//                }
//            }

//            //for print
//            Console.WriteLine("Array after sorting");
//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine(numbers[i]);
//            }

//            // using bulit in with foreach the builtin method is only used when the array is already give not a user input array
//            //Array.Sort(numbers);
//            //foreach(int a in numbers){
//            //    Console.WriteLine(a);
//            //}
//        }
//    }
//}


// program for item search in an array
//using System;
//namespace program
//{
//    class itemSearch
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, item;
//            bool flag=false;
//            int[] numbers = { 1, 2, 3, 4, 5 };
//            n = numbers.Length;
//            Console.WriteLine("Enter the search element");
//            item = Convert.ToInt32(Console.ReadLine());
//            for (i = 0; i < n; i++)
//            {
//                if (item == numbers[i])
//                {
//                    Console.WriteLine("Elements found in " + i + "th index");
//                    flag = true;
//                    return;
//                }
//  }
//            if (!flag)
//            {
//                Console.WriteLine("No element found in the array");
//            }
//}
//}
//}


//2d array rectangle  
/*
using System;

namespace Program
{
    class _2darray
    {
        public static void Main(String[] args)
        {
            int i, j;
            int[,] numbers = new int[2, 2];
            Console.WriteLine("Enter the elements in 2 d array ");
            for (i = 0; i < numbers.GetLength(0); i++)
            {
                for (j = 0; j < numbers.GetLength(1); j++)
                {
                    numbers[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            //for read 
            Console.WriteLine("The elements of the array");
            foreach(int a in numbers)
            {
                Console.WriteLine(a);
            }
        Console.ReadKey();
        }
    }

}

*/





// class and object

//using System;

//namespace personalDetails
//{
//    class program
//    {
//        public static void Main(String[] args)
//        {
//            person p = new person();
//            p.id = 0001;
//                p.name="Birkam Gyawali";
//            p.age = 19;
//            p.address = "Kathmandu";
//                p.displayData();
//        }
//    }


//// create a class for the person

//    class person
//    {
//      public  int id, age;
//        public string name, address;

//          public  void displayData()
//        {
//            Console.WriteLine("Hello " + name + " Your id is " + id + " and you are " + age + " year old. " + " You are from  " + address);
//        }
//    }

//}


// class and object for the area ,volume and parameter of rectangle with multiple class 
// now rewrite with single class 


/* using System;
namespace AVPofRectangle
{
    class program
    {
        public static void Main(String[] args)
        {
            int l, b, h;
            Console.WriteLine("Enter the length of the rectangle");
            l = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the breadth of the rectangle");
            b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the height of the rectangle");
            h = Convert.ToInt32(Console.ReadLine());

            area A = new area();
            A.Calculate(l, b);

            volume v = new volume();
            v.CaulculateVolume(l, b, h);
            Console.ReadKey();
        }
    }

    // class for area 
    class area
    {

        public void Calculate(int l, int b)
        {
            int area = l * b;
            Console.WriteLine("The area of the rectangle is " + area);
        }

    }


    class volume
    {

        public void CaulculateVolume(int l, int b, int h)
        {
            int volume = l * b * h;
            Console.WriteLine("The volume of rectangle is " + volume);
        }
    }
}
*/

//using single class 

/*using System;
namespace AVPSingleClass
{

    class program
    {
        public static void Main(String[] args)
        {
            Caculation c = new Caculation();
            Console.WriteLine("Enter the length of the rectangle");
            double l = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter the breadth of the rectangle");
            double b = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter the height of the rectangle");
            double h = Convert.ToDouble(Console.ReadLine());
            c.setData(l, b, h);
            Console.WriteLine("The area of the rectangle is " + c.area());
            Console.WriteLine("The volume of the rectangle is " + c.volume());

            Console.ReadKey();
        }
    }

    class Caculation
    {
        double l, b, h;
        public void setData(double l, double b, double h)
        {
            this.l = l;
            this.b = b;
            this.h = h;
        }

        public double area()
        {
            return l * b;
        }

        public double volume()
        {
            return l * b * h;
        }
    }

}
*/

/*ACCESS MODIFIER
Note : 
    1. class is by default internal and never by private
    2. members inside class is by default private 
    3. method is also by default private 
*/

/*

// claculation of simple interes 

using System;
namespace SimpleInterest
{
    class Calculatin
    {
        public double SICalculation(double p, double t, double r)
        {
            return (p * t * r) / 100;

        }
    }
    class program
    {
        public static void Main(string[] args)
        {
            Calculatin c = new Calculatin();
            Console.WriteLine("The simple interest is " + c.SICalculation(20000, 3, 4));
        Console.ReadKey();
        }
    }
}
*/

/*
example of call by vlaue : this is the default way of call method 
definition : When you pass a variable to a method,
C# makes a copy of that value. The method works on the copy. The original variable is completely safe and never touched.

using System;
class program
{
    static void Show(int x)
    {
        x = x + 10;
        Console.WriteLine("Inside the value " + x);
    }
    public static void Main(String[] args)
    {
        int a = 20;
        Show(a);
        Console.WriteLine("Outside method value" + a);
    }
}

Call by reference : Instead of sending a copy, you send the actual memory address of the variable. Whatever the method does to it directly changes your
original variable.

using System;
class program
{
    static void show (ref int x )
    {
        x = x + 10;
        Console.WriteLine("Inside the function value {0}", x);
    }

  public  static void Main(String[] args)
    {
        int a = 10;
        show(ref a);
        Console.WriteLine("Outside the function vlaue {0}", a);
        Console.ReadKey();
    }
}

Output parmater :
Definition : This is like ref but done specially for output.the method fills the variable for you . we dont need to intialize before call 
in fact the method is required to assign it before returning.
where to use it : needs to produce multiple results 
we assign the vlaue inside the method in out but not in the ref and the value;
and dont assign any value inside the main class in out but iin the ref and the value we assign the value



using System;
 internal class program
{
    static void Show( out int x)
    {
        x = 50; // assign value inside the method
        Console.WriteLine("Inside the method "+x);
    }

    static void Main(String[] args)
    {
        int a; // we dont need to assign vlaue fo the a 
        Show(out a);
        Console.WriteLine("Outside the function " + a);
        Console.ReadKey();
    }
}


calss by params
definitionn: mthod accept any number of argument of the same types.
Why it exists: You often don't know at design time how many values will be passed. params removes the need to create an array manually before every call.
 we can pass any number of the parameter we dont need to assign the array


using System;

internal class program
{
    static void show(params int[] num)
    {
        int total = 0;
        foreach(int n in num)
            total += n;
        Console.WriteLine("Total : " + total);
    }

    static void Main(String[] args)
    {
        show(1, 2);
        show(1, 2, 3);
        Console.ReadKey();
    }
}

Method overloading


using System;
namespace simpleMethodOverloading
{
    internal class program
    {
        public void add(int a, int b)
        {
            int c = a + b;
            Console.WriteLine("The sum of 2 numbers is {0} ", c);

        }
        public void add(int x, int y, int z)
        {
            int sum = x + y + z;
            Console.WriteLine("The sum of three numbers is {0} ", sum);
        }
        public static void Main(string[] args)
        {
            program p = new program();
            p.add(2, 3);
            p.add(2, 3, 4);
            Console.ReadKey();
        }
    }
}


with return of int 
namespace simpleMethodOverloading
{
internal class program
    {
        public int add(int a, int b)
        {
            //int c = a+b;
            //Console.WriteLine("The sum of 2 numbers is ", c);
            return a + b;

        }
        public int add(int x,int y, int z)
        {
            //int sum = x + y + z;
            //Console.WriteLine("The sum of three numbers is ", sum);
            return x + y + z;
        }
        public static void Main(string[] args)
        {
            program p = new program();
            //p.add(2, 3);
            Console.WriteLine(p.add(2, 3));
            Console.WriteLine(p.add(2, 3, 4));
            //p.add(2, 3, 4);
            Console.ReadKey();
        }
    }
}
*/

/*simple inheritance

using System;

namespace simpleInheritance
{
   internal class program
    {
        class A
        {
            public void display()
            {
                Console.WriteLine("hello user");
            }
        }

        class B : A
        {
            public void test()
            {
                Console.WriteLine("this is test");
            }
        }

       class Inheritance
        {
            public static void Main(String[] args)
            {
                B b = new  B();
                b.display();
                b.test();
                Console.ReadKey();
            }
        }

    }
}

*/


/* write a program to base class name employe has salary 35000 and who is manager get bonus 20000 per month. uisng inheritance

using System;
namespace example
{
    internal class program
    {
        class employer
        {
         public  int salary = 30000;
            public void Salary()
            {
                Console.WriteLine("Salay is  {0}", salary);
            }
        }
        class manager : employer
        {
           public int bonous = 20000;
           public int total ;

            public manager()
            {
                total = salary + bonous;
            }
            public void managerSalary()
            {
                Console.WriteLine("Manager salary is {0}",total);
            }

        }

        class calulation
        {
            public static void Main(String[] args)
            {
                manager m = new manager();
                m.Salary();
                m.managerSalary();
                Console.ReadKey();
            }
        }
      
    }
}


consustructor 

            i. Default Constructor


using System;
namespace defaultConstructor
{

   
    public class Multiplication
    {
        public int a, b;
        public Multiplication(){
            a=20;
            b=30;
        }
    }
    public class program
    {
        public static void Main(String[] agrs)
        {
            Multiplication m = new Multiplication();
            Console.WriteLine(m.a);
            Console.WriteLine(m.b);
        }
    }

}

ii. Instance/Paramterize Constructor

using System.Xml.Serialization;

public class program
{
    int x, y;
    program(int a,int b)
    {
        x = a;
        y = b;
    }

    void add()
    {
        int c= x+y;
        Console.WriteLine(c);
    }

    public static void Main(String[] args)
    {
        program p = new program(2, 3);
        p.add();
    }
}

iii. Overload constructor 


class program
{
    int mul;
    program(int a,int b)
    {
        mul = a * b;
        Console.WriteLine("The mul of 2 number is {0}", mul);
    }

    program(int a,int b, int c)
    {
        mul = a * b*c;
        Console.WriteLine("The multiplication of 3 numbers is" + mul);
    }

    public static void Main(String[] args)
    {
       new program(2, 3);
        new program(2, 3, 4);
        Console.ReadKey();
    }
}


iv. Static constuctor


class program
{
    public program()
    {
        Console.WriteLine("Run when we call it ");
    }
    static program()
    {
        Console.WriteLine("Run for one time when the instance of class is created \n Dont accept any access modifier");

    }

    public static void Main(String[] args)
    {
        program p= new program(); // both the constructor are called

        new program(); // escape static as it run for only one time


    }
}


Example of the destructor 

using System;
internal class program
{
    public program(String message)
    {
        Console.WriteLine(message);
    }
    ~program()
    {
        Console.WriteLine("call destuctor");
    }
    public void afterDestructor()
    {
        Console.WriteLine("This method is called after destructor");
    }
   

   

    public static void Main(String[] args)
    {
        string message = "Call from constructor";
        program p = new program(message);
        p.afterDestructor();
       
      
        Console.ReadKey();
    }
}


using this keyword to call another constructor


using System;

public class detail
{
    int id;
    string name;
    public detail(int id,string name)
    {
        this.id = id;
        this.name = name;
        Console.WriteLine("Call first constuctor");
    }

    public detail(int id):this(id,"Bikram")
    {
        Console.WriteLine("Name set to default");
        Console.WriteLine("Call first constuctor");
    }
    public void show()
    {
        Console.WriteLine("Your id is {0} and name is {1}", id, name);
    }
}

public class program
{
    public static void Main(String[] args)
    {
       detail d= new detail(2);
        d.show();
        Console.ReadKey();
    }
}



===================example of get and set================================




internal class program
{
    private int number;
    public int score
    {
        get
        {
            return number;
        }
        set
        {
            number = value;
        }
    }
    public void display()
    {
        Console.WriteLine("The number is {0}", number);
    }
}
    internal class test
    {


        public static void Main(String[] args)
        {
            program p = new program();
            p.score = 20;  // we assign the value to the private field of another class 
            //p.display();
            Console.WriteLine("The number is {0}", p.score);
        }
    }



automatic properites

============display your information using the properties


public class detail {
    private string name;
        public string sName
    {
        get
        {
            return name;
        }
        set
        {
            name= value;
        }
    }


    public int age { get; set; } // this is the automatic method

    public string address {  get; set; }   // the address is string


    public void display()
    {
        Console.WriteLine("Your nam is {0} and your age is {1}. You are from {2}", name, age, address);
    }
}



internal class program
{
    public static void Main(String[] args)
    {
        detail d = new detail();

        Console.WriteLine("Enter your name , age  and addresss one by one");
        d.sName = Console.ReadLine();
        d.age=Convert.ToInt32(Console.ReadLine()); // or we can write d.age=int.Parse(Console.ReadLine());
        d.address = Console.ReadLine();
        d.display();
        Console.ReadKey();

    }
}


=======   display your family details ==
namespace PropertiesExample
{
    class Student
    {
        private int _StdId;
        private string _Name;
        private string _Fname;

        public int StdId
        {
            set
            {
                if (value <= 0)
                {
                    Console.WriteLine("The ID can not be zero or negative");

                }
                else
                {
                    _StdId = value;
                    


                }

            }
            get
            {
                return _StdId;

            }

        }
        public string Name
        {
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    Console.WriteLine("Please Enter Your Name");
                }
                else
                {
                    _Name = value;
                }


            }
            get
            {
                return _Name;

            }
        }
        public string Fname
        {
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    Console.WriteLine("Plz Enter your father name");
                }
                else
                {
                    _Fname = value;
                }

            }
            get
            {
                return _Fname;
            }
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Student s = new Student();
            s.StdId = 5;
            s.Name = "Mahesh";
            


            s.Fname = "Binod";
            Console.WriteLine("My ID=" + s.StdId);
            Console.WriteLine("My  name is=" + s.Name);
            Console.WriteLine("My father name is=" + s.Fname);
            Console.ReadKey();

        }
    }
}



==========================indexier example========================


public class Student
{
    private int[] marks = new int[10];

    public int this[int i]{
        get { return marks[i]; }
        set { marks[i] = value; }
    }
}
class program
{
    public static void Main(String[] args)
    {
        Student s = new Student();
        s[0] = 40;
        s[1] = 70;
        Console.WriteLine(s[0]);
        Console.WriteLine(s[1]);
        Console.ReadKey();
        // this method is for the loop 
        //for (int i = 0; i < 10; i++)
        //  {
        //      s[i] = i * 3;
        //  }

        //  for(int i=0;i<10;i++){
        //      Console.WriteLine(s[i]);
        //  }
    }
}

==========  static classes ===============



static class detail
{
   public  static string name;
  public  static int age;

    public static void show()
    {
        Console.WriteLine("Your name is {0} and your age is {1}", name, age);
    }
}

class program
{
    public static void Main(String[] agrs)
    {
        detail.name = "Bikram Gyawali";   // we dont need to creat the object  fo the staic class 
        detail.age = 20;   // the member of the static clsss must ne static to be access by other class 
        detail.show();
        Console.ReadKey();
    }
}


================== finalizer ====================




class fileFinalizer
{
    public fileFinalizer()
    {
        Console.WriteLine("File is opened");
    }


    public void readFile()
    {
        Console.WriteLine("File read");
    }
   
    ~fileFinalizer()
    {
        Console.WriteLine("Call finalizer");
    }
}

class program
{
    public static void Main(String[] args)
    {
        fileFinalizer f = new fileFinalizer();
        f.readFile();
        f = null;
        GC.Collect();
        Console.ReadKey();
    }
}

*/