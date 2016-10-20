package monsh.com.listafirebase.models;

//Usuario = username, Tarea = item, realizado = completed;
public class ToDoItem {

    String username;
    String item;
    boolean completed;

    public ToDoItem(){

    }
    public ToDoItem(String item, String username,boolean completed){
        this.username = username;
        this.item = item;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
