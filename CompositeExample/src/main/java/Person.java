import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Person implements FamilyMember, Enumeration<FamilyMember> {
    private String _name;
    private ArrayList<FamilyMember> _children=new ArrayList<FamilyMember>();


    public Person(String name){
        _name=name;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public void AddChild(FamilyMember child){
        if(_children.contains(child))return;
        _children.add(child);
    }

    public void RemoveChild(FamilyMember child){
        if(!_children.contains(child))return;
        _children.remove(child);
    }

    public List<FamilyMember> getChildren(){
        return _children;
    }

    public FamilyMember GetChild(String name){
        return _children.stream().filter((x)->x.getName() == name).findFirst().get();
    }

    public boolean hasMoreElements() {
        return false;
    }

    public FamilyMember nextElement() {
        return null;
    }

    public void LogChildren(){
        if(getChildren().stream().count()>0)
        {
            System.out.println(_name+" has " + _children.stream().count() + " childs:");
            for (FamilyMember child:_children) {
                System.out.println(child.getName());
            }
        }
        else{
            System.out.println(_name+" has no children");
        }

        System.out.println("===================");
    }
}
