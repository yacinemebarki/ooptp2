# Exercice 2 – Word Frequency Analysis (Map)

# File structure
```
secondexo/
└── Main2.java   # Word frequency program
```

#  Features Implemented

## 1. User Input
- The user enters a sentence
- Sentence is converted to lowercase using:
```java
sentence = sentence.toLowerCase();
```

---

## 2. Word Extraction
- Sentence is manually split into words using a loop
- Words are stored in an `ArrayList<String>`
```java
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
```

---

## 3. Word Counting (Map)
- A `HashMap<String, Integer>` is used to store:
  - Key → word
  - Value → number of occurrences


### Logic:
- If word exists → increment value
- If not → add word with value 1
  ```java
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
  ```

---

## 4. Display Words with Occurrences
```java
        System.out.println("displaying the word with their number of occurence");
        for(String w:wordmap.keySet()){
            System.out.println(w+" "+wordmap.get(w));
        }
```
Example output:
```
java 2
est 2
simple 1
```

---

## 5. Total Number of Words
- Displays total number of words entered in the sentence
- using just the `size` method of list to display it length

---

## 6. Distinct Words
- Uses `Map.keySet()` to display all unique words
- using for loop to travers the wordmap

---

## 7. Most Frequent Word
- The program finds the word with the highest occurrence
- 

Logic:
- Compare values in the map
- Store the maximum
```java
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
```

---

## 8. Sorting Words Alphabetically
- Keys from the map are copied into a list
- List is sorted using `compareTo()`
```java
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
```
