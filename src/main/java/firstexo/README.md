# Exercice 1 – Student Management (List & Set)

# FIles structure
```bash
firstexo/
├── Etudiant.java   # Student class (id, name, surname)
└── Main1.java      # Main program (all operations)
```

# Feature implimented
## 1. create student class "Etudiant name"
-add constructeur 
  ```java 
        public Etudiant(String nom,String prenom,int id)
  ```
- add all nécessaires methods

- add toString method to return object information
     ```java
          @Override
          public String toString(){
             return "nom: "+nom+" prenom: "+prenom+" id: "+id;
          }
     ```
-and override hashcode and equal method
```java
    @Override
    public boolean equals(Object Et){
        if (!(Et instanceof Etudiant)) return false;
        Etudiant e=(Etudiant) Et;

        return  id==e.id;

    }
    @Override 
    public int hashCode(){
        return Objects.hash(id);

    }
```
## 2. test in main 
### 1. Create Students List
- Store students using `ArrayList<Etudiant>`
- Input data from user

---

### 2. Display Students
- Print all students using `toString()`

---

### 3. Remove Duplicates
- Convert List → Set
- Use `HashSet<Etudiant>` to remove duplicates

---

### 4. Compare Sizes
- Display size of List 
- Display size of Set
- ```java
  System.out.println("set size "+etuset.size());
  System.out.println("list size "+etu.size());```
  

---

### 5. Sort Students by ID
- Sort list in ascending order using nested loops
```java
        Etudiant e;
        for(int i=0;i<etu.size();i++){
            for(int j=i+1;j<etu.size();j++){
                if(etu.get(i).getid()>etu.get(j).getid()){
                    e=etu.get(i);
                    etu.set(i, etu.get(j));
                    etu.set(j, e);
                }
            }

        }
```

---

### 6. Sort Students by Name
- Alphabetical sorting using `e.compareTo(e2)` if the result is greater the 0 then e commes after e2 
```java
        for(int i=0;i<etu.size();i++){
            for(int j=i+1;j<etu.size();j++){
                if(etu.get(i).getnom().compareTo(etu.get(j).getnom())>0){
                    e=etu.get(i);
                    etu.set(i, etu.get(j));
                    etu.set(j, e);
                }


            }
        }
```

---

### 7. Search Student by ID
- Linear search in list
- Return student if found, else return null

---
