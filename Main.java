import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1,0,0,1));
   
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(list));

    }


    public class BinaryArrayToNumber{
        public static int ConvertBinaryArrayToInt(List<Integer> binary){





            StringBuilder sb = new StringBuilder ();
            for (int i = 0; i < binary.size(); i++) {
                sb.append(binary.get(i));
            }

            String myString = String.valueOf(sb);

            int decimal=Integer.parseInt(myString,2);


            return decimal;
        }


    }

}
