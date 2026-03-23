package firstexo;

import java.util.*;


public class Main1 {
    public static void main(String[] args) {
        
        List<Etudiant> etu=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of etudiant");
        int n=sc.nextInt();
        sc.nextLine();
        int id;
        String name;
        String sname;
        
        for (int i=0;i<n;i++){
            System.out.println("enter id");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name");
            name=sc.nextLine();
            
            System.out.println("enter second name");
            sname=sc.nextLine();
            
            Etudiant etud=new Etudiant(name, sname, id);
            etu.add(etud);

        }


        String text;
        for(int i=0;i<n;i++){
            text=etu.get(i).toString();
            System.out.println(text);
        
        }

        Set<Etudiant> etuset=new HashSet<>(etu) ;

        for(Etudiant e:etuset){
            System.out.println(e);
        }


        System.out.println("set size "+etuset.size());
        System.out.println("list size "+etu.size());

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
        
        for(int i=0;i<etu.size();i++){
            for(int j=i+1;j<etu.size();j++){
                if(etu.get(i).getnom().compareTo(etu.get(j).getnom())>0){
                    e=etu.get(i);
                    etu.set(i, etu.get(j));
                    etu.set(j, e);
                }


            }
        }




    
    }

    public Etudiant search(List<Etudiant> etu,Etudiant eleve){
        int n=etu.size();
        for(int i=0;i<n;i++){
            if (etu.get(i).getid()==eleve.getid()){
                return etu.get(i);
            }


        }
        return null;

    }
}
