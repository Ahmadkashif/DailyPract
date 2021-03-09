public class StringSplitter {

    public static String[] solution(String s){

        String[] strArr;
        if(s.length()>0){

            int strLen = ( ((s.length()% 2) == 0) ? s.length()/2 : (s.length()/2) + 1  ) ;
            System.out.println(strLen);
            strArr = new String[strLen];
            int j=0, counter = 0;

            for(int i= 0 ; i < s.length(); i++){

                counter++;

                if(counter == 1){
                    if((i+1)<s.length())
                        continue;
                    else
                    {
                        strArr[ j < strLen ? j++ : j ] = s.charAt(i) + "_";
                    }
                }
                if (counter == 2){
                    strArr[j < strLen ? j++ : j ] = s.charAt(i-1) + "" + s.charAt(i) + "";
                    counter = 0;
                }

            }
        }

        else{
            strArr = new String[1];
            strArr[0] = "";
        }


        return strArr;
    }
}
