import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();
        int choice = 0;
        String phrase = "";
        while(choice != 3)
        {
            System.out.println("---------------MAIN MENU--------------");
            System.out.println("1 - Read input string of words");
            System.out.println("2 - Reverse and display input string");
            System.out.println("3 - Exit program\n");
            System.out.print("Enter option number: ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    System.out.print("Please input a string of words: ");
                    sc.nextLine();
                    phrase = sc.nextLine();
                    System.out.println();
                    break;

                case 2:
                    if(phrase.isEmpty())
                    {
                        System.out.println("Please input a string first"); //empty string case
                    }
                    else
                    {
                        String temp = "";
                        for(int i = 0; i < phrase.length(); i++) //loops through the inputted string
                        {
                            if(phrase.charAt(i) != ' ') //checks to see if the char is a space or not
                            {
                                temp = temp + phrase.charAt(i); //if not a space it adds that character to the temp string
                            }
                            else
                            {
                                myStack.push(temp); //if it is a space it pushes the word formed in temp to the stack and resets temp to be empty
                                temp = "";
                            }
                        }
                        myStack.push(temp); //pushes the final word formed in the string
                        System.out.print("Entered string:    ");
                        System.out.println(phrase); //prints original phrase
                        System.out.print("Reversed string:   ");
                        while(!myStack.isEmpty()) //loops until stack is empty
                        {
                            System.out.print(myStack.top() + " "); //prints top element and a space
                            myStack.pop(); //pops the top element out of the stack
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
