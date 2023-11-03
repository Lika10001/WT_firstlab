package tasks.task13;

import tasks.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage(){return this.language;}
    public int getLevel(){return this.level;}

    @Override
    public boolean equals(Object object){
        if(object != null && object.getClass() == this.getClass()){
            return ((ProgrammerBook) object).getLanguage().equals(this.language) && ((ProgrammerBook) object).getLevel() == level;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("Programmer Book language: %s; level: %d", language, level);
    }

    @Override
    public int hashCode(){
        int resultHash = language == null? 3 : language.hashCode();
        resultHash += level * 2;
        return resultHash;
    }
}
