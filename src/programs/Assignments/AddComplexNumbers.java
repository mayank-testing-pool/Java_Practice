/* Write a program to add two copmplex numbers

Complex numbers have two parts – real part and imaginary part. When adding complex numbers we add real parts
together and imaginary parts together
 */

package src.programs.Assignments;

public class AddComplexNumbers {
    double real_num;
    double imgr_num;
    public AddComplexNumbers(double num1, double num2)
    {
       this.real_num=num1;
       this.imgr_num=num2;
    }

    public AddComplexNumbers() {

    }

    public AddComplexNumbers addition(AddComplexNumbers C1, AddComplexNumbers C2)
    {
        AddComplexNumbers temp = new AddComplexNumbers();
        temp.real_num=C1.real_num+C2.real_num;
        temp.imgr_num=C1.imgr_num+C2.imgr_num;
        return temp;

    }

    public static void main (String [] args) {
        AddComplexNumbers obj1 = new AddComplexNumbers(2, 3);
        System.out.println("Complex number 1 : "
                + obj1.real_num + " + i"
                + obj1.imgr_num);

        AddComplexNumbers obj2 = new AddComplexNumbers(4, 5);
        System.out.println("Complex number 1 : "
                + obj2.real_num + " + i"
                + obj2.imgr_num);

        AddComplexNumbers sum =new AddComplexNumbers();
        sum = sum.addition(obj1, obj2);

        System.out.println("Sum of complex number : "
                + sum.real_num + " + i"
                + sum.imgr_num);

  }
    }




