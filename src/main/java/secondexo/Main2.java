package secondexo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();

        int n=sentence.length();
        String mot="";

        List<String> word=new ArrayList<>(); 
        for (int i=0;i<n;i++) {
            mot="";
            while(i<n && sentence.charAt(i)!=' '){
                mot=mot+sentence.charAt(i);
                i+=1; 
            }
            if (!mot.equals("")) {
                word.add(mot);
            }
        }

        Map<String,Integer> wordmap=new HashMap<>();
        
        int ele;
        n=word.size();
        for(int i=0;i<n;i++){
            if(wordmap.containsKey(word.get(i))){
                ele=wordmap.get(word.get(i));
                wordmap.put(word.get(i),ele+1);

            }
            else {
                wordmap.put(word.get(i),1);
            }
        }
        System.out.println("displaying the word with their number of occurence");
        for(String w:wordmap.keySet()){
            System.out.println(w+" "+wordmap.get(w));
        }

        System.out.println("total word number is "+n);
        
        System.out.println("displaying all words");
        for(String w:wordmap.keySet()){
            System.out.println(w);


        }

        int g=-1;
        int val;
        String bigword="";

        for(String w:wordmap.keySet()){
            val=wordmap.get(w);
            if(val>g){
                bigword=w;
                g=val;

            }
        }
        System.out.println("the most repted word "+bigword);
 
        List<String> copy=new ArrayList<>();
        for(String w:wordmap.keySet()){
            copy.add(w);

        }
        n=copy.size();
        String w;
        System.out.println("displying the word in sorting order");
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(copy.get(i).compareTo(copy.get(j))>0){
                    w=copy.get(i);
                    copy.set(i,copy.get(j));
                    copy.set(j,w);


                }

            }
            System.out.println(copy.get(i));
        }

        

        

        
    }
}
