package GB.Lesson1;

public class Treadmill implements Obstacles {
    int length;

    public Treadmill(int length){
        this.length=length;
    }
    @Override
    public boolean toRun( int maxLength){
        return ( maxLength>=length);
    }
    @Override
    public boolean toJump( int maxHeight){
        return false;
    }

    public String toString(){
        return "Treadmill length:"+" "+length +"m";
    }

}