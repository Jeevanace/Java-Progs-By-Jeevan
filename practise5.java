public class practise5 {
    public static void main(String[] args) {
        int array[] ={32,87,3,589,12,1076,2000,8,622,127};
        int searchVal =12;
        int i=0;
        boolean found= false;
        for (i=0;i< array.length;i++)
        {
            if (array[i]== searchVal)
            {
                found = true;
            }
        }
        if (found)
        {
            System.out.println("Found "+searchVal+" at index "+i);
        }
        else
        {
            System.out.println(searchVal+"not in the array");
        }
    }
}
